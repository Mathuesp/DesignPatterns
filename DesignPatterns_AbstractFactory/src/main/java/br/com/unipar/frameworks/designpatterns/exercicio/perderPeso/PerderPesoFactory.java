package br.com.unipar.frameworks.designpatterns.exercicio.perderPeso;

import br.com.unipar.frameworks.designpatterns.exercicio.TreinoA;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoB;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoC;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoFactory;

public class PerderPesoFactory implements TreinoFactory {
    @Override
    public TreinoA createTreinoA() {
        return new PerderPesoTreinoA();
    }

    @Override
    public TreinoB createTreinoB() {
        return new PerderPesoTreinoB();
    }

    @Override
    public TreinoC createTreinoC() {
        return new PerderPesoTreinoC();
    }
}
