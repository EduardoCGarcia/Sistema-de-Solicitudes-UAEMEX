package Controladores;

import Utilerias.GUITools;
import Vista.Paneles.Administrativos.LoggedAdminPanel;
import Vista.Paneles.Solicitantes.LoggedSolicitantePanel;
import Vista.app;
import javax.swing.JOptionPane;

/**
 *
 * @author EduardoCGarcia
 */
public class LoginCotroller {
    public static void login(String correo,String password){
        if (correo.endsWith("@alumno.uaemex.mx")) {
            if (Buscadores.loginStudent(correo, password)) {
                app.sol = Buscadores.findStudent(correo);
                app.typeRole = "alumno";
                GUITools.panelIntoPanel(app.app.Contenedor, new LoggedSolicitantePanel());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }
        } else if (correo.endsWith("@profesor.uaemex.mx")) {
            if (Buscadores.loginTeacher(correo, password)) {
                app.sol = Buscadores.findTeacher(correo);
                app.typeRole = "profesor";
                GUITools.panelIntoPanel(app.app.Contenedor, new LoggedSolicitantePanel());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }
        } else if (correo.endsWith("@admin.uaemex.mx")) {
            if (Buscadores.loginAdmin(correo, password)) {
                app.admin = Buscadores.findAdmin(correo);
                app.typeRole = "admin";
                GUITools.panelIntoPanel(app.app.Contenedor, new LoggedAdminPanel());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Algo salio mal");
        }
    }
}
