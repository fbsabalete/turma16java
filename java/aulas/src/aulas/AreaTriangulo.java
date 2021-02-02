package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base, altura, area1, area2, area3, maiorArea;
		String triangulo = ""; 
		
		System.out.println("Digite a base do triangulo 1: ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 1: ");
		altura = leia.nextDouble();
		area1 = ((base * altura) / 2 );
		
		System.out.println("Digite a base do triangulo 2: ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 2: ");
		altura = leia.nextDouble();
		area2 = ((base * altura) / 2 );
		
		System.out.println("Digite a base do triangulo 3: ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 3: ");
		altura = leia.nextDouble();
		area3 = ((base * altura) / 2 );
		
		
		if(area1 > area2) {
			if(area1 > area3) {
				triangulo = "Triangulo 1";
				maiorArea = area1;
			}else {
				triangulo = "Triangulo 3";
				maiorArea = area3;
			}
		}else if(area2 > area3) {
			triangulo = "Triangulo 2";
			maiorArea = area2;
		}else {
			triangulo = "Triangulo 3";
			maiorArea = area3;
		}
		
		System.out.printf("A(s) maior(es) área(s) %s, com área de %.2f", triangulo, maiorArea);

	}
}
