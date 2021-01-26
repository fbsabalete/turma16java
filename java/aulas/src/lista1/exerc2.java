package lista1;

import java.util.Scanner;

public class exerc2 {
	public static void main(String[] args) {
		int anos, meses, dias, sobraMeses;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Diga sua idade em dias: ");
		int idadeDias = read.nextInt();
		read.close();
		sobraMeses = (idadeDias % 365);
		dias = (sobraMeses % 30);
		
		anos = (idadeDias - sobraMeses) / 365;
		System.out.print(anos);
		meses = (sobraMeses - dias) / 30;
		System.out.print(meses);
		
		System.out.printf("Você tem %d anos, %d meses e %d dias", anos, meses, dias);
	}
}
