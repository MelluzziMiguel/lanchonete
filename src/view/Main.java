package view;

import controller.LanchoneteController;
import model.Pedido;
import model.Produto;

public class Main {

    public static void main(String[] args) {

        LanchoneteController controller = new LanchoneteController();

        Produto xBurger = new Produto("XBurger", "Hamburguer", 15.0);
        Produto refri = new Produto("Refrigerante", "Lata", 6.0);

        Pedido pedido1 = controller.criarPedido();
        controller.adicionarItem(pedido1, xBurger, 2);
        controller.adicionarItem(pedido1, refri, 1);
        controller.finalizarPedido(pedido1);

        Pedido pedido2 = controller.criarPedido();
        controller.adicionarItem(pedido2, refri, 3);
        controller.finalizarPedido(pedido2);

        double faturamento = controller.consultarFaturamentoHoje();

        System.out.println("Faturamento do dia: R$ " + faturamento);
    }
}