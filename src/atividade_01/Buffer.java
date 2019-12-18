package atividade_01;

public class Buffer {
    private final Integer[] buffer;
    private int start = 0;
    private int end = 0;

    Buffer(int size) {
        assert size > 0;
        buffer = new Integer[size+1];
    }

    private boolean isEmpty() {
        return start == end;
    }

    private boolean isFull() {
        return start == ((end + 1) % buffer.length);
    }


    private void add(int value) {
        buffer[end] = value;
        end = (end + 1) % buffer.length;
    }

    private int remove() {
        try {
            return buffer[start];
        } finally {
            buffer[start] = null;
            start = (start + 1) % buffer.length;
        }
    }

    synchronized void put(int value) {
        // Aguarda espaço no buffer
        while (isFull()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // adiciona no buffer
        add(value);

        // notifica as demais threads
        this.notifyAll();
    }

    synchronized int get() {
        // Espera ter algum elemento no buffer
        while (isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // remove elemento do buffer
        int value = remove();
        // notifica as threads
        this.notifyAll();
        return value;
    }

}
