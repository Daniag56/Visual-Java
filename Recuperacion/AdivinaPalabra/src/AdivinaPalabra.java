import java.util.Scanner;

public class AdivinaPalabra {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String opcion = " ", letra = "", palabraSecreta = "java", palabraProgreso = "";
        System.out.println("\033[0;91m¡Bienvenido al juego de adivinar palabra!\033[0m");
        System.out.println("¿Quieres jugar? si/no");
        opcion = sc.nextLine();

        if (opcion.equals("si")) {
            for (int i = 1; i < 6; i++) {
                System.out.println("Introduce una letra: ");
                letra = sc.nextLine();
                actualizarPalabraProgreso(palabraSecreta, palabraProgreso, letra);
            }
        } else if (opcion.equals("no")) {
            System.out.println("Usted ha salido del juego");
        }else if(letra.contains("salir")){
            System.out.println("Usted a salido del juego");
        }

        sc.close();
    }

    public static String actualizarPalabraProgreso(String palabraSecreta, String palabraProgreso, String letra) {
        String cadenaVacia = "";
        if (letra.contains("j")) {
            System.out.println("Correcto! La letra 'j' está en la palabra");
        } else if (letra.contains("a")) {
            System.out.println("Correcto! La letra 'a' está en la palabra.");
        } else if (letra.contains("v")) {
            System.out.println("Correcto! La letra 'v' está en la palabra.");
        } else {
            System.out.println("Incorrecto la letra " + letra +" "+" no se encuentra en la palabra");
        }

        for(int i = 0;i<palabraSecreta.length();i++){
            
            if (letra.charAt(0) == palabraSecreta.charAt(i)) {
                cadenaVacia +="j_ _ _";
                System.out.println("Palabra secreta: "+cadenaVacia);
                
            }
        }
        
        
        
        return palabraSecreta;
    }
}
