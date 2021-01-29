package lista2;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		System.out.print("Digite um numero inteiro positivo: ");
		numero = read.nextInt();
		read.close();
		
		if(numero < 0) {
			System.out.println("Digite um numero positivo");
		}else if(numero == 0) {
			System.out.println("O numero 0 � neutro");
		}else if(numero % 2 == 0) {
			System.out.printf("O numero � par, e sua ra�z quadrada � %.2f", Math.sqrt(numero));
		}else {
			System.out.printf("O numero � impar, e seu quadrado � %.0f", Math.pow(numero, 2));
			
		}
	}
}
