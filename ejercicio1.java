//CoinD
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inventario = {
            {5, 12, 8, 3},
            {10, 0, 15, 7},
            {2, 6, 4, 11},
            {9, 1, 0, 14}
        };

        System.out.println("--- Inventario Actual ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(inventario[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\nIngrese fila (0-3): ");
        int fila = sc.nextInt();
        System.out.print("Ingrese columna (0-3): ");
        int col = sc.nextInt();

        if (fila >= 0 && fila < 4 && col >= 0 && col < 4) {
            if (inventario[fila][col] > 0) {
                inventario[fila][col]--;
                System.out.println("Venta registrada. Nueva cantidad: " + inventario[fila][col]);
                
                if (inventario[fila][col] == 0) {
                    System.out.println("Producto Agotado");
                }
            } else {
                System.out.println("Producto Agotado.");
            }
        } else {
            System.out.println("Coordenadas fuera de rango.");
        }
    }
}
