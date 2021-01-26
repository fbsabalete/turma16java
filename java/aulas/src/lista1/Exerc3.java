package lista1;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int A, B, C, R, S, D;
		
		System.out.println("Digite o valor de A: ");
		A = read.nextInt();
		System.out.println("Digite o valor de B: ");
		B = read.nextInt();
		System.out.println("Digite o valor de C: ");
		C = read.nextInt();
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		
		D = (R + S) / 2;
		System.out.printf("O valor de D = " + D);

	}
}
