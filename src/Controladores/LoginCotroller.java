package Controladores;

import Utilerias.GUITools;
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
                GUITools.panelIntoPanel(app.app.Contenedor, new LoggedSolicitantePanel());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }
        } else if (correo.endsWith("@profesor.uaemex.mx")) {
            if (Buscadores.loginTeacher(correo, password)) {
                app.sol = Buscadores.findTeacher(correo);
                GUITools.panelIntoPanel(app.app.Contenedor, new LoggedSolicitantePanel());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }
        } else if (correo.endsWith("@admin.uaemex.mx")) {
            if (Buscadores.loginAdmin(correo, password)) {
                app.admin = Buscadores.findAdmin(correo);
                GUITools.panelIntoPanel(app.app.Contenedor, new LoggedSolicitantePanel());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Algo salio mal");
        }
    }
}
