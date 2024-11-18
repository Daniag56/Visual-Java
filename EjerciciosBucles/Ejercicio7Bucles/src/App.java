
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        int combinacion = 0;

        for (int intentos = 0; intentos <= 4; intentos++) {
            System.out.println("Ingrese la combinacion");
            combinacion = sc.nextInt();
            if (combinacion == 7768) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                intentos = 4;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
        sc.close();
    }
}
