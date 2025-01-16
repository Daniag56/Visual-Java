import java.util.Scanner;

public class GESTISIMAL {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GestionAlmacen gestion = new GestionAlmacen();
        System.out.println("Introduzca la opcion que desee para interactuar: ");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificacion");
        System.out.println("5. Entrada de mercancia");
        System.out.println("6. Salida de mercancia");
        System.out.println("7. Salir");
        int opcion = sc.nextInt();
        System.out.println(" ");

        switch (opcion) {
            case 1:
                gestion.introducirProducto();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.println("Adios");
            default:
                System.out.println("Opcion no valida");
                break;
        }
        sc.close();
    }
}
