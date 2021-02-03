package heranca;

public class Eletronico {
	
	private String nome;
	private double custo;
	
	public String getNome() {
		return nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public Eletronico(String nome, double custo) {
		super();
		this.nome = nome;
		this.custo = custo;
	}
	
	public void ligar() {
		System.out.println("O aparelho est� ligado!");
	}
	
	public void desligar() {
		System.out.println("O aparelho est� desligado!");
	}
	
}
