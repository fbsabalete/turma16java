package bank16;

import java.util.Scanner;

public class TesteBanco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero da conta: ");
		String conta = sc.next();
		System.out.print("Digite o numero de CPF: ");
		String cpf = sc.next();
		System.out.println("Digite 1 para poupança e 2 para corrente: ");
		int tipo = sc.nextInt();
		if(tipo == 1) {
			Poupanca poupanca1 = new Poupanca("0001", "49949949979", 3);			
		}else if(tipo == 2) {
			Corrente corrente1 = new Corrente("0002", "22222222222", 2);
		}
		
		
	}
}
