package Modelos.Genericos;

import Modelos.Persona.Abstractos.Solicitante;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author EduardoCGarcia
 */
public class Solicitud implements Serializable {

    private String asunto;
    private Solicitante solitante;
    private LocalDate fechaDeSolicitud;
    private String estatus;
    private Folio folio;
    private String respuesta;
    private boolean estadoEmision;

    public Solicitud(String asunto, Solicitante solitante, Folio folio) {
        this.asunto = asunto;
        this.solitante = solitante;
        this.folio = folio;
        this.estatus = "Pendiente";
        this.setFechaDeSolicitud();

    }

    public Solicitud() throws Exception {
        this.folio = new Folio();
    }

    public Folio getFolio() {
        return folio;
    }

    public void setFolio() {
        String cad = "";
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

    public LocalDate getFechaDeSolicitud() {
        return fechaDeSolicitud;
    }

    public void setFechaDeSolicitud() {
        this.fechaDeSolicitud = LocalDate.now();
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isEstadoEmision() {
        return estadoEmision;
    }

    public void setEstadoEmision(boolean estadoEmision) {
        this.estadoEmision = estadoEmision;
    }
    
    
    
}
