package Modelos.Persona.Abstractos;

import Modelos.Genericos.Correo;
import Modelos.Genericos.Nombre;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class Empleado extends Solicitante{

    public Empleado(Nombre nombre, Correo correo, String numero, String password) {
        super(nombre, correo, numero, password);
    }

   
    
   
    
}
