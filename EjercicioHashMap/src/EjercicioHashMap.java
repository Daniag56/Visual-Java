import java.util.Scanner;

public class EjercicioHashMap {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Introduzca la opcion para iterar: ");
        System.out.print("1. Introducir datos en el HashMap");
        System.out.print("2. Mostrar datos del HashMap");
        int opcion = sc.nextInt();
        GestionHash gestion = new GestionHash();

        switch (opcion) {
            case 1:
                gestion.agregar("Malaga",2452);
                break;
            case 2:

                break;
            default:
                System.out.println("Introduzca una opcion valida");
                break;
        }

        sc.close();
    }
}
