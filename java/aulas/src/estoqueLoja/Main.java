package estoqueLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List <Produto> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int op = 1;
		int indice;
		int estoque;
		String produto;
		double preco;
		while(op!=0) {
			System.out.println("[INDICE][PRODUTO][PREÇO][ESTOQUE]");
			for(Produto prod : lista) {
				System.out.printf("%d\t%s\t%.2f\t%d\n", lista.indexOf(prod),prod.getNome(), prod.getPreco(), prod.getEstoque());
			}
			System.out.printf("Escolha uma opção:\n"
					+ "1 - Adicionar\n"
					+ "2 - Alterar\n"
					+ "3 - Remover\n"
					+ "0 - Sair\n");
			op = sc.nextInt();
			
			switch(op) {
			case 1: 
				System.out.print("Produto: ");
				sc.nextLine();
				produto = sc.nextLine();
				System.out.print("Preço: ");
				preco = sc.nextDouble();
				System.out.print("Estoque: ");
				estoque = sc.nextInt();
				lista.add(new Produto(produto, preco, estoque));
				break;
			case 2:
				if(!lista.isEmpty()) {
					System.out.println("Selecione um indice da lista para alterar:");
					indice = sc.nextInt();
					lista.remove(indice);
					System.out.print("Produto: ");
					sc.nextLine();
					produto = sc.nextLine();
					System.out.print("Preço: ");
					preco = sc.nextDouble();
					System.out.print("Estoque: ");
					estoque = sc.nextInt();
					lista.add(new Produto(produto, preco, estoque));
					break;
				}else {
					System.out.println("O estoque está vazio.");
				}
			case 3:
				if(!lista.isEmpty()) {
					System.out.println("Selecione um indice da lista para remover:");
					indice = sc.nextInt();
					lista.remove(indice);					
				}else {
					System.out.println("A lista esta vazia.");
				}
			case 0:
				System.out.println("[INDICE][PRODUTO][PREÇO][ESTOQUE]");
				for(Produto prod : lista) {
					System.out.printf("%d\t%s\t%.2f\t%d\n", lista.indexOf(prod),prod.getNome(), prod.getPreco(), prod.getEstoque());
				}
			}
		}
	}
}
