import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lanchonete {

    private List<Pedido> pedidos;

    public Lanchonete() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double calcularFaturamentoPorData(LocalDate data) {
        double total = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.getData().equals(data)) {
                total += pedido.getTotal();
            }
        }
        return total;
    }
}