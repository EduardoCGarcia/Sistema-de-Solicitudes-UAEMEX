package Vista;

import javax.swing.JFrame;

/**
 *
 * @author dil_7
 */
public class mainPrueba {
    
    public static void main(String[] args) {

//        RegistroEstudiante n = new RegistroEstudiante(new JFrame(), true);
//        n.setVisible(true);

//        if ("ejfnkdjs.fsdjnn-fdsn7@uaemex.profesor.mx".matches("[A-Za-z0-9+_.-]+@(uaemex.alumno.mx|uaemex.profesor.mx)$")) {
//            System.out.println("Correo valido");
//        }
          JFrame j = new JFrame();
          Vista.Paneles.LoggedSolicitantePanel log = new Vista.Paneles.LoggedSolicitantePanel();
          log.setVisible(true);
          j.setBounds(0, 0, 1200, 1400);
          j.add(log);
          j.repaint();
          j.setVisible(true);

    }
    
    
    
}
