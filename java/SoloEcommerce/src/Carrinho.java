
public class Carrinho extends Produto{
	private int qtdCompra;

	public void limpaCarrinho() {
		
	}
	
	public void subTotal() {
		
	}
	
	public Carrinho(int codigo, String descricao, double preco, int qtdEstoque, int qtdCompra) {
		super(codigo, descricao, preco, qtdEstoque);
		this.qtdCompra = qtdCompra;
	}

	public int getQtdCompra() {
		return qtdCompra;
	}

	public void setQtdCompra(int qtdCompra) {
		this.qtdCompra = qtdCompra;
	}
	
	
	

}
