import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double radio, altura ,pi , volumen;

    pi = 3.14 * 0.33;
    System.out.println("Introduzca el radio");
    radio = sc.nextDouble();
    System.out.println("Introduzca la altura");
    altura = sc.nextDouble();

    volumen = radio * 2 * altura * pi;

    System.out.println("El volumen de un cono es: " + volumen);
    }
}
