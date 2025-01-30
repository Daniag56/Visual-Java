import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GestionHash {
    HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

    public void agregar(String ciudad, int codPostal) {
        if (map.containsKey(ciudad)) {
            ArrayList<Integer> listamap;
            listamap = map.get(ciudad);
            if (!listamap.contains(codPostal)) {
                listamap.add(codPostal);
            }
        }else{
            ArrayList<Integer> listamap = new ArrayList<Integer>();
            map.put(ciudad, listamap);
        }
    }

    public void mostrar(){
        
    }

    
}
