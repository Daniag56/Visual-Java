import java.util.Scanner;

public class ArrayObjectDiscos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String codigo = "", autor = "", titulo = "", genero = "";
        int duracion = 0, opcion;
        String[] Crud = new String[4];
        System.out.println("Ingrese la opcion que desee para operar: ");
        System.out.println("1. Añadir disco");
        System.out.println("2. Borrar disco");
        opcion = sc.nextInt();
        System.out.println(" ");
        
        switch (opcion) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    System.out.print("Introduzca el codigo del disco: ");
                    sc.nextLine();
                    codigo = sc.nextLine();
                    System.out.print("Introduzca el autor del disco: ");
                    autor = sc.nextLine();
                    System.out.print("Introduzca el titulo del disco: ");
                    titulo = sc.nextLine();
                    System.out.print("Introduzca el genero del disco: ");
                    genero = sc.nextLine();
                    System.out.print("Introduzca la duracion del disco: ");
                    duracion = sc.nextInt();
                    Disco discos = new Disco(codigo, autor, titulo, genero, duracion);
                    System.out.println(" ");
                    Crud[i] = discos.toString();
                }
                for (String Micrud : Crud) {
                    System.out.println(Micrud);
                }
                break;
            case 2:
            System.out.print("Introduzca el codigo del disco que desea borrar: ");
            sc.nextLine();
            codigo = sc.nextLine();
            boolean encontrado = false;

            for (int i = 0; i < Crud.length; i++) {  
                if (Crud[i] != null && Crud[i].contains(codigo)) {
                    Crud[i] = null; 
                    encontrado = true;
                    System.out.println("Disco con código " + codigo + " ha sido borrado.");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Disco no encontrado.");
            }
            break;
            default:
                System.out.println("Opcion no encontrada");
                break;
        }

        sc.close();
    }
}
