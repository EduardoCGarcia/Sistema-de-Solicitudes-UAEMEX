/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelos.Correo;
import Vista.Paneles.NuevaSolicitudPanel;

/**
 *
 * @author dil_7
 */
public class mainPrueba {
    
    public static void main(String[] args) throws Exception {
        
       Correo c = new Correo();
        
        c.setDir("d@alumno.uaemex.mx");
        System.out.println(c.getDir());
        
   
    }
    
    
    
}
