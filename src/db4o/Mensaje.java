
package db4o;

import java.time.LocalDate;

public class Mensaje {
    
    private int id;
    private Usuario usuario;
    private String mensaje;
    private Boolean leido;
    private String fecha;

    public Mensaje() {
    }

    public Mensaje(int id, Usuario usuario, String mensaje, Boolean leido, String fecha) {
        this.id = id;
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.leido = leido;
        this.fecha = fecha;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
