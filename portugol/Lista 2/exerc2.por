programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro C, N
		real salario, excedente
		escreva("Entre com seu código: ")
		leia(C)
		escreva("Quantas horas foram trabalhadas?\n")
		leia(N)
		limpa()
		se(N > 50){
			excedente = (N - 50.0) * 20
			salario = 500.00
			escreva("Seu salário total será de R$", mat.arredondar(salario + excedente, 2)," sendo que seu excedente foi de R$", mat.arredondar(excedente, 2))
		}senao{
			salario = N * 10.00
			excedente = 0
			escreva("Seu salário total será de R$", mat.arredondar(salario, 2), " e você não possui excedente.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */