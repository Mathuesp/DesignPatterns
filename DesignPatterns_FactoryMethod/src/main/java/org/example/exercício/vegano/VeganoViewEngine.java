package org.example.exercício.vegano;

import org.example.exercício.HamburgerEngine;

import java.util.Map;

public class VeganoViewEngine implements HamburgerEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Hamburguer Vegano" +
                "\nHamburgues de grão de bico" +
                "\nAlface" +
                "\nTomate";
    }
}
