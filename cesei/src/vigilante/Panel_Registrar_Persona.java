
package vigilante;

import alerta.Alerta;
import alerta.AlertaAccion;
import alerta.AlertaSiNo;
import java.awt.Color;
import utils.BaseDatos;


public class Panel_Registrar_Persona extends javax.swing.JPanel {

    BaseDatos basedatos;
    Boolean click;
    public Panel_Registrar_Persona(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo_nombres = new javax.swing.JTextField();
        userLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        campo_apellidos = new javax.swing.JTextField();
        userLabel5 = new javax.swing.JLabel();
        etq_registrarpersonas = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btn_registrar = new javax.swing.JButton();
        campo_telefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        userLabel6 = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        userLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        campo_nombres.setBackground(new java.awt.Color(242, 242, 242));
        campo_nombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombres.setForeground(new java.awt.Color(0, 0, 0));
        campo_nombres.setText("Ingrese el nombre");
        campo_nombres.setBorder(null);
        campo_nombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_nombresMousePressed(evt);
            }
        });

        userLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel4.setForeground(new java.awt.Color(0, 0, 0));
        userLabel4.setText("Nombres");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        campo_apellidos.setBackground(new java.awt.Color(242, 242, 242));
        campo_apellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        campo_apellidos.setText("Ingrese el apellido");
        campo_apellidos.setBorder(null);
        campo_apellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_apellidosMousePressed(evt);
            }
        });

        userLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel5.setForeground(new java.awt.Color(0, 0, 0));
        userLabel5.setText("Apellidos");

        etq_registrarpersonas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_registrarpersonas.setForeground(new java.awt.Color(0, 0, 0));
        etq_registrarpersonas.setText("REGISTRAR PERSONA");

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        btn_registrar.setBackground(new java.awt.Color(0, 191, 99));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        campo_telefono.setBackground(new java.awt.Color(242, 242, 242));
        campo_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono.setForeground(new java.awt.Color(0, 0, 0));
        campo_telefono.setText("Ingrese el teléfono");
        campo_telefono.setBorder(null);
        campo_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_telefonoMousePressed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        userLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel6.setForeground(new java.awt.Color(0, 0, 0));
        userLabel6.setText("Teléfono");

        campo_cedula.setBackground(new java.awt.Color(242, 242, 242));
        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setForeground(new java.awt.Color(0, 0, 0));
        campo_cedula.setText("Ingrese la cédula");
        campo_cedula.setBorder(null);
        campo_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaMousePressed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        userLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel7.setForeground(new java.awt.Color(0, 0, 0));
        userLabel7.setText("Cédula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_registrarpersonas)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campo_cedula)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userLabel4)
                                .addComponent(campo_nombres)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userLabel5)
                                .addComponent(campo_apellidos)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userLabel6)
                                .addComponent(campo_telefono)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userLabel7))
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(etq_registrarpersonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(userLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nombresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_nombresMousePressed
        if (campo_nombres.getText().equals("Ingrese el nombre")) {
            campo_nombres.setText("");
            campo_nombres.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_nombresMousePressed

    private void campo_apellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_apellidosMousePressed
         if (campo_apellidos.getText().equals("Ingrese el apellido")) {
            campo_apellidos.setText("");
            campo_apellidos.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_apellidosMousePressed

    private void campo_telefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_telefonoMousePressed
         if (campo_telefono.getText().equals("Ingrese el teléfono")) {
            campo_telefono.setText("");
            campo_telefono.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_telefonoMousePressed

    private void campo_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaMousePressed
         if (campo_cedula.getText().equals("Ingrese la cédula")) {
            campo_cedula.setText("");
            campo_cedula.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_cedulaMousePressed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String cedula = campo_cedula.getText();
        String nombres = campo_nombres.getText();
        String apellidos = campo_apellidos.getText();
        String telefono = campo_telefono.getText();
        
        if( cedula.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("")){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
            
              basedatos.insertarPersona(cedula, nombres, apellidos, telefono);
              AlertaAccion alertaEditar = new AlertaAccion("Persona registrada correctamente");
             
             
             campo_cedula.setText(" ");
             campo_nombres.setText(" ");
             campo_apellidos.setText(" ");
             campo_telefono.setText(" ");
        }
             
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etq_registrarpersonas;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel userLabel4;
    private javax.swing.JLabel userLabel5;
    private javax.swing.JLabel userLabel6;
    private javax.swing.JLabel userLabel7;
    // End of variables declaration//GEN-END:variables
}
