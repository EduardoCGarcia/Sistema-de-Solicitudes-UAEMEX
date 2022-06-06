/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles.SubdireccionAcademica;

import Utilerias.GUITools;
import Vista.Paneles.Compartidos.ConsultarSolicitudesPanel;
import Vista.Paneles.Compartidos.EmitirRespuesta;
import java.awt.Color;

/**
 *
 * @author Gonzalo CH
 */
public class LoggerSubdireccionAcademica extends javax.swing.JPanel {

    /**
     * Creates new form LoggerSubdireccionAcademica
     */
    public LoggerSubdireccionAcademica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuLateral = new javax.swing.JPanel();
        btnGenerarConvocatoria = new javax.swing.JButton();
        btnConsultarSolicitudes = new javax.swing.JButton();
        btnEmitirRespuesta = new javax.swing.JButton();
        ContenedorDinamico = new Utilerias.FondoNoAjustable("TexturaBlanco1.jpeg");
        Logo = new Utilerias.FondoImagen("uaemex2.png");
        lblSistemaDeSolicitudes = new javax.swing.JLabel();
        lblSomos = new javax.swing.JLabel();
        lblUAEMEX = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAdministracion = new javax.swing.JLabel();
        lblUniversitaria = new javax.swing.JLabel();
        lblCiclo = new javax.swing.JLabel();

        MenuLateral.setBackground(new java.awt.Color(26, 104, 53));
        MenuLateral.setForeground(new java.awt.Color(26, 104, 53));

        btnGenerarConvocatoria.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarConvocatoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenerarConvocatoria.setText("Generar Convocatoria");
        btnGenerarConvocatoria.setBorder(null);
        btnGenerarConvocatoria.setContentAreaFilled(false);
        btnGenerarConvocatoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarConvocatoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarConvocatoriaMouseExited(evt);
            }
        });
        btnGenerarConvocatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarConvocatoriaActionPerformed(evt);
            }
        });

        btnConsultarSolicitudes.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarSolicitudes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnConsultarSolicitudes.setText("Consultar Solicitudes");
        btnConsultarSolicitudes.setBorder(null);
        btnConsultarSolicitudes.setContentAreaFilled(false);
        btnConsultarSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarSolicitudesMouseExited(evt);
            }
        });
        btnConsultarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSolicitudesActionPerformed(evt);
            }
        });

        btnEmitirRespuesta.setBackground(new java.awt.Color(255, 255, 255));
        btnEmitirRespuesta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmitirRespuesta.setText("Emitir Respuesta");
        btnEmitirRespuesta.setBorder(null);
        btnEmitirRespuesta.setContentAreaFilled(false);
        btnEmitirRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmitirRespuestaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmitirRespuestaMouseExited(evt);
            }
        });
        btnEmitirRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirRespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLateralLayout = new javax.swing.GroupLayout(MenuLateral);
        MenuLateral.setLayout(MenuLateralLayout);
        MenuLateralLayout.setHorizontalGroup(
            MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarConvocatoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmitirRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLateralLayout.setVerticalGroup(
            MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLateralLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnGenerarConvocatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnConsultarSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnEmitirRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        Logo.setBackground(new java.awt.Color(204, 0, 0));
        Logo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblSistemaDeSolicitudes.setBackground(new java.awt.Color(0, 0, 0));
        lblSistemaDeSolicitudes.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblSistemaDeSolicitudes.setForeground(new java.awt.Color(0, 79, 0));
        lblSistemaDeSolicitudes.setText("Sistema de Solicitues de la UAEMéx");

        lblSomos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSomos.setForeground(new java.awt.Color(0, 79, 0));
        lblSomos.setText("#SOMOS");

        lblUAEMEX.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUAEMEX.setForeground(new java.awt.Color(112, 97, 0));
        lblUAEMEX.setText("UAEMéx");

        jPanel2.setBackground(new java.awt.Color(0, 79, 0));
        jPanel2.setForeground(new java.awt.Color(0, 79, 0));

        lblAdministracion.setBackground(new java.awt.Color(0, 0, 0));
        lblAdministracion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministracion.setText("ADMINISTRACIÓN");

        lblUniversitaria.setBackground(new java.awt.Color(0, 0, 0));
        lblUniversitaria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUniversitaria.setForeground(new java.awt.Color(255, 255, 255));
        lblUniversitaria.setText("  UNIVERSITARIA");

        lblCiclo.setBackground(new java.awt.Color(0, 0, 0));
        lblCiclo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCiclo.setForeground(new java.awt.Color(255, 255, 255));
        lblCiclo.setText("  2021 - 2025");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUniversitaria)
                    .addComponent(lblAdministracion)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblCiclo)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblAdministracion)
                .addGap(0, 0, 0)
                .addComponent(lblUniversitaria)
                .addGap(0, 0, 0)
                .addComponent(lblCiclo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorDinamicoLayout = new javax.swing.GroupLayout(ContenedorDinamico);
        ContenedorDinamico.setLayout(ContenedorDinamicoLayout);
        ContenedorDinamicoLayout.setHorizontalGroup(
            ContenedorDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorDinamicoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblSistemaDeSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorDinamicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorDinamicoLayout.createSequentialGroup()
                        .addComponent(lblSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUAEMEX)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorDinamicoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
        );
        ContenedorDinamicoLayout.setVerticalGroup(
            ContenedorDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorDinamicoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(ContenedorDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSistemaDeSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(ContenedorDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUAEMEX, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContenedorDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContenedorDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarConvocatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarConvocatoriaActionPerformed
        
    }//GEN-LAST:event_btnGenerarConvocatoriaActionPerformed

    private void btnGenerarConvocatoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarConvocatoriaMouseEntered
        btnGenerarConvocatoria.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnGenerarConvocatoriaMouseEntered

    private void btnGenerarConvocatoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarConvocatoriaMouseExited
        btnGenerarConvocatoria.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGenerarConvocatoriaMouseExited

    private void btnConsultarSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarSolicitudesMouseEntered
        btnConsultarSolicitudes.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnConsultarSolicitudesMouseEntered

    private void btnConsultarSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarSolicitudesMouseExited
        btnConsultarSolicitudes.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnConsultarSolicitudesMouseExited

    private void btnEmitirRespuestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmitirRespuestaMouseEntered
        btnEmitirRespuesta.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnEmitirRespuestaMouseEntered

    private void btnEmitirRespuestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmitirRespuestaMouseExited
        btnEmitirRespuesta.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEmitirRespuestaMouseExited

    private void btnConsultarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSolicitudesActionPerformed
        
        //GUITools.panelIntoPanel(ContenedorDinamico,new ConsultarSolicitudesPanel());
    }//GEN-LAST:event_btnConsultarSolicitudesActionPerformed

    private void btnEmitirRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirRespuestaActionPerformed
        GUITools.panelIntoPanel(ContenedorDinamico,new EmitirRespuesta());
    }//GEN-LAST:event_btnEmitirRespuestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorDinamico;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel MenuLateral;
    private javax.swing.JButton btnConsultarSolicitudes;
    private javax.swing.JButton btnEmitirRespuesta;
    private javax.swing.JButton btnGenerarConvocatoria;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdministracion;
    private javax.swing.JLabel lblCiclo;
    private javax.swing.JLabel lblSistemaDeSolicitudes;
    private javax.swing.JLabel lblSomos;
    private javax.swing.JLabel lblUAEMEX;
    private javax.swing.JLabel lblUniversitaria;
    // End of variables declaration//GEN-END:variables
}