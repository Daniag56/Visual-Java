import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {


      Scanner sc = new Scanner(System.in);


      String nombre, direccion, nombreProducto1,nombreProducto2,nombreProducto3;
      int numTelefono, cantidad1, cantidad2, cantidad3;
      double precioUnidad1, precioUnidad2, precioUnidad3, subtotal, impuesto, descuento,totalParcial1, totalParcial2,totalParcial3, totalaPagar;


      System.out.print("Ingrese el nombre del cliente: ");
      nombre = sc.nextLine();
      System.out.print("Ingrese la direccion del cliente: ");
      direccion = sc.nextLine();
      System.out.print("Ingrese el numero de télefono del cliente: ");
      numTelefono = sc.nextInt();
      System.out.print("Ingrese el nombre del producto: ");
      sc.nextLine();
      nombreProducto1 = sc.nextLine();
      System.out.print("Ingrese el precio unitario del producto: ");
      precioUnidad1 = sc.nextDouble();
      System.out.print("Ingrese la cantidad del producto que desea comprar: ");
      cantidad1 = sc.nextInt();
      System.out.print("Ingrese el nombre del segundo producto: ");
      sc.nextLine();
      nombreProducto2 = sc.nextLine();
      System.out.print("Ingrese el precio unitario del segundo producto: ");
      precioUnidad2 = sc.nextDouble();
      System.out.print("Ingrese la cantidad del segundo producto que desea comprar: ");
      cantidad2 = sc.nextInt();
      System.out.print("Ingrese el nombre del tercer producto: ");
      sc.nextLine();
      nombreProducto3 = sc.nextLine();
      System.out.print("Ingrese el precio unitario del tercer producto: ");
      precioUnidad3 = sc.nextDouble();
      System.out.print("Ingrese la cantidad que desea comprar del tercer producto: ");
      cantidad3 = sc.nextInt();




     totalParcial1 = precioUnidad1 * cantidad1;
     totalParcial2 = precioUnidad2 * cantidad2;
     totalParcial3 = precioUnidad3 * cantidad3;

     subtotal = totalParcial1 + totalParcial2 + totalParcial3;
     impuesto = subtotal * 0.18;
     descuento = subtotal * 0.05;
     totalaPagar = subtotal +impuesto - descuento;



      System.out.println("-----------------------------------");
      System.out.println("             FACTURA               ");
      System.out.println("-----------------------------------");
      System.out.println("Cliente:"+ nombre);
      System.out.println("Direccion: "+ direccion);
      System.out.println("Teléfono: "+ numTelefono);
      System.out.println("");
      System.out.println("Producto    Precio Unitario  Cantidad  Total Parcial");
      System.out.printf("%-10s    %7.2f        %5d       $%-7.2f \n",nombreProducto1,precioUnidad1,cantidad1,totalParcial1);
      System.out.printf("%-10s    %7.2f        %5d       $%-7.2f \n",nombreProducto2,precioUnidad2,cantidad2,totalParcial2);
      System.out.printf("%-10s    %7.2f        %5d       $%-7.2f \n",nombreProducto3,precioUnidad3,cantidad3,totalParcial3);
      System.out.println("----------------------------------------------------");
      System.out.printf("\033[33m Subtotal:                              $%-7.2f\n\033[39;49m",subtotal);
      System.out.printf("\033[34m Impuesto(18%%):                         $%-7.2f\n\033[39;49m",impuesto);
      System.out.printf("Descuento(10%%):                          $%-7.2f\n",descuento);
      System.out.println("----------------------------------------------------");
      System.out.printf("Total a Pagar:                           $%-7.2f\n",totalaPagar);
    }
}
