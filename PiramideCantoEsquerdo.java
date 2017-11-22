
package aula01;
import java.util.Scanner;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   29/08/2017
 * @horario   08:46:33
 */
public class PiramideCantoEsquerdo {
    public static void main(String[] args) {
        int numero, l =0, c = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Determine o tamanho da figura: ");
        numero = scan.nextInt();
        /*for(l = 0; l < numero;l++){
            for(c = 0; c < numero;c++){
                if(l >= c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }*/
        /*for(l = 0; l < numero;l++){
            for(c = 0; c < numero;c++){
                if(l <= c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }*/
        /*for(l = 0; l < numero;l++){
            for(c = 0; c < numero;c++){
                if(l + c >= numero - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }*/
       /*for(l = 0; l < numero;l++){
            for(c = 0; c < numero;c++){
                if(l + c <= numero - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }*/
        for(l = 0; l < numero;l++){
            for(c = 0; c < (numero * 2 - 1);c++){
                if((l + c >= numero - 1) && !(c >= numero + l)){ // pode se usar o ou exclusivo ^, serve para substituir o && e a ! negação.
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
