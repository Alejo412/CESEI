
package administrador;
import alerta.Alerta;
import utils.BaseDatos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import utils.Usuario;


public class Panel_RegistrarVigilante extends javax.swing.JPanel {

    BaseDatos basedatos;
    
    
    public Panel_RegistrarVigilante(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_head = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        cont_main = new javax.swing.JPanel();
        campo_apellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        etq_apellido = new javax.swing.JLabel();
        campo_fechaNacimiento = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        etq_fechaNacimiento = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        campo_nombre = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etq_nombre = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        etq_correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        etq_contraseña = new javax.swing.JLabel();
        campo_contraseña = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();

        cont_head.setBackground(new java.awt.Color(56, 128, 255));

        etq_titulo.setBackground(new java.awt.Color(56, 128, 255));
        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Registrar Vigilante");

        javax.swing.GroupLayout cont_headLayout = new javax.swing.GroupLayout(cont_head);
        cont_head.setLayout(cont_headLayout);
        cont_headLayout.setHorizontalGroup(
            cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
        );
        cont_headLayout.setVerticalGroup(
            cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cont_main.setBackground(new java.awt.Color(0, 74, 173));

        campo_apellido.setBackground(new java.awt.Color(0, 74, 173));
        campo_apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_apellido.setForeground(new java.awt.Color(204, 204, 255));
        campo_apellido.setText("Apellido del vigilante");
        campo_apellido.setBorder(null);
        campo_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_apellidoMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        etq_apellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_apellido.setForeground(new java.awt.Color(255, 255, 255));
        etq_apellido.setText("Apellidos");

        campo_fechaNacimiento.setBackground(new java.awt.Color(0, 74, 173));
        campo_fechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_fechaNacimiento.setForeground(new java.awt.Color(204, 204, 255));
        campo_fechaNacimiento.setText("aaaa/mm/dd");
        campo_fechaNacimiento.setBorder(null);
        campo_fechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_fechaNacimientoMousePressed(evt);
            }
        });

        campo_telefono.setBackground(new java.awt.Color(0, 74, 173));
        campo_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono.setForeground(new java.awt.Color(204, 204, 255));
        campo_telefono.setText("Ingrese el teléfono");
        campo_telefono.setBorder(null);
        campo_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_telefonoMousePressed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        etq_fechaNacimiento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_fechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        etq_fechaNacimiento.setText("Fecha de nacimiento");

        btn_registrar.setBackground(new java.awt.Color(0, 191, 99));
        btn_registrar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        campo_nombre.setBackground(new java.awt.Color(0, 74, 173));
        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(204, 204, 255));
        campo_nombre.setText("Nombre del vigilante");
        campo_nombre.setBorder(null);
        campo_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_nombreMousePressed(evt);
            }
        });

        etq_telefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("Telefono");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        etq_nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setText("Nombres");

        etq_cedula.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedula.setText("Cédua");

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

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        etq_correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(255, 255, 255));
        etq_correo.setText("Correo");

        campo_correo.setBackground(new java.awt.Color(0, 74, 173));
        campo_correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_correo.setForeground(new java.awt.Color(204, 204, 255));
        campo_correo.setText("Correo del vigilante");
        campo_correo.setBorder(null);
        campo_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_correoMousePressed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        etq_contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        etq_contraseña.setText("Contraseña");

        campo_contraseña.setBackground(new java.awt.Color(0, 74, 173));
        campo_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        campo_contraseña.setBorder(null);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cont_mainLayout = new javax.swing.GroupLayout(cont_main);
        cont_main.setLayout(cont_mainLayout);
        cont_mainLayout.setHorizontalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mainLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_nombre)
                    .addComponent(campo_nombre)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(etq_apellido)
                    .addComponent(campo_apellido)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(etq_cedula)
                    .addComponent(campo_cedula)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(etq_contraseña)
                    .addComponent(campo_contraseña)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etq_telefono)
                                .addComponent(campo_telefono)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etq_fechaNacimiento)
                                .addComponent(campo_fechaNacimiento)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etq_correo)
                                .addComponent(campo_correo)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        cont_mainLayout.setVerticalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_cedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_correo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_fechaNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_apellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_contraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void campo_apellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_apellidoMousePressed
        if (campo_apellido.getText().equals("Apellido del vigilante")) {
            campo_apellido.setText("");
            campo_apellido.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_apellidoMousePressed

    private void campo_fechaNacimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_fechaNacimientoMousePressed
        if (campo_fechaNacimiento.getText().equals("aaaa/mm/dd")) {
            campo_fechaNacimiento.setText("");
            campo_fechaNacimiento.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_fechaNacimientoMousePressed

    private void campo_telefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_telefonoMousePressed
         if (campo_telefono.getText().equals("Ingrese el teléfono")) {
            campo_telefono.setText("");
            campo_telefono.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_telefonoMousePressed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
    String nombre = campo_nombre.getText();
    String apellido = campo_apellido.getText();
    String cedula = campo_cedula.getText();
    String correo = campo_correo.getText();
    String telefono = campo_telefono.getText();
    String fechaNacimiento = campo_fechaNacimiento.getText();
    String contrasena = campo_contraseña.getText();
    
         if( cedula.equals("") || nombre.equals("") || apellido.equals("") || telefono.equals("") || correo.equals("") || fechaNacimiento.equals("") || contrasena.equals("")  ){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
           // Encriptar la contraseña utilizando el método getMD5
             String contrasenaEncriptada = getMD5(contrasena);
             GuardarImagenBD guardarImagenBD = new GuardarImagenBD(cedula);
             guardarImagenBD.setVisible(true);
             
            basedatos.insertarUsuario(cedula, nombre, apellido, correo, contrasenaEncriptada, telefono, fechaNacimiento);

            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_cedula.setText("");
            campo_correo.setText("");
            campo_telefono.setText("");
            campo_fechaNacimiento.setText("");
            campo_contraseña.setText("");
      
         
        }
    
    }//GEN-LAST:event_btn_registrarActionPerformed
    
    public String getMD5(String input) {
        try {
            // Obtener una instancia del algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Convertir el String a bytes
            byte[] messageDigest = md.digest(input.getBytes());

            // Convertir los bytes a un String hexadecimal
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            // Añadir ceros a la izquierda si es necesario
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            // Devolver el hash MD5
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    private void campo_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_nombreMousePressed
        if (campo_nombre.getText().equals("Nombre del vigilante")) {
            campo_nombre.setText("");
            campo_nombre.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_nombreMousePressed

    private void campo_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaMousePressed
        if (campo_cedula.getText().equals("Documento del vigilante")) {
            campo_cedula.setText("");
            campo_cedula.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_cedulaMousePressed

    private void campo_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_correoMousePressed
        if (campo_correo.getText().equals("Correo del vigilante")) {
            campo_correo.setText("");
            campo_correo.setForeground(Color.white);
        }
    }//GEN-LAST:event_campo_correoMousePressed

    private void campo_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_fechaNacimiento1MousePressed
       
    }//GEN-LAST:event_campo_fechaNacimiento1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPasswordField campo_contraseña;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_fechaNacimiento;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel cont_head;
    private javax.swing.JPanel cont_main;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_contraseña;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_fechaNacimiento;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
