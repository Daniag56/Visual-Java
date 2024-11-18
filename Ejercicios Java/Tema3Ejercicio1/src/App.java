import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1, num2, multiplicacion;
        System.out.println("Introduzca el primer numero");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        multiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicacion es:"+ multiplicacion);

    }
}
