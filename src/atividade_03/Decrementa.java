package atividade_03;

public class Decrementa implements Runnable {
    private final BoundedCounter m;

    public Decrementa(BoundedCounter m) {
        this.m = m;
    }

    @Override
    public void run() {
        try {
            while (true) {
                m.decrement();
                System.out.println("Counter: "+m.get());
                Thread.sleep((long) (1_000 * Math.random()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
