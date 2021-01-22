programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real P, E, M
		escreva("Dê o peso de tomates: ")
		leia(P)

		se(P > 50){
			E = mat.arredondar(P - 50, 2)
			M = mat.arredondar(E * 4, 2)
			escreva("Você esta com um excesso de ", E, " quilos e pagará ", M, " de multa")
		}senao{
			escreva("Peso: ", P)
			escreva("Excesso: 0")
			escreva("Multa: 0")			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */