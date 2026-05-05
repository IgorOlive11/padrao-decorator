package com.igoroliveira.decorator;

/**
 * Decorator abstrato.
 * Implementa Bebida e delega as chamadas ao componente envolvido (wrapped).
 * Subclasses estendem o comportamento adicionando ingredientes.
 */
public abstract class BebidaDecorator implements Bebida {

    protected final Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco();
    }
}
