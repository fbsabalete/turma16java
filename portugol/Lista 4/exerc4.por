programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], total = 0, diagonal = 0
		para(inteiro i = 0; i < 3; i++){
			para(inteiro j = 0; j < 3; j++){
				escreva("Dê os numeros para preencher a matriz: ")
				leia(matriz[i][j])
				limpa()
				total += matriz[i][j]
				se(i == j){
					diagonal += matriz[i][j]
				}
			}
		}
		escreva("A soma total foi de ", total, " e a diagonal ", diagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */