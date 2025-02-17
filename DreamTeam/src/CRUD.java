import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD<T> {
    
    public ArrayList<T> query(String col, String value) throws SQLException;
    public ArrayList<T> query(String col, int value) throws SQLException;
    public ArrayList<T> requestAM(String sortedBy);
    public T requestById(int id);
    public boolean create(T model) throws SQLException;
    public boolean update(T model);
    public boolean delete(T model);
}
