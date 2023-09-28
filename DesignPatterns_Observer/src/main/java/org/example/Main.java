package org.example;

import org.example.exercicio.Acao;
import org.example.exercicio.StatusBar;
import org.example.exercicio.StockListView;

public class Main {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource();
//
//        SpreadSheet sheet1 = new SpreadSheet(dataSource);
//        SpreadSheet sheet2 = new SpreadSheet(dataSource);
//        Chart chart = new Chart(dataSource);
//
//        dataSource.addObserver(sheet1);
//        dataSource.addObserver(sheet2);
//        dataSource.addObserver(chart);
//
//        dataSource.setValue(35);
        Acao acao = new Acao();

        StatusBar statusBar = new StatusBar(acao);
        StockListView stockListView = new StockListView(acao);

        acao.addObserver(statusBar);
        acao.addObserver(stockListView);

        acao.setValor(5);
    }
}