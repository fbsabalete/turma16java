package lista1;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		
		System.out.print("Digite quantos anos você tem: ");
		anos = read.nextInt();
		System.out.print("Agora quantos meses: ");
		meses = read.nextInt();
		System.out.print("E os dias: ");
		dias = read.nextInt();
		
		read.close(); 
		
		idadeDias = anos * 365 + meses * 30 + dias;
		
		System.out.printf("Você tem %d dias de idade", idadeDias);
		
	}

}
