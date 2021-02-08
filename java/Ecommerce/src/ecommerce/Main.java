package ecommerce;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static Scanner leia = new Scanner(System.in);
	public static Cliente cliente = new Cliente();
	public static List<Produto> carrinho = new ArrayList<>();
	public static List<Produto> produto = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException {
		produto = setup(); //definição da lista padrão por txt
		do {
			resetarEstoque();
			cabecalho();
			limparCarrinho();
			cadastro();
			int opcao;
			do {
				System.out.printf("\n\nEscolha uma opção:\n"
						+ "1 - Adicionar itens\n"
						+ "2 - Remover itens\n"
						+ "3 - Alterar itens\n"
						+ "4 - Ver carrinho\n"
						+ "5 - Limpar carrinho\n"
						+ "6 - Finalizar compra\n"
						+ "7 - Sair\n");
				
				System.out.println("Escolha: ");
				opcao = checkInt();
				while(opcao < 1 || opcao > 7) {
					System.out.println("Digite opção correta: ");
					opcao = checkInt();
				}
				
				switch(opcao) {
				case 1:
					adicionarItens();
					break;
				case 2: 
					removerItens();
					break;
				case 3:
					alterarItens();
					break;
				case 4:
					mostrarCarrinho();
					break;
				case 5:
					limparCarrinho();
					break;
				case 6:
					finalizarPedido();
					break;
				case 7:
					break;
				}
			}while(opcao != 7 && opcao != 6);
		}while(true);
	}
	
	public static void adicionarItens() {
		linhaDupla();
		int codigo;
		char op;
		do {
			mostrarLista();
			linhaDupla();
			System.out.println("Digite o código do produto desejado: ");
			codigo = checkInt();
			while(codigo < 1 || codigo > 10) {
				System.out.println("Digite um codigo valido: ");
				codigo = checkInt();
			}
			// Compra de item
			for (Produto prod : produto) {
				if (prod.getCodigo() == codigo) {
					if(prod.getQtdCompra() == 0) {
						System.out.println("Digite a quantidade desejada: ");
						int qtdCompra = checkInt();
						while(qtdCompra > prod.getQtdEstoque() || qtdCompra < 0) {
							System.out.println("Digite um valor valido.");
							qtdCompra = checkInt();
							linhaDupla();
						}
						prod.comprar(qtdCompra);
						carrinho.add(new Produto(prod.getCodigo(), prod.getDescricao(), prod.getPreco(),
								prod.getQtdEstoque(), qtdCompra));
					}else {
						System.out.println("Você ja comprou este item.");
					}
				}
				
			}
			
			cliente.precoTotal = 0;
			for(Produto prod : carrinho) {
				cliente.precoTotal += prod.getPrecoTotalProduto();
			}
			mostrarCarrinho();
			linhaDupla();
			System.out.println("Deseja adicionar mais itens [S/N]? ");
			op = leia.next().toUpperCase().charAt(0);
			linhaDupla();
		}while(op == 'S');
	}
	
	public static void alterarItens() {
		linhaDupla();
		mostrarCarrinho();
		int codigo;
		char op;
		if(!carrinho.isEmpty()) {
			do {
				linhaDupla();
				System.out.println("Digite o código do produto a alterar: ");
				codigo = checkInt();
				for(Produto prod : carrinho) {
					if(prod.getCodigo() == codigo) {
						prod.removerItem();
						System.out.printf("Qual a nova quantidade? Temos %d no estoque: ", prod.getQtdEstoque());
						prod.setQtdCompra(checkInt());
						while(prod.getQtdCompra() > prod.getQtdEstoque()) {
							System.out.printf("Digite um valor valido:");
							prod.setQtdCompra(checkInt());	
						}
						prod.comprar(prod.getQtdCompra());
					}
				}
				cliente.precoTotal = 0;
				for(Produto prod : carrinho) {
					cliente.precoTotal += prod.getPrecoTotalProduto();
				}
				System.out.println("Deseja realizar mais alguma alteração?[S/N] ");
				op = leia.next().toUpperCase().charAt(0);
				linhaDupla();
			}while(op == 'S');
		}else {
			System.out.println("Não é possivel alterar um carrinho vazio.");
		}
	}

	public static void removerItens() {
		linhaDupla();
		mostrarCarrinho();
		int codigo;
		char op;
		if(!carrinho.isEmpty()) {
			do {
				System.out.println("Digite o código do produto quer remover: ");
				codigo = leia.nextInt();
				int tempCodigo = 11;
				boolean codigoValido = false;
				for (Produto prod : carrinho) {
					if (prod.getCodigo() == codigo) {
						tempCodigo = carrinho.indexOf(prod);
						System.out.println(tempCodigo);
						codigoValido = true;
					}
				}
				if(codigoValido) {					
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
				}else {
					System.out.println("Código invalido.");
				}
				mostrarCarrinho();
				System.out.println("Deseja remover mais itens?[S/N] ");
				op = leia.next().toUpperCase().charAt(0);
			} while (op == 'S');
		}else {
			System.out.println("Você nao tem produtos no carrinho!");
		}
	}
	
	public static void finalizarPedido() {
		Pedido pedido = new Pedido();
		pedido.setPrecoTotal(cliente.getPrecoTotal());
		char continua;		
		if(!carrinho.isEmpty()) {
			linhaDupla();
			System.out.println("Formas de Pagamento:");
			do {
				pedido.imprimirFormaPgto();
				System.out.print("Escolha: ");
				pedido.setFormaPgto();
				linhaDupla();
				pedido.totalFinal();
				System.out.println("Confirma essa forma de pagamento? [S/N]");
				continua = leia.next().toUpperCase().charAt(0);
				linhaDupla();
				while (continua != 'S'&& continua != 'N') {
					System.out.print("Digite S para Sim ou N para não: ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			} while (continua == 'N');
			System.out.print("Deseja emitir a nota fiscal? [S/N]: ");
			continua = leia.next().toUpperCase().charAt(0);
			linhaDupla();
			while (continua != 'S' && continua != 'N') {
				System.out.print("Digite S para Sim ou N para não: ");
				continua = leia.next().toUpperCase().charAt(0);
			}
			if (continua == 'S') {
				
				pedido.gerarNota(cliente.getNome(), cliente.tratamento());
				mostrarCarrinho();
				System.out.println();
				double imposto = pedido.getPrecoTotal() * 0.09;
		        System.out.printf("Impostos de 9%%: R$%.2f\n", imposto);
		        System.out.printf("Forma de pagamento selecionada: %s\nPreço final: R$ %.2f\n",pedido.getPgto(),pedido.precoFinal,"\n");
		        linhaDupla();
			} else {
				
				System.out.println("Agradeçemos e volte sempre!");
			}
		}else {
			System.out.println("Não é possivel finalizar o pedido sem itens no carrinho.");
		}
	}
	
	public static void mostrarLista() {
		System.out.print("\n[CÓDIGO]");
		System.out.print("[PRODUTO]");
		System.out.print("\t[PREÇO]");
		System.out.print("\t   [ESTOQUE]\n");
		for (Produto prod : produto) {
			prod.getProduto();
		}
	}

	public static void mostrarCarrinho() {
		
		System.out.print("\n[CÓDIGO]");
		System.out.print("[PRODUTO]");
		System.out.print("  [PREÇO]");
		System.out.print(" [QTD]");
		System.out.print(" [VALOR ITEM]\n");
		for (Produto prod : carrinho) {
			prod.getComprados();
		}
		System.out.printf("\nSubtotal: R$%.2f\n", cliente.getPrecoTotal());
		
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
	
	public static int checkInt() {
		Scanner leia = new Scanner(System.in);
		while(!leia.hasNextInt()) {
			System.out.println("Digite um valor valido:");
			leia.next();
		}
		int checked = leia.nextInt();
		return checked;
	}
	
	public static void linhaDupla() {
		System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");

	}
	
	public static void resetarEstoque() {
		for(Produto prod : produto) {
			if(prod.getQtdEstoque() == 0) {
				System.out.printf("\nRepondo estoque de %s\n", prod.getDescricao());
				prod.setQtdEstoque(10);
			}
		}
	}
	
	public static void cabecalho() {
		System.out.println("\n");
		linhaDupla();
		System.out.println("\t\t\t\t\t\t—————————————————————————————————————————————————————————");
		System.out.println("\t\t\t\t\t——————————————————————— WEB LOJA PC QUASE FERA ———————————————————————");
		System.out.println("\t\t\t\t\t\t—————————————————————————————————————————————————————————");
		System.out.println("\t\t\t\t\tMontariamos o melhor computador do mercado se vendessemos peças o suficiente\n");
		linhaDupla();
	}
	
	public static void cadastro() {
		System.out.print("Por gentileza, informe seu nome: ");
		cliente.setNome(leia.next());
		System.out.print("Agora, informe seu genero: F para feminino, M para masculino ou O para outros: ");
		cliente.setGenero();
		System.out.printf("%s %s, cadastro efetuado.", cliente.tratamento(), cliente.getNome(),"\n");
	}
	
	public static void limparCarrinho() {
		for(Produto prod : carrinho) {
			prod.removerItem();
		}
		for(Produto prod : produto) {
			prod.setQtdCompra(0);
		}
		cliente.setPrecoTotal(0);
		carrinho.clear();
	}
}