package ooplista1;

public class Aviao {
	private String modelo;
	private	int velocidadeAtual;
	private int altitude;
	
	public void aumentarVel(int incremento) {
		this.velocidadeAtual += incremento;
	}
	public void diminuirVel(int decremento) {
		this.velocidadeAtual -= decremento;
	}
	public void aumentarAltitude(int incremento) {
		this.altitude += incremento;
	}
	public void diminuirAltitude(int decremento) {
		this.altitude -= decremento;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
	
	
	
}
