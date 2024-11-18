import java.util.Scanner;

public class Ejercicio11Condicion {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String respuesta;
    int contador = 0;

    System.out.println("Con que se concatena un System.out.Println: ");
    System.out.println("a. +");
    System.out.println("b. ,");
    System.out.println("c. .");
    respuesta = sc.nextLine();

    if (respuesta.equals("a")) {
      contador += 1;
    } else {
      contador -= 1;
    }

    System.out.println("Cual es el operador para que una division devuelva el resto: ");
    System.out.println("a. /");
    System.out.println("b. !");
    System.out.println("c. %");
    respuesta = sc.nextLine();

    if (respuesta.equals("c")) {
      contador += 1;
    } else {
      contador -= 1;
    }

    System.out.println("Con que se concatena un System.out.Printf: ");
    System.out.println("a. +");
    System.out.println("b. ,");
    System.out.println("c. .");
    respuesta = sc.nextLine();

    if (respuesta.equals("b")) {
      contador += 1;
    } else {
      contador -= 1;
    }

    System.out.println("Cual es el tipo de variable para guardar numeros enteros: ");
    System.out.println("a. String");
    System.out.println("b. int");
    System.out.println("c. float");
    respuesta = sc.nextLine();

    if (respuesta.equals("b")) {
      contador += 1;
    } else {
      contador -= 1;
    }
    System.out.println("Cual es un tipo de condicion: ");
    System.out.println("a. if");
    System.out.println("b. for");
    System.out.println("c. do");

    if (respuesta.equals("a")) {
      contador += 1;
    } else {
      contador -= 1;
    }

    System.out.print("Su nota es: "+ contador);
  }
}
