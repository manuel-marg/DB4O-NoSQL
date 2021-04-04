
package db4o;

public class Chat {
    
    private int id;
    private Usuario emisor;
    private Usuario receptor;
    private Mensaje[] mensajes;

    public Chat() {
    }

    public Chat(int id, Usuario emisor, Usuario receptor, Mensaje[] mensajes) {
        this.id = id;
        this.emisor = emisor;
        this.receptor = receptor;
        this.mensajes = mensajes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public Mensaje[] getMensajes() {
        return mensajes;
    }

    public void setMensajes(Mensaje[] mensajes) {
        this.mensajes = mensajes;
    }


    
    
}
