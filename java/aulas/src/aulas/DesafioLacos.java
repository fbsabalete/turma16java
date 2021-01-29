package aulas;

import java.util.Scanner;
public class DesafioLacos
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		final int habitantes = 3;
		double salario, totalSalario = 0, mediaFilhos, mediaSalario, maiorSalario = 0, percentual;
		int filhos, totalFilhos = 0, contador = 0;
		
		for (int x = 0; x < habitantes; x++)
		{
			System.out.print("Por favor, digite seu salário: ");
			salario = ler.nextDouble();
			
			System.out.print("Por favor, digite quantos filhos você tem: ");
			filhos = ler.nextInt();
			
			totalSalario += salario;
			
			totalFilhos += filhos;
			
			if (salario > maiorSalario)
			{
				maiorSalario = salario;
			}
			if (salario < 100)
			{
				contador++;
			}
		
		}
		
		ler.close();
		
		mediaFilhos = totalFilhos/3;
		
		mediaSalario = totalSalario/3;
		
		percentual = 100*contador/habitantes;
		
		System.out.printf("A média de salários é R$%.2f", mediaSalario);
		System.out.printf("\nA média de filhos é %.2f", mediaFilhos);
		System.out.printf("\nO maior salário é %.2f", maiorSalario);
		System.out.printf("\nO percentual de pessoas com salário menor que RS100,00 é %.2f %%", percentual);
		
	
	}
	
}