import java.util.ArrayList;
import java.util.Scanner;

public interface Interactuador {
    String url = "jdbc:mariadb://localhost:3306/baloncesto";
    String username = "root";
    String contraseña = "";

    ConnectionPool conn = new ConnectionPool(url, username, contraseña);
    GestorSocio miGestor = new GestorSocio(conn.getConnection());
    Scanner sc = new Scanner(System.in);

    public static void consultaFiltrada() {
        ArrayList<Socio> lista = new ArrayList<>();
        System.out.println("Introduce la columna por la que filtrar: ");
        String columna = sc.nextLine().toLowerCase();

        try {
            switch (columna) {
                case "nombre":
                    System.out.println("Escriba el nombre del socio: ");
                    String nombre = sc.nextLine();
                    lista = miGestor.query(columna, nombre);
                    break;
                case "localidad":
                    System.out.println("Escriba la localidad de residencia: ");
                    String localidad = sc.nextLine();
                    lista = miGestor.query(columna, localidad);
                    break;
                case "socioid":
                    System.out.print("Introduce la id del socio: ");
                    int socioID = solicitarEntero();
                    lista = miGestor.query(columna, socioID);
                    break;
                case "estatura":
                    System.out.print("Introduce la estatura del socio: ");
                    int estatura = solicitarEntero();
                    lista = miGestor.query(columna, estatura);
                    break;
                case "edad":
                    System.out.print("Introduce la edad del socio: ");
                    int edad = solicitarEntero();
                    lista = miGestor.query(columna, edad);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Introduzca un valor correcto");
        }
    }

    public static void consultaOrdenada() {
        ArrayList<Socio> lista = null;
        System.out.println("Escriba el criterio de ordenacion: ");
        String criterio = sc.nextLine().toLowerCase();
        try {
            lista = miGestor.requestAM(contraseña);
            if (lista.isEmpty())
                System.out.println("No se encuentra ningun socio");
            for (Socio socio : lista) {
                System.out.println(socio);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void consultarPorId() {
        System.out.print("Introduce la id del socio: ");
        int socioID = solicitarEntero();
        try {
            Socio socio = miGestor.requestById(socioID);
            if (socio != null)
                System.out.println("No se encuentra ningun socio");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void modificar(){
        System.out.print("Introduce la id del socio: ");
        int socioID = solicitarEntero();
        try {
            miGestor.update(null);
            if (socioID == 0) {
                System.out.println("Socio no encontrado");
            }
            System.out.println("Se ha modificado el socio");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void crear(){
        System.out.println("Introduce el id del socio: ");
        int socioID = solicitarEntero();
        Socio socio1 = new Socio(socioID,"",0,0,"");
        try {
            miGestor.create(socio1);
            System.out.println("Socio creado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void eliminar(){
        System.out.print("Introduce la id del socio: ");
        int socioID = solicitarEntero();
        try {
            miGestor.delete(null);
            if (socioID == 0) {
                System.out.println("Socio no encontrado");
                }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
    }

    private static int solicitarEntero() {
        int entero = 0;

        boolean fin = false;

        while (!fin) {
            try {
                entero = sc.nextInt();
                fin = true;
            } catch (Exception e) {
                System.out.println("Opcion invalida");
            } finally {
                sc.nextLine();
            }

        }
        return entero;
    }

}
