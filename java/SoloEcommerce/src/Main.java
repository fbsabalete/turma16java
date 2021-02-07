import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException  {
		List<Cliente> cliente = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();
		List<Produto> produto = setup();
		
		System.out.println("\t\t\t\t\tWEB LOJA PC QUASE FERA");
        System.out.println("\t\tMontariamos o melhor computador do mercado se vendessemos peças o suficiente\n");
        
        System.out.print("Por gentileza, informe seu nome: ");
        
        System.out.print("Agora, informe seu genero: F para feminino, M para masculino ou O para outros: ");
        
        //System.out.printf("%s %s, cadastro efetuado.", apelido, nome);
        mostrarLista(produto);
        //Compra de item
        int codigo = 3;
        int qtdCompra = 2;
        for(Produto prod : produto) {
        	if(prod.getCodigo() == codigo) {
        		prod.comprar(qtdCompra);
        		carrinho.add(new Produto(prod.getCodigo(), prod.getDescricao(), prod.getPreco(), prod.getQtdEstoque(), qtdCompra));
        	}
        }
        
        //Remoção de item
        int tempCodigo = 1;
        for(Produto prod : carrinho) {
        	if(prod.getCodigo() == codigo) {
        		tempCodigo = carrinho.indexOf(prod);
        	}else {
        		System.out.println("Código invalido");
        	}
        }
        carrinho.remove(tempCodigo);
        for(Produto prod : produto) {
        	if(prod.getCodigo() == codigo) {
        		prod.removerItem();
        	}else {
        		System.out.println("Código invalido");
        	}
        }
        
        
        
        
        
        mostrarCarrinho(carrinho);
        mostrarLista(produto);
        
        
	}
	
	public static void mostrarLista(List <Produto> produto) {
		System.out.print("\n[CÓDIGO]");
		System.out.print("[PRODUTO]");
		System.out.print("  [PREÇO]");
        System.out.print(" [ESTOQUE]\n");
        for(Produto prod:produto) {
			prod.getProduto();
		}
	}
	public static void mostrarCarrinho(List <Produto> carrinho) {
		System.out.print("\n[CÓDIGO]");
		System.out.print("[PRODUTO]");
		System.out.print("  [PREÇO]");
		System.out.print(" [QTD]\n");
		for(Produto prod:carrinho) {
			prod.getComprados();
		}
	}
	
	public static List<Produto> setup() throws FileNotFoundException {
		List<Produto> produto = new ArrayList<>();
		File file = new File("C:\\temp\\Lista.txt");
	    Scanner sc = null;
		int codigo;
		String descricao;
		int qntEstoque;
		double preco;
		String lineSplit[] = new String[4];
        sc = new Scanner(file);
		while(sc.hasNext()) {
			lineSplit = sc.next().split(",");
			codigo = Integer.parseInt(lineSplit[0]);
			descricao = lineSplit[1].toUpperCase();
			qntEstoque = Integer.parseInt(lineSplit[2]);
			preco = Double.parseDouble(lineSplit[3]);
			produto.add(new Produto(codigo, descricao, preco, qntEstoque));
		}
		sc.close();
		
		
		return produto;
		
	}
}
