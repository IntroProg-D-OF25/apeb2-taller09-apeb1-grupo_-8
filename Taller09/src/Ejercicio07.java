import java.util.Random;
public class Ejercicio07 {
    public static void main(String[] args) {
        // Declaración de variables
        String[] estudiantes = {
            "Estudiante 1", "Estudiante 2", "Estudiante 3", "Estudiante 4", "Estudiante 5",
            "Estudiante 6", "Estudiante 7", "Estudiante 8", "Estudiante 9", "Estudiante 10",
            "Estudiante 11", "Estudiante 12", "Estudiante 13", "Estudiante 14", "Estudiante 15",
            "Estudiante 16", "Estudiante 17", "Estudiante 18", "Estudiante 19", "Estudiante 20",
            "Estudiante 21", "Estudiante 22", "Estudiante 23", "Estudiante 24", "Estudiante 25",
            "Estudiante 26", "Estudiante 27", "Estudiante 28"
        };
        double[] notas = new double[28];
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.round((random.nextDouble() * 10) * 100.0) / 100.0; 
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedioCiclo = suma / notas.length;
        double mejorNota = notas[0];
        double peorNota = notas[0];
        int indiceMejor = 0, indicePeor = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                indiceMejor = i;
            }
            if (notas[i] < peorNota) {
                peorNota = notas[i];
                indicePeor = i;
            }
        }
        System.out.println("Promedio del ciclo, paralelo C: " + promedioCiclo);
        System.out.println("\nEstudiantes con nota por encima del promedio:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedioCiclo) {
                System.out.println(estudiantes[i] + " - Nota: " + notas[i]);
            }
        }
        System.out.println("\nEstudiantes con nota por debajo del promedio:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < promedioCiclo) {
                System.out.println(estudiantes[i] + " - Nota: " + notas[i]);
            }
        }
        System.out.println("\nEstudiante con la mejor calificación:");
        System.out.println(estudiantes[indiceMejor] + " - Nota: " + mejorNota);
        System.out.println("\nEstudiante con la calificación más baja:");
        System.out.println(estudiantes[indicePeor] + " - Nota: " + peorNota);
    }
}
/**
 * Promedio del ciclo, paralelo C: 6.1382142857142865

Estudiantes con nota por encima del promedio:
Estudiante 1 - Nota: 7.66
Estudiante 2 - Nota: 9.35
Estudiante 3 - Nota: 9.44
Estudiante 8 - Nota: 8.07
Estudiante 9 - Nota: 8.67
Estudiante 11 - Nota: 9.85
Estudiante 13 - Nota: 9.78
Estudiante 16 - Nota: 8.18
Estudiante 18 - Nota: 7.57
Estudiante 21 - Nota: 7.54
Estudiante 22 - Nota: 9.96
Estudiante 23 - Nota: 7.72
Estudiante 24 - Nota: 6.43
Estudiante 25 - Nota: 7.44
Estudiante 27 - Nota: 7.71
Estudiante 28 - Nota: 8.97

Estudiantes con nota por debajo del promedio:
Estudiante 4 - Nota: 1.7
Estudiante 5 - Nota: 1.53
Estudiante 6 - Nota: 5.16
Estudiante 7 - Nota: 2.45
Estudiante 10 - Nota: 1.22
Estudiante 12 - Nota: 4.04
Estudiante 14 - Nota: 5.28
Estudiante 15 - Nota: 5.53
Estudiante 17 - Nota: 2.7
Estudiante 19 - Nota: 2.92
Estudiante 20 - Nota: 1.57
Estudiante 26 - Nota: 3.43

Estudiante con la mejor calificaci�n:
Estudiante 22 - Nota: 9.96

Estudiante con la calificaci�n m�s baja:
Estudiante 10 - Nota: 1.22
 */