
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int codigoLibro, unidadesVendidas;
        double descuento, totalconDescuento, iva, subtotal, totalFin, precio;

        System.out.println("LIBRERIA DE SUEÑOS");
        System.out.println("===================");

        System.out.print("Introduce el código del libro: ");
        codigoLibro = sc.nextInt();
        System.out.print("Introduce el precio: ");
        sc.nextLine();
        precio = sc.nextDouble();
        System.out.print("Introduce las unidades vendidas: ");
        sc.nextLine();
        unidadesVendidas = sc.nextInt();
        System.out.print("Introduce el descuento (%): ");
        sc.nextLine();
        descuento = sc.nextDouble();
        
        subtotal = precio * unidadesVendidas;
        totalconDescuento = subtotal * descuento;
        iva = subtotal * 0.16;
        totalFin = subtotal + iva - totalconDescuento;

        System.out.println("Su ticket: ");
        System.out.println("  ┌──────────────────────────┐");
        System.out.println("  │   LIBRERIA DE SUEÑOS     │");
        System.out.println("  ├──────────────────────────┤");
        System.out.printf("  │    Cod.%6d     %-7.2f│\n",codigoLibro, precio);
        System.out.printf("  │%5d uds.        %-7.2f │ \n",unidadesVendidas , subtotal);
        System.out.printf("  │ %7.2f          %-7.2f │ \n", descuento , totalconDescuento);
        System.out.printf("  │   16%% IVA     %-7.2f    │ \n", iva);
        System.out.printf("  │   TOTAL    \033[46m       %-7.2f│ \033[0m \n", totalFin);
        System.out.println("  └──────────────────────────┘");
    }
}
