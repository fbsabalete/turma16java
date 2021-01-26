package lista1;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		
		System.out.println("Digite quantos anos você tem: ");
		anos = read.nextInt();
		System.out.println("Agora quantos meses: ");
		meses = read.nextInt();
		System.out.println("E os dias: ");
		dias = read.nextInt();
		
		idadeDias = anos * 365 + meses * 30 + dias;
		
		System.out.println("Você tem " + idadeDias  + "dias de idade");
		
	}

}
