package org.example;

import org.example.matcha.Controller;
import org.example.matcha.MatchaViewEngine;
import org.example.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        //aqui pega os dados do banco
        Map<String, Object> context = new HashMap<>();
        //context é populado...
        render("productsView.html", context);
    }
}
