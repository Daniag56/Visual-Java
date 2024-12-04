package coordenada;

public class Posicion {
    
    public static int posiciones(int x, int y) {
        int altura = 0;
        for (int i = 1; i < 7; i++) {
            System.out.print(" *");
        }
        System.out.println(" ");
        for (int j = 1; j < 3; j++) {
            System.out.print("*");
            System.out.print(" *");
            for (int a = 0; a < 5; a++) {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        for (int g = 1; g < 11; g++) {
            System.out.print("*");
        }
        return altura;
    }
}
