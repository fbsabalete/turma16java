package ooplista3;

public class Cachorro extends Animal{
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "AUAU";
	}

	@Override
	public void locomover() {
		System.out.println("Correndo a pé");
	}
}
