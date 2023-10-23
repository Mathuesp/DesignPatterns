package org.example;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.send("Hello World!", "PC01");
    }
}