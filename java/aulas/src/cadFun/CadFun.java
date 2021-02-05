package cadFun;

import java.util.Scanner;

public class CadFun {
	public static void main(String[] args) {
		final int ACRESCIMO = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tCADASTRO DE FUNCIONARIOS");
		System.out.print("Matrícula: ");
		int matricula = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Terceirizado?[S/N]: ");
		char terceiro = sc.next().toUpperCase().charAt(0);
		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		sc.close();
		
		if(terceiro == 'S') {
			Empregado terc = new Terceiro(nome, matricula, horas, valorHora, ACRESCIMO);
			System.out.println("------------------------------------\nFUNCIONARIO:");
			System.out.printf("Nome: %s\nMatricula: %d\nHoras trabalhadas: %d\nValor por Hora: %.2f\n", terc.getNome(), terc.getMatricula(), terc.getHoras(), terc.getValorHora());
			System.out.printf("\nSalário total: %.2f", terc.salario());
			
		}else {
			Empregado func1 = new Empregado(nome, matricula, horas, valorHora);
			System.out.println("------------------------------------\nFUNCIONARIO:");
			System.out.printf("Nome: %s\nMatricula: %d\nHoras trabalhadas: %d\nValor por Hora: %.2f", func1.getNome(), func1.getMatricula(), func1.getHoras(), func1.getValorHora());
			System.out.printf("\nSalário total: %.2f", func1.salario());
		}
	}
}
