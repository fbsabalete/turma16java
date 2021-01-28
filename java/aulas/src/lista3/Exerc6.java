package lista3;

import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero, contador = 0;
		double media, totalMultiplo = 0;
		do {
			System.out.print("Digite um numero, e 0 para sair: ");
			numero = read.nextInt();
			if(numero % 3 == 0 && numero != 0) {
				totalMultiplo += numero;
				contador++;
			}
		}while(numero != 0);
		read.close();
		media = totalMultiplo / contador;
		System.out.printf("A média dos multiplos de 3 é: %.2f", media);
	}
}
