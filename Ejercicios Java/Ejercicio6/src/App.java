import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca la base imponible");
       double base_imp = sc.nextInt();
       double total = base_imp * 1.21;
       System.out.println("El total de la factura con IVA es:" + total);
       sc.close();
    }
}
