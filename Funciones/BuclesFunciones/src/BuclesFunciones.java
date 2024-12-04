import coordenada.Posicion;
import java.util.Scanner;
public class BuclesFunciones {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.println("Introduzca la altura de la piramide: ");
        altura = sc.nextInt();

        System.out.println(Posicion.posiciones(altura, altura));
        sc.close();
    }
}
