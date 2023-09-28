package org.example;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("matheus@gmail.com", "Matheus", "123");
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("Usuário logado", usuario);

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.get("Usuário logado"));
    }
}