package Controladores;

import Modelos.Correo;
import Modelos.Estudiante;
import Modelos.Profesor;
import Vista.app;

/**
 *
 * @author EduardoCGarcia
 */
public class Buscadores {
    public static Estudiante findStudent(String numero,String correo){
        for (Estudiante e : app.estudiantes) {
            if(e.getNumero().equals(numero) || e.getCorreo().equals(correo)){
                return e;
            }
        }
        return null;
    }
    public static Estudiante findStudent(String correo){
        for (Estudiante e : app.estudiantes) {
            if(e.getCorreo().equals(correo)){
                return e;
            }
        }
        return null;
    }
    
    public static Profesor findTeacher(String numero,String correo){
        for (Profesor e : app.profesores) {
            if(e.getNumero().equals(numero) || e.getCorreo().equals(correo)){
                return e;
            }
        }
        return null;
    }
    
    public static Profesor findTeacher(String correo){
        for (Profesor e : app.profesores) {
            if(e.getCorreo().equals(correo)){
                return e;
            }
        }
        return null;
    }
    
    public static boolean existStudent(String numero,String correo){
        Estudiante buscado = findStudent(numero,correo);
        if(buscado != null){
            return true;
        }
        return false;
    }
    public static boolean existTeacher(String numero,String correo){
        Estudiante buscado = findStudent(numero,correo);
        if(buscado != null){
            return true;
        }
        return false;
    }
    
    public static boolean loginStudent(String correo, String password){
        Estudiante buscado = findStudent(correo);
        if(buscado != null){
            return (buscado.getPassword().equals(password)) ? true :false;
        }
        return false;
    }
    public static boolean loginTeacher(String correo, String password){
        Profesor buscado = findTeacher(correo);
        if(buscado != null){
            return (buscado.getPassword().equals(password)) ? true :false;
        }
        return false;
    }
    
}
