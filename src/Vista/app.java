package Vista;

import Modelos.Persona.Administrativo;
import Modelos.Persona.Estudiante;
import Modelos.Persona.Profesor;
import Modelos.Persona.Abstractos.Solicitante;
import Modelos.Genericos.Solicitud;
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
    public static ArrayList<Solicitud> solicitudes = Archivos.leerArchivo("solicitudes.dat");
    public static Solicitante sol;
    public static Administrativo admin;
    public static GeneralLogin app = new GeneralLogin();
    
    
    public static void main(String[] args) {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNumero() + " " + e.getCorreo());
        }
        app.setVisible(true);
        
        mostrar();
        
    }
    
    public static void mostrar(){
        System.out.println("ADMIN==============================================================================");
        for (Administrativo s : secretarias) {
            System.out.println(String.format("%s %s %s %s", s.getNumero(),s.getNombre(),s.getCorreo(),s.getPassword()));
        }
        System.out.println("ESTUDIANTE==============================================================================");
        for (Solicitante s : estudiantes) {
            System.out.println(String.format("%s %s %s %s", s.getNumero(),s.getNombre(),s.getCorreo(),s.getPassword()));
        }
        System.out.println("PROFESOR==============================================================================");
        for (Solicitante s : profesores) {
            System.out.println(String.format("%s %s %s %s", s.getNumero(),s.getNombre(),s.getCorreo(),s.getPassword()));
        }
    }
    
    
}
