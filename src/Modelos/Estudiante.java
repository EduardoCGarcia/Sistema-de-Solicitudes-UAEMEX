package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class Estudiante extends Solicitante {
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
