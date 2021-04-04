
package db4o;

import java.time.LocalDate;

public class Usuario {
    
    private int id;
    private String nombre;
    private String username;
    private String foto_perfil;
    private String correo;
    private String biografia;
    private String fecha_nacimiento;
    private String telefono;
    private String ultimo_ip;
    private Boolean verificado;
    private Boolean privado;
    private Usuario[] pendientes;
    private Usuario[] seguidores;
    private Usuario[] seguidos;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String username, String foto_perfil, String correo, String biografia, String fecha_nacimiento, String telefono, String ultimo_ip, Boolean verificado, Boolean privado, Usuario[] pendientes, Usuario[] seguidores, Usuario[] seguidos) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.foto_perfil = foto_perfil;
        this.correo = correo;
        this.biografia = biografia;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.ultimo_ip = ultimo_ip;
        this.verificado = verificado;
        this.privado = privado;
        this.pendientes = pendientes;
        this.seguidores = seguidores;
        this.seguidos = seguidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUltimo_ip() {
        return ultimo_ip;
    }

    public void setUltimo_ip(String ultimo_ip) {
        this.ultimo_ip = ultimo_ip;
    }

    public Boolean getVerificado() {
        return verificado;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Usuario[] getPendientes() {
        return pendientes;
    }

    public void setPendientes(Usuario[] pendientes) {
        this.pendientes = pendientes;
    }

    public Usuario[] getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Usuario[] seguidores) {
        this.seguidores = seguidores;
    }

    public Usuario[] getSeguidos() {
        return seguidos;
    }

    public void setSeguidos(Usuario[] seguidos) {
        this.seguidos = seguidos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", username=" + username + ", foto_perfil=" + foto_perfil + ", correo=" + correo + ", biografia=" + biografia + ", fecha_nacimiento=" + fecha_nacimiento + ", telefono=" + telefono + ", ultimo_ip=" + ultimo_ip + ", verificado=" + verificado + ", privado=" + privado + ", pendientes=" + pendientes + ", seguidores=" + seguidores + ", seguidos=" + seguidos + '}';
    }

    public Usuario(int id) {
        this.id = id;
    }

       
    
}
