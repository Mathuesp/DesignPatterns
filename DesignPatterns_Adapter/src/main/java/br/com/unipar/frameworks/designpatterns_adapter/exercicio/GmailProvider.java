package br.com.unipar.frameworks.designpatterns_adapter.exercicio;

import br.com.unipar.frameworks.designpatterns_adapter.exercicio.Email;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.EmailProvider;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.contas.Gmail;

public class GmailProvider implements EmailProvider {
    private Gmail gmail;

    public GmailProvider(Gmail gmail) {
        this.gmail = gmail;
    }

    @Override
        public void apply(Email email) {
        gmail.init();
        gmail.render(email);
    }
}
