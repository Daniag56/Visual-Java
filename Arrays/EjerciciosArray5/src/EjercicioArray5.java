import java.util.Scanner;

public class EjercicioArray5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
        System.out.println("Ingrese 10 números enteros");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();

            if (array[i]>=maximo) {
                maximo = array[i];
            }
            if (array[i]<=minimo) {
                minimo = array[i];
            }
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);

            if (array[i] == maximo) {
                System.out.println("maximo");
            }
            if (array[i] == minimo) {
                System.out.println("minimo");
            }
           
        }
        sc.close();
    }
}
