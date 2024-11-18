
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       double baseImponible, ivaGeneral, ivaReducido,ivaSuperreducido;
       String iva, codigoPromocional;
       
       System.out.print("Introduzca la base imponible");
       baseImponible = sc.nextDouble();
       System.out.print("Introduzca el tipo de IVA(General, Reducido, Superreducido)");
       iva = sc.nextLine();
       System.out.print("Introduzca el codigo promocional: ");
       codigoPromocional = sc.nextLine();

       switch (iva) {
            case "General":
                ivaGeneral = baseImponible * 0.21;
                break;
            case "Reducido":
                ivaReducido = baseImponible * 0.10;
                break;
            case "Superreducido":
                ivaSuperreducido = baseImponible * 0.4;
                break;
        }
        switch (codigoPromocional) {
            case "nopro":
                
                break;
            case "mitad":

                break;
            case "meno5":

                break;
            case "5porc":

                break;
        }
       
       sc.close();
    }
}
