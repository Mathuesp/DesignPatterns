package br.com.unipar.frameworks.designpatterns_composite.exercicio.produtos;

import br.com.unipar.frameworks.designpatterns_composite.exercicio.Box;
import lombok.Data;

@Data
public abstract class Produto implements Box {
    protected final String title;
    protected final double price;
}
