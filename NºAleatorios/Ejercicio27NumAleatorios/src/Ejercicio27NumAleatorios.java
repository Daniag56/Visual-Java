
import java.util.Scanner;

public class Ejercicio27NumAleatorios {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String eleccion, elegido = "";
        System.out.print("Turno del jugador (introduzca piedra, papel, tijera): ");
        eleccion = sc.nextLine();
        int eleccionMaquina = (int) (Math.random() * 3) + 1;
        switch (eleccionMaquina) {
            case 1:
                elegido = "piedra";
                break;
            case 2:
                elegido = "papel";
                break;
            case 3:
                elegido = "tijera";
                break;
        }
        System.out.println("Turno del ordenador: "+elegido);
        if (eleccion.equals("piedra") && (elegido.equals("tijera"))) {
            System.out.println("Gana el jugador");
        }else if (eleccion.equals("tijera")&&(elegido.equals("piedra"))) {
            System.out.println("Gana la maquina");
        }else if (eleccion.equals("piedra") && (elegido.equals("papel"))) {
            System.out.println("Gana la maquina");
        }else if ((eleccion.equals("papel")&&(elegido.equals("piedra")))) {
            System.out.println("Gana el jugador");
        }else if (eleccion.equals("tijera")&&(elegido.equals("piedra"))) {
            System.out.println("Gana la maquina");
        }else if (eleccion.equals("piedra")&&(elegido.equals("tijera"))) {
            System.out.println("Gana el jugador");
        }else if(eleccion.equals("papel")&&(elegido.equals("tijera"))){
            System.out.println("Gana la maquina");
        }else if (eleccion.equals("tijera")&&(elegido.equals("papel"))) {
            System.out.println("Gana el jugador");
        }else{
            System.out.println("Empate");
        }
        sc.close();
    }
}
