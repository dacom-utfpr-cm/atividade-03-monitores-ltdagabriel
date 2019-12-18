package atividade_01;

public class Consumidor implements Runnable {
    private final Buffer buffer;

    public Consumidor(Buffer buffer) {

        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Consumido: "+buffer.get());

            try {
                // para testas se todos os consumidores funcionam
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
