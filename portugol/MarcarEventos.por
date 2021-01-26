programa
{
	
	funcao inicio()
	{	
		/*
		 * Pegar o nome
		 * Escolhar um dia, depois uma hora para o evento
		 * Continua ou não, se recomeçar, começa em branco
		 * Mostra agenda? S/N
		 */
		inteiro hora = 0, dia = 0
		cadeia evento, nome, data[32][24]
		caracter continua = 's'
		escreva("Digite seu nome: ")
		leia(nome)
		enquanto(continua != '`'){
			enquanto(continua == 's' ou continua == 'S'){
				limpa()
				escreva("Digite o nome do evento: ")
				leia(evento)
				escreva("Digite o dia: ")
				leia(dia)
				enquanto(dia < 1 ou dia > 31){
					escreva("Data invalida. Digite novamente: ")
					leia(dia)
				}
				escreva("E a hora?: ")
				leia(hora)
				enquanto(hora < 0 ou hora > 23){
					escreva("Hora invalida. Digite novamente: ")
					leia(dia)
				}
				data[dia][hora] = evento
				escreva("Continuar?[S/N]: ")
				leia(continua)	
				limpa()
			}
			escreva("Mostrar eventos?[S/N]: ")
			leia(continua)
			limpa()
			se(continua == 'S' ou continua == 's'){
				escreva(nome, ", seus agendamentos são: \n")
				para(inteiro i = 1; i <= 31; i++){
					para(inteiro j = 0; j < 24; j++){
						se(data[i][j] != ""){
							escreva("_____________________\n")
							escreva("Evento: ", data[i][j], "\n")
							escreva("Data: ", i, "\n")
							escreva("Hora: ", j, ":00\n")
						}
					}
				}
				escreva("Entre qualquer letra para parar\n")
				leia(continua)
				continua = '`'	
			}			
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {evento, 13, 9, 6}-{data, 13, 23, 4}-{continua, 14, 11, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */