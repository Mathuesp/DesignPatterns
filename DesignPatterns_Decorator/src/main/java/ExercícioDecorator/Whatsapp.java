package ExercícioDecorator;

public class Whatsapp implements Notifier {
    private Notifier notifier;

    public Whatsapp(Notifier notifier) {
        this.notifier = notifier;
    }

    private String whats(String message) {
        return "_whats_" + message;
    }

    @Override
    public void notify(String message) {
        String whats = whats(message);
        notifier.notify(whats);
    }
}
