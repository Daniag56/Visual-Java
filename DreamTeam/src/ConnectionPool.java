import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionPool {
    private ArrayList<Connection> conn;
    private String url = "jdbc:mariadb://localhost:3306/baloncesto";
    private String username = "root";
    private String contraseña = "";

  

    public ConnectionPool(String url, String username, String contraseña) {
        this.url = url;
        this.username = username;
        this.contraseña = contraseña;
    }

    public ArrayList<Connection> getConn() {
        return conn;
    }

    public void conexion() {
        Connection connection = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            connection = DriverManager.getConnection(url, username, contraseña);
            sentencia = connection.createStatement();

            String query = "SELECT * FROM socio";
            resultado = sentencia.executeQuery(query);

            while (resultado.next()) {
                int socioID = resultado.getInt("socioID");
                String nombre = resultado.getString("nombre");
                int estatura = resultado.getInt("estatura");
                int edad = resultado.getInt("edad");
                String localidad = resultado.getString("localidad");

                System.out.println("ID socio: " + socioID + ", Nombre: " + nombre + ", Estatura: " + estatura
                        + ", Edad: " + edad + ", Localidad: " + localidad);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CloseAll(Connection connection, Statement sentencia, ResultSet resultado) throws SQLException {
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            resultado.close();
        if (connection != null)
            resultado.close();
    }
}
