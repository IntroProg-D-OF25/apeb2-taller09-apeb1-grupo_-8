/**
 *Con el objetivo practicar el uso del ciclo repetitivo for, 
 * se propone que dado un límite, se presenten las siguientes figuras. Por ejemplo si el límite es 4:
 * 
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite;
        System.out.print("Ingrese el límite: ");
        limite = tcl.nextInt();
        System.out.println("Figura 1:");    
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print("*"); 
            }
            System.out.println();
        }
        System.out.println("\nFigura 2:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nFigura 3:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = limite - 1; i >= 1; i--) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/***
 * Figura 1:
*
**
***
****
*****

Figura 2:
    *
   ***
  *****
 *******
*********

Figura 3:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */