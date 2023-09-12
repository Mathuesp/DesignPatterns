package org.example;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar.getInstance(); // exemplo de Factory Method

        new ProductsController().listProducts();
    }
}