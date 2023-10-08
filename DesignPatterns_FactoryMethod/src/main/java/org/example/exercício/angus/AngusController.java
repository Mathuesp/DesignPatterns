package org.example.exercício.angus;

import org.example.exercício.HamburgerEngine;
import org.example.matcha.Controller;
import org.example.matcha.ViewEngine;
import org.example.sharp.SharpViewEngine;

import java.util.Map;

public class AngusController {
    public void render(String viewName, Map<String, Object> context){
        HamburgerEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected HamburgerEngine createViewEngine(){
        return new AngusViewEngine();
    }
}
