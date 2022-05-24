/*
Validar los seter para que se lance una excepción

*/

package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class Nombre {
    private String nombres;
    private String primerApellido;
    private boolean tipo;/*0 = AAN    1 = NAA*/

    public Nombre(String nombres, String primerApellido, boolean tipo) throws Exception {
        this.setNombres(nombres);
        this.setPrimerApellido(primerApellido);
        this.tipo = tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        if(!nombres.matches("[a-zA-Z\s]+") && nombres.startsWith(" ") || nombres.length() == 0 )
            return;
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido)  throws Exception{
        if(!primerApellido.matches("[a-zA-Z\s]+") || primerApellido.startsWith(" ") || primerApellido.length() == 0){
            Exception e = new Exception();
            throw e;
        }
        this.primerApellido = primerApellido;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    
    
    @Override
    public String toString() {
        if (!this.tipo) 
            return  primerApellido + " " +nombres;
        else
            return  nombres + " " + primerApellido;
        
        
    }
    
}
