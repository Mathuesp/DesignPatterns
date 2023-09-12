package ExercícioDecorator;

public class Sms implements Notifier {
    private Notifier notifier;

    public Sms(Notifier notifier) {
        this.notifier = notifier;
    }

    private String sms(String message) {
        return "_sms_" + message;
    }

    @Override
    public void notify(String message) {
        String sms = sms(message);
        notifier.notify(sms);
    }
}
