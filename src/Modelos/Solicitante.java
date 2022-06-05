package Modelos;

import java.io.Serializable;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class Solicitante implements Serializable {
    private Nombre nombre;
    private Correo correo;
    protected String numero;
    private String password;

    public Solicitante(Nombre nombre, Correo correo, String numero, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.password = password;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) throws Exception{
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo.toString();
    }

    public void setCorreo(Correo correo) throws Exception{
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    //public abstract void setNumero(String numero) throws Exception;

    @Override
    public String toString() {
        return nombre.toString()  + correo + numero;
    }
    
    
}
