package productos;

import java.sql.PreparedStatement;

public class Producto {

    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    private long codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    /**
     * 
     * @param codigo
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     */
    public Producto(long codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public PreparedStatement setCodigo(long codigo) {
        this.codigo = codigo;
                return null;
    }

    public PreparedStatement setDescripcion(String descripcion) {
        this.descripcion = descripcion;
                return null;
    }

    public PreparedStatement setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
                return null;
    }

    public PreparedStatement setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
                return null;
    }

    public PreparedStatement setStock(int stock) {
        this.stock = stock;
                return null;
    }

    /**
     * Metodo toString para imprimir los resultados de la base de datos
     */
    @Override
    public String toString() {
        return String.format("Codigo producto: %12d" + codigo + " , " + "Descripcion producto: %s" + descripcion + " , "
                + "Precio compra: %5.2f" + precioCompra + " , " + "Precio Venta: %5.2f" + precioVenta + " , " + "Stock: %8d"
                + stock);
    }
}