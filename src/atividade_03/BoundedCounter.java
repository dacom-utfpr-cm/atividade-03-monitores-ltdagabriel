package atividade_03;

public class BoundedCounter {
    private int i;
    private int min;
    private int max;

    BoundedCounter(int min, int max) {
        i = min + 3;
        assert max > min;

        this.max = max;
        this.min = min;
    }

    synchronized int get() {
        return i;
    }

    synchronized void increment() throws InterruptedException {

        while (i >= max) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i++;
        notifyAll();

    }

    synchronized void decrement() throws InterruptedException {

        while (i <= min) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i--;
        notifyAll();

    }

}