import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leia = new Scanner(System.in);
		Cliente cliente = new Cliente();
		List<Produto> carrinho = new ArrayList<>();
		List<Produto> produto = setup();
		char op2;
		
		do {
			int contador = 0;
			for(Produto prod : produto) {
				if(prod.getQtdEstoque() == 0) {
					contador++;
				}
			}
			if(contador == 9) {
				System.out.println("aaaaaaaa");
				for(Produto prod : produto) {
					prod.setQtdEstoque(10);
				}
			}
			System.out.println("\t\t\t\t\tWEB LOJA PC QUASE FERA");
			System.out.println("\t\tMontariamos o melhor computador do mercado se vendessemos peças o suficiente\n");
			System.out.print("Por gentileza, informe seu nome: ");
			leia.nextLine();
			cliente.setNome(leia.nextLine());
			System.out.print("Agora, informe seu genero: F para feminino, M para masculino ou O para outros: ");
			cliente.setGenero();
			System.out.printf("%s %s, cadastro efetuado.", cliente.tratamento(), cliente.getNome());
			
			/*
			 * 1 - Adicionar itens 
			 * 2 - Remover itens 
			 * 3 - Ver carrinho 
			 * 4 - Finalizar comprar
			 * 5 - Sair
			 */
			int opcao;
			do {
				System.out.printf("Escolha uma opção:\n"
						+ "1 - Adicionar itens\n"
						+ "2 - Remover itens\n"
						+ "3 - Ver carrinho\n"
						+ "4 - Limpar carrinho"
						+ "5 - Finalizar compra\n"
						+ "6 - Sair\n"
						+ "Escolha: ");
				opcao = leia.nextInt();
				switch(opcao) {
				case 1:
					adicionarItens(produto,carrinho, cliente);
					break;
				case 2: 
					removerItens(produto,carrinho, cliente);
					break;
				case 3:
					double precoTotal = cliente.getPrecoTotal();
					mostrarCarrinho(carrinho,precoTotal);
					break;
				case 4:
					for(Produto prod : carrinho) {
						prod.removerItem();
					}
					carrinho.clear();
				case 5:
					finalizarPedido(produto,carrinho, cliente);
				case 6:
					break;
				}
			}while(opcao != 4 && opcao != 5);
		}while(true);
		
	}

	public static void finalizarPedido(List<Produto> produto, List<Produto> carrinho, Cliente cliente) {
		Pedido pedido = new Pedido();
		pedido.setPrecoTotal(cliente.getPrecoTotal());
		char continua;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Formas de Pagamento:");
	    do {
	    pedido.imprimirFormaPgto();
	    System.out.print("Escolha: ");
	    pedido.setFormaPgto();
	    pedido.totalFinal();
	    System.out.println("Confirma essa forma de pagamento? [S/N]");
	    continua = leia.next().toUpperCase().charAt(0);
		    while (continua != 'S'&& continua != 'N') {
		    	System.out.print("Digite S para Sim ou N para não: ");
		        continua = leia.next().toUpperCase().charAt(0);
		    }
	    } while (continua == 'N');
	    System.out.print("Deseja emitir a nota fiscal? [S/N]: ");
	    continua = leia.next().toUpperCase().charAt(0);
	    while (continua != 'S' && continua != 'N') {
	    	System.out.print("Digite S para Sim ou N para não: ");
	        continua = leia.next().toUpperCase().charAt(0);
	    }
	    if (continua == 'S') {
	    	
	    	pedido.cabecalho();
	        System.out.println("Cliente: " + cliente.tratamento() + cliente.getNome());
	    	
	    	double imposto = pedido.getPrecoTotal() * 0.09;
	        System.out.printf("\nImpostos de 9%%: R$%.2f\n", imposto);
	        System.out.printf("\nForma de pagamento selecionada: %s\nPreço final: R$ %.2f",pedido.getPgto(),pedido.precoFinal,"\n");
	    	
	    } else {
	    	
	    	System.out.println("Agradeçemos e volte sempre!");
	    }
	}
	
	public static void adicionarItens(List<Produto> produto, List<Produto> carrinho, Cliente cliente) {
		mostrarLista(produto);
		Scanner ler = new Scanner(System.in);
		int codigo;
		char op;
		do {
			System.out.println("Digite o código do produto desejado: ");
			codigo = ler.nextInt();
			System.out.println("Digite a quantidade desejada: ");
			int qtdCompra;
			qtdCompra = ler.nextInt();
			// Compra de item
			for (Produto prod : produto) {
				if (prod.getCodigo() == codigo) {
					prod.comprar(qtdCompra);
					carrinho.add(new Produto(prod.getCodigo(), prod.getDescricao(), prod.getPreco(),
							prod.getQtdEstoque(), qtdCompra));
				}
			}
			cliente.precoTotal = 0;
			for(Produto prod : carrinho) {
				cliente.precoTotal += prod.getPrecoTotalProduto();
			}
			mostrarCarrinho(carrinho,cliente.getPrecoTotal());
			System.out.println("Deseja adicionar mais itens? ");
			op = ler.next().toUpperCase().charAt(0);
		}while(op == 'S');
	}
	
	public static void removerItens(List<Produto> produto, List<Produto> carrinho, Cliente cliente) {
		mostrarCarrinho(carrinho,cliente.getPrecoTotal());
		Scanner leia = new Scanner(System.in);
		int codigo;
		char op;
		do {
			System.out.println("Digite o código do produto quer remover: ");
			codigo = leia.nextInt();
			int tempCodigo = 1;
			for (Produto prod : carrinho) {
				if (prod.getCodigo() == codigo) {
					tempCodigo = carrinho.indexOf(prod);
				}
			}
			carrinho.remove(tempCodigo);
			for (Produto prod : produto) {
				if (prod.getCodigo() == codigo) {
					cliente.precoTotal -= prod.getPrecoTotalProduto();
					prod.removerItem();
				}
			}
			cliente.precoTotal = 0;
			for(Produto prod : carrinho) {
				cliente.precoTotal += prod.getPrecoTotalProduto();
			}
			mostrarCarrinho(carrinho, cliente.precoTotal);
			System.out.println("Deseja remover mais itens? ");
			op = leia.next().toUpperCase().charAt(0);
		} while (op == 'S');
		leia.close();
	}

	public static void mostrarLista(List<Produto> produto) {
		System.out.print("\n[CÓDIGO]");
		System.out.print("[PRODUTO]");
		System.out.print("  [PREÇO]");
		System.out.print(" [ESTOQUE]\n");
		for (Produto prod : produto) {
			prod.getProduto();
		}
	}

	public static void mostrarCarrinho(List<Produto> carrinho, double precoTotal) {
		
		System.out.print("\n[CÓDIGO]");
		System.out.print("[PRODUTO]");
		System.out.print("  [PREÇO]");
		System.out.print(" [QTD]\n");
		for (Produto prod : carrinho) {
			prod.getComprados();
		}
		System.out.printf("Subtotal: R$%.2f\n", precoTotal);
		
	}

	public static List<Produto> setup() throws FileNotFoundException {
		List<Produto> produto = new ArrayList<>();
		File file = new File("Lista.txt");
		Scanner sc = null;
		int codigo;
		String descricao;
		int qntEstoque;
		double preco;
		String lineSplit[] = new String[4];
		sc = new Scanner(file);
		while (sc.hasNext()) {
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
