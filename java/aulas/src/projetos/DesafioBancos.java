package projetos;

import java.util.Scanner;

public class DesafioBancos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valorMovimento;
		int tipo;
		char movimento;
		boolean sair = false;
		String conta = "", descricao;
	
		while(!sair) {
			double saldo = 0.0;
			char continua = 'S';
			int contador = 0;
			System.out.printf("\nBanco G6-Nation\n");
			System.out.println("Trabalhando por você!");
			
			System.out.println("1 - CONTA POUPANÇA");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - SAIR");
			System.out.printf("Selecione o tipo de conta: ");
			tipo = ler.nextInt();
			while(tipo > 5 || tipo < 1) {
				System.out.println("Digite uma opção válida: ");
				tipo = ler.nextInt();
			}
			conta = definir(tipo);
			
			while((continua == 's' || continua == 'S') && contador < 10 && tipo != 5) {
				System.out.printf("CONTA %s\n\n", conta);
				System.out.print("Selecione o movimento - D/C: ");
				movimento = ler.next().charAt(0);
				if(saldo == 0) {
					while(movimento == 'd' || movimento == 'D') {
						System.out.print("Você não possui saldo, selecione Credito: ");
						movimento = ler.next().charAt(0);
					}
				}
				System.out.print("Valor: R$");
				valorMovimento = ler.nextDouble();
				if(movimento == 'd' || movimento == 'D') {
					while(saldo - valorMovimento < 0) {
						System.out.println("Valor indisponivel, digite um valor disponivel: R$");
						valorMovimento = ler.nextDouble();			
					}
					saldo -= valorMovimento;
				}else {				
					saldo += valorMovimento;
				}
				System.out.print("Descrição: ");
				descricao = ler.next();
				System.out.printf("Saldo atual: R$%.2f", saldo);
				System.out.print("\nContinua? S/N: ");
				continua = ler.next().charAt(0);
				contador++;
			}
			
			switch(tipo) {
			case 1:
				poupanca(saldo); //KEVIN
				break;
			case 2:
				corrente(saldo); //DENILSON
				break;
			case 3:
				especial(saldo); //DEBORA
				break;
			case 4:
				empresa(saldo); //FERNANDO
				break;
			case 5:
				sair = true;
				break;
			}
		}
	}
	
	
	public static void poupanca(double saldoAtual) {
		char continua;
		Scanner ler= new Scanner(System.in);

        saldoAtual= saldoAtual + saldoAtual * 0.05;

        System.out.println("Deseja ver a correção monetário S/N?" );
        continua = ler.next().charAt(0);

        if (continua == 's' || continua == 'S')
        {
        System.out.printf("Seu saldo é de R$%.2f", saldoAtual);
        }
	}
	
	public static void corrente(double saldoAtual) {
		Scanner leia = new Scanner(System.in);
		int contador = 1;
		char opcao = 's';
		
		System.out.print("Deseja emitir o Talão? S/N: ");
		opcao = leia.next().charAt(0);
		while(contador <= 3 && (opcao == 'S' || opcao == 's')){
			System.out.printf("----TALÃO DE CHEQUE----\n");
			System.out.printf("Valor:___________________\t\t\n");
			
			System.out.printf("Você pode emitir mais %d talões", (3 - contador));
			if(contador == 3) {
				System.out.println("\nAcabaram seus cheques");
			}else {
				System.out.println("\nGostaria de emitir mais um?: ");
				opcao = leia.next().charAt(0);
				contador++;		
			}
			System.out.println("Obrigado.");
		}
	}
	
	public static void especial(double saldoAtual) {
		Scanner ler = new Scanner(System.in);
		char limiteEspecial;
		double valorLimite, limite = 1000.0;
		System.out.println("Deseja utilizar o limite especial? S/N: ");
		limiteEspecial = ler.next().charAt(0);
		if(limiteEspecial == 'S' || limiteEspecial == 's') {
			System.out.printf("Qual o valor? (limite atual: %.2f): R$", limite);
			valorLimite = ler.nextDouble();
			while(valorLimite > limite || valorLimite < 0) {
				if(valorLimite < 0) {
					System.out.print("Digite um valor válido: R$");
					valorLimite = ler.nextDouble();
				}else {
					System.out.printf("Digite um valor dentro de seu limite(R$%.2f)", limite);
					valorLimite = ler.nextDouble();
				}
					
			}
			saldoAtual += valorLimite;
			System.out.printf("\nSaldo: R$%.2f", saldoAtual);
			System.out.println( );
		}
	}
		
	public static void empresa(double saldoAtual) {
		Scanner ler = new Scanner(System.in);
		char emprestimo;
		double valorEmprestimo, limite = 10000.0;
		System.out.println("Deseja fazer um emprestimo? S/N: ");
		emprestimo = ler.next().charAt(0);
		if(emprestimo == 'S' || emprestimo == 's') {
			System.out.printf("Qual o valor? (limite atual: %.2f): R$", limite);
			valorEmprestimo = ler.nextDouble();
			while(valorEmprestimo > limite || valorEmprestimo < 0) {
				if(valorEmprestimo < 0) {
					System.out.print("Digite um valor válido: R$");
					valorEmprestimo = ler.nextDouble();
				}else {
					System.out.printf("Digite um valor dentro de seu limite(R$%.2f)", limite);
					valorEmprestimo = ler.nextDouble();					
				}
			}
			saldoAtual += valorEmprestimo;
			System.out.printf("\nSaldo: R$%.2f", saldoAtual);
			System.out.println( );
			
		}
	}

	public static String definir(int tipo) {
		String tipoConta = "";
		switch(tipo) {
		case 1:
			tipoConta = "POUPANÇA";
			break;
		case 2:
			tipoConta = "CORRENTE";
			break;
		case 3:
			tipoConta = "ESPECIAL";
			break;
		case 4:
			tipoConta = "EMPRESA";
			break;
		default:
			//sair
			break;
		}
		return tipoConta;
	}
}
