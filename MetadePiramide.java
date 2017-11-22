
package aula01;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   22/08/2017
 * @horario   16:59:05
 */
public class MetadePiramide {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char espacio = ' ', asterisco = '*';
        int x = 0;
        System.out.print("Número de linhas: ");
        x = obj.nextInt();
        for (int i = 1; i <= x; i++) { 
            for (int espacios = x - i; espacios > 0; espacios--) {
                System.out.print(espacio);
            }
            for (int lineas = 1; lineas < (2 * i)/2; lineas++) {
                System.out.print(asterisco);
            }
            System.out.println("");
        }
    }
}
