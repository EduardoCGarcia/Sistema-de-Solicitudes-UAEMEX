package Vista.Paneles;

import Controladores.Buscadores;
import Controladores.RegisterController;
import Modelos.Correo;
import Modelos.Estudiante;
import Modelos.Nombre;
import Utilerias.Archivos;
import Vista.app;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EduardoCGarcia
 */
public class RegistroAdministativo extends javax.swing.JDialog {

    /**
     * Creates new form RegistroEmpleado
     */
    public RegistroAdministativo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        deshabilitarBotonRegistrar();
    }
    
    public void deshabilitarBotonRegistrar() {
        if (txtCorreo.getText().isBlank() || txtNombre.getText().isBlank() || txtApellido.getText().isBlank()
                || txtNumCuenta.getText().isBlank() || txtPassword.getText().isBlank()) {
            btnRegistrarse.setEnabled(false);
        } else {
            btnRegistrarse.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new Utilerias.FondoNoAjustable("TexturaBlanco1.jpeg");
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNumCuenta = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        panelEncabezado = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        panelPiedepag = new javax.swing.JPanel();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCorreo.setText("Correo institucional:");

        lblCuenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCuenta.setText("Numero de cuenta:");

        lblContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");

        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        txtNumCuenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNumCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumCuentaKeyReleased(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        panelEncabezado.setBackground(new java.awt.Color(26, 104, 53));
        panelEncabezado.setForeground(new java.awt.Color(26, 104, 53));

        lblEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setText("Registro de empleado");

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPiedepag.setBackground(new java.awt.Color(26, 104, 53));
        panelPiedepag.setForeground(new java.awt.Color(26, 104, 53));

        javax.swing.GroupLayout panelPiedepagLayout = new javax.swing.GroupLayout(panelPiedepag);
        panelPiedepag.setLayout(panelPiedepagLayout);
        panelPiedepagLayout.setHorizontalGroup(
            panelPiedepagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPiedepagLayout.setVerticalGroup(
            panelPiedepagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnRegistrarse))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(lblApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(lblContraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPassword))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(lblCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumCuenta))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(lblCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCorreo))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPiedepag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuenta)
                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarse)
                .addGap(42, 42, 42)
                .addComponent(panelPiedepag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        deshabilitarBotonRegistrar();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        deshabilitarBotonRegistrar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtNumCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCuentaKeyReleased
        deshabilitarBotonRegistrar();
    }//GEN-LAST:event_txtNumCuentaKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        deshabilitarBotonRegistrar();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        deshabilitarBotonRegistrar();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        try {
            RegisterController.teacherRegister(
                    new Nombre(txtNombre.getText(), txtApellido.getText(), true),
                    txtCorreo.getText(),
                    txtNumCuenta.getText(),
                    String.copyValueOf(txtPassword.getPassword()));
        } catch (Exception ex) {
            System.out.println("hubo un error");
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelPiedepag;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
