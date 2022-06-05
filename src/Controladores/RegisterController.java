package Controladores;

import Modelos.Administrativo;
import Modelos.Correo;
import Modelos.Estudiante;
import Modelos.Nombre;
import Modelos.Profesor;
import Utilerias.Archivos;
import Vista.app;
import javax.swing.JOptionPane;

/**
 *
 * @author EduardoCGarcia
 */
public class RegisterController {
    public static void studentRegister(Nombre nombre,String correo,String numero,String password,String planEstudios){
        if (numero.length() == 7) {
            if (!Buscadores.existStudent(numero,correo)) {
                try {
                    System.out.println("Estudiante pruba");
                    Estudiante e = new Estudiante(
                            nombre,
                            new Correo(correo),
                            numero,
                            password,
                            planEstudios);
                    
                    app.estudiantes.add(e);
                    Archivos.guardarArchivo("estudiantes.dat", app.estudiantes);
                    JOptionPane.showMessageDialog(null, "Estudiante guardado");

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El correo y/o numero de cuenta ya han sido utilizados anteriormente.\nNo se puede crear la cuenta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El numero de cuenta debe contener 7 digitos");
        }
    }
    
    public static void teacherRegister(Nombre nombre,String correo,String numero,String password){
        if (numero.length() == 5) {
            if (!Buscadores.existTeacher(numero,correo)) {
                try {
                    Profesor p = new Profesor(
                            nombre,
                            new Correo(correo),
                            numero,
                            password);
                    app.profesores.add(p);
                    Archivos.guardarArchivo("profesores.dat", app.profesores);
                    JOptionPane.showMessageDialog(null, "Profesor guardado");

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El correo y/o numero de cuenta ya han sido utilizados anteriormente.\nNo se puede crear la cuenta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El numero de cuenta debe contener 5 digitos");
        }
    }
    public static void adminRegister(Nombre nombre,String correo,String numero,String password){
        if (numero.length() == 8) {
            if (!Buscadores.existAdmin(numero,correo)) {
                try {
                    Administrativo a = new Administrativo(
                            nombre,
                            new Correo(correo),
                            numero,
                            password);
                    app.secretarias.add(a);
                    Archivos.guardarArchivo("secretarias.dat", app.secretarias);
                    JOptionPane.showMessageDialog(null, "Administrativo guardado");

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El correo y/o numero de cuenta ya han sido utilizados anteriormente.\nNo se puede crear la cuenta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El numero de cuenta debe contener 8 digitos");
        }
    }




}
