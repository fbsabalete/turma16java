package lista2;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numeros[] = new int[3]; 
		int tempNum;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = read.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 3; j++) {
				if(numeros[i] > numeros[j]) {
					tempNum = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = tempNum;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d ", numeros[i]);
		}
	}
}
