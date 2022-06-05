package Vista;

import javax.swing.JPanel;

/**
 *
 * @author EduardoCGarcia
 */
public class app {
    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
        
        
    }
    
     public void colocar(JPanel padre,JPanel hijo){
        hijo.setBounds(0,0,padre.getWidth(),padre.getHeight());
        padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }
}
