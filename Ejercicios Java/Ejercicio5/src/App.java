import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double euros, pesetas , conversor; 
        System.out.println("Introduce la cantidad de pesetas");
        pesetas = sc.nextDouble();
        euros = pesetas/166.386;
        System.out.println("La cantidad de euros es:"+euros);
        sc.close();
    }
}
