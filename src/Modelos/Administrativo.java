package Modelos;

/**
 *
 * @author EduardoCGarcia
 */
public class Administrativo extends Empleado{
    private String claveIssemym;
 //Ya validado para lanzar una excepcion
    private static final byte LENGTH = 8;
    
    public Administrativo(Nombre nombre, Correo correo, String numero) throws Exception {
        super(nombre, correo);
        this.setNumero(numero);
    }


    @Override
    public void setNumero(String numero) throws Exception{
        ////validado para lanzar una excepcion
        if(numero.length() != LENGTH && numero.matches("[0-9]+")){
           Exception e = new Exception();
            throw e; 
        }
         this.numero = numero;   
        //super.setNumero(numero); 
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getClaveIssemym() {
        return claveIssemym;
    }

    public void setClaveIssemym(String claveIssemym) {
        this.claveIssemym = claveIssemym;
    }
    
    

   
    
   
}
