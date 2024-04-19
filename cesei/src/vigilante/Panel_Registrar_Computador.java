
package vigilante;

import alerta.Alerta;
import java.awt.Color;
import utils.BaseDatos;


public class Panel_Registrar_Computador extends javax.swing.JPanel {

   BaseDatos basedatos;
    public Panel_Registrar_Computador(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        campo_marca = new javax.swing.JTextField();
        campo_codigo = new javax.swing.JTextField();
        userLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        campo_cedulaPersona = new javax.swing.JTextField();
        userLabel5 = new javax.swing.JLabel();
        etq_registrarpersonas = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        userLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        campo_marca.setBackground(new java.awt.Color(242, 242, 242));
        campo_marca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_marca.setForeground(new java.awt.Color(0, 0, 0));
        campo_marca.setText("Ingrese la marca");
        campo_marca.setBorder(null);
        campo_marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_marcaMousePressed(evt);
            }
        });

        campo_codigo.setBackground(new java.awt.Color(242, 242, 242));
        campo_codigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_codigo.setForeground(new java.awt.Color(0, 0, 0));
        campo_codigo.setText("Ingrese el código");
        campo_codigo.setBorder(null);
        campo_codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_codigoMousePressed(evt);
            }
        });

        userLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel4.setForeground(new java.awt.Color(0, 0, 0));
        userLabel4.setText("Marca");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        campo_cedulaPersona.setBackground(new java.awt.Color(242, 242, 242));
        campo_cedulaPersona.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedulaPersona.setForeground(new java.awt.Color(0, 0, 0));
        campo_cedulaPersona.setText("Ingrese el documento de la persona");
        campo_cedulaPersona.setBorder(null);
        campo_cedulaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaPersonaMousePressed(evt);
            }
        });

        userLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel5.setForeground(new java.awt.Color(0, 0, 0));
        userLabel5.setText("Cédula Persona");

        etq_registrarpersonas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_registrarpersonas.setForeground(new java.awt.Color(0, 0, 0));
        etq_registrarpersonas.setText("REGISTRAR COMPUTADOR");

        btn_registrar.setBackground(new java.awt.Color(0, 191, 99));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        userLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel7.setForeground(new java.awt.Color(0, 0, 0));
        userLabel7.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel7)
                    .addComponent(etq_registrarpersonas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campo_codigo)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userLabel4)
                        .addComponent(campo_marca)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userLabel5)
                        .addComponent(campo_cedulaPersona)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(etq_registrarpersonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(userLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_marcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_marcaMousePressed
        if (campo_marca.getText().equals("Ingrese la marca")) {
            campo_marca.setText("");
            campo_marca.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_marcaMousePressed

    private void campo_codigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_codigoMousePressed
        if (campo_codigo.getText().equals("Ingrese el código")) {
            campo_codigo.setText("");
            campo_codigo.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_codigoMousePressed

    private void campo_cedulaPersonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaPersonaMousePressed
        if (campo_cedulaPersona.getText().equals("Ingrese el documento de la persona")) {
            campo_cedulaPersona.setText("");
            campo_cedulaPersona.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_cedulaPersonaMousePressed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        
        String codigo = campo_codigo.getText();
        String marca = campo_marca.getText();
        String cedula_persona = campo_cedulaPersona.getText();
        
        if( codigo.equals("") || marca.equals("") || cedula_persona.equals("")){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
             basedatos.insertarComputador(codigo, marca, cedula_persona);
             campo_codigo.setText(" ");
             campo_marca.setText(" ");
             campo_cedulaPersona.setText(" ");
        }
             
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_cedulaPersona;
    private javax.swing.JTextField campo_codigo;
    private javax.swing.JTextField campo_marca;
    private javax.swing.JLabel etq_registrarpersonas;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel userLabel4;
    private javax.swing.JLabel userLabel5;
    private javax.swing.JLabel userLabel7;
    // End of variables declaration//GEN-END:variables
}
