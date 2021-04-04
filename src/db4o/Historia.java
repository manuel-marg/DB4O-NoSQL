
package db4o;

import java.time.LocalDate;

public class Historia {

    private int id;
    private Boolean closefriends;
    private String foto;
    private String video;
    private Usuario usuario;
    private Boolean archivado;
    private String fecha_publicacion;
    private Usuario[] usuario_etiquetado;

    public Historia() {
    }

    public Historia(int id, Boolean closefriends, String foto, String video, Usuario usuario, Boolean archivado, String fecha_publicacion, Usuario[] usuario_etiquetado) {
        this.id = id;
        this.closefriends = closefriends;
        this.foto = foto;
        this.video = video;
        this.usuario = usuario;
        this.archivado = archivado;
        this.fecha_publicacion = fecha_publicacion;
        this.usuario_etiquetado = usuario_etiquetado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getClosefriends() {
        return closefriends;
    }

    public void setClosefriends(Boolean closefriends) {
        this.closefriends = closefriends;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean getArchivado() {
        return archivado;
    }

    public void setArchivado(Boolean archivado) {
        this.archivado = archivado;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public Usuario[] getUsuario_etiquetado() {
        return usuario_etiquetado;
    }

    public void setUsuario_etiquetado(Usuario[] usuario_etiquetado) {
        this.usuario_etiquetado = usuario_etiquetado;
    }
    
    
    
}
