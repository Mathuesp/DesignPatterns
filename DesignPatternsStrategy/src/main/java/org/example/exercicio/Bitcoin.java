package org.example.exercicio;

public class Bitcoin implements Pagamento {
    @Override
    public void payment(String pedido) {
        System.out.println("Pagamento efetuado pela forma Bitcoin");
    }
}
