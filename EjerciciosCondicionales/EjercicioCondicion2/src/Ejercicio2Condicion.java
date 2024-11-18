import java.util.Scanner;

public class Ejercicio2Condicion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int hora;
        System.out.println("Ingrese la hora: ");
        hora = sc.nextInt();

      if ((hora>=6) && (hora<13)) {
        System.out.println("Buenos dias");
        
      }else{
        if ((hora>=13) && (hora<21)) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
      }
    }
}
