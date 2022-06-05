package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public abstract class OrdenDelDiaOrdinaria extends OrdenDelDia{
    private String lecturaDeActa;

    
    public OrdenDelDiaOrdinaria(String lecturaDeActa) {
        this.lecturaDeActa = lecturaDeActa;
    }

    public String getLecturaDeActa() {
        return lecturaDeActa;
    }

    public void setLecturaDeActa(String lecturaDeActa) {
        this.lecturaDeActa = lecturaDeActa;
    }
    
    
    
    
}
