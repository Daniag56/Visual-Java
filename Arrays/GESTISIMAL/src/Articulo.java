public class Articulo {
    private int codigo, stock;
    private double  precioCompra, precioVenta;
    private String descripcion;

    public Articulo(int codigo, double precioCompra, double precioVenta, int stock, String descripcion) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int  getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Articulo [codigo=" + codigo + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta
                + ", stock=" + stock + ", descripcion=" + descripcion;
    }
}
