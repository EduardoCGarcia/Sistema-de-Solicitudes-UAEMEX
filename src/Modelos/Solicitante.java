package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class Solicitante {
    private Nombre nombre;
    private Correo correo;
    protected String numero;

    public Solicitante(Nombre nombre, Correo correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) throws Exception{
        this.nombre = nombre;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) throws Exception{
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public abstract void setNumero(String numero) throws Exception;

    @Override
    public String toString() {
        return nombre.toString()  + correo + numero;
    }
    
    
}
