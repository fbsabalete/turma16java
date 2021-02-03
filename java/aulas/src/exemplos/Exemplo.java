package exemplos;

public class Exemplo {
	private String nome;
	public int identificacao;
	
	
	public String getNome() {
		return nome;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public void setNome(String exemplo) {
		this.nome = exemplo;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	
	public int funcaoTeste() {
		identificacao = identificacao* 2;
		return identificacao;
	}
	
	
	
	
}
