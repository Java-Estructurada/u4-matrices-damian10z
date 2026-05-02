//CoinD
import java.util.Scanner;

public class ejercicioP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] calificaciones = new double[3][4];
        double[] promedios = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa las 4 calificaciones del Estudiante " + (i + 1) + ":");
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Materia " + (j + 1) + ": ");
                calificaciones[i][j] = sc.nextDouble();
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / 4;
            System.out.println();
        }

        System.out.println("\n=== RESULTADOS ACADÉMICOS ===");
        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("Estudiante %d - Promedio: %.2f%n", (i + 1), promedios[i]);
        }
    }
}