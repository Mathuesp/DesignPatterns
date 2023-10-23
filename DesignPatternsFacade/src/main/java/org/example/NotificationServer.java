package org.example;

public class NotificationServer {
    //connect() -> Connection
    //authenticate(appID, key) -> AuthToken
    //send(authToken

    public Connection connect(String ipAdress) {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send (AuthToken authToken, Message message,String target) {
        System.out.println("Sending a message..." + message.toString());
    }
}
