import java.util.Scanner;

public class DreamTeam implements Interactuador {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca opciones para iterar: ");
    System.out.println("1. crear una nueva entrada: ");
    System.out.println("2. Mostrar todas las entradas: ");
    System.out.println("3. Mostrar por id: ");
    System.out.println("4. modificar: ");
    System.out.println("5. eliminar: ");
    System.out.println("6. salir: ");
    int opcion = sc.nextInt();
    switch (opcion) {
      case 1:
        Interactuador.crear();
        break;
      case 2:
        Interactuador.consultaOrdenada();
        break;
      case 3:
        Interactuador.consultarPorId();
        break;
      case 4:
        Interactuador.modificar();
        break;
      case 5:
        Interactuador.eliminar();
        break;
      default:
        break;
    }
    sc.close();
  }

}
