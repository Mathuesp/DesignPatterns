package org.example.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private String nome;
    private String sobrenome;
    private String apelido;
    private String email;

    public static class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String apelido;
        private String email;

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(nome, sobrenome, apelido, email);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
