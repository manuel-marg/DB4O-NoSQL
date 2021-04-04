
package db4o;

public class Guardado {
    
    private int id;
    private Usuario usuario;
    private String nombre_album;
    private Publicacion publicacion;

    public Guardado() {
    }

    public Guardado(int id, Usuario usuario, String nombre_album, Publicacion publicacion) {
        this.id = id;
        this.usuario = usuario;
        this.nombre_album = nombre_album;
        this.publicacion = publicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre_album() {
        return nombre_album;
    }

    public void setNombre_album(String nombre_album) {
        this.nombre_album = nombre_album;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    
    
    
}
