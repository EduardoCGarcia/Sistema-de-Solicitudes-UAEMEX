package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
    
public class Estudiante extends Solicitante{
    private static final byte LENGTH = 7; // el la longitud del numero de cuenta
    private String planEstudios;
    
    public Estudiante(Nombre nombre, Correo correo, String numero, String planEstudios) {
        super(nombre, correo);
        this.planEstudios = planEstudios;
        this.setNumero(numero);
    }

    public String getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(String planEstudios) {
        this.planEstudios = planEstudios;
    }
    
    @Override
    public void setNumero(String numero) {
        if(numero.length() != LENGTH && numero.matches("[1-9]+"))
            return; // aqui vala validacion
        super.numero = numero;
        //super.setNumero(numero); 
    }

    @Override
    public String toString() {
        return super.toString() + planEstudios;
    }
    
    /*
    
    
    
    dsadddddddddddddddddddddd
    
    das
    d
    as
    d
    sa
    d
    
    sa
    d
    
    as
    ds
    
    adas
    
    
    */
}
