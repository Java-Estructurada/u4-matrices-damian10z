//CoinD
public class ejercicioA1 {
    public static void main(String[] args) {
        double[][] calificaciones = new double[3][4];

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                calificaciones[i][j] = 5 + (Math.random() * 5);
            }
        }

        System.out.println("=== REGISTRO DE CALIFICACIONES ===");
        System.out.println("            Mat 1   Mat 2   Mat 3   Mat 4");
        System.out.println("------------------------------------------");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estud. " + (i + 1) + " | ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.printf("%6.1f  ", calificaciones[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
}
