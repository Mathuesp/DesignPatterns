package org.example.exercicio;

import org.example.DataSource;

public class StockListView implements Observer {
    private Acao acao;

    public StockListView(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void update() {
        System.out.println("StockListView got notified! New value: " + acao.getValor());
    }
}
