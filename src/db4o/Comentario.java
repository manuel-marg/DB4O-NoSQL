
package db4o;

import java.time.LocalDate;

public class Comentario {
    
    private int id;
    private Usuario usuario;
    private int id_publicacion;
    private String contenido;
    private String fecha_publicacion;
    private String fecha_modificacion;
    private int cantidad_likes;

    public Comentario() {
    }

    public Comentario(int id, Usuario usuario, int id_publicacion, String contenido, String fecha_publicacion, String fecha_modificacion, int cantidad_likes) {
        this.id = id;
        this.usuario = usuario;
        this.id_publicacion = id_publicacion;
        this.contenido = contenido;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_modificacion = fecha_modificacion;
        this.cantidad_likes = cantidad_likes;
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

    public int getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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
    
    

  

   

    public int getCantidad_likes() {
        return cantidad_likes;
    }

    public void setCantidad_likes(int cantidad_likes) {
        this.cantidad_likes = cantidad_likes;
    }
    
    public Comentario(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id=" + id + ", usuario=" + usuario + ", id_publicacion=" + id_publicacion + ", contenido=" + contenido + ", fecha_publicacion=" + fecha_publicacion + ", fecha_modificacion=" + fecha_modificacion + ", cantidad_likes=" + cantidad_likes + '}';
    }   
    
}