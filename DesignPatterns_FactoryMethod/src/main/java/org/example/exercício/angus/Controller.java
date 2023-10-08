package org.example.exercício.angus;

import org.example.exercício.HamburgerEngine;
import org.example.matcha.MatchaViewEngine;
import org.example.matcha.ViewEngine;

import java.util.Arrays;
import java.util.Map;

public class Controller {

    public void render(String viewName, Map<String, Object> context){
        HamburgerEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected HamburgerEngine createViewEngine(){
        return new AngusViewEngine();
    }
}
