import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionMariaDB {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mariadb://localhost:3306/baloncesto";
        String username = "root";
        String contraseña = "";

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

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultado != null)
                    resultado.close();
                if (sentencia != null)
                    sentencia.close();
                if (connection != null)
                    connection.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
}
