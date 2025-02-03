import java.util.Scanner;

public class EjercicioHashMap {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GestionHash gestion = new GestionHash();
        String ciudad = "";
        int codPostal = 0;

        int opcion;

        do {
            System.out.println("Introduzca la opcion para iterar: ");
            System.out.println("1. Introducir datos en el HashMap");
            System.out.println("2. Mostrar datos del HashMap");
            System.out.println("3. Borrado");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca la ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.println("Introduzca el codigo postal de la ciudad: ");
                    codPostal = sc.nextInt();
                    sc.nextLine();
                    gestion.agregar(ciudad, codPostal);
                    break;
                case 2:
                    gestion.mostrar();
                    break;
                case 3:
                    System.out.println("Introduzca la ciudad a borrar: ");
                    ciudad = sc.nextLine();
                    gestion.borrar(ciudad);
                case 4:
                    System.out.println("Introduzca la ciudad para mostrar el cp: ");
                    ciudad = sc.nextLine();
                    gestion.MostrarCpProvincia(ciudad);
                break;
                default:
                    System.out.println("Adios");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }

}
