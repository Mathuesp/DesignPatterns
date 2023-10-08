package org.example.exercício;

import org.example.exercício.angus.Controller;

import java.util.HashMap;
import java.util.Map;

public class ProdutoController2 extends Controller {
    public void listProduct(){
        //aqui pega os dados do banco
        Map<String, Object> context = new HashMap<>();
        //Context é populado
        render("productsView.html", context);
    }
}
