programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real salario, mediaSalario = 0.0, mediaFilhos = 0.0, maximo = 0, percentual
		inteiro contPercent = 0, filhos
		const inteiro TAMANHO = 20
		para(inteiro i = 1; i<=TAMANHO; i++){
			limpa()
			escreva("Boa tarde. Qual seu salário?\n")
			leia(salario)
			escreva("Quantos filhos você tem?\n")
			leia(filhos)
			mediaSalario += salario
			mediaFilhos += filhos
			se(salario > maximo){
				maximo = salario
			}
			se(salario <= 100){
				contPercent++
			}
		}

		mediaSalario = mediaSalario/TAMANHO
		mediaFilhos = mediaFilhos/TAMANHO
		percentual = 100*contPercent/TAMANHO
		limpa()
		escreva("Média de salário da população: R$", mat.arredondar(mediaSalario,2), "\n")
		escreva("Média do número de filhos: ", mat.arredondar(mediaFilhos, 2), "\n")
		escreva("Maior salário: R$", maximo, "\n")
		escreva("Percentual de pessoas com salário até R$100,00: ", mat.arredondar(percentual, 2),"%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */