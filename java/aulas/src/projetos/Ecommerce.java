package projetos;

import java.util.Scanner;

public class Ecommerce {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String produto[] = {"headset","monitor","teclado","mouse","CPU","webcam",
							"fonte","caboUSB","cabHTML","cooler"};
		double preco[] = {150.00, 750.99, 230.00, 100.00, 1567.99, 120.00, 80.00, 25.00,45.00,529.99};
		double parcela = 0, precoFinal;
		int codigo[] = new int[10];
		int estoque[] = new int[10];
		char formaPgto;
		int tempCodigo, quantidade, contador = 0;
		String nome, apelido, pgto;
	    char genero;
	    char confirma;
	    for (int i= 0; i<10; i++)
        {
            codigo[i]=  (i+1);
            estoque[i]=10;
        }
		while(true) {
			double precoTotal = 0;
			int carrinho[] = new int[10];
			for(int i = 0; i < 10; i++) {
				if(estoque[i] == 0) {
					contador++;
				}
				if(contador == 9) 
				{
					for (int j= 0; j<10; j++)
					{
			            estoque[j]=10;
			        }
				}
			}
			
			System.out.println("\t\t\t\t\tWEB LOJA PC QUASE FERA");
	        System.out.println("\t\tMontariamos o melhor computador do mercado se vendessemos peças o suficiente\n");
			System.out.print("Por gentileza, informe seu nome: ");
			
	        nome = ler.nextLine();

	        System.out.print("Agora, informe seu genero: F para feminino, M para masculino ou O para outros: ");
	        genero = ler.next().toUpperCase().charAt(0);

	        while (genero != 'F' && genero != 'M' && genero != 'O') {
	            System.out.print("Opção inválida. Por favor, digite F para feminino, M para masculino ou O para outros: ");
	            genero = ler.next().toUpperCase().charAt(0);
	        }

	        if (genero == 'F') {
	            apelido = "Sra.";
	        }
	        else if (genero == 'M') {
	            apelido = "Sr.";
	        }
	        else {
	            apelido = "Srx";
	        }

	        System.out.printf("%s %s, cadastro efetuado.", apelido, nome);
			do {
				//----------------------------------
			        

			        System.out.print("\nCÓDIGO DO PRODUTO");
			        System.out.print("\t\tESTOQUE");
			        System.out.print("\t\t\t\tPREÇO\n");

			        for(int i=0;i<10;i++)
			        {
			            System.out.print("\nCÓD - "+codigo[i]+" "+produto[i]);
			            System.out.print("\t\t\t"+estoque[i]);
			            System.out.print("\t\t\t\tR$"+preco[i]);
			        }
			        System.out.println("\n\n");
					System.out.println("\t\t\tCARRINHO");
			        mostrarCarrinho(carrinho, preco, produto, precoTotal);
			        
				//----------------------------------
				System.out.print("\nDigite o código do produto: ");
				/*
				while(!ler.hasNextInt()) {
					System.out.println("Digite um valor valido:");
					ler.next();
				}
				
				if(ler.hasNextInt()) {
					tempCodigo = ler.nextInt();	
				}else {					
					System.out.println("Digite um valor valido:");
					while(tempCod)
				}*/
				tempCodigo = ler.nextInt();					
				while(tempCodigo < 1 || tempCodigo > 10) {
					System.out.print("Digite um código válido: ");
					tempCodigo = ler.nextInt();
				}
				for(int i = 0; i < 10; i++) {
					if(tempCodigo == codigo[i]) {
						
						if(estoque[i] != 0) {
							if(carrinho[i] == 0) {
								System.out.printf("Quantos do produto %s você deseja comprar? ", produto[i].toUpperCase());
								quantidade = ler.nextInt();
								while(quantidade > estoque[i] || quantidade <= 0) {
									if(quantidade > estoque[i]) {
										System.out.printf("Temos apenas %d de estoque, digite um valor valido: ", estoque[i]);
										quantidade = ler.nextInt();
									}else if(quantidade <= 0) {
										System.out.print("Digite uma quantidade válida: ");
										quantidade = ler.nextInt();
									}
								}
								carrinho[i] = quantidade;
							 	estoque[i] = estoque[i] - quantidade;
							 	precoTotal += quantidade*preco[i];
							}else {
								System.out.printf("Você adicionou %d produtos '%s' ao carrinho. O preço ficou R$ %.2f", carrinho[i], produto[i], preco[i]*carrinho[i]);
								System.out.printf("\nDeseja alterar, deletar ou selecionar outro produto? [A/D/N]");
								confirma = ler.next().toUpperCase().charAt(0);
								while(confirma != 'A' && confirma != 'D' && confirma != 'N') {
									System.out.print("Digite uma opção válida [A/D/N] ");
									confirma = ler.next().toUpperCase().charAt(0);
								}
								if(confirma == 'A') {
									precoTotal -= carrinho[i]*preco[i];
									estoque[i] += carrinho[i];
									System.out.printf("Qual a nova quantidade? ");
									quantidade = ler.nextInt();
									while(quantidade > estoque[i] || quantidade <= 0) {
										if(quantidade > estoque[i]) {
											System.out.printf("Temos apenas %d de estoque, digite um valor valido: ", estoque[i]);
											quantidade = ler.nextInt();
										}else if(quantidade <= 0) {
											System.out.print("Digite uma quantidade válida: ");
											quantidade = ler.nextInt();
										}
									}
									carrinho[i] = quantidade;
								 	estoque[i] = estoque[i] - quantidade;
								 	precoTotal += quantidade*preco[i];
								}else if(confirma == 'D') {
									precoTotal -= carrinho[i]*preco[i];
									estoque[i] += carrinho[i];
									carrinho[i] = 0;
									System.out.printf("O item %s foi tirado do carrinho.", produto[i]);
									System.out.println();
								}
							}
						}else {
							System.out.println("Não temos estoque deste produto.\n");
						}
					}
				}
				System.out.printf("Deseja continuar comprando? [S/N] ");
				confirma = ler.next().toUpperCase().charAt(0);
			}while(confirma == 'S');
			ler.nextLine();
			System.out.println("\t\t\tCARRINHO");
			mostrarCarrinho(carrinho, preco, produto, precoTotal);
			do {
		        System.out.println("Formas de Pagamento:\n0 - débito ou dinheiro\n1 - crédito a vista\n2 - crédito em 2 parcelas\n3 - crédito em 3 parcelas ");
		        System.out.print("Escolha: ");
		        formaPgto = ler.next().charAt(0);

		        while (formaPgto != '0' && formaPgto != '1' && formaPgto != '2' && formaPgto != '3') {
		            System.out.println("Forma inválida. Digite novamente: ");
		            formaPgto = ler.next().charAt(0);		        }
		        if (formaPgto == '0') {
		            precoFinal = precoTotal - (precoTotal * 0.10);
		            System.out.printf("Você selecionou A VISTA\n"
		            		+ "Preço final: R$%.2f\n", precoFinal);
		            pgto = "A VISTA";
		        } else if (formaPgto == '1') {
		        	precoFinal = precoTotal;
		        	System.out.printf("Você selecionou CRÉDITO A VISTA\n"
		            		+ "Preço final: R$%.2f\n", precoFinal);
		        	pgto = "CRÉDITO A VISTA";
		        } else if (formaPgto == '2') {
		        	precoFinal = precoTotal + (precoTotal * 0.10);
		            parcela = precoFinal / 2;
		            System.out.printf("Você selecionou CRÉDITO 2x\n"
		            		+ "Preço por parcela: R$%.2f\n"
		            		+ "Preço final: R$%.2f\n", parcela,precoFinal);
		            pgto = "CRÉDITO 2x";
		        } else{
		        	precoFinal = precoTotal + (precoTotal * 0.15);
		            parcela = precoFinal / 3;
		            System.out.printf("Você selecionou CRÉDITO 3x\n"
		            		+ "Preço por parcela: R$%.2f\n"
		            		+ "Preço final: R$%.2f\n", parcela,precoFinal);
		            pgto = "CRÉDITO 3x";
		        }
		        System.out.println("Confirma a forma de pagamento?[S/N]: ");
		        confirma = ler.next().toUpperCase().charAt(0);
			}while(confirma != 'S');
			System.out.println("\tNOTA FISCAL");
			System.out.println("CNPJ: 40028922/0001-01");
			System.out.println("WEB LOJA PC QUASE FERA");
			System.out.printf("%s %s\n", apelido, nome);
			System.out.print("\n[PRODUTO]");
	        System.out.print("\t\t[QNTD]");
	        System.out.print("\t\t[PREÇO UND]");
	        System.out.print("\t\t[PREÇO TOTAL]");

	        for(int i=0;i<10;i++){
	        	if(carrinho[i] != 0) {
		            System.out.print("\n"+produto[i].toUpperCase());
		            System.out.print("\t\t\t"+carrinho[i]);
		            System.out.print("\t\tR$"+preco[i]);
		            System.out.print("\t\t\tR$"+preco[i]*carrinho[i]);
	        	}
	        }
	        System.out.printf("\nForma de pagamento: %s\n", pgto);
	        if(formaPgto == '2' || formaPgto == '3') {
		        System.out.printf("Preço por parcela: R$%.2f\n"
	            		+ "Preço final: R$%.2f\n", parcela,precoFinal);
	        }else {
	        	System.out.printf("Preço final: R$%.2f\n\n", precoFinal);
	        }
	        System.out.printf("Imposto 9%%: R$%.2f\n", precoFinal*0.09);
	        
			ler.nextLine();
		}
	}
	
	public static void mostrarCarrinho(int carrinho[], double preco[], String produto[], double precoTotal) {

		for(int i=0;i<10;i++)
        {
            if(carrinho[i]!= 0)
            {
                System.out.println("\nPRODUTO: "+produto[i]+"\nQNT:"+carrinho[i]+"\tPREÇO: R$"+preco[i]*carrinho[i]);
            }
        }
        System.out.printf("Preço total: R$%.2f\n\n", precoTotal);
	}
}
