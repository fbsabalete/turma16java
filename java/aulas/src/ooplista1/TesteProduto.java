package ooplista1;

public class TesteProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setCodigo("A001");
		produto.setEstoque(10);
		produto.setNome("Monitor Funcional");
		produto.setPreco(700.00);
		
		System.out.println("Dados do produto:");
		System.out.println(produto.getCodigo());
		System.out.println(produto.getEstoque());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		
		produto.comprar(10);
	}
}
