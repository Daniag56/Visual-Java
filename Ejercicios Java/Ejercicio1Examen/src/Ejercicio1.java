import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        // El resultado no es igual por un problema en el printf que no hemos logrado
        // encontrar aunque esta bien puesto
        Scanner sc = new Scanner(System.in);
        double velocidadLuz, longitud;
        int años, dias, horas, minutos, segundos;
        dias = 365;
        horas = 365 * 24;
        minutos = horas * 60;
        segundos = minutos * 60;
        velocidadLuz = 299.792;
        longitud = velocidadLuz * segundos;
        System.out.println("DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("=============================");
        System.out.print("Ingrese los años: ");
        años = sc.nextInt();
        System.out.printf("La luz recorre aproximadamente: %15.2f kilometros en 1 año", longitud);
    }
}
