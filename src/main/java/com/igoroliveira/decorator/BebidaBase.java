package com.igoroliveira.decorator;

/**
 * Implementacao concreta do componente base.
 * Representa um cafe simples sem adicional.
 */
public class BebidaBase implements Bebida {

    @Override
    public String getDescricao() {
        return "Cafe";
    }

    @Override
    public double getPreco() {
        return 3.00;
    }
}
