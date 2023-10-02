package br.com.unipar.frameworks.designpatterns_adapter.exercicio;

import br.com.unipar.frameworks.designpatterns_adapter.exercicio.contas.Gmail;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.contas.Yahoo;

public class YahooProvider implements EmailProvider {
    private Yahoo yahoo;

    public YahooProvider(Yahoo yahoo) {
        this.yahoo = yahoo;
    }

    @Override
    public void apply(Email email) {
        yahoo.init();
        yahoo.render(email);
    }
}
