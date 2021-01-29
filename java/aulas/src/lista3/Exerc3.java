package lista3;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idade = 0, menor21 = 0, maior50 = 0;
		while(idade != -99) {
			System.out.print("Diga sua idade: ");
			idade = read.nextInt();
			if(idade < 21) {
				menor21++;
			}else if(idade > 50) {
				maior50++;
			}
		}
		read.close();
		System.out.printf("O numero de pessoas com menos de 21 anos foi de %d e com mais de 50 foi %d", menor21, maior50 );
	}
}
