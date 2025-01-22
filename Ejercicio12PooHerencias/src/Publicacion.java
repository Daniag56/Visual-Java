public abstract  class  Publicacion {
    private String ISBN;
    private String titulo;
    private int anoPublicacion;
    public Publicacion(String ISBN, String titulo, int anoPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }


    @Override
    public String toString(){
        return "ISBN: " + this.ISBN + "\n" + "Titulo: "+this.titulo +"\n" + "Año de Publicacion: " + this.anoPublicacion ;
    }
}
