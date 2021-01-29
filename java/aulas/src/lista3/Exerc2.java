package lista3;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero, pares = 0, impares = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero: ");
			numero = read.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		read.close();
		System.out.printf("O numero de pares foi %d e de impares %d", pares, impares);
	}
}
