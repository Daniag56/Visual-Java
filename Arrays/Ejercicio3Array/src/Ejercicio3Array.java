import java.util.Scanner;

public class Ejercicio3Array {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];

        System.out.println("Introduce 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("----------------------------");

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}
