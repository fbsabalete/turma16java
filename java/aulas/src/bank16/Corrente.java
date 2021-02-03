package bank16;

public class Corrente extends Conta{
	private int qtMesTalao;

	public Corrente(String numero, String cpf, int qtMesTalao) {
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}
	
	public void emitirTalao(int qtde) {
		if(qtde > 3 || qtde < 0) {
			System.out.println("Valor invalido.");
		}else {
			for(int i = 0; i < qtde; i++) {
				System.out.println("TALÃO BONITO");
			}
		}
	}
	
	public int getQtMesTalao() {
		return qtMesTalao;
	}

	public void setQtMesTalao(int qtMesTalao) {
		this.qtMesTalao = qtMesTalao;
	}
	
	
	
}
