package ooplista1;

public class Produto {
	private double preco;
	private String codigo;
	private String nome;
	private int estoque;
	
	public void comprar(int quantidade) {
		if(quantidade<=estoque) {
			System.out.println("Item comprado!");
			this.estoque -= quantidade;
		}else {
			System.out.println("Não temos essa quantidade em estoque.");
		}
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPreco() {
		return preco;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
