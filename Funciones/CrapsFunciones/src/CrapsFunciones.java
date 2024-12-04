import funciones.Tirada;
import java.util.Scanner;

public class CrapsFunciones {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidadDinero, dado1 = 0, dado2 = 0, cantidadGanada,siguienteSuma=0;
        System.out.println("Introduzca la cantidad de dinero que quiera apostar: ");
        cantidadDinero = sc.nextInt();

        dado1 = Tirada.lanzaDados();
        dado2 = Tirada.lanzaDados();

        int sumaDados = dado1 + dado2;

        switch (sumaDados) {
            case 7, 11:
                cantidadGanada = cantidadDinero * 2;
                System.out.println("Usted a ganado, su cantidad de dinero es: " + cantidadGanada);
                break;
            case 2, 3, 12:
                cantidadGanada = 0;
                System.out.println("Usted a perdido todo su dinero");
                break;
            case 4, 5, 6, 8, 9, 10:
                System.out.println("Tiene que seguir tirando ");
                
                int contador=0;
                do {
                     dado1 = Tirada.lanzaDados();
                     dado2 = Tirada.lanzaDados();
                     siguienteSuma = dado1 + dado2;
                     System.out.println("El resultado de su tirada a sido " + siguienteSuma+" siga intentandolo");
                     contador++;
                } while ((sumaDados != siguienteSuma) && (siguienteSuma != 7));
        
                if (sumaDados == siguienteSuma) {
                    System.out.println("Usted a ganado");
                    cantidadGanada = cantidadDinero;
                }else if(siguienteSuma == 7){
                    System.out.println("Usted a perdido el juego");
                    cantidadGanada = cantidadDinero;
                }
                break;
        }
       
        

        sc.close();
    }
}
