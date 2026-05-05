package com.igoroliveira.decorator;

public class Main {
    public static void main(String[] args) {
        // Pedido simples: cafe puro
        Bebida pedido = new BebidaBase();
        System.out.println(pedido.getDescricao() + " -> R$ " + pedido.getPreco());

        // Cafe com leite, chocolate e creme
        pedido = new ComCreme(new ComChocolate(new ComLeite(new BebidaBase())));
        System.out.println(pedido.getDescricao() + " -> R$ " + pedido.getPreco());

        // Cafe com leite e canela
        Bebida outro = new ComCanela(new ComLeite(new BebidaBase()));
        System.out.println(outro.getDescricao() + " -> R$ " + outro.getPreco());
    }
}
