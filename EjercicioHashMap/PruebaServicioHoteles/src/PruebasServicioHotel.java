import java.util.Scanner;

public class PruebasServicioHotel {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String localizacion = "", servicio = "";
        ServiciosHotel gestion = new ServiciosHotel();
        do {
            System.out.println();
            System.out.println("Ingrese una opcion valida para iterar: ");
            System.out.println("1. Consultar tabla");
            System.out.println("2. Añadir un nuevo servicio a la tabla");
            System.out.println("3. Borrar entrada completa de la tabla");
            System.out.println("4. Borrar un servicio de la tabla");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la localizacion para mostrar los servicios: ");
                    localizacion = sc.nextLine();
                    System.out.println();
                    gestion.consulta(localizacion);
                    break;
                case 2:
                    System.out.println("Ingrese la localizacion del hotel");
                    localizacion = sc.nextLine();
                    System.out.println("Ingrese el servicio que se realiza en el hotel");
                    servicio = sc.nextLine();
                    gestion.agregar(localizacion, servicio);
                    break;
                case 3:
                    System.out.println("Ingrese la localizacion del hotel para borrarlo: ");
                    localizacion = sc.nextLine();
                    gestion.borrar(localizacion);
                    break;
                case 4:
                    System.out.println("Ingrese una localizacion: ");
                    localizacion = sc.nextLine();
                    System.out.println("Ingrese el servicio que desea borrar: ");
                    servicio = sc.nextLine();
                    gestion.borrarServicio(localizacion, servicio);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
}
