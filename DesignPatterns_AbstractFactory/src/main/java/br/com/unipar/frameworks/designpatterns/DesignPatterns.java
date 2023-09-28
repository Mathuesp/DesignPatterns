package br.com.unipar.frameworks.designpatterns;

import br.com.unipar.frameworks.designpatterns.exercicio.app.ContactForm;
import br.com.unipar.frameworks.designpatterns.exercicio.construirMusculo.ContruirMusculoFactory;
import br.com.unipar.frameworks.designpatterns.exercicio.perderPeso.PerderPesoFactory;


public class DesignPatterns {

    public static void main(String[] args) {
       new ContactForm().render(new ContruirMusculoFactory());
    }
}
