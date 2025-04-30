import java.util.Scanner;

public class ContraseñaSegura {
    public static final String RED_BRIGHT = "\033[0;91m";  // Rojo
    public static final String GREEN_BRIGHT = "\033[0;92m";  // Verde
    public static final String YELLOW_BRIGHT = "\033[0;93m";  // Amarillo
    public static final String RESET = "\033[0m";  // Reset de color

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean contrasenaSegura = false;
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?/.,;:";

        while (intentos < 3 && !contrasenaSegura) {
            System.out.println("Ingrese una contraseña:");
            String contrasena = scanner.nextLine();

            if (contrasena.isEmpty()) {
                System.out.println(RED_BRIGHT + "Error: La contraseña no puede estar vacía." + RESET);
                intentos++;
                continue;
            }

            boolean tieneMinuscula = false;
            boolean tieneMayuscula = false;
            boolean tieneNumero = false;
            boolean tieneEspecial = false;
            boolean tieneEspacio = false;

            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    tieneMinuscula = true;
                } else if (c >= 'A' && c <= 'Z') {
                    tieneMayuscula = true;
                } else if (c >= '0' && c <= '9') {
                    tieneNumero = true;
                } else if (caracteresEspeciales.indexOf(c) != -1) {
                    tieneEspecial = true;
                } else if (c == ' ') {
                    tieneEspacio = true;
                }
            }

            if (contrasena.length() < 8) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe tener al menos 8 caracteres." + RESET);
            } else if (!tieneMinuscula) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos una letra minúscula." + RESET);
            } else if (!tieneMayuscula) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos una letra mayúscula." + RESET);
            } else if (!tieneNumero) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos un número." + RESET);
            } else if (!tieneEspecial) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos un carácter especial." + RESET);
            } else if (tieneEspacio) {
                System.out.println(RED_BRIGHT + "Error: La contraseña no debe contener espacios en blanco." + RESET);
            } else {
                System.out.println(GREEN_BRIGHT + "Contraseña segura." + RESET);
                contrasenaSegura = true;
                break;
            }

            intentos++;
        }

        if (!contrasenaSegura) {
            System.out.println(YELLOW_BRIGHT + "Número máximo de intentos alcanzado." + RESET);
        }

        scanner.close();
    }
}

