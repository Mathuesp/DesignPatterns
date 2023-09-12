package org.example.exercício;

import org.example.matcha.MatchaViewEngine;
import org.example.matcha.ViewEngine;

import java.util.Arrays;
import java.util.Map;

public class Controller {

    public void render(String[] hamburger, Map<String, Object> context){
        ViewEngine engine = createViewEngine();
        String html = engine.render(Arrays.toString(hamburger), context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
