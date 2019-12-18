package atividade_02;

import static java.lang.Thread.sleep;

public class Trabalhador implements Runnable {
    private final MonitorCounter m;

    public Trabalhador(MonitorCounter m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Incrementa a cada 1s
                m.increment();
                sleep(1_000);
            } catch (InterruptedException e) {
                System.out.println("Relógio finalizado!");
            }

        }

    }
}
