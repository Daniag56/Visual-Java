
public class CartasChicago {
    public static void main(String[] args) throws Exception {
        int sumaDados, dado, puntuacion1 = 0, puntuacion2 = 0, puntuacion3 = 0, jugador1, jugador2, jugador3,
                puntuacionOb = 2;
        int sumaPuntuacion1 = 0, sumaPuntuacion2 = 0, sumaPuntuacion3 = 0;

        for (int i = 1; i < 12; i++) { // Bucle for para generar las rondas y la puntuacion objetiva
            int dado1 = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;
            int dado3 = (int) (Math.random() * 6) + 1;
            int dado4 = (int) (Math.random() * 6) + 1;
            int dado5 = (int) (Math.random() * 6) + 1;
            int dado6 = (int) (Math.random() * 6) + 1;
            sumaDados = dado1 + dado2;
            int sumaDados2 = dado3 + dado4;
            int sumaDados3 = dado5 + dado6;
            if (i == 1) { // condicion para que chicago solo aparezca al principio del codigo
                System.out.println("\033[0;93mCHICAGO \033[0m");
            }
            System.out.println("\033[0;91mRonda " + i + " ;Puntuacion objetivo: " + puntuacionOb + "\033[0m");
            puntuacionOb++;
            switch (dado1) {
                case 1:
                    dado = 1;
                    break;
                case 2:
                    dado = 2;
                    break;
                case 3:
                    dado = 3;
                    break;
                case 4:
                    dado = 4;
                    break;
                case 5:
                    dado = 5;
                    break;
                case 6:
                    dado = 6;
                    break;
            }
            switch (dado2) {
                case 1:
                    dado = 1;
                    break;
                case 2:
                    dado = 2;
                    break;
                case 3:
                    dado = 3;
                    break;
                case 4:
                    dado = 4;
                    break;
                case 5:
                    dado = 5;
                    break;
                case 6:
                    dado = 6;
                    break;
            }
            switch (dado3) {
                case 1:
                    dado = 1;
                    break;
                case 2:
                    dado = 2;
                    break;
                case 3:
                    dado = 3;
                    break;
                case 4:
                    dado = 4;
                    break;
                case 5:
                    dado = 5;
                    break;
                case 6:
                    dado = 6;
                    break;
            }
            switch (dado4) {
                case 1:
                    dado = 1;
                    break;
                case 2:
                    dado = 2;
                    break;
                case 3:
                    dado = 3;
                    break;
                case 4:
                    dado = 4;
                    break;
                case 5:
                    dado = 5;
                    break;
                case 6:
                    dado = 6;
                    break;
            }
            switch (dado5) {
                case 1:
                    dado = 1;
                    break;
                case 2:
                    dado = 2;
                    break;
                case 3:
                    dado = 3;
                    break;
                case 4:
                    dado = 4;
                    break;
                case 5:
                    dado = 5;
                    break;
                case 6:
                    dado = 6;
                    break;
            }
            switch (dado6) {
                case 1:
                    dado = 1;
                    break;
                case 2:
                    dado = 2;
                    break;
                case 3:
                    dado = 3;
                    break;
                case 4:
                    dado = 4;
                    break;
                case 5:
                    dado = 5;
                    break;
                case 6:
                    dado = 6;
                    break;
            }

            if (sumaDados == i + 1) { // condicion para controlar la puntuacion
                puntuacion1 += 1;
                sumaPuntuacion1 += 1;

            } else if (sumaDados2 == i + 1) {
                puntuacion2 += 1;
                sumaPuntuacion2 += 1;
            } else if (sumaDados3 == i + 1) {
                puntuacion3 += 1;
                sumaPuntuacion3 += 1;
            }
            System.out.println("Tirada del jugador 1:" + dado1 + "-" + dado2 + " ; " + puntuacion1 + " puntos");
            System.out.println("Tirada del jugador 2:" + dado3 + "-" + dado4 + " ; " + puntuacion2 + " puntos");
            System.out.println("Tirada del jugador 3:" + dado5 + "-" + dado6 + " ; " + puntuacion3 + " puntos");
            if (i < puntuacionOb) {
                puntuacion1 = 0;
                puntuacion2 = 0;
                puntuacion3 = 0;
            }
            System.out.println(
                    "Puntuaciones generales: Jugador 1 - " + sumaPuntuacion1 + " puntos " + ";" + " Jugador 2 - "
                            + sumaPuntuacion2 + " puntos " + " Jugador 3 - " + sumaPuntuacion3 + " puntos");
            if (i == 11) {
                System.out.println("FIN DE LA PARTIDA");
            }
        }
    }
}
