package Modelos;

import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class OrdenDelDia {
    private String listaDePresentes;
    private  ArrayList<Solicitud> solicitudes;

    public OrdenDelDia() {
        this.solicitudes = new ArrayList<Solicitud>();
    }

    public OrdenDelDia(String listaDePresentes) {
        this();
        this.listaDePresentes = listaDePresentes;
    }
    
    public String getListaDePresentes() {
        return listaDePresentes;
    }

    public void setListaDePresentes(String listaDePresentes) {
        this.listaDePresentes = listaDePresentes;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }
    
    public void addSolicitud(Solicitud nuevaSolicitud){
        this.solicitudes.add(nuevaSolicitud);
    }
    
}
