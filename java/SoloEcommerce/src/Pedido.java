import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pedido {
	protected double precoTotal;
	protected char formaPgto;
	protected double precoFinal;
	protected String pgto;
	protected double desconto;
	protected double parcela;
	
	public void gerarNota(String nome, String tratamento) {
		this.cabecalho();
        System.out.println("Cliente: " + tratamento + nome);
    	
    	double imposto = this.getPrecoTotal() * 0.09;
        System.out.printf("\nImpostos de 9%%: R$%.2f\n", imposto);
        System.out.printf("\nForma de pagamento selecionada: %s\nPreço final: R$ %.2f",this.getPgto(),this.precoFinal,"\n");
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public char getFormaPgto() {
		return formaPgto;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public String getPgto() {
		return pgto;
	}

	public void setPgto(String pgto) {
		this.pgto = pgto;
	}

	public double getParcela() {
		return parcela;
	}

	public void setParcela(double parcela) {
		this.parcela = parcela;
	}

	public void setFormaPgto(char formaPgto) {
		this.formaPgto = formaPgto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void setFormaPgto() {
		Scanner leia = new Scanner(System.in);
		char formaPgto = leia.next().charAt(0);
		while (formaPgto != '0' && formaPgto != '1' && formaPgto != '2' && formaPgto != '3') {
			System.out.println("Forma inválida. Digite novamente: ");
			formaPgto = leia.next().charAt(0);
		}
		
		this.formaPgto = formaPgto;
	}

	public void imprimirFormaPgto() {
		System.out.println("0 - débito ou dinheiro - DESCONTO DE 10%! - Valor final: R$"
				+ (precoFinal = precoTotal - (precoTotal * 0.10)));
		System.out.println("1 - crédito a vista - Valor final: " + (precoFinal = precoTotal));
		System.out.println("2 - crédito em 2 parcelas - Acréscimo de 10% - Valor final: R$"
				+ (precoFinal = precoTotal + (precoTotal * 0.10)));
		System.out.println("3 - crédito em 3 parcelas - Acréscimo de 15% - Valor final : R$"
				+ (precoFinal = precoTotal + (precoTotal * 0.15)));
	}

	public void totalFinal() {
		if (formaPgto == '0') {
			pgto = "A VISTA";
			desconto = precoTotal * 0.10;
			precoFinal = precoTotal - desconto;
			System.out.printf("Você selecionou %s e teve R$%.2f de DESCONTO!\n" + "Preço final: R$%.2f\n", pgto,
					desconto, precoFinal);

		} else if (formaPgto == '1') {
			precoFinal = precoTotal;
			pgto = "CRÉDITO A VISTA";
			System.out.printf("Você selecionou %s\n" + "Preço final: R$%.2f\n", pgto, precoFinal);
		} else if (formaPgto == '2') {
			precoFinal = precoTotal + (precoTotal * 0.10);
			pgto = "CRÉDITO 2x";
			parcela = precoFinal / 2;
			System.out.printf("Você selecionou %s\n" + "Preço por parcela: R$%.2f\n" + "Preço final: R$%.2f\n", pgto,
					parcela, precoFinal);

		} else {
			precoFinal = precoTotal + (precoTotal * 0.15);
			pgto = "CRÉDITO 3x";
			parcela = precoFinal / 3;
			System.out.printf("Você selecionou %s\n" + "Preço por parcela: R$%.2f\n" + "Preço final: R$%.2f\n", pgto,
					parcela, precoFinal);
		}
	}

	public void cabecalho() {
		System.out.println("\t\t\t\t\tWEB LOJA PC QUASE FERA");
		System.out.println("\t\tMontariamos o melhor computador do mercado se vendessemos peças o suficiente\n");
		System.out.println("CNPJ: 40028922/0001-01");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy | HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
}
