import java.util.Scanner;

public class Ejercicio14Condicionales {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String simbolo;
        System.out.println("Elija hacia donde quiera que apunte el vertize: ");
        System.out.println("1. Hacia arriba");
        System.out.println("2. Hacia abajo");
        System.out.println("3. Hacia la derecha");
        System.out.println("4. Hacia la izquierda");
        System.out.print("Introduzca la opcion que desea ejecutar: ");
        opcion = sc.nextInt();

        System.out.print("Introduzca un simbolo para rellenar la piramide: ");
        sc.nextLine();
        simbolo = sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("  " + simbolo + " ");
                System.out.println(" " + simbolo + simbolo + simbolo + " ");
                System.out.println(simbolo + simbolo + simbolo + simbolo + simbolo);
                break;
            case 2:
                System.out.println(simbolo + simbolo + simbolo + simbolo + simbolo);
                System.out.println(" " + simbolo + simbolo + simbolo + " ");
                System.out.println("  " + simbolo + " ");
                break;
            case 3:
                System.out.println(simbolo);
                System.out.print(simbolo);
                System.out.print(" ");
                System.out.println(simbolo);
                System.out.print(simbolo);
                System.out.print(" ");
                System.out.print(simbolo);
                System.out.print(" ");
                System.out.println(simbolo);
                System.out.print(simbolo);
                System.out.print(" ");
                System.out.println(simbolo);
                System.out.println(simbolo);
                break;
            case 4:
                System.out.println(simbolo);
                System.out.println(simbolo);
                System.out.print(simbolo);
                System.out.println(simbolo);
                System.out.print(simbolo);
                System.out.print(simbolo);  
                System.out.println(simbolo); 
                System.out.print(simbolo);   
                System.out.print(simbolo);

        }
        sc.close();
    }
}
