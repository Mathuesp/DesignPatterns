package org.example.exercicio;

public class Acao extends Subject {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        notifyObservers();
    }
}
