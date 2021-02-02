package javaoo;

public class Product {
	public int codigo;
	public String descricao;
	public double valorUnitario;
	
	public Product(String descricao) {
		this.descricao = descricao;
	}

	public Product(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Product(int codigo, String descricao, double valorUnitario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	
	
	
	
	
	
}
