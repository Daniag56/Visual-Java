import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestionHash {

    HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

    public void agregar(String ciudad, int codPostal) {
        ciudad = "";
        codPostal = 0;
        if (!map.containsKey(ciudad)) {
            ArrayList<Integer> listamap = new ArrayList<>();
            listamap.add(codPostal);
            map.put(ciudad, listamap);

        } else {
            ArrayList<Integer> listamap = map.get(ciudad);
            if (!listamap.contains(codPostal)) {
                listamap.add(codPostal);
            }
        }
    }

    public boolean borrar(String ciudad) {
        if (map.containsKey(ciudad)) {
            map.remove(ciudad);
            return true;
        }
        return false;
    }

    public void mostrar() {
        for (Map.Entry<String, ArrayList<Integer>> mapeable : map.entrySet()) {
            System.out.print("La provincia: " + mapeable.getKey() + " tiene los codigos postales: ");
            for (int i = 0; i < mapeable.getValue().size(); i++) {
                System.out.println(mapeable.getValue().get(i));
            }
        }
    }

    public void MostrarCpProvincia(String ciudad) {
        if (map.containsKey(ciudad)) {
            ArrayList<Integer> listamap = map.get(ciudad);
            System.out.print("Provincia: " + ciudad + "tiene los cp:");
            for (Integer miCp : listamap) {
                System.out.print(miCp + "");
            }
            System.out.println();
        }
    }
}
