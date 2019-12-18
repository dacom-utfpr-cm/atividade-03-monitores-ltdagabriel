package atividade_01;

/**
 * Implemente uma solução com monitor para o problema do
 * Produtor-Consumidor usando um buffer circular.
 *
 * @autor: Gabriel Choptian
 */
public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(4);
        // 1 produtor
        new Thread(new Produtor(buffer)).start();

        // 3 consumidores
        new Thread(new Consumidor(buffer)).start();
        new Thread(new Consumidor(buffer)).start();
        new Thread(new Consumidor(buffer)).start();
    }
}
