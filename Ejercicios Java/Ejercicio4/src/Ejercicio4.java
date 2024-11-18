import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double euros, pesetas , conversor; 
        System.out.println("Introduce la cantidad de euros");
        euros = sc.nextDouble();
        conversor =  euros * 166.386;
        System.out.println("La cantidad de pesetas es:"+conversor);
        sc.close();
    }
}
