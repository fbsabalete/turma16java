package lista1;

import java.util.Scanner;

public class Exerc8 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double custoConsumidor, custoFabrica, imposto;
		
		System.out.print("Digite o pre�o de f�brica do veiculo: ");
		custoFabrica = read.nextDouble();
		read.close();
		
		imposto = custoFabrica*0.45;
		custoConsumidor = custoFabrica + imposto + (custoFabrica*0.28);
		System.out.printf("O custo final do veiculo � de R$%.2f", custoConsumidor);
		
	}
}
