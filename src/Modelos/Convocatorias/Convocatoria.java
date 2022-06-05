package Modelos.Convocatorias;

import Modelos.Consejo;
import Modelos.Genericos.Lugar;
import Modelos.Ordenes.OrdenDelDia;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class Convocatoria {
    private LocalDate fecha;
    private LocalDate fecha_sesion;
    private LocalTime hora_primera;
    private LocalTime hora_segunda;
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

    public LocalDate getFecha_sesion() {
        return fecha_sesion;
    }

    public LocalTime getHora_primera() {
        return hora_primera;
    }

    public LocalTime getHora_segunda() {
        return hora_segunda;
    }

    public void setFecha_sesion(LocalDate fecha_sesion) {
        this.fecha_sesion = fecha_sesion;
    }

    public void setHora_primera(LocalTime hora_primera) {
        this.hora_primera = hora_primera;
    }

    public void setHora_segunda(LocalTime hora_segunda) {
        this.hora_segunda = hora_segunda;
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
