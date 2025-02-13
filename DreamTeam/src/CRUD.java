import java.util.ArrayList;

public interface CRUD<T> {
    
    public ArrayList<T> query(String col, String value);
    public ArrayList<T> query(String col, int value);
    public ArrayList<T> requestAM(String sortedBy);
    public T requestById(int id);
    public boolean create(T model);
    public boolean update(T model);
    public boolean delete(T model);
}
