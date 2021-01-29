package aulas;

import java.util.Scanner;

public class DesafioTimes {
	public static void main(String[] args) {
		/*
		 * 4 times, G/P/E, 4 rodadas, G = 3, E = 1, P = 0
		 * Escolha um time, mostra os pontos
		 */
		String times[] = {"Palmeiras", "SPFC", "Santos", "Corinthians"};
		int pontos[] = new int[4];
		int vitorias[] = new int[4];
		int perdas[] = new int [4];
		int empates[] = new int[4];
		char resultado, continua;
		int time, indice;
		Scanner read = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.printf("\tRodada %d", i+1);
			System.out.println();
			for(int j = 0; j < 4; j++) {
				System.out.printf(times[j] + " [G/P/E]: ");
				resultado = read.next().toUpperCase().charAt(0);
				switch(resultado) {
					case 'G':
						pontos[j] += 3;
						vitorias[j]++;
						break;
					case 'P':
						pontos[j] += 0;
						perdas[j]++;
						break;
					case 'E':
						pontos[j] += 1;
						empates[j]++;
						break;
					default:
						while(resultado != 'G' && resultado != 'P' && resultado != 'E') {
							System.out.print("Digite um resultado válido: ");
							resultado = read.next().toUpperCase().charAt(0);
						}
				}
			}
		}
		
		do {
			System.out.print("\nEscolha um time para mostrar o resultado (1-Palmeiras, 2-SPFC, 3-Santos, 4-Corinthians: ");
			time = read.nextInt();
			indice = time - 1;
			System.out.printf("Time: %s\n"
					+"Vitórias: %d\n"
					+"Empates: %d\n"
					+"Derrotas: %d\n"
					+"Pontos: %d", times[indice], vitorias[indice], empates[indice], perdas[indice], pontos[indice]
					);	
			System.out.print("\n\nDeseja ver o resultado de outro time?[S/N] ");
			continua = read.next().toUpperCase().charAt(0);
		}while(continua == 'S');
	}
}
