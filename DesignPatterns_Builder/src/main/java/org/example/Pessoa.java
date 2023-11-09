package org.example;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String apelido;
    private String email;

    public Pessoa(String nome, String sobrenome, String apelido, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
