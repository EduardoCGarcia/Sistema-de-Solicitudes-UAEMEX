/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Paneles.Compartidos;

import Vista.app;

/**
 *
 * @author EduardoCGarcia
 */
public class PanelPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
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

        Contenedor = new Utilerias.FondoNoAjustable("TexturaBlanco1.jpeg");
        panelEncabezado2 = new javax.swing.JPanel();
        lblSomos = new javax.swing.JLabel();
        lblUAEMEX = new javax.swing.JLabel();
        panelPieDePagina = new javax.swing.JPanel();
        jPanel1 = new Utilerias.FondoNoAjustable("TexturaBlanco.jpg");
        lblAdministracion = new javax.swing.JLabel();
        lblUniversitaria = new javax.swing.JLabel();
        lblCiclo = new javax.swing.JLabel();
        panelEncabezado1 = new javax.swing.JPanel();
        Logo = new Utilerias.FondoImagen("uaemex2.png");
        lblSistemaDeSolicitudes = new javax.swing.JLabel();
        lblEntrarComo = new javax.swing.JLabel();
        cboxUsuario = new javax.swing.JComboBox<>();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSelecciona = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(237, 229, 229));
        Contenedor.setForeground(new java.awt.Color(237, 229, 229));

        panelEncabezado2.setBackground(new java.awt.Color(255, 255, 255));
        panelEncabezado2.setForeground(new java.awt.Color(255, 255, 255));

        lblSomos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSomos.setForeground(new java.awt.Color(0, 79, 0));
        lblSomos.setText("#SOMOS");

        lblUAEMEX.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUAEMEX.setForeground(new java.awt.Color(112, 97, 0));
        lblUAEMEX.setText("UAEMéx");

        javax.swing.GroupLayout panelEncabezado2Layout = new javax.swing.GroupLayout(panelEncabezado2);
        panelEncabezado2.setLayout(panelEncabezado2Layout);
        panelEncabezado2Layout.setHorizontalGroup(
            panelEncabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezado2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUAEMEX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelEncabezado2Layout.setVerticalGroup(
            panelEncabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezado2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelEncabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUAEMEX, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPieDePagina.setBackground(new java.awt.Color(26, 104, 53));
        panelPieDePagina.setForeground(new java.awt.Color(26, 104, 53));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblAdministracion.setBackground(new java.awt.Color(0, 0, 0));
        lblAdministracion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAdministracion.setForeground(new java.awt.Color(112, 97, 0));
        lblAdministracion.setText("ADMINISTRACIÓN");

        lblUniversitaria.setBackground(new java.awt.Color(0, 0, 0));
        lblUniversitaria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUniversitaria.setForeground(new java.awt.Color(112, 97, 0));
        lblUniversitaria.setText("  UNIVERSITARIA");

        lblCiclo.setBackground(new java.awt.Color(0, 0, 0));
        lblCiclo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCiclo.setForeground(new java.awt.Color(112, 97, 0));
        lblCiclo.setText("  2021 - 2025");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCiclo))
                    .addComponent(lblUniversitaria)
                    .addComponent(lblAdministracion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblAdministracion)
                .addGap(0, 0, 0)
                .addComponent(lblUniversitaria)
                .addGap(0, 0, 0)
                .addComponent(lblCiclo)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout panelPieDePaginaLayout = new javax.swing.GroupLayout(panelPieDePagina);
        panelPieDePagina.setLayout(panelPieDePaginaLayout);
        panelPieDePaginaLayout.setHorizontalGroup(
            panelPieDePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPieDePaginaLayout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPieDePaginaLayout.setVerticalGroup(
            panelPieDePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelEncabezado1.setBackground(new java.awt.Color(26, 104, 53));
        panelEncabezado1.setForeground(new java.awt.Color(26, 104, 53));

        Logo.setBackground(new java.awt.Color(204, 0, 0));
        Logo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblSistemaDeSolicitudes.setBackground(new java.awt.Color(0, 0, 0));
        lblSistemaDeSolicitudes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSistemaDeSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        lblSistemaDeSolicitudes.setText("Sistema de Solicitues de la UAEMéx");

        javax.swing.GroupLayout panelEncabezado1Layout = new javax.swing.GroupLayout(panelEncabezado1);
        panelEncabezado1.setLayout(panelEncabezado1Layout);
        panelEncabezado1Layout.setHorizontalGroup(
            panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezado1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSistemaDeSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        panelEncabezado1Layout.setVerticalGroup(
            panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezado1Layout.createSequentialGroup()
                .addGroup(panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSistemaDeSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        lblEntrarComo.setBackground(new java.awt.Color(51, 51, 51));
        lblEntrarComo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblEntrarComo.setForeground(new java.awt.Color(51, 51, 51));
        lblEntrarComo.setText("Entrar como:");

        cboxUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Solicitante", "Subdirección académica" }));

        btnContinuar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Bienvenido");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblSelecciona.setBackground(new java.awt.Color(0, 0, 0));
        lblSelecciona.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblSelecciona.setText("Selecciona tu tipo de usuario");

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPieDePagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(panelEncabezado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelEncabezado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addComponent(lblSelecciona, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addComponent(lblEntrarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEncabezado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEncabezado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lblSelecciona, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEntrarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnContinuar)
                .addGap(34, 34, 34)
                .addComponent(panelPieDePagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        String cbx = (String) cboxUsuario.getSelectedItem();

        if (cbx.equals("Administrativo")) {
            app.role = "admin";
        } else if(cbx.equals("Solicitante")){
            app.role = "suscriptor";
        } else if(cbx.equals("Subdirección académica")) {
            
        }   

        Login log = new Login(app.app,true);
        log.setVisible(true);

    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Logo;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cboxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdministracion;
    private javax.swing.JLabel lblCiclo;
    private javax.swing.JLabel lblEntrarComo;
    private javax.swing.JLabel lblSelecciona;
    private javax.swing.JLabel lblSistemaDeSolicitudes;
    private javax.swing.JLabel lblSomos;
    private javax.swing.JLabel lblUAEMEX;
    private javax.swing.JLabel lblUniversitaria;
    private javax.swing.JPanel panelEncabezado1;
    private javax.swing.JPanel panelEncabezado2;
    private javax.swing.JPanel panelPieDePagina;
    // End of variables declaration//GEN-END:variables
}
