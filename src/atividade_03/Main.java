package atividade_03;

/**
 * Escreva um monitor BoundedCounter que possui um valor
 * mı́nimo e máximo. A classe possui dois métodos: increment()
 * e decrement(). Ao alcançar os limites mı́nimo ou máximo, a
 * thread que alcançou deve ser bloqueada.
 *
 * @author Gabriel Choptian
 */

public class Main {

    public static void main(String[] args) {

        BoundedCounter m = new BoundedCounter(1, 10);

        new Thread(new Incrementa(m)).start();

        new Thread(new Decrementa(m)).start();

    }

}