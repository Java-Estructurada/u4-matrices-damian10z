//CoinD
import java.util.Scanner;

public class ejerciciom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de días (filas): ");
        int dias = sc.nextInt();
        System.out.print("Ingrese número de horas (columnas): ");
        int horas = sc.nextInt();

        int[][] horario = new int[dias][horas];
        int[][] transpuesta = new int[horas][dias];

        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < horas; j++) {
                System.out.print("ID Clase para Día " + (i + 1) + ", Hora " + (j + 1) + ": ");
                horario[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < horas; j++) {
                transpuesta[j][i] = horario[i][j];
            }
        }

        System.out.println("\n--- Horario Original (Días x Horas) ---");
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < horas; j++) {
                System.out.print(horario[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Horario Transpuesto (Horas x Días) ---");
        for (int i = 0; i < horas; i++) {
            for (int j = 0; j < dias; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}