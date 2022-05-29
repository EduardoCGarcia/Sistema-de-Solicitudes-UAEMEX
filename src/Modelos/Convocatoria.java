package Modelos;

import java.time.LocalDate;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class Convocatoria {
    private LocalDate fecha;
    private Consejo consejo;
    private Lugar lugar;
    private OrdenDelDia ordenDelDia;
    private String saludo;
    private String complemento;
    private String parrafoFinal;
    private static final String textoAnio = "2022, Celebracion de los 195 años de la apertura de las clases ";
    private static final String presidente = "DR.GERMAN GARCIA BENITES ";
          
    public static String getPresidente(){
        return Convocatoria.presidente;
    }

    public Convocatoria(LocalDate fecha, Consejo consejo, Lugar lugar, OrdenDelDia ordenDelDia, String saludo, String complemento, String parrafoFinal) {
        this.fecha = fecha;
        this.consejo = consejo;
        this.lugar = lugar;
        this.ordenDelDia = ordenDelDia;
        this.saludo = saludo;
        this.complemento = complemento;
        this.parrafoFinal = parrafoFinal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Consejo getConsejo() {
        return consejo;
    }

    public void setConsejo(Consejo consejo) {
        this.consejo = consejo;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public OrdenDelDia getOrdenDelDia() {
        return ordenDelDia;
    }

    public void setOrdenDelDia(OrdenDelDia ordenDelDia) {
        this.ordenDelDia = ordenDelDia;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getParrafoFinal() {
        return parrafoFinal;
    }

    public void setParrafoFinal(String parrafoFinal) {
        this.parrafoFinal = parrafoFinal;
    }
    
    
    
}   
