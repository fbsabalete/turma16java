package ooplista2;

public class Main {
	public static void main(String[] args) {
		Fornecedor forn1 = new Fornecedor("Bonito", "Rua Linda", "1199999999", 10000.0, 5000.0);
		Empregado func1 = new Empregado("Robson", "Rua Legal", "1194593333", 3, 3500, 9);
		Administrador admin1 = new Administrador("Roberto", "Rua Feia", "1112341234", 1000.0);
		Operario op1 = new Operario("José", "Rua Oito", "112242929", 1200, 10);
		Vendedor vend1 = new Vendedor("Lucas", "Rua Estranha", "1193552335", 2000, 10);
		
		System.out.println("Fornecedor:");
		System.out.printf("Nome: %s\nEndereço: %s\nTelefone: %s\nCrédito: %.2f\nDivida: %.2f\n", forn1.getNome(), forn1.getEndereco(), forn1.getTelefone(), forn1.getValorCredito(), forn1.getValorDivida());
		System.out.println(forn1.obterSaldo());
		System.out.println("------------------------------------------------");
		System.out.println("Funcionario");
		System.out.printf("Nome: %s\nEndereço: %s\nTelefone: %s\nCódigo setor: %d\nSalário base: %.2f\nImposto: %d%%\n", 
							func1.getNome(), func1.getEndereco(), func1.getTelefone(), func1.getCodigoSetor(),func1.getSalarioBase(),func1.getImposto());
		System.out.printf("Salario final: R$%.2f\n", func1.calcularSalario());
		System.out.println("------------------------------------------------");
		System.out.println("Administrador:");
		System.out.printf("Nome: %s\nEndereço: %s\nTelefone: %s\nAjuda de Custo: %.2f\n", admin1.getNome(), admin1.getEndereco(), admin1.getTelefone(), admin1.getAjudaDeCusto());
		System.out.println("------------------------------------------------");
		System.out.println("Operario");
		System.out.printf("Nome: %s\nEndereço: %s\nTelefone: %s\nValor da produção: %.2f\nComissão: %.2f\n", op1.getNome(), op1.getEndereco(), op1.getTelefone(), op1.getValorProducao(), op1.getComissao());
		System.out.println("------------------------------------------------");
		System.out.println("Vendedor:");
		System.out.printf("Nome: %s\nEndereço: %s\nTelefone: %s\nValor das vendas: %.2f\nComissão: %.2f", vend1.getNome(), vend1.getEndereco(),vend1.getTelefone(), vend1.getValorVendas(), vend1.getComissao());
		
		
		
		
	}
}
