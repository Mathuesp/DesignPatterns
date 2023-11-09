package org.example;

import org.example.builder.Person;
import org.example.builder2.People;
import org.example.builder2.PeopleBuilder;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Matheus",
                "Pereira",
                "Mathues",
                "matheus.pereira.00"
        );

        System.out.println(pessoa);

        Person pessoa1 = new Person.PessoaBuilder()
                .nome("Leonardo")
                .sobrenome("Almeida")
                .apelido("Leo")
                .email("leonardo.almeida")
                .build();

        System.out.println(pessoa1);

        People people = new PeopleBuilder()
                .nome("Leonardo")
                .sobrenome("Almeida")
                .apelido("Leo")
                .email("leonardo.almeida")
                .build();

        System.out.println(people);
    }
}