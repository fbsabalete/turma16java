package lista1;

import java.util.Scanner;

public class Exerc7 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite o coeficiente a: ");
		a = read.nextDouble();
		System.out.print("Digite o coeficiente b: ");
		b = read.nextDouble();
		System.out.print("Digite o coeficiente c: ");
		c = read.nextDouble();
		System.out.print("Digite o coeficiente d: ");
		d = read.nextDouble();
		System.out.print("Digite o coeficiente e: ");
		e = read.nextDouble();
		System.out.print("Digite o coeficiente f: ");
		f = read.nextDouble();
		read.close();
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.printf("O valor de x é %.2f e y %.2f", x,y);
		
		
	}
}
