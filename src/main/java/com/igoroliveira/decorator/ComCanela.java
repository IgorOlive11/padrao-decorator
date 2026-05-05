package com.igoroliveira.decorator;

/** Decorator concreto: adiciona canela a bebida. */
public class ComCanela extends BebidaDecorator {

    public ComCanela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Canela";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.50;
    }
}
