package aulas;

import java.util.Scanner;

public class DesafioDoWhile {
	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que pegue um número do teclado e calcule 
		 * a soma de todos os números  de 1 até ele. 
		 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
		 */
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0, i = 1;
		
		System.out.print("Digite um numero: ");
		numero = ler.nextInt();
		do {
			soma += i;
			i++;
		}while(i <= numero);
		System.out.println(soma);
	}
}
