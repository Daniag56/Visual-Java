import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String nombre, producto;
        double  total, cantidad, precioUnidad, impuesto, totalFin;

        System.out.println("Ingrese el nombre del cliente:");
        nombre = sc.nextLine();

        System.out.println("Ingrese la descripción del producto:");
        producto = sc.nextLine();

        System.out.println("Ingrese la cantidad:");
        cantidad = sc.nextDouble();

        System.out.println("Ingrese el precio unitario:");
        precioUnidad = sc.nextDouble();

        total = precioUnidad * cantidad;
        impuesto = total * 0.21;
        totalFin = total + impuesto;

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.printf("Cliente:                     %-10s\n",nombre);
        System.out.printf("Producto:                    %-10s\n",producto);  
        System.out.printf("Cantidad:                    %-10s\n",cantidad); 
        System.out.printf("Precio Unitario:          %7.2f\n",precioUnidad); 
        System.out.printf("Total sin impuesto:        %7.2f\n",total);  
        System.out.printf("Impuesto(21%%):            %7.2f\n",impuesto); 
        System.out.printf("Total con impuesto:        %7.2f\n",totalFin);         
        System.out.println("╚════════════════════════════════════════════════════╝");
    }
}
