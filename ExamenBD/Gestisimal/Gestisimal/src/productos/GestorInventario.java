package productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import productos.Producto;
import crud.CRUD;

public class GestorInventario implements CRUD<Producto> {
    Connection conn;

    public GestorInventario(Connection conn) {
        this.conn = conn;
    }

    @Override
    public ArrayList<Producto> requestAll(String sortedBy) throws SQLException {
        ArrayList<Producto> result = new ArrayList<>();
        long codigo;
        String descripcion;
        double precioCompra;
        double precioVenta;
        int stock;

        String querySQL = "SELECT * FROM productos";
        
        try (Statement stmt = this.conn.createStatement()) {
            
            stmt.executeQuery(querySQL);
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Producto requestById(long códigoProducto) throws SQLException {
        
        String sqlQuery = "SELECT * FROM productos";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            // TODO: Terminar de construir stmt
            // TODO: Ejecución de la consulta
            // TODO: Recorrido del resultado de la consulta y creación del producto a
            // devolver

            return null;
        } catch (SQLException e) {
            throw e;
        }
    }
    /**
     * @param Producto producto
     * Funcion que contiene una consulta INSERT INTO para añadir nuevos campos a la tabla
     * 
     */
    @Override
    public boolean create(Producto producto) throws SQLException {
        long codigo = producto.getCodigo();
        String descripcion = producto.getDescripcion();
        double precioCompra = producto.getPrecioCompra();
        double precioVenta = producto.getPrecioVenta();
        int stock = producto.getStock();

        String sqlQuery = "INSERT INTO productos(codigo,descripcion,precioCompra,precioVenta,stock) VALUES(?,?,?,?,?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, codigo);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precioCompra);
            stmt.setDouble(4, precioVenta);
            stmt.setInt(5, stock);
            int affectedRows = stmt.executeUpdate(sqlQuery);
            if (affectedRows == 0)
                throw new SQLException("Falló la creación del nuevo producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }
/**
 * @param Producto producto
 * Funcion para modificar los campos de la tabla
 * con una consulta UPDATE
 */
    @Override
    public boolean update(Producto producto) throws SQLException {
        long codigo = producto.getCodigo();
        String descripcion = producto.getDescripcion();
        double precioCompra = producto.getPrecioCompra();
        double precioVenta = producto.getPrecioVenta();
        int stock = producto.getStock();

        String sqlQuery = "UPDATE productos SET(?,?,?,?,?) WHERE (codigo,descripcion,precioCompra,precioVenta,stock)";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, codigo);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precioCompra);
            stmt.setDouble(4, precioVenta);
            stmt.setInt(5, stock);
            int affectedRows = stmt.executeUpdate(sqlQuery);
            if (affectedRows == 0)
                throw new SQLException("Falló la actualización de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }
    /**
     * @param long codigo
     * Funcion delete para borrar un campo de la tabla mediante su codigo
     * con una consulta DELETE
     */
    @Override
    public boolean delete(long códigoProcucto) throws SQLException {
        long codigo = 0;
        String sqlQuery = "DELETE (codigo) FROM productos WHERE(?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, codigo);
            int affectedRows = stmt.executeUpdate(sqlQuery);
            if (affectedRows == 0)
                throw new SQLException("Falló el borrado de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

}