package lista1;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int segundosTotais, segundos, minutos, horas, minutosSobra;
		System.out.print("Digite quantos segundos teve o evento: ");
		segundosTotais = read.nextInt();
		read.close();
		minutosSobra = segundosTotais % 3600;
		segundos = minutosSobra % 60;
		
		horas = (segundosTotais - minutosSobra) / 3600;
		minutos = (minutosSobra - segundos) / 60;
		
		System.out.printf("O evento teve %d horas, %d minutos e %d segundos", horas, minutos, segundos);
	}
}
