
package aula01;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   22/08/2017
 * @horario   10:41:18
 */
public class Exemplo07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        do{
            System.out.print("Digite 0 para finalizar o programa: ");
            x = entrada.nextInt();
        }while(x!=0);
        System.out.println("Progrma terminado!!!!!!! ;) ");
    }
}
