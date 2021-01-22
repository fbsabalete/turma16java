programa
{
	inclua biblioteca Matematica --> mat
	real d, x1, y1, x2, y2
	funcao inicio()
	{
		escreva("Dê os pontos (x1, y1, x2, y2): ")
		leia(x1, y1, x2, y2)
		d = mat.raiz(mat.potencia((x2 - x1), 2) + mat.potencia((y2 - y1), 2), 2)
		escreva("A distância entre os pontos é: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */