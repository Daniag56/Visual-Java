
import java.util.Scanner;

public class ExamenCondicional {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int edad, suscripcion, descuento = 0;
        double descuentoFin = 0, basica, precio = 0, estandar, premium, precioFin = 0;
        String nombre, tipoSuscripcion = "";
        System.out.println("\033[42m¡Bienvenido/a a la plataforma digital!\033[0m");
        System.out.println("");
        System.out.print("Por favor, dinos tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Por favor, dinos tu edad: ");
        edad = sc.nextInt();
        System.out.print("Gracias por registrarte," + nombre + "! ");
        System.out.println("Selecciona el tipo de suscripcion que deseas: ");
        System.out.printf("1. Basica -   10\u20ac \n");
        System.out.printf("2. Estandar - 15\u20ac \n");
        System.out.printf("3. Premium -  20\u20ac \n");
        suscripcion = sc.nextInt();
        // Utilizo un switch para manejar toda la iteracion del programa por las edades
        // y los descuentos que se deben aplicar
        switch (suscripcion) {
            case 1:
                precio = 10;
                tipoSuscripcion = "Basica";
                if ((edad <= 25) && (edad >= 18)) {
                    descuento = 20;
                    descuentoFin = (precio * 0.20);
                    precioFin = precio - descuentoFin;
                } else if ((edad <= 40) && (edad >= 26)) {
                    descuento = 10;
                    descuentoFin = (precio * 0.10);
                    precioFin = precio - descuentoFin;
                } else if (edad >= 41) {
                    precioFin = 10;
                }
                break;
            case 2:
                precio = 15;
                tipoSuscripcion = "Estandar";
                if ((edad <= 25) && (edad >= 18)) {
                    descuento = 20;
                    descuentoFin = (precio * 0.20);
                    precioFin = precio - descuentoFin;
                } else if ((edad <= 40) && (edad >= 26)) {
                    descuento = 10;
                    descuentoFin = (precio * 0.10);
                    precioFin = precio - descuentoFin;
                } else if (edad >= 41) {
                    precioFin = 15;
                }
                break;
            case 3:
                precio = 20;
                tipoSuscripcion = "Premium";
                if ((edad <= 25) && (edad >= 18)) {
                    descuento = 20;
                    descuentoFin = (precio * 0.20);
                    precioFin = precio - descuentoFin;
                } else if ((edad <= 40) && (edad >= 26)) {
                    descuento = 10;
                    descuentoFin = (precio * 0.10);
                    precioFin = precio - descuentoFin;
                } else if (edad >= 41) {
                    precioFin = 20;
                }
                break;
            default:
                System.out.println("Ingrese un numero correcto");
                break;
        }
        // En estos printf he usado otras variables como descuento que contienen en
        // valor real del enunciado, para poder printarlas
        System.out.println("Resumen de tu registro: ");
        System.out.printf("Nombre: %-10s \n", nombre);
        System.out.printf("Tipo de suscripcion: %-10s \n", tipoSuscripcion);
        System.out.printf("Precio original: %7.2f\u20ac \n", precio);
        System.out.printf("Descuento aplicado: %-2d%% \n", descuento);
        System.out.printf("Precio final: \033[1;31m%-7.2f\u20ac\033[0m \n", precioFin);
        // He anidado if para controlar los mensajes de Finalizacion, el cumplimiento de
        // las condiciones dependen de las edades
        if ((edad < 25) && (tipoSuscripcion.equals("Premium"))) {
            System.out.println("\033[43m¡Felicidades, estás aprovechando al máximo nuestra plataforma!\033[0m");
        } else if ((edad < 40) && (edad > 26) && (tipoSuscripcion.equals("Estandar"))) {
            System.out.println("\033[43mBuena eleccion para disfrutar de contenido de calidad a buen precio.\033[0m");
        } else if ((edad >= 41) && (tipoSuscripcion.equals("Basica"))) {
            System.out.println("\033[43m¡Gracias por unirte! Esperamos que disfrutes del contenido básico.\033[0m");
        } else {
            System.out.println("\033[43mGracias por registrarte en nuestra plataforma.\033[0m");
        }
        sc.close();
    }
}
