import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private LocalDate data;
    private List<ItemPedido> itens;

    public Pedido() {
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void finalizar() {
        if (itens.isEmpty()) {
            throw new IllegalStateException("Pedido sem itens");
        }

        System.out.println("Pedido finalizado. Total: R$ " + calcularTotal());
    }

    public LocalDate getData() {
        return data;
    }

    public double getTotal() {
        return calcularTotal();
    }
}