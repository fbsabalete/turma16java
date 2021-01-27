package aulas;

import java.util.Scanner;

public class ExemploIf {
	public static void main(String[] args) {
		/*Digitar um numero inteiro positivo.
		//Dizer se ele é par ou impar, se for 0 dizer que é neutro
		Se for negativo, nao pode.*/
		Scanner read = new Scanner(System.in);
		int numero;
		System.out.print("Digite um numero inteiro positivo: ");
		numero = read.nextInt();
		read.close();
		
		if(numero < 0) {
			System.out.println("Digite um numero positivo");
		}else if(numero == 0) {
			System.out.println("O numero 0 é neutro");
		}else if(numero % 2 == 0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
		
	}
}
