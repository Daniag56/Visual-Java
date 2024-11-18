
import java.util.Scanner;

public class Ejerciciosbucles13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeroPos = 0,numero, numeroNeg=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el numero: "+ i);
            numero = sc.nextInt();
            if (numero>0) {
                numeroPos++;
            }else if (numero<0) {
                numeroNeg++;   
            }else{
                i--;
            }
        }
        System.out.println("La cantidad de numero Positivos son:"+ numeroPos + " "+ "la cantidad de numeros negativos son: "+numeroNeg);
        sc.close();
    }
}
