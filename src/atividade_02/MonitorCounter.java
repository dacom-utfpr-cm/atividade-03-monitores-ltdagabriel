package atividade_02;


public class MonitorCounter {

    private int i = 0;


    synchronized void increment() {
        i++;
        notifyAll();
    }


    synchronized void sleepUntil(int x) {
        // Dorme enquanto o contador não atingiu o valor de x
        while (i < x) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
    }

}