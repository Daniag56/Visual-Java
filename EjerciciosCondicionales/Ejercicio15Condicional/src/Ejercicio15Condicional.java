import java.util.Scanner;

public class Ejercicio15Condicional {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String opcion;
       int contador = 0;

       System.out.println("          RESPONDA VERDADERO O FALSO");
       System.out.println("1.Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("2.Ha aumentado sus gastos de vestuario");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("3.Ha perdido el interés que mostraba anteriormente por ti");
       opcion = sc.nextLine();
       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("4.Ahora se afeita y se asea con más frecuencia (si es hombre) arregla el pelo y se asea con más frecuencia (si es mujer)");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("5.No te deja que mires la agenda de su teléfono móvil");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("6.A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("7.Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("8.Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador = 0;
       }

       System.out.println("9.Has notado que últimamente se perfuma más");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero || verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador += 0;
       }

       System.out.println("10.Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
       opcion = sc.nextLine();

       if (opcion.equals("Verdadero")) {
        contador += 3;
       }
       if (opcion.equals("Falso || falso")) {
        contador += 0;
       }

       System.out.println(contador);

       if (contador <= 10) {
        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
       }
       if ((contador <= 22) && (contador >= 11)) {
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia bajes la guardia.");
       }
       if ((contador <= 30) && (contador >= 22)) {
        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
       }
       sc.close();
    }
}
