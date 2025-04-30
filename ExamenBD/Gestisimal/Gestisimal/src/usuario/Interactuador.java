package usuario;

import java.util.ArrayList;
import java.util.Scanner;

import pool.ConnectionPool;
import productos.Producto;
import productos.GestorInventario;

public interface Interactuador {
    // Configuración de la conexión a la base de datos
    final String URL = "jdbc:mariadb://localhost:3306/gestisimal";
    final String USUARIO = "root";
    final String CLAVE = "";

    ConnectionPool pool = new ConnectionPool(URL, USUARIO, CLAVE);
    GestorInventario miGestor = new GestorInventario(pool.getConnection());
    Scanner sc = new Scanner(System.in);

    // Consulta ordenada de productos
    public static void consultaOrdenada() {
        // TODO: Declaración e inicialización del ArrayList donde guardaremos el
        // resultado de la consulta
        // TODO: Petición al usuario de los criterios de ordenación.

        try {
            // TODO: Solicitud al gestor, comprobación del resultado y muestra de mensaje de
            // error o listado de productos.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Consulta de datos por ID
    public static void consultaPorCódigo() {
        // TODO: Petición al usuario del código del producto (preferentemente usando la
        // función solicitarValorNumérico).

        try {
            // TODO: Solicitud al gestor, comprobación del resultado y muestra de mensaje de
            // error o datos del producto.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Alta de nuevo producto
    /**
     * @param codigo
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     * 
     * Funcion para dar de alta a los elementos usando la funcion create
     */
    public static void altaProducto() {
        long codigo;
        String descripcion;
        double precioCompra;
        double precioVenta;
        int stock;
        GestorInventario miGestor = new GestorInventario(null);
        try {
            System.out.println("Ingrese los campos para añadir un nuevo campo a la tabla");
            System.out.println("Introduzca el codigo del producto: ");
            codigo = sc.nextLong();
            System.out.println("Introduzca la descripcion del producto: ");
            descripcion = sc.nextLine();
            sc.nextLine();
            System.out.println("Introduzca el precio de compra: ");
            precioCompra = sc.nextDouble();
            System.out.println("Introduzca el precio de venta: ");
            precioVenta = sc.nextDouble();
            System.out.println("Introduzca el stock del producto: ");
            stock = sc.nextInt();
            miGestor.create(new Producto(codigo, descripcion, precioCompra, precioVenta, stock));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualización de los datos de un producto
     /**
     * @param codigo
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     * 
     * Funcion para modificar a los elementos usando la funcion update
     */
    public static void modificaciónProducto() {
        long codigo;
        String descripcion;
        double precioCompra;
        double precioVenta;
        int stock;
        GestorInventario miGestor = new GestorInventario(null);
        try {
            System.out.println("Ingrese los campos para modificar un campo de la tabla");
            System.out.println("Introduzca el codigo del producto: ");
            codigo = sc.nextLong();
            System.out.println("Introduzca la descripcion del producto: ");
            descripcion = sc.nextLine();
            sc.nextLine();
            System.out.println("Introduzca el precio de compra: ");
            precioCompra = sc.nextDouble();
            System.out.println("Introduzca el precio de venta: ");
            precioVenta = sc.nextDouble();
            System.out.println("Introduzca el stock del producto: ");
            stock = sc.nextInt();
            miGestor.update(new Producto(codigo, descripcion, precioCompra, precioVenta, stock));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Baja de un producto
     /**
     * @param codigo
     * 
     * 
     * Funcion para dar de baja a los elementos usando la funcion delete
     */
    public static void bajaProducto() {
        long codigo;
        GestorInventario miGestor = new GestorInventario(null);
        try {
            System.out.println("Introduzca el codigo del producto: ");
            codigo = sc.nextLong();
            miGestor.delete(codigo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Solicitar opción al usuario
    public static int solicitarElección(int OPCIÓN_MAX) {
        int elección = 0;
        try {
            elección = sc.nextInt();
            if (elección < 1 || elección > OPCIÓN_MAX)
                throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Opción inválida.\n");
        } finally {
            sc.nextLine(); // Limpiamos buffer de entrada
        }
        return elección;
    }

    // Solicitar valor numérico al usuario
    // Ejemplo de uso 1: int existencias = (Integer)
    // solicitarValorNumérico(Integer.class);
    // Ejemplo de uso 2: long código = (Long) solicitarValorNumérico(Long.class);
    // Ejemplo de uso 3: double precioCompra = (Double)
    // solicitarValorNumérico(Double.class);
    private static Object solicitarValorNumérico(Class<?> tipo) {
        Object resultado = null;
        while (resultado == null) {
            try {
                if (tipo == Short.class)
                    resultado = sc.nextShort();
                else if (tipo == Integer.class)
                    resultado = sc.nextInt();
                else if (tipo == Long.class)
                    resultado = sc.nextLong();
                else if (tipo == Float.class)
                    resultado = sc.nextFloat();
                else if (tipo == Double.class)
                    resultado = sc.nextDouble();
                else
                    System.out.println("Tipo de dato no soportado.");
            } catch (Exception e) {
                System.out.print("Valor inválido.\nPruebe de nuevo: ");
            } finally {
                sc.nextLine(); // Limpiamos buffer de entrada
            }
        }
        return resultado;
    }

    // Cerrar scanner
    public static void cerrarScanner() {
        sc.close();
    }

}
