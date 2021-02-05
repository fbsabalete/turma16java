package cadFun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFun {
	public static void main(String[] args) {
		final int ACRESCIMO = 10;
		
		List <Empregado> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tCADASTRO DE FUNCIONARIOS");
		for(int i = 0; i < 3; i++) {
			System.out.printf("Funcionario %d\n", i);
			System.out.print("Terceirizado?[S/N]: ");
			char terceiro = sc.next().toUpperCase().charAt(0);
			System.out.print("Matrícula: ");
			int matricula = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			if(terceiro == 'S') {
				lista.add(new Terceiro(nome, matricula, horas, valorHora, ACRESCIMO));			
			}else {
				lista.add(new Empregado(nome, matricula, horas, valorHora));
			}
		}
		sc.close();
		System.out.println("[MATRICULA] [NOME]\t [SALARIO]");
		for(Empregado emp : lista) {
			System.out.printf("\t%d\t%s\tR$%.2f\n", emp.getMatricula(), emp.getNome(), emp.salario());
		}
		
	}
}
