/*
Validar de la misma forma que en las clase Nombre

 */
package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class Correo {
//Ya validado para lanzar una excepcion
    private String dir;

    public Correo() {
    }

    public Correo(String dir) throws Exception {
        setDir(dir);
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) throws Exception {
        //validado para lanzar una excepcion
        if (dir == null || dir.length() < 3 || !(Character.isAlphabetic(dir.charAt(0)) || Character.isDigit(dir.charAt(0)))
                || !dir.endsWith(".uaemex.mx") || !contieneArr(dir) || dir.matches("[^!#$%&/()=¨}{]") || !dir.contains(".")
                || dir.endsWith(".") || dir.endsWith("@")) {
            Exception e = new Exception();
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
