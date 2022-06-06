/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Genericos;

import Vista.app;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dyl_7
 */
public class Folio implements Comparable, Serializable {
    private String folio;

    public Folio() throws Exception {
        this.setFolio();
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio() throws Exception {
        int indice = app.solicitudes.size();
        String codigo = "";
        
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        int dateYear = calendar.get(Calendar.YEAR);
        
        if(indice >= 0 && indice < 10){
            codigo = "SOL" + dateYear + "00000" + String.valueOf(indice);
        }else if(indice > 9 && indice < 100){
            codigo = "SOL" + dateYear + "0000" + String.valueOf(indice);
        }else if(indice > 99 && indice < 1000){
            codigo = "SOL" + dateYear + "000" + String.valueOf(indice);
        }else if(indice > 999 && indice < 10000){
            codigo = "SOL" + dateYear + "00" + String.valueOf(indice);
        }else if(indice > 9999 && indice < 100000){
            codigo = "SOL" + dateYear + "0" + String.valueOf(indice);
        }else if(indice > 99999 && indice < 1000000){
            codigo = "SOL" + dateYear + String.valueOf(indice);
        }else{
            Exception e = new Exception("El dolio no ha podido crearse");
            throw e;
        }
        this.folio = codigo;
    }

    
    
    @Override
    public int compareTo(Object o) {
        String other = (String) o;
        return this.folio.compareTo(other);
    }

    @Override
    //el parametro no puede ser nulo y debe ser instancia del folio
    public boolean equals(Object obj) { 
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Folio)){
            return false;
        }
        Folio other = (Folio) obj;
        return (this.folio.equals(other.folio));
         
    }

    @Override
    public int hashCode() {
        return this.folio.hashCode();
    }
}
