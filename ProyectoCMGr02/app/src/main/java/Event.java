/**
 * Created by personal on 7/05/18.
 */

public class Event {
    private String uid , origen , destino , hora , usuario;

    public Event(){

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Event (String uid , String origen , String  destino , String hora , String usuario){
        this.uid = uid;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.usuario = usuario;
    }

}


