package br.com.unipar.frameworks.designpatterns.exercicio.perderPeso;

import br.com.unipar.frameworks.designpatterns.exercicio.TreinoA;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoB;

public class PerderPesoTreinoB implements TreinoB {
    @Override
    public void render() {
        System.out.println("Treino B - Perder Peso!");
    }
}
