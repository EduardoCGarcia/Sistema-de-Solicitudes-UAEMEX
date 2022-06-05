package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class Profesor extends Empleado {

    public Profesor(Nombre nombre, Correo correo, String numero, String password) {
        super(nombre, correo, numero, password);
    }

    
    @Override
    public String toString() {
        return super.toString();
    }

}
