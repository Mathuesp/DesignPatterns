package org.example.exercicio;

public class StatusBar implements Observer {
    private Acao acao;

    public StatusBar(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void update() {
        System.out.println("StatusBar got notified! New value: " + acao.getValor());
    }
}
