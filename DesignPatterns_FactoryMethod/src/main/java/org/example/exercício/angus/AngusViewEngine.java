package org.example.exercício.angus;

import org.example.exercício.HamburgerEngine;

import java.util.Map;

public class AngusViewEngine implements HamburgerEngine {

    @Override
    public String render(String viewName, Map<String, Object> context){
        return "Hamburguer Angus" +
                "\nCarne Angus" +
                "\nQueijo Cheddar" +
                "\nMolho Especial";
    }
}
