programa{
	inteiro anos
	inteiro meses
	inteiro dias
	
	funcao inicio(){
		escreva("Qual sua idade completa? (anos, meses, dias) \n")
		leia(anos, meses, dias)
		//Idade em dias:
		dias = dias + (meses * 30) + (anos * 365)
		escreva(dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */