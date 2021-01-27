package lista2;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idade;
		String categoria;
		
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();
		read.close();
		
		if(idade >= 10 && idade <= 14) {
			categoria = "Infantil";
		}else if(idade >= 15 && idade <= 17) {
			categoria = "Juvenil";
		}else {
			categoria = "Adulto";
		}
		System.out.printf("Sua categoria é %s", categoria);
	}
}
