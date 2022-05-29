package Modelos;

import java.util.Date;

/**
 *
 * @author EduardoCGarcia
 */
public class Solicitud {
    private String asunto;
    private Solicitante solitante;
    private Date fechaDeSolicitud;
    private String estatus;

    public Solicitud(String asunto, Solicitante solitante, Date fechaDeSolicitud, String estatus) {
        this.asunto = asunto;
        this.solitante = solitante;
        this.fechaDeSolicitud = fechaDeSolicitud;
        this.estatus = estatus;
    }

    public Solicitud() {
    }
    
    
    
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Solicitante getSolitante() {
        return solitante;
    }

    public void setSolitante(Solicitante solitante) {
        this.solitante = solitante;
    }

    public Date getFechaDeSolicitud() {
        return fechaDeSolicitud;
    }

    public void setFechaDeSolicitud(Date fechaDeSolicitud) {
        this.fechaDeSolicitud = fechaDeSolicitud;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    
    
    
    
    
    
}
