programa
{
	inclua biblioteca Matematica --> mat
	real custoFabrica, imposto, distribuidor, custoConsumidor
	funcao inicio()
	{
		escreva("Dê o custo de fábrica do veiculo: ")
		leia(custoFabrica)

		imposto = custoFabrica * 0.45
		distribuidor = custoFabrica * 0.28

		custoConsumidor = custoFabrica + imposto + distribuidor
		escreva("O custo para o consumidor é de R$", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */