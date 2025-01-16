import java.util.Scanner;

public class GestionAlmacen {
    Scanner sc = new Scanner(System.in);
    Articulo[] articulos = new Articulo[10];

    public void altaProducto() {
        for (int i = 0; i < articulos.length; i++) {
            System.out.print("Introduzca el codigo del articulo: ");
            int codigo = sc.nextInt();
            System.out.print("Introduzca el precio de compra del articulo: ");
            double precioCompra = sc.nextDouble();
            System.out.print("Introduzca el precio de venta del articulo: ");
            double precioVenta = sc.nextDouble();
            System.out.print("Introduzca el stock del articulo: ");
            int stock = sc.nextInt();
            System.out.print("Introduzca una descripcion del articulo:");
            sc.nextLine();
            String descripcion = sc.nextLine();
            System.out.println(" ");

            
            articulos[i] = new Articulo(codigo, precioCompra, precioVenta, stock, descripcion);

           
        }
    }

    public void mostrarProducto(){
        for (Articulo listado : articulos) {
            System.out.println(listado.toString());
        }
    }

    

}
