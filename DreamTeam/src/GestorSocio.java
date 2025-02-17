import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorSocio implements CRUD<Socio> {

    Connection conn;
    Socio socio1 = new Socio(0, null, 0, 0, null);

    public GestorSocio(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Socio requestById(int id) {
        String query = "SELECT * FROM socios WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Socio(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("estatura"),
                        rs.getInt("edad"),
                        rs.getString("localidad"));
            } else {
                System.out.println("No se encontró ningún socio con el ID: " + id);
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el socio: " + e.getMessage());
            return null;
        }
    }

    // Implementación de otros métodos de la interfaz CRUD
    @Override
    public ArrayList<Socio> query(String col, String value) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "localidad");
        if (!validColumns.contains(col))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + col + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> query(String col, int value) throws SQLException {
        List<String> validColumns = Arrays.asList("SocioID", "Edad");
        if (!validColumns.contains(col))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + col + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> requestAM(String sortedBy) {
        ArrayList<Socio> result = null;
        String sqlQuery = "SELECT * FROM socio ORDER BY " + sortedBy;
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            ResultSet querySet = stmt.executeQuery();
            result = new ArrayList<Socio>();
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
        } catch (Exception e) {
            System.out.println("No se ha podido realizar la consulta");
        }
                return result;

    }

    @Override
    public boolean create(Socio socio) throws SQLException {
        int socioID = socio1.getId();
        String nombre = socio1.getNombre();
        int estatura = socio1.getEstatura();
        int edad = socio1.getEdad();
        String localidad = socio1.getLocalidad();

        String sqlQuery = "INSERT INTO socio (socioID, nombre, estatura, edad, localidad) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, socioID);
            stmt.setString(2, nombre);
            stmt.setInt(3, estatura);
            stmt.setInt(4, edad);
            stmt.setString(5, localidad);

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0)
                throw new SQLException("Falló la creación del nuevo socio.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Socio socio) {
        String query = "DELETE FROM socios WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, socio.getId());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Socio eliminado correctamente.");
                return true;
            } else {
                System.out.println("No se encontró ningún socio con el ID: " + socio.getId());
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el socio: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Socio socio1) {
        int socioID = socio1.getId();
        String nombre = socio1.getNombre();
        int edad = socio1.getEdad();
        int estatura = socio1.getEstatura();
        String localidad = socio1.getLocalidad();

        String sqlQuery = "UPDATE socio SET nombre = ?, estatura = ?, edad = ?, localidad = ? WHERE socioID = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(5, socioID);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                System.out.println("No ha podido completarse la actualización del socio");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
