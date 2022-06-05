package Modelos.Persona;

import Modelos.Genericos.Correo;
import Modelos.Persona.Abstractos.Empleado;
import Modelos.Genericos.Nombre;

/**
 *
 * @author EduardoCGarcia
 */
public class Administrativo extends Empleado{
    //Ya validado para lanzar una excepcion
    private static final byte LENGTH = 8;

    public Administrativo(Nombre nombre, Correo correo, String numero, String password) throws Exception {
        super(nombre, correo, numero, password);
    }
    
    



   
    
   
}
