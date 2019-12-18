package atividade_04;


public class Cliente extends Thread {
    private Barbearia barbearia;
    Cliente(Barbearia barbearia){
        this.barbearia = barbearia;
    }

    @Override
    public void run() {
        try {
            barbearia.mudar_corte();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
