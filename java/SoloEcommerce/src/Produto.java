
public class Produto {
	private int codigo;
	private String descricao;
	private int qtdEstoque;
	private double preco;
	
	/*
	 * -codigo: int
		-descricao: String
		-qtdEstoque: int
		-preco: double
		+verificarEstoque() : void
		+atualizarEstoque(): void
		+gets
		+sets
	 */
	
	public void getProduto() {
		System.out.printf("   %d\t%s   R$%.2f    %d\n", this.getCodigo(), this.getDescricao(), this.getPreco(), this.getQtdEstoque());
	}
	
	public void atualizarEstoque(int qtd) {
		this.qtdEstoque -= qtd;
	}
	
	public Produto(int codigo, String descricao, double preco, int qtdEstoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
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
