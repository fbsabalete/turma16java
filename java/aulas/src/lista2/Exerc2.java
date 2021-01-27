package lista2;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1, num2, num3, primeiro, segundo, terceiro;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = read.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = read.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = read.nextInt();
		read.close();
		if(num1 < num2 && num1 < num3) {
			primeiro = num1;
			if(num2 < num3) {
				segundo = num2;
				terceiro = num3;
			}else {
				segundo = num3;
				terceiro = num2;
			}
		}else if(num2 < num1 && num2 < num3) {
			primeiro = num2;
			if(num1 < num3) {
				segundo = num1;
				terceiro = num3;
			}else {
				segundo = num3;
				terceiro = num1;
			}
		}else {
			primeiro = num3;
			if(num2 < num1) {
				segundo = num2;
				terceiro = num1;
			}else {
				segundo = num1;
				terceiro = num2;
			}
		}
		System.out.printf("1º -- %d \n2º -- %d \n3º -- %d", primeiro, segundo, terceiro);
	}
}
