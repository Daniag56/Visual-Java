import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
/*   float x = 144;
  float y = 999;

  System.out.println(x);
  System.out.println(y);

  float suma, resta, multiplicacion, division;

  suma = x + y;
  resta = x - y;
  multiplicacion = x * y;
  division = x / y;

  System.out.println("El resultado de la suma es:" + suma);
  System.out.println("El resultado de la resta es:" + resta);
  System.out.println("El resultado de la multiplicacion es:"+ multiplicacion);
  System.out.println("El resultado de la division es:" +division); 

//Ejercicio 2
String nombre = "Daniel Arias Garcia";
System.out.println(nombre);

//Ejercicio 3
String nombre = "Daniel Arias Garcia";
String direccion = "C/Sierra de las Nieves";
String Telefono= "665280386";
System.out.println(nombre);
System.out.println(direccion);
System.out.println(Telefono);*/

//Ejercicio 4
Scanner sc = new Scanner(System.in);
double euros, pesetas , conversor; 
System.out.println("Introduce la cantidad de euros");
euros = sc.nextDouble();
conversor =  euros * 166.386;
System.out.println("La cantidad de pesetas es:"+conversor);
}
}
