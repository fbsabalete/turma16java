package lista3;

import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero, soma = 0;
		do {
			System.out.print("Digite numeros para somar. Para parar, digite 0: ");
			numero = read.nextInt();
			soma += numero;
		}while(numero != 0);
		read.close();
		System.out.printf("A soma dos numeros foi: %d", soma);
	}
}
