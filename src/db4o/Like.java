
package db4o;

public class Like {
   
    private int id;
    private Usuario usuario;
    private Boolean tipo;
    private int id_publicacion; // Podriamos pasar el Objeto
    private int id_comentario; // Prodrimos paras el Objeto
    private String fecha_publicacion;
    private String fecha_modificacion;

    public Like() {
    }

    public Like(int id, Usuario usuario, Boolean tipo, int id_publicacion, int id_comentario, String fecha_publicacion) {
        this.id = id;
        this.usuario = usuario;
        this.tipo = tipo;
        this.id_publicacion = id_publicacion;
        this.id_comentario = id_comentario;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_modificacion = "";
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

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }

    public int getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
    
    public Like(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }
    
    @Override
    public String toString() {
        return "Like{" + "id=" + id + ", usuario=" + usuario + ", tipo=" + tipo + ", id_publicacion=" + id_publicacion + ", id_comentario=" + id_comentario + ", fecha_publicacion=" + fecha_publicacion + ", fecha_modificacion=" + fecha_modificacion + '}';
    }
    
}