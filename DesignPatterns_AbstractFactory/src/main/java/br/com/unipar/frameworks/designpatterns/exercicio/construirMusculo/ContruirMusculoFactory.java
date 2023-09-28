package br.com.unipar.frameworks.designpatterns.exercicio.construirMusculo;

import br.com.unipar.frameworks.designpatterns.exercicio.TreinoA;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoB;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoC;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoFactory;

public class ContruirMusculoFactory implements TreinoFactory {
    @Override
    public TreinoA createTreinoA() {
        return new ConstruirMusculoTreinoA();
    }

    @Override
    public TreinoB createTreinoB() {
        return new ConstruirMusculoTreinoB();
    }

    @Override
    public TreinoC createTreinoC() {
        return new ConstruirMusculoTreinoC();
    }
}
