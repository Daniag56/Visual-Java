import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        // Utilizo printf por su facilidad de implementacion y versatilidad ademas de
        // limpieza, mi resultado no es igual del todo porque he harcodeado la variable
        // PI
        Scanner sc = new Scanner(System.in);
        int radio;
        double area, numPi;

        numPi = 3.1416;

        System.out.println("\033[1;30m ÁREA DE UN CIRCULO \033[0m");
        System.out.println("==================");
        System.out.print("Introduzca el radio (cm): ");
        radio = sc.nextInt();
        area = numPi * radio * radio;
        System.out.printf("El área del circulo es: \033[1;31m %7.8f \033[0m cm\u00B2", area);

    }
}
