package org.example;

public class NotificationService {
    public void send(String mensagem, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("192.168.1.1");
        AuthToken authToken = server.authenticate("01", "key01");
        Message message = new Message(mensagem);

        server.send(authToken,message, target);

        connection.diconnect();
    }
}
