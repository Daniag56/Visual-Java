import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class GestionCoches implements Crud<Coches> {
    private File file1;
    private ArrayList<Coches> listaCoche = new ArrayList<Coches>();

    public GestionCoches(File file1) {
        this.file1 = file1;
    }

    @Override
    public ArrayList<Coches> recuperarTodos() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String linea = " ";
            while ((linea = br.readLine()) != null) {
                Coches coche1 = new Coches(linea);
                listaCoche.add(coche1);
            }
            br.close();
        } catch (Exception ioe) {
            System.out.println(ioe.getMessage());
        }
        return null;

    }

    @Override
    public Coches recuperarUno(String id) {
        
        return null;
    }

    @Override
    public Coches añadir(Coches data) {

        throw new UnsupportedOperationException("Unimplemented method 'añadir'");
    }

    @Override
    public Coches eliminar(String id) {

        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public Coches modificar(Coches data) {

        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

}
