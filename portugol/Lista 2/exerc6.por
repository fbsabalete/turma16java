programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia categoria = "Muito novo"
		logico limite = falso
		escreva("Digite a idade do nadador: ")
		leia(idade)
		se(idade < 5){
			
			limite = verdadeiro
		}senao se(idade >= 18){
			categoria = "Adultos"
		}senao se (idade >= 14){
			categoria = "Juvenil B"
		}senao se (idade >= 12){
			categoria = "Juvenil A"
		}senao se (idade >= 8){
			categoria = "Infantil B"
		}senao se (idade >= 5){
			categoria = "Infantil A"
		}

		se(limite){
			escreva("Você é muito novo para competir.")
		}senao{
			escreva("Você tem ", idade, " anos, então sua categoria é ", categoria)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */