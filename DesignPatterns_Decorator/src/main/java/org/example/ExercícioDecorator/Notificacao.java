package org.example.ExercícioDecorator;

public class Notificacao implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("Notificação..." + message);
    }
}
