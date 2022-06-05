package Controladores;

import Modelos.Persona.Administrativo;
import Modelos.Genericos.Correo;
import Modelos.Persona.Estudiante;
import Modelos.Persona.Profesor;
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
    public static Administrativo findAdmin(String numero,String correo){
        for (Administrativo e : app.secretarias) {
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
    public static Administrativo findAdmin(String correo){
        for (Administrativo e : app.secretarias) {
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
        Profesor buscado = findTeacher(numero,correo);
        if(buscado != null){
            return true;
        }
        return false;
    }
    public static boolean existAdmin(String numero,String correo){
        Administrativo buscado = findAdmin(numero,correo);
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
    public static boolean loginAdmin(String correo, String password){
        Administrativo buscado = findAdmin(correo);
        if(buscado != null){
            return (buscado.getPassword().equals(password)) ? true :false;
        }
        return false;
    }
    
}
