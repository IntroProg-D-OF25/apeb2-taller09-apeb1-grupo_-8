import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de marcas que desea almacenar: ");
        n = tcl.nextInt();
        tcl.nextLine();
        String[] marcas = new String[n];
        System.out.println("Ingrese los nombres de las marcas:");
        for (int i = 0; i < n; ) {
            System.out.print("Marca " + (i + 1) + ": ");
            String marca = tcl.nextLine();
            char inicial = Character.toUpperCase(marca.charAt(0));
            if (inicial == 'A' || inicial == 'C' || inicial == 'T') {
                System.out.println("La marca no es válida porque empieza con A, C o T. Intente de nuevo.");
            } else {
                marcas[i] = marca;
                i++; 
            }
        }
        System.out.println("\nLas marcas almacenadas son:");
        for (String marca : marcas) {
            System.out.println(marca);
        }
    }
}