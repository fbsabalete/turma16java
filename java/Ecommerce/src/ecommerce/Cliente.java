package ecommerce;
import java.util.Scanner;

public class Cliente {

	// Atributos
	protected String nome;
	protected char genero;
	protected double precoTotal = 0;


	public void setGenero() {
		Scanner leia = new Scanner(System.in);
		char genero = leia.next().toUpperCase().charAt(0);
		while (genero != 'F' && genero != 'M' && genero != 'O') {
			System.out.print("Opção inválida. Por favor, digite F para feminino, M para masculino ou O para outros: ");
			genero = leia.next().toUpperCase().charAt(0);
		}
		
		this.genero = genero;
	}

	// Método
	public String tratamento() {
		String apelido = "";
		if (genero == 'F') {
			apelido = "Sra. ";
		} else if (genero == 'M') {
			apelido = "Sr. ";
		} else {
			apelido = "Srx. ";
		}
		return apelido;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	// Encapsulamento
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getGenero() {
		return genero;
	}
}