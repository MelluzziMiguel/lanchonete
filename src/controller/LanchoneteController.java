package controller;

import model.*;

import java.time.LocalDate;

public class LanchoneteController {

    private Lanchonete lanchonete;

    public LanchoneteController() {
        this.lanchonete = new Lanchonete();
    }

    public Pedido criarPedido() {
        return new Pedido();
    }

    public void adicionarItem(Pedido pedido, Produto produto, int quantidade) {
        pedido.adicionarItem(new ItemPedido(produto, quantidade));
    }

    public void finalizarPedido(Pedido pedido) {
        pedido.finalizar();
        lanchonete.adicionarPedido(pedido);
    }

    public double consultarFaturamentoHoje() {
        return lanchonete.calcularFaturamentoPorData(LocalDate.now());
    }
}