
package administrador;

import alerta.Alerta;
import java.awt.Color;
import utils.BaseDatos;
import utils.Usuario;


public class Panel_RegistroSede extends javax.swing.JPanel {

    BaseDatos basedatos;
    
    public Panel_RegistroSede(BaseDatos basedatos) {
      this.basedatos = basedatos;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        etq_Nsede = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        etq_direccion = new javax.swing.JLabel();
        campo_contacto = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        etq_sede = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        campo_Nsede = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        etq_cedulaAdmin = new javax.swing.JLabel();
        campo_cedulaAdmin = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(56, 128, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Sede");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 74, 173));

        etq_Nsede.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_Nsede.setForeground(new java.awt.Color(255, 255, 255));
        etq_Nsede.setText("N° Sede");

        campo_direccion.setBackground(new java.awt.Color(0, 74, 173));
        campo_direccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_direccion.setForeground(new java.awt.Color(204, 204, 255));
        campo_direccion.setText("Direccion de sede ");
        campo_direccion.setBorder(null);
        campo_direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_direccionMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        etq_direccion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(255, 255, 255));
        etq_direccion.setText("Direccion");

        campo_contacto.setBackground(new java.awt.Color(0, 74, 173));
        campo_contacto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_contacto.setForeground(new java.awt.Color(204, 204, 255));
        campo_contacto.setText("Número o Email");
        campo_contacto.setBorder(null);
        campo_contacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_contactoMousePressed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        etq_sede.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_sede.setForeground(new java.awt.Color(255, 255, 255));
        etq_sede.setText("Contacto");

        btn_registrar.setBackground(new java.awt.Color(0, 191, 99));
        btn_registrar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar Sede");
        btn_registrar.setBorder(null);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        campo_Nsede.setBackground(new java.awt.Color(0, 74, 173));
        campo_Nsede.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_Nsede.setForeground(new java.awt.Color(204, 204, 255));
        campo_Nsede.setText("N° de sede");
        campo_Nsede.setBorder(null);
        campo_Nsede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_NsedeMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        etq_cedulaAdmin.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedulaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedulaAdmin.setText("Cédula Admin");

        campo_cedulaAdmin.setBackground(new java.awt.Color(0, 74, 173));
        campo_cedulaAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedulaAdmin.setForeground(new java.awt.Color(204, 204, 255));
        campo_cedulaAdmin.setText("Documento del Admin");
        campo_cedulaAdmin.setBorder(null);
        campo_cedulaAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaAdminMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_cedulaAdmin)
                    .addComponent(campo_cedulaAdmin)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etq_sede)
                                .addComponent(campo_contacto)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_Nsede)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campo_Nsede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_direccion)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campo_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(309, 309, 309)))
                    .addGap(105, 105, 105)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(etq_cedulaAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cedulaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(etq_Nsede)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_Nsede, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(etq_direccion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(etq_sede)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(campo_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_direccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_direccionMousePressed
         if (campo_direccion.getText().equals("Direccion de sede ")) {
            campo_direccion.setText("");
            campo_direccion.setForeground(Color.white);
        }
        
         
    }//GEN-LAST:event_campo_direccionMousePressed

    private void campo_contactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_contactoMousePressed
         if (campo_contacto.getText().equals("Número o Email")) {
            campo_contacto.setText("");
            campo_contacto.setForeground(Color.white);
        }
        
    }//GEN-LAST:event_campo_contactoMousePressed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String Nsede = campo_Nsede.getText();
        String contacto = campo_contacto.getText();
        String direccion = campo_direccion.getText();
        String cedulaAdmin = campo_cedulaAdmin.getText();
        
         if( Nsede.equals("") || contacto.equals("") || direccion.equals("") || cedulaAdmin.equals("")){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
             basedatos.insertarSede(Nsede, direccion, contacto, cedulaAdmin);
             campo_Nsede.setText(" ");
             campo_contacto.setText(" ");
             campo_direccion.setText(" ");
             campo_cedulaAdmin.setText(" ");
             
            
             
       }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void campo_NsedeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_NsedeMousePressed
        if (campo_Nsede.getText().equals("N° de sede")) {
            campo_Nsede.setText("");
            campo_Nsede.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_NsedeMousePressed

    private void campo_cedulaAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaAdminMousePressed
        if (campo_cedulaAdmin.getText().equals("Documento del Admin")) {
            campo_cedulaAdmin.setText("");
            campo_cedulaAdmin.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_cedulaAdminMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_Nsede;
    private javax.swing.JTextField campo_cedulaAdmin;
    private javax.swing.JTextField campo_contacto;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JLabel etq_Nsede;
    private javax.swing.JLabel etq_cedulaAdmin;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_sede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
