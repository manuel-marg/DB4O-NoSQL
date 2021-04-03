
package db4o;

import java.time.LocalDate;

public class Comentario {
    
    private int id;
    private Usuario usuario;
    private int id_publicacion;
    private String contenido;
    private LocalDate fecha_publicacion;
    private LocalDate fecha_modificacion;
    private int cantidad_likes;
    
}
