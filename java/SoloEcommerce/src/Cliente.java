
public class Cliente {
	private String nome;
	private char genero;
	
	public String tratamentoGenero() {
		if(this.genero == 'F') {
			return "Sra.";
		}else if(this.genero == 'M') {
			return "Sr.";
		}else {
			return "Srx.";
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public Cliente(String nome, char genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}
	
	
}
