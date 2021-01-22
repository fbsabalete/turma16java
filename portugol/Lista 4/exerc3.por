programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		para(inteiro i = 0; i < 4; i++){
			para(inteiro j = 0; j < 6; j++){
				N1[i][j] = Util.sorteia(0, 10)
				N2[i][j] = Util.sorteia(0, 10)
			}
		}
		para(inteiro i = 0; i < 4; i++){
			para(inteiro j = 0; j < 6; j++){
				M1[i][j] = N1[i][j] + N2[i][j]
				M2[i][j] = N1[i][j] - N2[i][j]
				se(M2[i][j] < 0){
					M2[i][j] = M2[i][j] * (-1)
				}
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 7, 10, 2}-{N2, 7, 20, 2}-{M1, 7, 30, 2}-{M2, 7, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */