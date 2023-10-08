package org.example.exercício.vegano;

import org.example.exercício.HamburgerEngine;
import org.example.exercício.angus.Controller;

public class VeganoController extends Controller {
    @Override
    protected HamburgerEngine createViewEngine(){
        return new VeganoViewEngine();
    }
}
