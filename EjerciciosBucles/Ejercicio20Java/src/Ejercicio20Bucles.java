import java.util.Scanner;

public class Ejercicio20Bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura deseada: ");
        int alturaIntroducida = sc.nextInt();
        int espacio = alturaIntroducida ;
        int altura = 1;
        int espaciosInternos = 0;
        String caracter = "";
        System.out.println("Introduzca el caracter que desea usar: ");
        sc.nextLine();
        caracter = sc.nextLine();
        while (altura <= alturaIntroducida) {
            for (int i = 1; i <= espacio; i++) {
                System.out.print(" ");
            }
            System.out.print(caracter);
            for (int i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }
            if (altura > 1) {
                System.out.print(caracter);
            }
            System.out.println();
            altura++;
            espacio--;
            espaciosInternos +=2;
        }
        for (int i = 1; i < altura * 2; i++) {
            System.out.print(caracter);
        }

        sc.close();

    }
}
