package org.example.exercicio;

public class Dinheiro implements Pagamento {
    @Override
    public void payment(String pedido) {
        System.out.println("Pagamento efetuado pela forma Dinheiro");
    }
}
