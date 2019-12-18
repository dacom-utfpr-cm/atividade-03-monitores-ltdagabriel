package atividade_01;

import java.util.Random;

public class Produtor implements Runnable {
    private final Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        int value;
        while (true) {
            value = random.nextInt(100) + 1;
            System.out.println("Produzido: "+ value);
            buffer.put(value);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
