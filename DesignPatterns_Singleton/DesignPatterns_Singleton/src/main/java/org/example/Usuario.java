package org.example;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Usuario {
    private String login;
    private String nome;
    private String senha;

    public Usuario(String login, String nome, String senha) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }
}
