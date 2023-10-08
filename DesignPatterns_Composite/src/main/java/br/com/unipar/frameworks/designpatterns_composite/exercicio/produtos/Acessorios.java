package br.com.unipar.frameworks.designpatterns_composite.exercicio.produtos;

public class Acessorios extends Produto {
    public Acessorios(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
