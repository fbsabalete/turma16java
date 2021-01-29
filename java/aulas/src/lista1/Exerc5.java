package lista1;

import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = read.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = read.nextInt();
		System.out.print("Digite a terceira nota: ");
		nota3 = read.nextInt();
		
		read.close();
		
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.printf("A média das notas é %d", media);
	}
}
