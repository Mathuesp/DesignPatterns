package ExercícioDecorator;

public class Email implements Notifier {
    private Notifier notifier;

    public Email(Notifier notifier) {
        this.notifier = notifier;
    }

    private String mail(String message) {
        return "_email_" + message;
    }

    @Override
    public void notify(String message) {
        String mail = mail(message);
        notifier.notify(mail);
    }
}
