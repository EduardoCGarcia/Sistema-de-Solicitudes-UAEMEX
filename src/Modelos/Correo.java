package Modelos;

import java.io.Serializable;

/**
 *
 * @author EduardoCGarcia
 */
public class Correo implements Serializable{
//Ya validado para lanzar una excepcion
    private String dir;

    public Correo() {
    }

    public Correo(String dir) throws Exception {
        this.setDir(dir);
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) throws Exception {
        //validado para lanzar una excepcion
        if (!dir.matches("[A-Za-z0-9+_.-]+@(alumno.uaemex.mx|profesor.uaemex.mx|admin.uaemex.mx)$")) {
            Exception e = new Exception("La dirección de correo no es valida");
            throw e;
        }
            this.dir = dir;
        
    }

    static boolean contieneArr(String cad) {
        int cont = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == '@') {
                cont++;
            }
        }
        return cont == 1;
    }

    @Override
    public String toString() {
        return dir;
    }

}
