package Vista;

import Controladores.RegisterController;
import Vista.Paneles.RegistroAdministativo;
import javax.imageio.spi.RegisterableService;
import javax.swing.JFrame;

/**
 *
 * @author dil_7
 */
public class mainPrueba {
    
    public static void main(String[] args) {
        RegistroAdministativo n = new RegistroAdministativo(app.app, true);
        n.setVisible(true);
        /*if ("asjh@admin.uaemex.mx".matches("[A-Za-z0-9+_.-]+@(alumno.uaemex.mx)$") ||
            "asjh@admin.uaemex.mx".matches("[A-Za-z0-9+_.-]+@(profesor.uaemex.mx)$") ||
            "asjh@admin.uaemex.mx".matches("[A-Za-z0-9+_.-]+@(admin.uaemex.mx)$")) {
            System.out.println("El correo es correcto");
        }*/
        

    }
    
    
    
}
