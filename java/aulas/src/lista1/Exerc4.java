package lista1;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int A, B, C, R, S, D;
		
		System.out.print("Digite o valor de A: ");
		A = read.nextInt();
		System.out.print("Digite o valor de B: ");
		B = read.nextInt();
		System.out.print("Digite o valor de C: ");
		C = read.nextInt();
		read.close();
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		
		D = (R + S) / 2;
		System.out.printf("D = %d", D);

	}
}
