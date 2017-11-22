
package aula01;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   22/08/2017
 * @horario   10:07:43
 */
public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um valor: \n");
        int n = entrada.nextInt();
        if(n > 0){
            System.out.println("Numero positivo");
        }else if(n<0){
            System.out.println("Numero negativo");
        }else{
            System.out.println("Valor nulo");
        }
    }
}
