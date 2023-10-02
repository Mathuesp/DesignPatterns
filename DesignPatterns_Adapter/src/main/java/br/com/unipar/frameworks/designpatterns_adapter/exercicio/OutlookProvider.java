package br.com.unipar.frameworks.designpatterns_adapter.exercicio;

import br.com.unipar.frameworks.designpatterns_adapter.exercicio.contas.Outlook;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.contas.Yahoo;

public class OutlookProvider implements EmailProvider {
    private Outlook outlook;

    public OutlookProvider(Outlook outlook) {
        this.outlook = outlook;
    }

    @Override
    public void apply(Email email) {
        outlook.init();
        outlook.render(email);
    }
}
