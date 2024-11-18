import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    float mb, kb;
    System.out.println("Introduzca los Megabytes:");
    mb = sc.nextFloat();
    kb = mb * 1024 ; 

    System.out.println("La cantidad de kb es: " + kb);
    }
}
