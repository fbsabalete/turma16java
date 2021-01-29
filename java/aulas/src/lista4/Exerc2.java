package lista4;

public class Exerc2 {
	public static void main(String[] args) {
		int lancamentos[] = new int[10];
		int contador = 0, maiorValor = 0;
		double media = 0;
		
		for(int i = 0; i < 10; i++) {
			lancamentos[i] = (int)randomInt(1, 6);
			media += lancamentos[i];
			System.out.printf("%d, ", lancamentos[i]);
			if(lancamentos[i] >= maiorValor) {
				maiorValor = lancamentos[i];
			}
		}
		for(int i = 0; i < 10; i++) {
			if(maiorValor == lancamentos[i]) {
				contador++;
			}
		}
		media = media/10;
		System.out.printf("\nA média é %.2f e o maior valor foi %d, que apareceu %d vezes", media, maiorValor, contador);
		
	}

	public static double randomInt(int min, int max) {
		double x = (int)(Math.random()*((max-min)+1))+min;		
		return x;
	}
}