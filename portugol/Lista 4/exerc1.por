programa
{
	
	funcao inicio()
	{
		real pontos[5], maximo = 0
		para(inteiro i = 0; i < 5; i++){
			escreva("Insira a pontuação numero ", i + 1, ":\n")
			leia(pontos[i])
			limpa()
		}
		escreva("\tPontos\n")
		para(inteiro i = 0; i < 5; i++){
			se(pontos[i] > maximo){
				maximo = pontos[i]	
			}
			escreva(pontos[i], "\n")			
		}
		escreva("A maior pontuação foi de ", maximo, " pontos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */