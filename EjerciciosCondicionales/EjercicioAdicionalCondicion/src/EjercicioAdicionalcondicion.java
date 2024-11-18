import java.util.Scanner;

public class EjercicioAdicionalcondicion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String tipoAsiento, tipoEspectador;
        double precio;

        System.out.print("Introduzca precio real: ");
        precio = sc.nextDouble();

        System.out.println("¿Quieres entrada a palco o gallinero?");
        System.out.println("1. Palco");
        System.out.println("2. Gallinero");
        sc.nextLine();
        tipoAsiento = sc.nextLine();

        System.out.println("Tipo de entrada: ");
        System.out.println("1. Invitado");
        System.out.println("2. Local");
        System.out.println("3. Foraneo");
        tipoEspectador = sc.nextLine();

        switch (tipoAsiento) {
            case "Palco":
                if (tipoEspectador.equals("Invitado")) {
                    precio = precio - (precio * 10) / 100;
                    System.out.print("El precio de la entrada al Palco para invitado es: " + precio + "€");
                } else if (tipoEspectador.equals("Foraneo")) {
                    precio = precio + (precio * 10) / 100;
                    System.out.print("El precio de la entrada al Palco para Foraneo es: " + precio + "€");
                } else if (tipoEspectador.equals("Local")) {
                    System.out.println("El precio de la entrada al Palco para Local es: " + precio + "€");
                } else {
                    System.out.println("Introduzca un Espectador correcto");
                }
                break;

            case "Gallinero":
                if (tipoEspectador.equals("Invitado")) {
                    precio = precio - (precio * 5) / 100;
                    System.out.println("El precio de la entrada al Gallinero para Invitado es: " + precio + "€");
                } else if (tipoEspectador.equals("Foraneo")) {
                    precio = precio + ((precio * 5) / 100);
                    System.out.println("El precio de la entrada al Gallinero para Foraneo es: " + precio + "€");
                } else if (tipoEspectador.equals("Local")) {
                    System.out.println("El precio de la entrada al Palco para local es:" + precio + "€");
                } else {
                    System.out.println("Introduce un Espectador correcto");
                }
                break;
        }
        sc.close();
    }
}
