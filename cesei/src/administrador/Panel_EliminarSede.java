
package administrador;

import alerta.Alerta;
import alerta.AlertaEliminar;
import alerta.AlertaSiNo;
import java.awt.Color;
import utils.BaseDatos;
import utils.Sede;



public class Panel_EliminarSede extends javax.swing.JPanel {

    BaseDatos basedatos;
    String id_sede;
    Sede sede;
    Boolean click;
    public Panel_EliminarSede(String id_sede, BaseDatos basedatos) {
        this.basedatos = basedatos;
        this.id_sede = id_sede;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo_contacto1 = new javax.swing.JTextField();
        etq_contacto1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btn_eliminiarSede = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        etq_contacto = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        campo_Nsede = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        etq_direccion = new javax.swing.JLabel();
        etq_Nsede = new javax.swing.JLabel();
        campo_contacto = new javax.swing.JTextField();
        campo_direccion = new javax.swing.JTextField();
        campo_cedulaAdmin = new javax.swing.JTextField();
        etq_cedulaAdmin = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();

        campo_contacto1.setBackground(new java.awt.Color(0, 74, 173));
        campo_contacto1.setBorder(null);

        etq_contacto1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_contacto1.setForeground(new java.awt.Color(255, 255, 255));
        etq_contacto1.setText("Contacto:");

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        btn_eliminiarSede.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminiarSede.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_eliminiarSede.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminiarSede.setText("Eliminar Sede");
        btn_eliminiarSede.setBorder(null);
        btn_eliminiarSede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminiarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminiarSedeActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_contacto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_contacto.setForeground(new java.awt.Color(0, 0, 0));
        etq_contacto.setText("Contacto:");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        campo_Nsede.setBackground(new java.awt.Color(242, 242, 242));
        campo_Nsede.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_Nsede.setForeground(new java.awt.Color(0, 0, 0));
        campo_Nsede.setText("Ingrese el ID de la sede");
        campo_Nsede.setBorder(null);
        campo_Nsede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_NsedeMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        etq_direccion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(0, 0, 0));
        etq_direccion.setText("Dirección:");

        etq_Nsede.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_Nsede.setForeground(new java.awt.Color(0, 0, 0));
        etq_Nsede.setText("N° Sede");

        campo_contacto.setBackground(new java.awt.Color(242, 242, 242));
        campo_contacto.setForeground(new java.awt.Color(0, 0, 0));
        campo_contacto.setBorder(null);

        campo_direccion.setBackground(new java.awt.Color(242, 242, 242));
        campo_direccion.setForeground(new java.awt.Color(0, 0, 0));
        campo_direccion.setBorder(null);

        campo_cedulaAdmin.setBackground(new java.awt.Color(242, 242, 242));
        campo_cedulaAdmin.setForeground(new java.awt.Color(0, 0, 0));
        campo_cedulaAdmin.setBorder(null);

        etq_cedulaAdmin.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedulaAdmin.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedulaAdmin.setText("Administrador:");

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminiarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(442, 442, 442))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_Nsede)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(etq_Nsede, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_direccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(etq_cedulaAdmin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(campo_direccion))
                        .addGap(29, 29, 29)
                        .addComponent(etq_contacto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(campo_contacto)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator8)
                        .addComponent(campo_cedulaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(etq_Nsede)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(campo_Nsede, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etq_direccion)
                                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(etq_contacto)
                                        .addComponent(campo_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_cedulaAdmin)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campo_cedulaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(btn_eliminiarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_NsedeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_NsedeMousePressed
        if (campo_Nsede.getText().equals("Ingrese el ID de la sede")) {
            campo_Nsede.setText("");
            campo_Nsede.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_NsedeMousePressed

    private void btn_eliminiarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminiarSedeActionPerformed
        String id_sede = campo_Nsede.getText();
        if( id_sede.equals("")){
            Alerta ventana = new Alerta("Debe ingresar N°sede.");
        }else{
           
            AlertaEliminar alertaEliminar = new AlertaEliminar("¿Esta seguro de eliminar   la sede: "+campo_Nsede.getText()+"?",click );
            if(click = true){
              basedatos.eliminarSede(id_sede);
              Panel_ListaSedes nuevo = new Panel_ListaSedes(basedatos);
            }
            
            
             
         
         }
    }//GEN-LAST:event_btn_eliminiarSedeActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String id_sede = campo_Nsede.getText();
         if( id_sede.equals("")){
            Alerta ventana = new Alerta("Debe ingresar N°sede.");
        }else{
             
             sede = basedatos.buscarSede(id_sede);
             String direccion = sede.getDireccion();
             String contacto = sede.getContacto();
             String cedulaAdmin = sede.getCedulaAdmin();
             
             campo_direccion.setText(direccion);
             campo_contacto.setText(contacto);
             campo_cedulaAdmin.setText(cedulaAdmin);
           
         }
        
       
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminiarSede;
    private javax.swing.JTextField campo_Nsede;
    private javax.swing.JTextField campo_cedulaAdmin;
    private javax.swing.JTextField campo_contacto;
    private javax.swing.JTextField campo_contacto1;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JLabel etq_Nsede;
    private javax.swing.JLabel etq_cedulaAdmin;
    private javax.swing.JLabel etq_contacto;
    private javax.swing.JLabel etq_contacto1;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
