package ooplista3;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "...";
	}

	@Override
	public void locomover() {
		System.out.println("Subindo em uma arvore.");
	}
	
}
