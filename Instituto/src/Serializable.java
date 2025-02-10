public interface Serializable<K> {
    public String serializar(K dato);
    public K deserializar(String data);
}
