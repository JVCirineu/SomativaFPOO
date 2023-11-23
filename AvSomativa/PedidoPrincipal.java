package AvSomativa;

public class PedidoPrincipal {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(1, "Maionese", 1);
		System.out.println(pedido.getId());
		System.out.println(pedido.getProduto());
		System.out.println(pedido.getQuantidade());
		
		
		System.out.println("-------------");
		
		Pedido pedido2 = new Pedido(2, "Ketchup", 1);
		System.out.println(pedido2.getId());
		System.out.println(pedido2.getProduto());
		System.out.println(pedido2.getQuantidade());
		
	}
}
