import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       double nota,nota2,notaFin;

       System.out.println("¿Que nota quieres sacar?");
       notaFin = sc.nextDouble();
       System.out.println("Introduce una nota");
       nota = sc.nextDouble();
       nota2 = (notaFin -(nota*0.4))/0.6;
    
       System.out.println("Para sacar un: " +notaFin+ "tienes que sacar un: " + nota2 ); 
    }
}
