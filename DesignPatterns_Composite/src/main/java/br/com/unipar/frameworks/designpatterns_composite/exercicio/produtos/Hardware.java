package br.com.unipar.frameworks.designpatterns_composite.exercicio.produtos;

public class Hardware extends Produto {
    public Hardware(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
