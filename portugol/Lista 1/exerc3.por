programa
{
	inteiro segundosTotais, horas, minutosSobra, minutos, segundosSobra, segundos
	funcao inicio()
	{
		
		escreva("Quantos segundos teve o evento? \n")
		leia(segundosTotais)
		horas = (segundosTotais / 3600)
		minutos = (segundosTotais % 3600) / 60
		segundos = (segundosTotais % 3600) % 60
		escreva("O evento durou ", horas, "h", minutos, "m", segundos, "s")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */