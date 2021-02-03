package bank16;

public class Conta {
	private String numero;
	private String cpf;
	private double saldo;
	
	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public void debitar(double valor) {
		if(valor < this.saldo) {
			this.saldo -= valor;			
		}else {
			System.out.println("Digite um valor valido");
		}
	}
	public void creditar(double valor) {
		if(valor > 0) {
			this.saldo += valor;			
		}else {
			System.out.println("Digite um valor valido");
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
