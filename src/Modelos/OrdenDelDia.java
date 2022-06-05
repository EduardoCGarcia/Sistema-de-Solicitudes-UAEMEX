package Modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class OrdenDelDia {
private String listaDePresente;
    private HashMap<Folio, Solicitud> solicitudes;

    public OrdenDelDia() {
        this.solicitudes = new HashMap<Folio, Solicitud>();
    }

    public OrdenDelDia(String listaDePresente) {
        this();
        this.listaDePresente = listaDePresente;
    }

    public String getListaDePresente() {
        return listaDePresente;
    }

/*    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }
*/
    
    public void setListaDePresente(String listaDePresente) {
        this.listaDePresente = listaDePresente;
    }
    

    public void setSolicitudes(HashMap<Folio, Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    public void addSolicitud(Solicitud nuevaSolicitud){
        this.solicitudes.put(nuevaSolicitud.getFolio(), nuevaSolicitud);
    }
    
    public String despliegaSolicitud(){
        String cadena = "";
        Iterator iter = this.solicitudes.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry <Folio, Solicitud> dato= (Map.Entry) iter.next();
            cadena = cadena+ "\n"+ dato.getValue().toString();
        }
        
    //    for(Map.Entry <Folio, Solicitud> dato: this.solicitudes.entrySet()){
    //        cadena = cadena+ "\n"+ dato.getValue().toString();
    //    }
        
        return cadena;
    }
    
    public HashMap<Folio, Solicitud> getSolicitudes(){
        return solicitudes;
    }
    
}
