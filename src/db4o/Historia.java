
package db4o;

import java.time.LocalDate;

public class Historia {

    private int id;
    private Boolean closefriends;
    private String foto;
    private String video;
    private Usuario usuario;
    private Boolean archivado;
    private LocalDate fecha_publicacion;
    private Usuario[] usuario_etiquetado;
    
}
