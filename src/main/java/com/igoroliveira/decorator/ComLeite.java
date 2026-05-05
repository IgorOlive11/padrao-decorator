package com.igoroliveira.decorator;

/** Decorator concreto: adiciona leite a bebida. */
public class ComLeite extends BebidaDecorator {

    public ComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }
}
