package lista4;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numeros[] = new int[5];
		int maiorValor = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = read.nextInt();
			if(numeros[i] > maiorValor) {
				maiorValor = numeros[i];
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d, ", numeros[i]);
		}
		System.out.printf("e o maior valor foi: %d", maiorValor);
	}
}
