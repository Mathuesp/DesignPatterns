package org.example;

import org.example.exercicio.Dinheiro;
import org.example.exercicio.Pedido;

public class Main {
    public static void main(String[] args) {
//        ImageStorage imageStorage = new ImageStorage();

//        imageStorage.store("arquivo1", new JpegCompressor(), new HighContrastFilter());

//        imageStorage.store("arquivo1", new PngCompressor(), new BeWFilter());
        Pedido pedido = new Pedido();

        pedido.pagarPedido("123", new Dinheiro());
    }
}