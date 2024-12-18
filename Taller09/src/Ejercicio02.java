import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        ArrayList<Integer> primos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int num, suma, primero = 0, segundo = 1, j = 1, x, h = 2;
        System.out.println("Ingrese un limite: ");
        num = teclado.nextInt();
        for (int i = 1; i <= num; i++) {
            fibonacci.add(segundo);
            suma = primero + segundo;
            primero = segundo;
            segundo = suma;
        }
        while (j <= num) {
            x = 0;
            for (int i = 2; i <= Math.sqrt(h); i++) {
                if (h % i == 0) {
                   x ++; 
                }
            } 
            if (x == 0) {
                primos.add(h);
                j++;
            }
            h ++;
        }
        for (int i = 0; i < num; i++) {
            System.out.print( fibonacci.get(i) + "/" + primos.get(i) + " ");
        }
    }
}