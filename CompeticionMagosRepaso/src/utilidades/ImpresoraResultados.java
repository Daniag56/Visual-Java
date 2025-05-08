package utilidades;

public class ImpresoraResultados {
    public static void imprimirResultados(float puntuaciónMago1, float puntuaciónMago2) {
        System.out.println("\nRESULTADOS FINALES:");
        System.out.println("Mago 1: " + puntuaciónMago1);
        System.out.println("Mago 2: " + puntuaciónMago2);
        
        if (puntuaciónMago1 > puntuaciónMago2) {
            System.out.println("¡Mago 1 es el ganador!");
        } else if (puntuaciónMago2 > puntuaciónMago1) {
            System.out.println("¡Mago 2 es el ganador!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}