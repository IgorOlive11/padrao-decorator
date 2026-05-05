package com.igoroliveira.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BebidaDecoratorTest {

    @Test
    void bebidaBaseTemprecoCerto() {
        Bebida cafe = new BebidaBase();
        assertEquals(3.00, cafe.getPreco(), 0.001);
        assertEquals("Cafe", cafe.getDescricao());
    }

    @Test
    void comLeiteAdicionaValorEDescricao() {
        Bebida pedido = new ComLeite(new BebidaBase());
        assertEquals(4.50, pedido.getPreco(), 0.001);
        assertEquals("Cafe + Leite", pedido.getDescricao());
    }

    @Test
    void comChocolateAdicionaValorEDescricao() {
        Bebida pedido = new ComChocolate(new BebidaBase());
        assertEquals(5.00, pedido.getPreco(), 0.001);
        assertEquals("Cafe + Chocolate", pedido.getDescricao());
    }

    @Test
    void comCanelaNaoAdicionaChocolate() {
        Bebida pedido = new ComCanela(new BebidaBase());
        assertEquals(3.50, pedido.getPreco(), 0.001);
        assertTrue(pedido.getDescricao().contains("Canela"));
        assertFalse(pedido.getDescricao().contains("Chocolate"));
    }

    @Test
    void decoradoresEncadeadosSomamPrecos() {
        // Cafe (3.00) + Leite (1.50) + Chocolate (2.00) + Creme (1.00) = 7.50
        Bebida pedido = new ComCreme(new ComChocolate(new ComLeite(new BebidaBase())));
        assertEquals(7.50, pedido.getPreco(), 0.001);
    }

    @Test
    void decoradoresEncadeadosConcatenamDescricao() {
        Bebida pedido = new ComCreme(new ComChocolate(new ComLeite(new BebidaBase())));
        assertEquals("Cafe + Leite + Chocolate + Creme", pedido.getDescricao());
    }

    @Test
    void mesmosDecoradoresPodemSerAplicadosDuasVezes() {
        // Dois leites: 3.00 + 1.50 + 1.50 = 6.00
        Bebida pedido = new ComLeite(new ComLeite(new BebidaBase()));
        assertEquals(6.00, pedido.getPreco(), 0.001);
        assertEquals("Cafe + Leite + Leite", pedido.getDescricao());
    }

    @Test
    void cafeSemAdicionaisTemDescricaoSimples() {
        Bebida cafe = new BebidaBase();
        assertFalse(cafe.getDescricao().contains("+"));
    }
}
