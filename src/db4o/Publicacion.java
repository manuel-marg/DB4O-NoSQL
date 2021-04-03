
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
    private LocalDate fecha_publicacion;
    private LocalDate fecha_modificacion;
    private Usuario[] user_etiquetado;
    private Boolean archivado;
    
}
