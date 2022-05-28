package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class Estudiante extends Solicitante {
//Ya validado para lanzar una excepcion
    private static final byte LENGTH = 7;
    private String planEstudios;

    public Estudiante(Nombre nombre, Correo correo, String numero, String planEstudios) throws Exception {
        super(nombre, correo);
        this.planEstudios = planEstudios;
        this.setNumero(numero);
    }

    public String getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(String planEstudios) throws Exception {
        //validado para lanzar una excepcion
        if (planEstudios.isEmpty()) {
            Exception e = new Exception();
            throw e;
        }
        this.planEstudios = planEstudios;
    }

    @Override
    public void setNumero(String numero) throws Exception {
        //validado para lanzar una excepcion
        if (numero.length() != LENGTH && numero.matches("[1-9]+")) {
            Exception e = new Exception();
            throw e;
        }
        this.numero = numero;
        //super.setNumero(numero); 
    }

    @Override
    public String toString() {
        return super.toString() + planEstudios;
    }

}
