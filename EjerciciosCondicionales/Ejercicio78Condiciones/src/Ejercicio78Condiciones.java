import java.util.Scanner;

public class Ejercicio78Condiciones {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Introduzca la nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Introduzca la nota2: ");
        nota2 = sc.nextDouble();
        System.out.print("Introduzca la nota3: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3)/3;
        int media_cast = (int)media;

        if ((nota1 > 0) || (nota2 > 0) || (nota3 > 0)) {
            System.out.println("La nota media es: " + media);

        } else {
            System.out.println("Los numeros introducidos no son correctos");
        }

        switch (media_cast) {
            case 0, 1, 2, 3, 4:
                System.out.println("Tiene un: " + media + " de media y es insuficiente");
                break;
            case 5, 6:
                System.out.println("Tiene un: " + media + " de media y es suficiente");
                break;
            case 7, 8:
                System.out.println("Tiene un: " + media + " de media y es notable");
                break;
            case 9, 10:
                System.out.println("Tiene un: " + media  + " de media y es sobresaliente");
                break;
            default:
                System.out.println("Los numeros introducidos no corresponden con ninguna media");
                break;
        }
    }
}
