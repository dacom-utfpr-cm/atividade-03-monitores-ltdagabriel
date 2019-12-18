package atividade_04;

/**
 * Implemente uma solução para o problema do Barbeiro
 * Dorminhoco usando monitores.
 *
 * @author Gabriel Choptian
 */
public class Main {
    public static void main(String[] args) {
        Barbearia barbearia = new Barbearia(1);
        Barbeiro barbeiro = new Barbeiro(barbearia);
        barbeiro.start();
        for (int i = 0; i < 10; i++) {
            new Cliente(barbearia).start();
        }
    }
}
