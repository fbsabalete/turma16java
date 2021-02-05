package ooplista3;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		return "NYE";
	}

	@Override
	public void locomover() {
		System.out.println("Galopando");
	}
	
}
