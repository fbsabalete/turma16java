package ooplista3;

public class Main {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Marlon", 7);
		Cavalo cavalo = new Cavalo("Jackson", 5);
		Preguica preguica = new Preguica("Fabiano", 9);
		
		System.out.println("---CACHORRO---");
		System.out.printf("Nome: %s\nIdade: %d\n", dog.getNome(), dog.getIdade());
		dog.locomover();
		dog.emitirSom();
		System.out.println("---CAVALO---");
		System.out.printf("Nome: %s\nIdade: %d\n", cavalo.getNome(), cavalo.getIdade());
		cavalo.locomover();
		cavalo.emitirSom();
		System.out.println("---PREGUIÇA---");
		System.out.printf("Nome: %s\nIdade: %d\n", preguica.getNome(), preguica.getIdade());
		preguica.locomover();
		preguica.emitirSom();
		
		

		
	}
}
