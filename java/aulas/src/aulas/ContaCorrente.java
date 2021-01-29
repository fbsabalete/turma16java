package aulas;

import java.util.Scanner;

public class ContaCorrente {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador = 1;
		double CC = 0.0, saldoAtual;
		char opcao = 's';

		System.out.print("Deseja emitir o Talão? S/N: ");
		opcao = leia.next().charAt(0);
		while (contador <= 3 && (opcao != 'N' || opcao != 'n')) {
			System.out.printf("----TALÃO DE CHEQUE----\n");
			System.out.printf("Valor:___________________\t\t\n");

			System.out.printf("Você pode emitir mais %d talões", (3 - contador));
			if (contador == 3) {
				System.out.println("Acabaram seus cheques");
			} else {
				System.out.println("Gostaria de emitir mais um?: ");
				opcao = leia.next().charAt(0);
				contador++;
			}
			System.out.println("Obrigado.");
		}
		leia.close();
	}
}
