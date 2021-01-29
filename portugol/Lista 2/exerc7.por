programa
{
	
	funcao inicio()
	{
		real base, altura, area
		escreva("Defina o valor de base: ")
		leia(base)
		escreva("Defina o valor de altura: ")
		leia(altura)
		limpa()
		se(base <= 0 ou altura <= 0){
			escreva("Valores impossiveis, digite valores validos.")	
		}senao{
			area = (base * altura) / 2
			escreva("A área do triangulo é de ", area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */