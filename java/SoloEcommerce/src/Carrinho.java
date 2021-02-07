
public class Carrinho extends Produto{
	private int qtdCompra;

    public Carrinho(int codigo, String descricao, double preco, int qtdEstoque, int qtdCompra) {
		super(codigo, descricao, preco, qtdEstoque);
		this.qtdCompra = qtdCompra;
	}

	public void subTotal() 
    {
    	
    }

    public Carrinho(int codigo, int qtdCompra) 
    {
        super(codigo);
        this.qtdCompra = qtdCompra;
        System.out.println("");
    }

    public int getQtdCompra() 
    {
        return qtdCompra;
    }

    public void setQtdCompra(int qtdCompra) 
    {
        this.qtdCompra = qtdCompra;
    }

	

}
