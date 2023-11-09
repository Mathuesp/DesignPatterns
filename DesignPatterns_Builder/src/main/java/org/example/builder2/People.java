package org.example.builder2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class People {
    private String nome;
    private String sobrenome;
    private String apelido;
    private String email;


    public static final class PeopleBuilder {
        private String nome;
        private String sobrenome;
        private String apelido;
        private String email;

        public PeopleBuilder() {
        }

        public PeopleBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PeopleBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PeopleBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PeopleBuilder email(String email) {
            this.email = email;
            return this;
        }

        public People build() {
            return new People(nome, sobrenome, apelido, email);
        }
    }
}
