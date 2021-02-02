package javaoo;

public class LojaProduct {
	public static void main(String[] args) {
		Product item1 = new Product("Camiseta bonita");
		Product item2 = new Product(255, "Camisa identificada");
		Product item3 = new Product(256, "Camisa cara", 99.99);
		
		System.out.println(item1.descricao);
		System.out.println("----------------");
		System.out.println(item2.codigo);
		System.out.println(item2.descricao);
		System.out.println("----------------");
		System.out.println(item3.codigo);
		System.out.println(item3.descricao);
		System.out.println(item3.valorUnitario);
	}
}
