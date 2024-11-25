import java.util.Scanner;

public class Ejercicio1BuclesExamen {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        String contraseña;
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?/.,;:";
        int posicionCaracter = 1;
        boolean contieneCaracter = true;
        do {
            System.out.println("Ingrese una contraseña: ");
            contraseña = sc.nextLine();
            intentos++;
        } while (intentos < 3);

        for (int i = 0; i < posicionCaracter; i++) {
            if (!contieneCaracter) {
                contieneCaracter = true;
            } else if (posicionCaracter != -1) {
                contieneCaracter = false;
                caracteresEspeciales.indexOf(contraseña.charAt(i));
            }
        }
        if (contieneCaracter == true) {
            System.out.println("aa");
        } else if (contieneCaracter == false) {
            System.out.println("\033[0;91mError: La contraseña debe contener al menos un carácter especial.\033[0m");
        }
        if (intentos == 3) {
            System.out.println("\033[0;93mNúmero máximo de intentos alcanzados\033[0m");
        }

        sc.close();
    }
}