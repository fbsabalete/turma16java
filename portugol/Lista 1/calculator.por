programa{
	real num1
	real num2
	caracter op
	funcao inicio(){
		escreva("Digite o primeiro numero: ")
		leia(num1)
		escreva("Agora o operador: ")
		leia(op)
		escreva("Digite o segundo numero: ")
		leia(num2)
		calculo(num1, num2, op)
	}

	funcao calculo(real primeiro,real segundo,caracter operador){
		real resultado
		escolha(operador){
			caso '+':
			resultado = primeiro + segundo
			escreva(primeiro, " + ", segundo, " = ", resultado)
			pare

			caso '-':
			resultado = primeiro - segundo
			escreva(primeiro, " - ", segundo, " = ", resultado)
			pare

			caso '*':
			resultado = primeiro * segundo
			escreva(primeiro, " * ", segundo, " = ", resultado)
			pare

			caso '/':
			resultado = primeiro / segundo
			escreva(primeiro, " / ", segundo, " = ", resultado)
			pare
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 788; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */