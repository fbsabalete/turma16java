package lista3;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int totalPessoas = 0, idade, sexo, tipo, calmas = 0, calmasMenor = 0,
			mulherNervosa = 0, homemAgressivo = 0, outrosCalmos = 0, nervosaMaior40 = 0;
		final int MAXIMO = 6;
		while(totalPessoas < MAXIMO) {
			System.out.print("Idade: ");
			idade = read.nextInt();
			System.out.print("Sexo(Feminino[1]/Masculino[2]/Outros[1]): ");
			sexo = read.nextInt();
			System.out.print("Você se considera: Calma[1], Nervosa[2] ou Agressiva[3]? ");
			tipo = read.nextInt();
			totalPessoas++;
			
			if(tipo == 1) {
				calmas++;
				if(idade < 18) {
					calmasMenor++;
				}
				if(sexo == 3) {
					outrosCalmos++;
				}
			}
			if(tipo == 2) {
				if(sexo == 1) {
					mulherNervosa++;
				}
				if(idade > 40) {
					nervosaMaior40++;
				}
			}
			if(tipo == 3 && sexo == 2) {
				homemAgressivo++;
			}
		}
		read.close();
		
		System.out.printf("Pessoas calmas: %d", calmas);
		System.out.printf("\nMulheres nervosas: %d", mulherNervosa);
		System.out.printf("\nHomens agressivos: %d", homemAgressivo);
		System.out.printf("\nOutros calmos: %d", outrosCalmos);
		System.out.printf("\nNervosos com mais de 40: %d", nervosaMaior40);
		System.out.printf("\nCalmos menores de 18: %d", calmasMenor);
		
	}
}
