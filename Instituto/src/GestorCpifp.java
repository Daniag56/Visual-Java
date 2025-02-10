import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorCpifp {

    Cpifp miCentro = new Cpifp("Juan", "hfvb", 77675748, "args[0]");
    private File misEstudiantes;

    public boolean añadir(int id, String nombre) {
        if (obtenerEst(miCentro.serializar(nombre)) != null) {
            System.out.println("El coche ya estaba registrado y no se ha añadido al fichero");
            return true;
        } else {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(misEstudiantes, true));
                bw.write(miCentro.serializar() + "\n");
                bw.close();
            } catch (FileNotFoundException fnfe) {
                System.out.println(fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
            return false;
        }
        return false;

    }

    public boolean eliminar(int id) {
        return false;
    }

    public boolean modificar(int id, String nombre) {
        return false;
    }

    public String obtenerEst() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(misEstudiantes));
            String linea = "";
            miCentro.deserializar(linea);
            while ((linea = br.readLine()) != null) {
                br.close();
                return "";

            }
            br.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return "";
    }

    public String listarEst() {
        return null;
    }
}
