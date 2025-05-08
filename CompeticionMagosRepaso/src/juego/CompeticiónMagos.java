package juego;

import utilidades.GeneradorAleatorio;
import utilidades.CalculadorPuntuación;
import utilidades.ImpresoraResultados;
import java.util.Scanner;

public class CompeticiónMagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a la Competición de Magos!");
        System.out.print("¿Quieres comenzar el juego? (si/no): ");
        String respuesta = scanner.nextLine();

        if (!respuesta.equalsIgnoreCase("si")) {
            System.out.println("¡Hasta luego!");
        }

        float puntuaciónMago1 = 0, puntuaciónMago2 = 0;

        for (int ronda = 1; ronda <= 5; ronda++) {
            System.out.println("\n--- Ronda " + ronda + " ---");

            int cartaMago1 = GeneradorAleatorio.generarCarta();
            int dadoMago1 = GeneradorAleatorio.generarDado();
            float puntuaciónRondaMago1 = CalculadorPuntuación.calcularPuntuación(cartaMago1, dadoMago1);
            puntuaciónMago1 += puntuaciónRondaMago1;

            int cartaMago2 = GeneradorAleatorio.generarCarta();
            int dadoMago2 = GeneradorAleatorio.generarDado();
            float puntuaciónRondaMago2 = CalculadorPuntuación.calcularPuntuación(cartaMago2, dadoMago2);
            puntuaciónMago2 += puntuaciónRondaMago2;

            System.out.println("Mago 1 - Carta: " + cartaMago1 + ", Dado: " + dadoMago1 + ", Puntuación ronda: " + puntuaciónRondaMago1);
            System.out.println("Mago 2 - Carta: " + cartaMago2 + ", Dado: " + dadoMago2 + ", Puntuación ronda: " + puntuaciónRondaMago2);

            System.out.println("Quieres continuar? Pulse Intro");
            scanner.nextLine();
        }

        ImpresoraResultados.imprimirResultados(puntuaciónMago1, puntuaciónMago2);
        scanner.close();
    }
}
