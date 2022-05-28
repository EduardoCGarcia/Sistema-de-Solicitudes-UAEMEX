package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class Profesor extends Empleado {

    private static final byte LENGTH = 5;

    public Profesor(Nombre nombre, Correo correo, String numero) throws Exception {
        super(nombre, correo);
        this.setNumero(numero);
    }

    @Override
    public void setNumero(String numero) throws Exception {
        //validado para lanzar una excepcion
        if (numero.length() != LENGTH && numero.matches("[0-9]+")) {
            Exception e = new Exception();
            throw e;
        }
        super.numero = numero;

        //super.setNumero(numero); 
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
