package atividade_02;

import static java.lang.Thread.sleep;

/**
 * Escreva uma monitor Counter que possibilita um processo
 * dormir até o contador alcançar um valor. A classe Counter
 * permite duas operações: increment() e sleepUntil(int x).
 *
 * @autor Gabriel Choptian
 */
public class Main {

    public static void main(String[] args) {

        MonitorCounter m = new MonitorCounter();

        // Trabalhador conta a cada 1 segundo
        new Thread(new Trabalhador(m)).start();
        // Escreve Ola Mundo após incrementar até 10
        new Thread(new Dorme(m, "Ola Mundo!", 10)).start();

    }

}