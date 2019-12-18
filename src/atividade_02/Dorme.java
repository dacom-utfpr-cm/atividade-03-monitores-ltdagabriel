package atividade_02;

public class Dorme implements Runnable {
    private final MonitorCounter m;
    private final String s;
    private final int segundos;

    public Dorme(MonitorCounter m, String s, int segundos) {

        this.m = m;
        this.s = s;
        this.segundos = segundos;
    }

    @Override
    public void run() {

        m.sleepUntil(segundos);

        System.out.println(s);

    }
}
