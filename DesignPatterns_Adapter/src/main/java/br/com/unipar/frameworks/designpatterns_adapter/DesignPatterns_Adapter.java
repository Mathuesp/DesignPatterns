/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.unipar.frameworks.designpatterns_adapter;

import br.com.unipar.frameworks.designpatterns_adapter.exercicio.Email;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.EmailView;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.OutlookProvider;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.contas.Gmail;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.GmailProvider;
import br.com.unipar.frameworks.designpatterns_adapter.exercicio.contas.Outlook;

public class DesignPatterns_Adapter {

    public static void main(String[] args) {
//        ImageView imageView = new ImageView(new Image());
//        imageView.apply(new CaramelFilter(new Caramel()));

        EmailView emailView = new EmailView(new Email());
        emailView.apply(new OutlookProvider(new Outlook()));
    }
}
