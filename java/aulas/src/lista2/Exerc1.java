package lista2;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = read.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = read.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = read.nextInt();
		read.close();
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.printf("O maior número é %d", num1);
			}
		}else if (num2 > num3) {
			System.out.printf("O maior número é %d", num2);
		}else {
			System.out.printf("O maior número é %d", num3);
		}
	}
}
