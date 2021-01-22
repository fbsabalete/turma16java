programa
{
	
	funcao inicio()
	{
		real valor = 0.0, soma = 0.0, contador = 0.0
		escreva("Digite numeros positivos, ou negativo para terminar\n")
		enquanto(valor >= 0){
			soma += valor
			leia(valor)
			se(valor >= 0){
				contador++
			}
		}
		limpa()
		escreva("Soma total: ", soma,"\n")
		escreva("Média: ", soma/contador,"\n")
		escreva("Total de valores: ", contador,"\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */