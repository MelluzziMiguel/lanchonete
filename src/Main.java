import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Lanchonete lanchonete = new Lanchonete();

        Produto xBurger = new Produto("XBurger", "Hamburguer", 15.0);
        Produto refri = new Produto("Refrigerante", "Lata", 6.0);

        Pedido pedido1 = new Pedido();
        pedido1.adicionarItem(new ItemPedido(xBurger, 2));
        pedido1.adicionarItem(new ItemPedido(refri, 1));
        pedido1.finalizar();

        lanchonete.adicionarPedido(pedido1);

        Pedido pedido2 = new Pedido();
        pedido2.adicionarItem(new ItemPedido(refri, 3));
        pedido2.finalizar();

        lanchonete.adicionarPedido(pedido2);

        double faturamento = lanchonete.calcularFaturamentoPorData(LocalDate.now());

        System.out.println("Faturamento do dia: R$ " + faturamento);
    }
}