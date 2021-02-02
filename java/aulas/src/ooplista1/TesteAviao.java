package ooplista1;

public class TesteAviao {
	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		
		aviao.setAltitude(1500);
		aviao.setModelo("747");
		aviao.setVelocidadeAtual(300);
		System.out.println("Dados iniciais: ");
		System.out.println(aviao.getAltitude());
		System.out.println(aviao.getModelo());
		System.out.println(aviao.getVelocidadeAtual());
		aviao.aumentarAltitude(200);
		aviao.aumentarVel(50);
		System.out.println("Dados pós incremento:");
		System.out.println(aviao.getAltitude());
		System.out.println(aviao.getVelocidadeAtual());
		aviao.diminuirAltitude(100);
		aviao.diminuirVel(25);
		System.out.println("Dados pós decremento:");
		System.out.println(aviao.getAltitude());
		System.out.println(aviao.getVelocidadeAtual());
	}
}
