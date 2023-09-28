package org.example.exercicio;

public class CartaoDebito implements Pagamento {
    @Override
    public void payment(String pedido) {
        System.out.println("Pagamento efetuado pela forma Cartão de Débito");
    }
}
