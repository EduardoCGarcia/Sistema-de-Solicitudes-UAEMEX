package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class Empleado extends Solicitante{
    
    public Empleado(Nombre nombre, Correo correo) {
        super(nombre, correo);
    }
    
    @Override
    public void setNumero(String numero) throws Exception {
        if (numero == null || numero.length() == 0) {
            return;
        }
        for (int i = 0; i < numero.length(); i++) {
            if (!Character.isDigit(numero.charAt(i))) {
                return;
            }
        }
        this.numero = numero;
    }
    
}
