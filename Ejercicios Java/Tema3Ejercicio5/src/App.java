import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double largo, ancho, area;
        System.out.println("Introduzca el largo del rectangulo");
        largo = sc.nextDouble();
        System.out.println("Introduzca el ancho del rectangulo");
        ancho = sc.nextDouble();

        area = largo * ancho;

        System.out.println("El area del rectangulo es: " + area);
    }
}
