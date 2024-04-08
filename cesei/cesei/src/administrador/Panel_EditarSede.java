
package administrador;

import alerta.Alerta;
import java.awt.Color;
import utils.BaseDatos;
import utils.Sede;


public class Panel_EditarSede extends javax.swing.JPanel {

   BaseDatos basedatos;
   Sede sede;
   String id_sede;
    public Panel_EditarSede(String id_sede, BaseDatos basedatos) {
        this.basedatos  =  basedatos;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        cont_head = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        cont_main = new javax.swing.JPanel();
        etq_Nsede = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        etq_direccion = new javax.swing.JLabel();
        btn_buscarSede = new javax.swing.JButton();
        campo_contacto = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_editarSede = new javax.swing.JButton();
        etq_sede = new javax.swing.JLabel();
        campo_Nsede = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        cont_head.setBackground(new java.awt.Color(56, 128, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Editar Sede");

        javax.swing.GroupLayout cont_headLayout = new javax.swing.GroupLayout(cont_head);
        cont_head.setLayout(cont_headLayout);
        cont_headLayout.setHorizontalGroup(
            cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cont_headLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(etq_titulo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        cont_headLayout.setVerticalGroup(
            cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cont_headLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(etq_titulo)
                    .addGap(0, 16, Short.MAX_VALUE)))
        );

        cont_main.setBackground(new java.awt.Color(0, 74, 173));

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

        btn_buscarSede.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscarSede.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_buscarSede.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarSede.setText("Buscar");
        btn_buscarSede.setBorder(null);
        btn_buscarSede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarSedeActionPerformed(evt);
            }
        });

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

        btn_editarSede.setBackground(new java.awt.Color(0, 191, 99));
        btn_editarSede.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_editarSede.setForeground(new java.awt.Color(255, 255, 255));
        btn_editarSede.setText("Editar Sede");
        btn_editarSede.setBorder(null);
        btn_editarSede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarSedeActionPerformed(evt);
            }
        });

        etq_sede.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_sede.setForeground(new java.awt.Color(255, 255, 255));
        etq_sede.setText("Contacto");

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

        javax.swing.GroupLayout cont_mainLayout = new javax.swing.GroupLayout(cont_main);
        cont_main.setLayout(cont_mainLayout);
        cont_mainLayout.setHorizontalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(btn_editarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cont_mainLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cont_mainLayout.createSequentialGroup()
                            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_contacto)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(etq_sede))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etq_direccion)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(cont_mainLayout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etq_Nsede)
                                .addGroup(cont_mainLayout.createSequentialGroup()
                                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campo_Nsede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(72, 72, 72)
                                    .addComponent(btn_buscarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(96, 96, 96)))
        );
        cont_mainLayout.setVerticalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(btn_editarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cont_mainLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                            .addComponent(etq_Nsede)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_Nsede, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_buscarSede, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(cont_mainLayout.createSequentialGroup()
                            .addComponent(etq_sede)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cont_mainLayout.createSequentialGroup()
                            .addComponent(etq_direccion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(135, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cont_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(cont_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_direccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_direccionMousePressed
        if (campo_Nsede.getText().equals("Direccion de sede ")) {
            campo_Nsede.setText("");
            campo_Nsede.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_direccionMousePressed

    private void btn_buscarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarSedeActionPerformed
        String id_sede = campo_Nsede.getText();
         if( id_sede.equals("")){
            Alerta ventana = new Alerta("Debe ingresar N°sede.");
        }else{
             
             sede = basedatos.buscarSede(id_sede);
             String direccion = sede.getDireccion();
             String contacto = sede.getContacto();
            
             campo_direccion.setText(direccion);
             campo_contacto.setText(contacto);
             
         }
    }//GEN-LAST:event_btn_buscarSedeActionPerformed

    private void campo_contactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_contactoMousePressed
        if (campo_Nsede.getText().equals("Número o Email")) {
            campo_Nsede.setText("");
            campo_Nsede.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_contactoMousePressed

    private void btn_editarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarSedeActionPerformed
        String id_sede = campo_Nsede.getText();
        String direccion = campo_direccion.getText();
        String contacto = campo_contacto.getText();
        
            Boolean verificacion = false;
         if( id_sede.equals("") || direccion.equals(" ") || contacto.equals(" ")){
            Alerta ventana = new Alerta("Todos los campos son obligatorios.");
            verificacion = false;
        }else{
             
             Boolean editarSede = basedatos.editarSede(id_sede, direccion, contacto);
             verificacion = true;
             
         }
    }//GEN-LAST:event_btn_editarSedeActionPerformed

    private void campo_NsedeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_NsedeMousePressed
        if (campo_Nsede.getText().equals("N° de sede")) {
            campo_Nsede.setText("");
            campo_Nsede.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_NsedeMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarSede;
    private javax.swing.JButton btn_editarSede;
    private javax.swing.JTextField campo_Nsede;
    private javax.swing.JTextField campo_contacto;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JPanel cont_head;
    private javax.swing.JPanel cont_main;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel etq_Nsede;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_sede;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
