/*
Validar los seter para que se lance una excepción

*/

package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class NombreLatino extends Nombre{
    
    private String segundoApellido;
    
    public NombreLatino(String nombres, String primerApellido, String segundoApellido, boolean tipo) throws Exception {
        super(nombres, primerApellido, tipo);
        this.setSegundoApellido(segundoApellido);
    }
    
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        if(!segundoApellido.matches("[a-zA-Z\s]+") || segundoApellido.startsWith(" ")  || segundoApellido.length() == 0)
            return;
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        if (!super.getTipo()) 
            return  super.getPrimerApellido() + " " + segundoApellido + " " + super.getNombres();
        else
            return  super.getNombres() + " " + super.getPrimerApellido() + " " + segundoApellido;
    }
    
    
    
}
