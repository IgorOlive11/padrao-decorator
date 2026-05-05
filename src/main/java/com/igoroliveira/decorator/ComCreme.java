package com.igoroliveira.decorator;

/** Decorator concreto: adiciona creme chantilly a bebida. */
public class ComCreme extends BebidaDecorator {

    public ComCreme(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Creme";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.00;
    }
}
