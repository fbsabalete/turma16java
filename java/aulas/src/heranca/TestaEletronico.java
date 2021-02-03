package heranca;

public class TestaEletronico {

	public static void main(String[] args) {
		Ventilador v1 = new Ventilador("Arno", 250, 8, "Base");
		Celular c1 = new Celular("Xiaomi", 999.99, "2560x1080", 2);
		
		System.out.printf("Ventilador %s \nPreço: %.2f\nNumero de pas: %d \nTipo %s \n\n", v1.getNome(), v1.getCusto(), v1.getNumeroPas(), v1.getTipo());
		v1.ligar();
		v1.aumentarVelocidade();
		v1.diminuirVelocidade();
		v1.desligar();
		
		
		System.out.printf("\nCelular %s\nPreco: %.2f\nResolucao: %s\nQuantidade de cameras: %d\n\n", c1.getNome(), c1.getCusto(), c1.getResolucao(), c1.getQuantidadeCameras());
		c1.fazerLigacao();
		c1.enviarSms();

	}

}
