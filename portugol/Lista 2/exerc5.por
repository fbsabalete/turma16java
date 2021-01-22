programa
{
	
	funcao inicio()
	{
		real indice
		escreva("Informe o indice atual: ")
		leia(indice)
		se(indice >= 0.5){
			escreva("Todos os grupos devem paralisar suas atividades!")
		}senao se (indice >= 0.4){
			escreva("Os grupos 1 e 2 devem paralisar suas atividades!")
		}senao se (indice >= 0.3){
			escreva("O primeiro grupo deve paralisar suas atividades!")
		}senao{
			escreva("As atividades podem continuar normalmente.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */