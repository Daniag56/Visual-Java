public class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        codigo = this.codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        autor = this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        titulo = this.titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        genero = this.genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        duracion = this.duracion;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        return cadena;
    }
}
