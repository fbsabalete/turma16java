
public class Produto {
	private int codigo;
	private String descricao;
	private int qtdEstoque;
	private double preco;
	private int qtdCompra;
	private double precoTotalProduto;
	
	public int getQtdCompra() {
		return qtdCompra;
	}

	public void setQtdCompra(int qtdCompra) {
		this.qtdCompra = qtdCompra;
	}

	public void removerItem() {
		qtdEstoque += qtdCompra;
		qtdCompra = 0;
		precoTotalProduto = 0;
	}
	
	public void comprar(int qtdCompra) {
		this.qtdCompra = qtdCompra;
		precoTotalProduto = this.qtdCompra * this.preco;
		qtdEstoque -= qtdCompra;
	}
	
	
	public double getPrecoTotalProduto() {
		return precoTotalProduto;
	}
	
	public void getProduto() {
		System.out.printf("   %d\t%s   R$%.2f    %d\n", this.getCodigo(), this.getDescricao(), this.getPreco(), this.getQtdEstoque());
	}
	public void getComprados() {
		System.out.printf("   %d\t%s   R$%.2f    %d\n", this.getCodigo(), this.getDescricao(), this.getPreco(), this.qtdCompra);
	}
	
	
	public Produto(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Produto(int codigo, String descricao, double preco, int qtdEstoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
	}
	public Produto(int codigo, String descricao, double preco, int qtdEstoque, int qtdCompra) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
		this.qtdCompra = qtdCompra;
		this.precoTotalProduto = this.qtdCompra * this.preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
