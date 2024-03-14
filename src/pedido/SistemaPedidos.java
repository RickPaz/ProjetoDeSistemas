package pedido;

public class SistemaPedidos {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Produto prod  = new Produto(1,  "Martelo", 25.0);
        ItemPedido item = new ItemPedido(prod, 2);
        pedido.addItem(item);
        
        prod  = new Produto(2,  "Alicate", 45.0);
        item = new ItemPedido(prod, 3);
        pedido.addItem(item);
        
        
        System.out.println("Total: " + pedido.valorTotal());
    }
    
}
