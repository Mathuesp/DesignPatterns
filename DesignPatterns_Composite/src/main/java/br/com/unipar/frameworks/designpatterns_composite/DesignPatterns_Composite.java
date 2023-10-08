package br.com.unipar.frameworks.designpatterns_composite;


import br.com.unipar.frameworks.designpatterns_composite.exercicio.CompositeBox;
import br.com.unipar.frameworks.designpatterns_composite.exercicio.DeliveryService;
import br.com.unipar.frameworks.designpatterns_composite.exercicio.produtos.Acessorios;
import br.com.unipar.frameworks.designpatterns_composite.exercicio.produtos.Hardware;

public class DesignPatterns_Composite {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(new Acessorios("Teclado", 120)),
                new CompositeBox(new Hardware("Memória RAM", 250),
                        new Acessorios("Mouse", 90)),
                new Acessorios("Headset", 1400)
        );
        System.out.println(deliveryService.calculateOrderPrice());
        
    }
}
