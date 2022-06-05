package Modelos.Persona;

import Modelos.Genericos.Correo;
import Modelos.Genericos.Nombre;
import Modelos.Persona.Abstractos.Solicitante;
import java.io.Serializable;

/**
 *
 * @author EduardoCGarcia
 */
public class Estudiante extends Solicitante implements Serializable{
//Ya validado para lanzar una excepcion
    private static final byte LENGTH = 7;
    private String planEstudios;

    public Estudiante(Nombre nombre, Correo correo, String numero, String password, String planEstudios) {
        super(nombre, correo, numero, password);
        this.planEstudios = planEstudios;
    }

    public String getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(String planEstudios) {
        this.planEstudios = planEstudios;
    }


}
