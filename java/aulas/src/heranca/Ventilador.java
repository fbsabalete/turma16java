package heranca;

public class Ventilador extends Eletronico {

	private int numeroPas;
	private int velocidades;
	private String tipo;
	
	public Ventilador(String nome, double custo, int numeroPas, String tipo) {
		super(nome, custo);
		this.numeroPas = numeroPas;
		this.tipo = tipo;
	}
	
	public void aumentarVelocidade() {
		System.out.println("Velocidade aumentou!");
	}
	
	public void diminuirVelocidade() {
		System.out.println("Velocidade diminuiu!");
	}

	public int getNumeroPas() {
		return numeroPas;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public String getTipo() {
		return tipo;
	}

	public void setNumeroPas(int numeroPas) {
		this.numeroPas = numeroPas;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
