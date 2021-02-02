package javaoo;


public class ProjetoOO1 {
	//banca de revista, adega, curso de ingles < 18 
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Rui Almeida", true);
		Pessoa pessoa2 = new Pessoa("Marcos");
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.estaViva);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.estaViva);
	}
	
}
