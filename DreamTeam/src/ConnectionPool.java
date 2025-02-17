
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class ConnectionPool {
    private ArrayList<Connection> conn = new ArrayList<Connection>();
    private String url;
    private String username;
    private String contraseña;

  

    public ConnectionPool(String url, String username, String contraseña) {
        this.url = url;
        this.username = username;
        this.contraseña = contraseña;
    }

    

    public Connection getConnection(){
        Connection conn = null;
        try {
            // Obtiene una conexión con los parámetros de conexión dados
            conn = DriverManager.getConnection(this.url, this.username, this.contraseña);
            // Si obtenemos conexión la añadimos en el array de conexiones
            if(conn!=null)
                this.conn.add(conn);    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Devolvemos la conexión establecida si se ha podido establecer
        return conn; //Puede ser null si no hay conexión establecida
    }

    public void closeAll(){
        //Cerramos una a una las conexiones establecidas
        for(Connection conns: this.conn){
            try {
                if(conn!=null)
                    conns.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //Limpiamos el array de conexiones
        this.conn.clear();
    }
}
