package Vista;

import Modelos.Correo;
import Vista.Paneles.RegistroEstudiante;
import javax.swing.JFrame;

/**
 *
 * @author dil_7
 */
public class mainPrueba {
    
    public static void main(String[] args) throws Exception {
        RegistroEstudiante n = new RegistroEstudiante(new JFrame(), true);
        n.setVisible(true);
    }
    
    
    
}
