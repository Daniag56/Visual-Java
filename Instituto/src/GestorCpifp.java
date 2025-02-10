import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorCpifp {

    @SuppressWarnings("rawtypes")
    Cpifp miCentro = new Cpifp("Juan", "hfvb", 77675748, "args[0]");
    private File misEstudiantes;

    public boolean añadir(int id, String nombre) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(misEstudiantes, true));
            bw.write(miCentro.serializar(id) + "\n");
            bw.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return false;

    }

    public boolean eliminar(int id) {
        return false;
    }

    public boolean modificar(int id, String nombre) {
        return false;
    }

    public String obtenerEst(int id) {
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
