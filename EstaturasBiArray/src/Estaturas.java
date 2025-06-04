import java.util.Random;

public class Estaturas {
    private String[] paises = {"España", "Rusia", "Japón", "Australia"};
    private int[][] estaturas = new int[4][10];

    public Estaturas() {
        Random random = new Random();
        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = 140 + random.nextInt(71); // Genera altura aleatoria entre 140 y 210
            }
        }
    }

    public void mostrarResultados() {
        System.out.println("                                                 MED  MIN  MAX");
        for (int i = 0; i < paises.length; i++) {
            int suma = 0, min = 210, max = 140;

            System.out.print(paises[i] + ": ");
            for (int j = 0; j < estaturas[i].length; j++) {
                System.out.print(estaturas[i][j] + " ");
                suma += estaturas[i][j];
                if (estaturas[i][j] < min) min = estaturas[i][j];
                if (estaturas[i][j] > max) max = estaturas[i][j];
            }

            int media = suma / estaturas[i].length;
            System.out.println("| " + media + " " + min + " " + max);
        }
    }
}
