
package db4o;

import java.time.LocalDate;

public class Publicacion {
    
    private int id;
    private Usuario usuario;
    private String foto;
    private String video;
    private String descripcion;
    private Hashtag[] hashtag;
    private String ubicacion;
    private int cantidad_likes;
    private String fecha_publicacion;
    private String fecha_modificacion;
    private Usuario[] user_etiquetado;
    private Boolean archivado;

    public Publicacion() {
    }

    public Publicacion(int id, Usuario usuario, String foto, String video, String descripcion, Hashtag[] hashtag, String ubicacion, int cantidad_likes, String fecha_publicacion, String fecha_modificacion, Usuario[] user_etiquetado, Boolean archivado) {
        this.id = id;
        this.usuario = usuario;
        this.foto = foto;
        this.video = video;
        this.descripcion = descripcion;
        this.hashtag = hashtag;
        this.ubicacion = ubicacion;
        this.cantidad_likes = cantidad_likes;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_modificacion = fecha_modificacion;
        this.user_etiquetado = user_etiquetado;
        this.archivado = archivado;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Hashtag[] getHashtag() {
        return hashtag;
    }

    public void setHashtag(Hashtag[] hashtag) {
        this.hashtag = hashtag;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidad_likes() {
        return cantidad_likes;
    }

    public void setCantidad_likes(int cantidad_likes) {
        this.cantidad_likes = cantidad_likes;
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

    public Usuario[] getUser_etiquetado() {
        return user_etiquetado;
    }

    public void setUser_etiquetado(Usuario[] user_etiquetado) {
        this.user_etiquetado = user_etiquetado;
    }

    public Boolean getArchivado() {
        return archivado;
    }

    public void setArchivado(Boolean archivado) {
        this.archivado = archivado;
    }

    public Publicacion(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "id=" + id + ", usuario=" + usuario + ", foto=" + foto + ", video=" + video + ", descripcion=" + descripcion + ", hashtag=" + hashtag + ", ubicacion=" + ubicacion + ", cantidad_likes=" + cantidad_likes + ", fecha_publicacion=" + fecha_publicacion + ", fecha_modificacion=" + fecha_modificacion + ", user_etiquetado=" + user_etiquetado + ", archivado=" + archivado + '}';
    }
    
    
    
}
