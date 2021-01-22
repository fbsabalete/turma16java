programa
{
	inclua biblioteca Util
	
	funcao inicio(){
		inteiro numero[10], total = 0, maior = 0, contagem = 0
		para(inteiro i = 0; i < 10; i++){
			numero[i] = Util.sorteia(1, 6)
			escreva(numero[i], ", ")
			total += numero[i]
			se(numero[i] >= maior){
				maior = numero[i]
			}
		}
		para(inteiro i = 0; i < 10; i++){
			se(numero[i] == maior){
					contagem++
				}
		}
		
		escreva("\nA média dos valores foi de ", total/10.0, "\n")
		escreva("O maior número foi ", maior, " e ele apareceu ", contagem, " vezes")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 56; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */