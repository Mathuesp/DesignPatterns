package org.example;

import ExercícioDecorator.*;

public class Main {
    public static void main(String[] args) {
//        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
        notification(new Email(new Sms(new Whatsapp(new Notificacao()))));
    }

    public static void storeCreditCard (Stream stream) {
        stream.write("1234-1234-2345-1325");
    }

    public static void notification (Notifier notifier) {
        notifier.notify("Pedido 123 ");
    }
}