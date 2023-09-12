package org.example.exercício.angus;

import org.example.exercício.HamburgerEngine;

import java.util.Map;

public class AngusViewEngine implements HamburgerEngine {

    @Override
    public String render(String[] hamburger, Map<String, Object> context) {
        return hamburger.toString();
    }
}
