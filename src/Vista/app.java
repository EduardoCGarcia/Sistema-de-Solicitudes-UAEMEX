package Vista;

import Modelos.Administrativo;
import Modelos.Estudiante;
import Modelos.Profesor;
import Utilerias.Archivos;
import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public class app {
    public static String role = "";
    public static ArrayList<Administrativo> secretarias = Archivos.leerArchivo("secretarias.dat");
    public static ArrayList<Estudiante> estudiantes = Archivos.leerArchivo("estudiantes.dat");
    public static ArrayList<Profesor> profesores = Archivos.leerArchivo("profesores.dat");
    public static GeneralLogin app = new GeneralLogin();
    
    
    public static void main(String[] args) {
        
        app.setVisible(true);
        
        
    }
    
    
}
