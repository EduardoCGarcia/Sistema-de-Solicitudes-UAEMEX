package Modelos.Persona;

import Modelos.Genericos.Correo;
import Modelos.Persona.Abstractos.Empleado;
import Modelos.Genericos.Nombre;

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
