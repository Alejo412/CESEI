
package administrador;

import alerta.Alerta;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.Usuario;


public class Panel_EliminarVigilante extends javax.swing.JPanel {

    Usuario usuarioValidado;
    BaseDatos basedatos;
    String cedula_vigilante; 
    public Panel_EliminarVigilante(String cedula_vigilante, BaseDatos basedatos) {
         initComponents();
        this.cedula_vigilante = cedula_vigilante; 
        this.basedatos = basedatos;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_head = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        cont_main = new javax.swing.JPanel();
        campo_fechaNacimiento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        campo_apellido = new javax.swing.JTextField();
        campo_correo = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        etq_fechaNacimieto = new javax.swing.JLabel();
        btn_eliminarVigilante = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        etq_cedula = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btn_buscarVigilante = new javax.swing.JButton();
        etq_nombre = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        etq_apellido = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        etq_telefono = new javax.swing.JLabel();
        etq_correo = new javax.swing.JLabel();
        campo_foto = new javax.swing.JLabel();

        cont_head.setBackground(new java.awt.Color(56, 128, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Eliminar Vigilante");

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
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cont_headLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(etq_titulo)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        cont_main.setBackground(new java.awt.Color(0, 74, 173));

        campo_fechaNacimiento.setBackground(new java.awt.Color(0, 74, 173));
        campo_fechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_fechaNacimiento.setForeground(new java.awt.Color(204, 204, 255));
        campo_fechaNacimiento.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        campo_apellido.setBackground(new java.awt.Color(0, 74, 173));
        campo_apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_apellido.setForeground(new java.awt.Color(204, 204, 255));
        campo_apellido.setBorder(null);

        campo_correo.setBackground(new java.awt.Color(0, 74, 173));
        campo_correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_correo.setForeground(new java.awt.Color(204, 204, 255));
        campo_correo.setBorder(null);

        campo_telefono.setBackground(new java.awt.Color(0, 74, 173));
        campo_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono.setForeground(new java.awt.Color(204, 204, 255));
        campo_telefono.setBorder(null);

        etq_fechaNacimieto.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_fechaNacimieto.setForeground(new java.awt.Color(255, 255, 255));
        etq_fechaNacimieto.setText("Fecha de nacimiento");

        btn_eliminarVigilante.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminarVigilante.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_eliminarVigilante.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarVigilante.setText("Eliminar Vigilante");
        btn_eliminarVigilante.setActionCommand("");
        btn_eliminarVigilante.setBorder(null);
        btn_eliminarVigilante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarVigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarVigilanteActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        etq_cedula.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedula.setText("Cédula");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        btn_buscarVigilante.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscarVigilante.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_buscarVigilante.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarVigilante.setText("Buscar ");
        btn_buscarVigilante.setActionCommand("");
        btn_buscarVigilante.setBorder(null);
        btn_buscarVigilante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarVigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarVigilanteActionPerformed(evt);
            }
        });

        etq_nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setText("Nombres");

        campo_cedula.setBackground(new java.awt.Color(0, 74, 173));
        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setForeground(new java.awt.Color(204, 204, 255));
        campo_cedula.setText("Documento del vigilante");
        campo_cedula.setBorder(null);
        campo_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaMousePressed(evt);
            }
        });

        campo_nombre.setBackground(new java.awt.Color(0, 74, 173));
        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(204, 204, 255));
        campo_nombre.setBorder(null);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        etq_apellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_apellido.setForeground(new java.awt.Color(255, 255, 255));
        etq_apellido.setText("Apellidos");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        etq_telefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("Telefono");

        etq_correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(255, 255, 255));
        etq_correo.setText("Correo");

        campo_foto.setText("campo_foto");

        javax.swing.GroupLayout cont_mainLayout = new javax.swing.GroupLayout(cont_main);
        cont_main.setLayout(cont_mainLayout);
        cont_mainLayout.setHorizontalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminarVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433))
            .addGroup(cont_mainLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_correo)
                        .addComponent(campo_correo)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etq_cedula)
                    .addComponent(campo_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_apellido)
                        .addComponent(campo_apellido)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_nombre)
                        .addComponent(campo_nombre)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_telefono)
                        .addComponent(campo_telefono)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_fechaNacimieto)
                        .addComponent(campo_fechaNacimiento)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        cont_mainLayout.setVerticalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mainLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_cedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(etq_apellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_fechaNacimieto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(campo_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etq_correo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btn_eliminarVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cont_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cont_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarVigilanteActionPerformed
         String cedula = campo_cedula.getText();

        if (cedula == "") {
            Alerta ventana = new Alerta("El campo de cédula está vacío.");
        }

        Usuario usuario = basedatos.buscarusuario(cedula);

        if (usuario == null) {
            Alerta ventana = new Alerta("No se encontró ningún usuario con esa cédula.");
        }
        
        usuarioValidado = basedatos.buscarusuario(cedula);
        
        if (usuarioValidado != null) {
            String nombres = usuarioValidado.getNombres();
            String apellidos = usuarioValidado.getApellidos();
            String correo = usuarioValidado.getEmail();
            String telefono = usuarioValidado.getTelefono();
            String fecha_nacimiento = usuarioValidado.getFecha_nacimiento();

            campo_nombre.setText(nombres);
            campo_apellido.setText(apellidos);
            campo_correo.setText(correo);
            campo_telefono.setText(telefono);
            campo_fechaNacimiento.setText(fecha_nacimiento);

            Image foto_perfil = usuarioValidado.getFoto();
            if (foto_perfil != null) {
                foto_perfil = foto_perfil.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(foto_perfil);

                // Asegúrate de que esta operación de interfaz de usuario se realice en el hilo de despacho de eventos de Swing
                //SwingUtilities.invokeLater(() -> {
                    campo_foto.setIcon(icono);
             } else {
                System.out.println("La foto de perfil está en null");
            }
        } else {
            System.out.println("No se encontró el usuario");
        }    
    }//GEN-LAST:event_btn_buscarVigilanteActionPerformed

    private void campo_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaMousePressed
         if (campo_cedula.getText().equals("Documento del vigilante")) {
            campo_cedula.setText("");
            campo_cedula.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_cedulaMousePressed

    private void btn_eliminarVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarVigilanteActionPerformed
        String cedulaVigilante = campo_cedula.getText();
        if( cedulaVigilante.equals("")){
            Alerta ventana = new Alerta("Debe ingresar N°sede.");
        }else{
             basedatos.eliminarVigilante(cedulaVigilante);
         
         }
    }//GEN-LAST:event_btn_eliminarVigilanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarVigilante;
    private javax.swing.JButton btn_eliminarVigilante;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_fechaNacimiento;
    private javax.swing.JLabel campo_foto;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel cont_head;
    private javax.swing.JPanel cont_main;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_fechaNacimieto;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
