package lista1;

import java.util.Scanner;

public class exerc2 {
	public static void main(String[] args) {
		int anos, meses, dias, sobraMeses;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Diga sua idade em dias: ");
		int idadeDias = read.nextInt();
		
		sobraMeses = (idadeDias % 365);
		dias = (sobraMeses % 30);
		
		anos = (idadeDias - sobraMeses) / 365;
		System.out.println(anos);
		meses = (sobraMeses - dias) / 30;
		System.out.println(meses);
		
		System.out.printf("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias");
	}
}
