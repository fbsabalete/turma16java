package lista4;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int somaTotal = 0, somaDiagonal = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Digite os numeros para preencher a matriz: ");
				matriz[i][j] = sc.nextInt();
				somaTotal += matriz[i][j];
				if(i == j) {
					somaDiagonal += matriz[i][j];
				}
			}
		}
		
		System.out.printf("A soma total foi %d, e a diagonal principal %d", somaTotal, somaDiagonal);
	}
}
