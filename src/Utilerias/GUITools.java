package Utilerias;

//import Controllers.CRUD;
//import Modelos.Maicitos;
//import Modelos.Venta;
//import app.Main;
import java.awt.Color;
//import java.util.ArrayList;
import javax.swing.JPanel;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoCGarcia
 */
public class GUITools {
//    public static DefaultTableModel setModelAndTableModel(){
//        DefaultTableModel modelo =  setColumnsTable();
//        
//        for (Maicitos m : Main.maicitos) {
//            String filas[]={
//                String.format("%d",m.getId()),
//                m.getSabor(),
//                String.format("%.2f",m.getPrecio()),
//                String.format("%d",m.getTam()),
//                String.format("%d",m.getCantidad())
//            };
//            modelo.addRow(filas);
//        }
//        return modelo;
//    }
//    
//    public static DefaultTableModel setModelAndTableModelAgregar(int idBuscado){
//        DefaultTableModel modelo =  setColumnsTable();
//        Maicitos m = CRUD.findMaicito(idBuscado);
//        if(m != null){
//            String filas[]={
//                String.format("%d",m.getId()),
//                m.getSabor(),
//                String.format("%.2f",m.getPrecio()),
//                String.format("%d",m.getTam()),
//                String.format("%d",m.getCantidad())
//            };
//            modelo.addRow(filas);
//            return modelo;
//        }
//            
//        return null;
//    }
//    
//    public static DefaultTableModel setColumnsTable(){
//        DefaultTableModel modelo =  new DefaultTableModel();
//        /*Establecemos las columnas*/
//        ArrayList<String> columnas = new ArrayList<String> ();
//        columnas.add("Id");
//        columnas.add("Sabor");
//        columnas.add("Precio");
//        columnas.add("Tamaño");
//        columnas.add("Cantidad");
//        
//        for(Object col:columnas){
//            modelo.addColumn(col);
//        }
//        return modelo;
//    }
//    public static DefaultTableModel setColumnsTableVentas(){
//        DefaultTableModel modelo =  new DefaultTableModel();
//        /*Establecemos las columnas*/
//        ArrayList<String> columnas = new ArrayList<String> ();
//        columnas.add("Fecha");
//        columnas.add("Cliente");
//        columnas.add("Sabor");
//        columnas.add("Cantidad");
//        columnas.add("Total");
//        
//        for(Object col:columnas){
//            modelo.addColumn(col);
//        }
//        return modelo;
//    }
//    
//    public static DefaultTableModel setModelAndTableModelVenta(){
//        DefaultTableModel modelo =  setColumnsTableVentas();
//        
//        for (Venta v : Main.ventas) {
//            Maicitos m = CRUD.findMaicito(v.getIdSabor());
//            String filas[]={
//                String.format(v.getFecha().toString()),
//                String.format(v.getNombreCliente()),
//                String.format(m.getSabor()),
//                String.format("%d",v.getCantidad()),
//                String.format("%.2f",v.getTotal())
//            };
//            modelo.addRow(filas);
//        }
//        return modelo;
//    }
//    
    public static void panelIntoPanel(JPanel padre,JPanel hijo){
        hijo.setBounds(0,0,padre.getWidth(),padre.getHeight());//definir tamaño y posicion del hijo
        hijo.setBackground(Color.red);
        padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }
}
