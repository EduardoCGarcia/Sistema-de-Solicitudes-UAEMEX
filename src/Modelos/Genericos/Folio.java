/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Genericos;

/**
 *
 * @author dyl_7
 */
public class Folio implements Comparable {
    private String folio;
    private static int nf=0;

    public Folio() {
        this.folio = ""+(++nf);
    }

    public String getFolio() {
        return folio;
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
