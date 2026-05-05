package com.igoroliveira.decorator;

/** Decorator concreto: adiciona chocolate a bebida. */
public class ComChocolate extends BebidaDecorator {

    public ComChocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }
}
