import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int horas, precio , salarioTotal;
    precio = 12;
    System.out.println("Introduzca las horas trabajadas esta semana");
    horas = sc.nextInt();

    salarioTotal = horas*precio;

    System.out.println("El salario de una semana es:  " + salarioTotal);
  
    }
}
