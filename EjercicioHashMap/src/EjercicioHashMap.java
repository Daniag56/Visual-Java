import java.util.Scanner;

public class EjercicioHashMap {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GestionHash gestionar = new GestionHash();
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
                    gestionar.agregar(ciudad, codPostal);
                    break;
                case 2:
                    gestionar.mostrar();
                    break;
                case 3:
                    System.out.println("Introduzca la ciudad a borrar: ");
                    ciudad = sc.nextLine();
                    gestionar.borrar(ciudad);
                default:
                    System.out.println("Adios");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }

}
