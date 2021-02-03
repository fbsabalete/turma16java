package bank16;

public class Poupanca extends Conta{
	private int diaAniversario;
	
	public Poupanca(String numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
	}
	
	public void aniversario(int dia) {
		if(this.diaAniversario == dia) {
			super.creditar(super.getSaldo()*0.0005);
		}
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	
}
