
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = 0;
        int factorial = numeroIntroducido;
        System.out.println("Introduzca un numero por pantalla: ");
        numeroIntroducido = sc.nextInt();
        for (int i = 1; i < numeroIntroducido; i++) {
             factorial *= i;
        }
        System.out.println(numeroIntroducido+factorial);
        sc.close();
    }
}
