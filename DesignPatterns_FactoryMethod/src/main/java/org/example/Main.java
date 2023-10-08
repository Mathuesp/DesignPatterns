package org.example;

import org.example.exercício.ProdutoController;
import org.example.exercício.ProdutoController2;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
//        Calendar.getInstance(); // exemplo de Factory Method
//
//        new ProductsController().listProducts();

        Calendar.getInstance();

        new ProdutoController().listProduct();
        new ProdutoController2().listProduct();
    }
}