package br.com.unipar.frameworks.designpatterns.exercicio.app;

import br.com.unipar.frameworks.designpatterns.abstractfactory.WidgetFactory;
import br.com.unipar.frameworks.designpatterns.exercicio.TreinoFactory;

public class ContactForm {
    public void render(TreinoFactory factory) {
        factory.createTreinoA().render();
        factory.createTreinoB().render();
        factory.createTreinoC().render();
    }
}
