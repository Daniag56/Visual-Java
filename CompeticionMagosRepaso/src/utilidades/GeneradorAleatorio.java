package utilidades;

public class GeneradorAleatorio {
    public static int generarCarta() {
        return (int) (Math.random() * 40) + 1; // Número entre 1 y 40
    }

    public static int generarDado() {
        return (int) (Math.random() * 6) + 1; // Número entre 1 y 6
    }
}
