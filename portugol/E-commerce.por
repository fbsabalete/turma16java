programa
{
	inclua biblioteca Matematica --> mat
	
	
	funcao inicio()
	{
		/*
		 * 	Mostrar no topo nome da loja e slogan
		 * 	Listar 10 produtos, com 10 de estoque inicialmente e um valor unitário
		 * 	Produtos devem ter código identificador
		 * 	Selecionar produto com código, respeitando estoque, cada produto apenas uma vez
		 * 	Continuar[S/N], onde o N informa uma nota fiscal:
		 * 	Imposto 9%
		 * 	Pagamento a vista = 10%-, 1 vez no cartão valor padrão
		 * 	2x 10%+
		 * 	3x 15%+
		 *	Nota: 	
		 *	VALOR DO IMPOSTO TOTAL 9% = xxxxx

			[PRODUTO] [QTDE] [VALOR FINAL]
			
			TOTAL GERAL
			OPÇÃO DE PAGAMENTO
			TOTAL A SER PAGO, TOTAL E POR PARCELA

		 *
		 */
	
		 cadeia produtos[] = {"Arroz", "Feijão", "Óleo", "Macarrão", "Açúcar", "Café", "Farinha", "Candida", "Sabão", "Detergente"}
		 inteiro parcelas = 0, estoque[10], codigo[10], tempCodigo, quantidade, comprado[10], metodoPagamento
		 caracter condicao = 's', qualquer
		 real valorParcela = 0.0, precoTotal = 0.0, precoImposto,imposto, preco[10] = {24.00, 7.00, 7.0, 3.0, 3.0, 8.0, 3.0, 3.0, 5.0, 2.0}
		 para(inteiro i = 0; i < 10; i++){
		 	estoque[i] = 10
		 	codigo[i] = i+1		//inicialização do estoque
		 }
		 enquanto(verdadeiro){
		 	 condicao = 's'
		 	 para(inteiro i = 0; i < 10; i++){
		 	 	comprado[i] = 0
		 	 	
		 	 }
		 	 limpa()
			 escreva("\t\t\t\tFernando's Mercadinho BigBom\n")
			 escreva("\t\t\tOnde você encontra o melhor pior preço!\n")
			 escreva("[CÓDIGO] [PREÇO] [PRODUTO] [ESTOQUE]")
			 para(inteiro i = 0; i < 10; i++){
			 	escreva("\n", codigo[i],"\t ", preco[i], "\t  ", produtos[i], "\t\t", estoque[i])
			 }
			 enquanto(condicao == 's' ou condicao == 'S'){
			 	escreva("\nSelecione o código do produto que você quer comprar: ")
			 	leia(tempCodigo)
			 	para(inteiro i = 0; i < 10; i++){
			 		se(tempCodigo == codigo[i]){
			 			se(estoque[i] != 0 e comprado[i] == 0){
				 			escreva("Quantos(as) ", produtos[i], "s você deseja comprar?: ")
				 			leia(quantidade)
				 			
				 			enquanto(quantidade > estoque[i]){
				 				escreva("Temos apenas ", estoque[i], " de estoque. Digite um valor valido")
				 				leia(quantidade)
				 			}
				 			comprado[i] = quantidade
				 			estoque[i] = estoque[i] - quantidade
				 			precoTotal += quantidade*preco[i]
			 			}senao{
			 				escreva("Não temos estoque ou você ja comprou isso antes\n")
			 			}
			 		}
			 	}
			 	escreva("Deseja continuar comprando?[S/N]: ")
			 	leia(condicao)
			 }
			 limpa()
			 imposto = mat.arredondar(0.09*precoTotal, 2)
			 precoImposto = precoTotal+imposto
			 escreva("Preço Total(imposto incluso): R$", precoImposto)
			 escreva("\nDefina o metódo de pagamento:\n")
			 escreva("1 - A vista (10% de desconto)\n", "2 - Cartão de credito\n")
			 leia(metodoPagamento)
			 enquanto(metodoPagamento != 1 e metodoPagamento != 2){
			 	escreva("Método inválido. Selecione novamente: ")
			 	leia(metodoPagamento)
			 }
			 limpa()
			 se(metodoPagamento == 2){
			 	escreva("Em quantas vezes deseja pagar?\n")
			 	escreva("1x - R$", precoImposto,"\n2x - R$", mat.arredondar((precoImposto+0.1*precoImposto)/2,2), "\n3x - R$", mat.arredondar((precoImposto+0.15*precoImposto)/3,2))
			 	leia(parcelas)
			 	enquanto(parcelas > 3 e parcelas < 1){
			 		escreva("Numero invalido, tente novamente: ")
			 		leia(parcelas)
			 	}
			 	se(parcelas == 1){
			 		valorParcela = precoImposto
			 	}senao se(parcelas == 2){
			 		valorParcela = mat.arredondar((precoImposto+0.1*precoImposto)/2,2)
			 		precoImposto = 2*valorParcela
			 	}senao se(parcelas == 3){
			 		valorParcela = mat.arredondar((precoImposto+0.15*precoImposto)/3,2)
			 		precoImposto = 3*valorParcela
			 	}
			 }senao{
			 	precoImposto -= precoImposto*0.1
			 }
			 limpa() 
			 //NOTA FISCAL
			 escreva("Fernando's Mercadinho BigBom\n")
			 escreva("----------------------------\n")
			 
			 escreva("[PRODUTO] [QTDE] [VALOR]\n")
			 para(inteiro i = 0; i < 10; i++){
			 	se(comprado[i] != 0){
			 		escreva(produtos[i],"\t", comprado[i],"\t R$", comprado[i]*preco[i], "\n")
			 	}
			 }
			 escreva("\nTotal Geral: R$", precoTotal, "\n")
			 escreva("Valor total de imposto a pagar: ", imposto,"\n\n")
			 se(metodoPagamento ==1){
			 	escreva("Método de pagamento: A VISTA\n")
			 	escreva("Total a pagar: R$", precoImposto, " -- -10%")
			 }senao{
			 	escreva("Método de pagamento: CARTÃO \n")
			 	se(parcelas > 1){
			 		escreva("Valor total: R$", precoImposto, "\n")
			 		escreva("Pagamento em ", parcelas, " parcelas\n")
			 		escreva("Valor por parcela: R$", valorParcela, "\n")
			 	}senao{
			 		escreva("Valor total: R$", precoImposto, "\n")
			 	}
			 }
			 escreva("Digite qualquer coisa para continuar")
			 leia(qualquer)
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4169; 
 * @DOBRAMENTO-CODIGO = [7];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {comprado, 31, 74, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */