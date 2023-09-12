package org.example.exercicio;

public class Paypal implements Pagamento {
    @Override
    public void payment(String pedido) {
        System.out.println("Pagamento efetuado pela forma Paypal");
    }
}
