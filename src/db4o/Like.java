
package db4o;

import java.time.LocalDate;

public class Like {
   
    private int id;
    private Usuario usuario;
    private Boolean tipo;
    private int id_publicacion; // Podriamos pasar el Objeto
    private int id_comentario; // Prodrimos paras el Objeto
    private LocalDate fecha_publicacion;
    private LocalDate fecha_modificacion;

    public Like() {
    }

    public Like(int id, Usuario usuario, Boolean tipo, int id_publicacion, int id_comentario, LocalDate fecha_publicacion, LocalDate fecha_modificacion) {
        this.id = id;
        this.usuario = usuario;
        this.tipo = tipo;
        this.id_publicacion = id_publicacion;
        this.id_comentario = id_comentario;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_modificacion = fecha_modificacion;
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

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public LocalDate getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(LocalDate fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
    
    
    
}
