package projetos;

import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        String matriz[][]= new String [24][31];
        char continua;
        int data, hora;
        String evento=" ";
        while(true)
        {
            do
            {
               System.out.println("Escolha uma data para o seu evento: ");
               data=leia.nextInt();
               while(data < 1 || data > 31) {
            	   System.out.println("Digite uma data válida: ");
            	   data=leia.nextInt();
               }
               System.out.println("Escolha uma hora para o seu evento: ");
               hora=leia.nextInt();
               while(hora < 0 || hora > 23) {
            	   System.out.println("Digite uma hora válida: ");
            	   hora=leia.nextInt();
               }
               System.out.println("Digite o nome do seu evento: ");
               evento=leia.next();

               matriz[hora][data-1]=evento;

               System.out.println("Deseja continuar? S/N ");
               continua=leia.next().toUpperCase().charAt(0);

               if(continua=='N')
               {
                   break;
               }

            }while(true);

            System.out.println("Deseja visualizar seus eventos? S/N");
            continua=leia.next().toUpperCase().charAt(0);

            if(continua=='S')
            {
                System.out.println("Seus agendamentos são: ");
                
                for(int i=0; i<31; i++)
                {
                    for(int j=0; j<24; j++)
                    {
                        if(matriz[j][i] != null)
                        {
                            System.out.printf("\nO evento é %s",matriz[j][i]);
                            System.out.printf("\nNo dia: %d",i+1);
                            System.out.printf("\nNa hora: %d",j);
                        }
                    }
                }
            }else {
            	break;
            }
        }
	}
}
