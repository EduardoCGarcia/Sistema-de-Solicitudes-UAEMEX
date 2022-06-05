package Vista;

import Modelos.Administrativo;
import Modelos.Estudiante;
import Modelos.Profesor;
import Modelos.Solicitante;
import Utilerias.Archivos;
import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public class app {
    public static String role = "";
    public static String typeSuscriptor = "";
    public static ArrayList<Administrativo> secretarias = Archivos.leerArchivo("secretarias.dat");
    public static ArrayList<Estudiante> estudiantes = Archivos.leerArchivo("estudiantes.dat");
    public static ArrayList<Profesor> profesores = Archivos.leerArchivo("profesores.dat");
    public static Solicitante sol;
    public static GeneralLogin app = new GeneralLogin();
    
    
    public static void main(String[] args) {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNumero() + " " + e.getCorreo());
        }
        app.setVisible(true);
        
        
    }
    
    
}
