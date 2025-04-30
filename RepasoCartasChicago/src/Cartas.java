import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        int puntosJugador3 = 0;

        System.out.println("CHICAGO");

        for (int ronda = 1; ronda <= 11; ronda++) {
            int objetivo = ronda + 1;
            System.out.println("Ronda " + ronda + " ; Puntuación objetivo: " + objetivo);

            puntosJugador1 += jugarTurno(1, objetivo);
            puntosJugador2 += jugarTurno(2, objetivo);
            puntosJugador3 += jugarTurno(3, objetivo);

            System.out.println("Puntuaciones generales: Jugador 1  " + puntosJugador1 + " puntos ; "
                    + "Jugador 2  " + puntosJugador2 + " puntos ; "
                    + "Jugador 3  " + puntosJugador3 + " puntos\n");

            System.out.println("Pulse INTRO para la siguiente ronda");
            scanner.nextLine();
        }

        determinarGanador(puntosJugador1, puntosJugador2, puntosJugador3);

        scanner.close();
    }

    public static int jugarTurno(int jugador, int objetivo) {
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int suma = dado1 + dado2;
        int puntos = 0;
        if (puntos == suma) {
            puntos = +1;
        }

        System.out.println("Tirada del jugador " + jugador + ": " + dado1 + "-" + dado2 + " ; " + puntos + " puntos");

        return puntos;
    }

    public static void determinarGanador(int puntos1, int puntos2, int puntos3) {
        if (puntos1 > puntos2 && puntos1 > puntos3) {
            System.out.println("¡El jugador 1 gana con " + puntos1 + " puntos!");
        } else if (puntos2 > puntos1 && puntos2 > puntos3) {
            System.out.println("¡El jugador 2 gana con " + puntos2 + " puntos!");
        } else if (puntos3 > puntos1 && puntos3 > puntos2) {
            System.out.println("¡El jugador 3 gana con " + puntos3 + " puntos!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}
