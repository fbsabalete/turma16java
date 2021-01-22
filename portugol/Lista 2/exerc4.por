programa
{
	
	funcao inicio()
	{
		inteiro numero
		cadeia par, positivo
		escreva("Dê um numero inteiro: ")
		leia(numero)
		se(numero == 0){
			escreva("Não pode ser 0")
		}senao{
			se(numero % 2 == 0){
				par = "par"
			}senao{
				par = "ímpar"
			}
			se(numero > 0){
				positivo = "positivo"
			}senao{
				positivo = "negativo"
			}
		escreva("O número dado é ", par, " e ", positivo)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */