
package db4o;

import java.time.LocalDate;

public class Usuario {
    
    private int id;
    private String nombre;
    private String username;
    private String foto_perfil;
    private String correo;
    private String biografia;
    private LocalDate fecha_nacimiento;
    private int telefono;
    private String ultimo_ip;
    private Boolean verificado;
    private Boolean privado;
    private Usuario[] pendientes;
    private Usuario[] seguidores;
    private Usuario[] seguidos;
    
    
}
