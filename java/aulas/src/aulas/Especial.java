package aulas;

import java.util.Scanner;

public class Especial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char continua = 'S', movimento;
		int contador = 0;
		double valor, saldoAtual = 0.0, limiteEspecial = 1000.00;
		String descricao;
		System.out.println("CONTA ESPECIAL\n\n");

		while ((continua == 'S' || continua == 's') && contador < 10) {
			System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f", saldoAtual, limiteEspecial);
			System.out.print("\nSELECIONE O MOVIMENTO - D/C: ");
			movimento = ler.next().charAt(0);
			System.out.print("VALOR: R$");
			valor = ler.nextDouble();
			System.out.print("DESCRIÇÃO: ");
			descricao = ler.next();
			if (movimento == 'C' || movimento == 'c') {
				saldoAtual += valor;
				if (limiteEspecial == 1000) {
					System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f", saldoAtual, limiteEspecial);
				} else if (limiteEspecial < 1000) {
					if (limiteEspecial + valor < 1000) {
						limiteEspecial += valor;
					} else {
						limiteEspecial = 1000;
					}
					System.out.println("Aqui");
					System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f", saldoAtual, limiteEspecial);
				}
			} else if (movimento == 'D' || movimento == 'd') {
				saldoAtual = saldoAtual - valor;
				if (saldoAtual <= 0) {
					System.out.println("Saldo insuficiente");
					System.out.println("DESEJA USAR O LIMITE?[S,N]");
					continua = ler.next().charAt(0);
					if (continua == 'S' || continua == 's') {
						limiteEspecial = (saldoAtual + limiteEspecial);
						if (limiteEspecial >= 0) {
							System.out.printf("Você ainda tem R$%.2f no Limite Especial", limiteEspecial);
						} else {
							System.out.println("Saldo insuficiente");
						}
					} else {
						System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f", saldoAtual, limiteEspecial);
					}
				}

			}
			System.out.println("\nOutra Transação?[S,N]");
			continua = ler.next().charAt(0);
			contador++;
		}
		System.out.println("Até Logo");
	}
}