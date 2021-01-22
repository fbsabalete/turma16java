programa
{
	inteiro anos
	inteiro meses
	inteiro totalDias
	inteiro dias
	inteiro sobraDias
	funcao inicio()
	{
		escreva("Qual sua idade em dias?\n")
		leia(totalDias)
		sobraDias = totalDias % 365
		anos = totalDias / 365
		dias = sobraDias % 30
		meses = sobraDias / 30
		escreva("Você tem ", anos, " anos, ", meses, " meses e ", dias, " dias de idade")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */