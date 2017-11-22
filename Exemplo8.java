
package aula01;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   22/08/2017
 * @horario   10:53:13
 */
public class Exemplo8 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int dia;
        do{
            System.out.print("Digite um valor de 1 a 7: (zero encerra o programa. ;) ");
            dia = entrada.nextInt();
            
            switch (dia) {
            case 0:
                System.out.println("Programa terminado. ;)");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia errado!!");
        }
        }while(dia != 0);
        
    }
}
