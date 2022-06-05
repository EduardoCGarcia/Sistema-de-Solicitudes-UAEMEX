package Vista.Paneles;

import java.awt.Color;

/**
 *
 * @author EduardoCGarcia
 */
public class LoggedAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarSolicitud
     */
    public LoggedAdminPanel() {
        initComponents();
        btnNuevaSolicitud.setContentAreaFilled(false);
        btnNuevaSolicitud.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraMenu = new javax.swing.JPanel();
        btnConsultarEstatus = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnSolicitudRegistradas = new javax.swing.JButton();
        btnEmitirOficio = new javax.swing.JButton();
        jPanel3 = new Utilerias.FondoNoAjustable("TexturaBlanco1.jpeg");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNuevaSolicitud = new javax.swing.JButton();
        ContenedorDinamico = new javax.swing.JPanel();

        BarraMenu.setBackground(new java.awt.Color(26, 104, 53));
        BarraMenu.setForeground(new java.awt.Color(26, 104, 53));

        btnConsultarEstatus.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnConsultarEstatus.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarEstatus.setText("Consultar estatus");
        btnConsultarEstatus.setBorder(null);
        btnConsultarEstatus.setContentAreaFilled(false);
        btnConsultarEstatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarEstatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarEstatusMouseExited(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        btnSolicitudRegistradas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnSolicitudRegistradas.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitudRegistradas.setText("Solicitudes Registradas");
        btnSolicitudRegistradas.setBorder(null);
        btnSolicitudRegistradas.setContentAreaFilled(false);
        btnSolicitudRegistradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSolicitudRegistradasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSolicitudRegistradasMouseExited(evt);
            }
        });

        btnEmitirOficio.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEmitirOficio.setForeground(new java.awt.Color(255, 255, 255));
        btnEmitirOficio.setText("Emitir oficio de respuesta");
        btnEmitirOficio.setBorder(null);
        btnEmitirOficio.setContentAreaFilled(false);
        btnEmitirOficio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmitirOficioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmitirOficioMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(26, 104, 53));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 104, 53));
        jLabel1.setText("Sistema de solicitud");

        jLabel2.setBackground(new java.awt.Color(26, 104, 53));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 104, 53));
        jLabel2.setText("Administrativo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevaSolicitud.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevaSolicitud.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnNuevaSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaSolicitud.setText("Nueva Solicitud");
        btnNuevaSolicitud.setBorder(null);
        btnNuevaSolicitud.setContentAreaFilled(false);
        btnNuevaSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitudMouseExited(evt);
            }
        });
        btnNuevaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSolicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraMenuLayout = new javax.swing.GroupLayout(BarraMenu);
        BarraMenu.setLayout(BarraMenuLayout);
        BarraMenuLayout.setHorizontalGroup(
            BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BarraMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSolicitudRegistradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmitirOficio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevaSolicitud)
                .addGap(70, 70, 70))
        );
        BarraMenuLayout.setVerticalGroup(
            BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraMenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnNuevaSolicitud)
                .addGap(52, 52, 52)
                .addComponent(btnConsultarEstatus)
                .addGap(55, 55, 55)
                .addComponent(btnSolicitudRegistradas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnEmitirOficio)
                .addGap(41, 41, 41)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
        );

        ContenedorDinamico.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout ContenedorDinamicoLayout = new javax.swing.GroupLayout(ContenedorDinamico);
        ContenedorDinamico.setLayout(ContenedorDinamicoLayout);
        ContenedorDinamicoLayout.setHorizontalGroup(
            ContenedorDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
        ContenedorDinamicoLayout.setVerticalGroup(
            ContenedorDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContenedorDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BarraMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarEstatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarEstatusMouseEntered
        btnConsultarEstatus.setForeground(Color.YELLOW);
    }//GEN-LAST:event_btnConsultarEstatusMouseEntered

    private void btnSolicitudRegistradasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitudRegistradasMouseExited
        btnSolicitudRegistradas.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSolicitudRegistradasMouseExited

    private void btnSolicitudRegistradasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitudRegistradasMouseEntered
        btnSolicitudRegistradas.setForeground(Color.YELLOW);
    }//GEN-LAST:event_btnSolicitudRegistradasMouseEntered

    private void btnConsultarEstatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarEstatusMouseExited
        btnConsultarEstatus.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnConsultarEstatusMouseExited

    private void btnEmitirOficioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmitirOficioMouseEntered
        btnEmitirOficio.setForeground(Color.YELLOW);
    }//GEN-LAST:event_btnEmitirOficioMouseEntered

    private void btnEmitirOficioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmitirOficioMouseExited
        btnEmitirOficio.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEmitirOficioMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.RED);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnNuevaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitudActionPerformed

    private void btnNuevaSolicitudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitudMouseEntered
        btnNuevaSolicitud.setForeground(Color.YELLOW);
    }//GEN-LAST:event_btnNuevaSolicitudMouseEntered

    private void btnNuevaSolicitudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitudMouseExited
        btnNuevaSolicitud.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnNuevaSolicitudMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraMenu;
    private javax.swing.JPanel ContenedorDinamico;
    private javax.swing.JButton btnConsultarEstatus;
    private javax.swing.JButton btnEmitirOficio;
    private javax.swing.JButton btnNuevaSolicitud;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSolicitudRegistradas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
