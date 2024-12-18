import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (int i = 0; i < 7 ; i++) {
                if (estudiantes[i].startsWith(inicial)) {
                    System.out.println("La letra '" + inicial + "' coincide con la primera letra del nombre '" + estudiantes[i] + "'");
                    bandera = false;
                }
            }
        }
    }
}