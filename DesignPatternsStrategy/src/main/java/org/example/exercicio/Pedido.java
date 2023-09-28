package org.example.exercicio;

import org.example.Compressor;
import org.example.Filter;

public class Pedido {
    public void pagarPedido (String pedido, Pagamento pagamento) {
        pagamento.payment(pedido);
    }
}
