package lista1;

import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double x1, y1, x2, y2, d;
		
		System.out.print("Dê o ponto x1: ");
		x1 = read.nextDouble();
		System.out.print("Dê o ponto y1: ");
		y1 = read.nextDouble();
		System.out.print("Dê o ponto x2: ");
		x2 = read.nextDouble();
		System.out.print("Dê o ponto y2: ");
		y2 = read.nextDouble();
		
		read.close();
		
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("O valor da distância é d = %.2f", d);
	}
}
