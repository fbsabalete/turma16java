package heranca;

public class Celular extends Eletronico {
	
	private String resolucao;
	private int quantidadeCameras;
	
	public String getResolucao() {
		return resolucao;
	}

	public int getQuantidadeCameras() {
		return quantidadeCameras;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public void setQuantidadeCameras(int quantidadeCameras) {
		this.quantidadeCameras = quantidadeCameras;
	}

	public Celular(String nome, double custo, String resolucao, int quantidadeCameras) {
		super(nome, custo);
		this.resolucao = resolucao;
		this.quantidadeCameras = quantidadeCameras;
	}
	
	public void fazerLigacao() {
		System.out.println("Celular est� fazendo liga��o!");
	}
	
	public void enviarSms() {
		System.out.println("Enviando sms!");
	}

}
