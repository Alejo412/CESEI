
package administrador;
import alerta.Alerta;
import alerta.AlertaAccion;
import alerta.AlertaSiNo;
import utils.BaseDatos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import utils.Usuario;


public class Panel_RegistrarVigilante extends javax.swing.JPanel {

    BaseDatos basedatos;
    Boolean click;
    
    public Panel_RegistrarVigilante(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_main = new javax.swing.JPanel();
        campo_apellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        etq_apellido = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
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
        campo_contrasena = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        calender_elegirFecha = new com.toedter.calendar.JDateChooser();

        campo_apellido.setBackground(new java.awt.Color(242, 242, 242));
        campo_apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_apellido.setText("Apellido del vigilante");
        campo_apellido.setBorder(null);
        campo_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_apellidoMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        etq_apellido.setBackground(new java.awt.Color(0, 0, 0));
        etq_apellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_apellido.setText("Apellidos");

        campo_telefono.setBackground(new java.awt.Color(242, 242, 242));
        campo_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono.setText("Ingrese el teléfono");
        campo_telefono.setBorder(null);
        campo_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_telefonoMousePressed(evt);
            }
        });

        etq_fechaNacimiento.setBackground(new java.awt.Color(0, 0, 0));
        etq_fechaNacimiento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
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

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        campo_nombre.setBackground(new java.awt.Color(242, 242, 242));
        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setText("Nombre del vigilante");
        campo_nombre.setBorder(null);
        campo_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_nombreMousePressed(evt);
            }
        });

        etq_telefono.setBackground(new java.awt.Color(0, 0, 0));
        etq_telefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_telefono.setText("Telefono");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        etq_nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_nombre.setText("Nombres");

        etq_cedula.setBackground(new java.awt.Color(0, 0, 0));
        etq_cedula.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedula.setText("Cédula");

        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setText("Documento del vigilante");
        campo_cedula.setBorder(null);
        campo_cedula.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_cedula.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campo_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaMousePressed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        etq_correo.setBackground(new java.awt.Color(0, 0, 0));
        etq_correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_correo.setText("Correo");

        campo_correo.setBackground(new java.awt.Color(242, 242, 242));
        campo_correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_correo.setText("Correo del vigilante");
        campo_correo.setBorder(null);
        campo_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_correoMousePressed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        etq_contraseña.setBackground(new java.awt.Color(0, 0, 0));
        etq_contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_contraseña.setText("Contraseña");

        campo_contrasena.setBackground(new java.awt.Color(242, 242, 242));
        campo_contrasena.setBorder(null);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        calender_elegirFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calender_elegirFechaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout cont_mainLayout = new javax.swing.GroupLayout(cont_main);
        cont_main.setLayout(cont_mainLayout);
        cont_mainLayout.setHorizontalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mainLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_nombre)
                            .addComponent(campo_nombre)
                            .addComponent(jSeparator1)
                            .addComponent(etq_apellido)
                            .addComponent(campo_apellido)
                            .addComponent(jSeparator2)
                            .addComponent(etq_cedula)
                            .addComponent(campo_cedula)
                            .addComponent(jSeparator5)
                            .addComponent(etq_contraseña)
                            .addComponent(campo_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etq_telefono)
                                        .addComponent(campo_telefono)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etq_correo)
                                        .addComponent(campo_correo)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(etq_fechaNacimiento)
                                    .addComponent(calender_elegirFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))))
                .addContainerGap())
        );
        cont_mainLayout.setVerticalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
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
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_fechaNacimiento)
                        .addGap(8, 8, 8)
                        .addComponent(calender_elegirFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(cont_mainLayout.createSequentialGroup()
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
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addComponent(etq_contraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cont_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cont_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_apellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_apellidoMousePressed
        if (campo_apellido.getText().equals("Apellido del vigilante")) {
            campo_apellido.setText("");
            campo_apellido.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_apellidoMousePressed

    private void campo_telefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_telefonoMousePressed
         if (campo_telefono.getText().equals("Ingrese el teléfono")) {
            campo_telefono.setText("");
            campo_telefono.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_telefonoMousePressed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
    
    
    String nombre = campo_nombre.getText();
    String apellido = campo_apellido.getText();
    String cedula = campo_cedula.getText();
    String correo = campo_correo.getText();
    String telefono = campo_telefono.getText();
    SimpleDateFormat fecha_formateada = new SimpleDateFormat("yyyy-MM-dd");
    String fecha_nacimiento = (fecha_formateada.format(calender_elegirFecha.getCalendar().getTime()));
    String contrasena = campo_contrasena.getText();
    
         if( cedula.equals("") || nombre.equals("") || apellido.equals("") || telefono.equals("") || correo.equals("") || fecha_nacimiento.equals("") || contrasena.equals("")  ){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
           // Encriptar la contraseña utilizando el método getMD5
             String contrasenaEncriptada = getMD5(contrasena);
             
             
             
             
              AlertaAccion alertaRegistrar = new AlertaAccion("Vigilante registrada correctamente");
            if(click = true){
               basedatos.insertarUsuario(cedula, nombre, apellido, correo,  telefono, fecha_nacimiento, contrasenaEncriptada);
    
            }
            
            GuardarImagenBD guardarImagenBD = new GuardarImagenBD(cedula, basedatos);
             guardarImagenBD.setVisible(true);
             
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_cedula.setText("");
            campo_correo.setText("");
            campo_telefono.setText("");
            campo_contrasena.setText("");
            calender_elegirFecha.setDate(null);
            
            
         
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
            campo_nombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_nombreMousePressed

    private void campo_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaMousePressed
        if (campo_cedula.getText().equals("Documento del vigilante")) {
            campo_cedula.setText("");
            campo_cedula.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_cedulaMousePressed

    private void campo_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_correoMousePressed
        if (campo_correo.getText().equals("Correo del vigilante")) {
            campo_correo.setText("");
            campo_correo.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_correoMousePressed

    private void campo_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_fechaNacimiento1MousePressed
       
    }//GEN-LAST:event_campo_fechaNacimiento1MousePressed

    private void calender_elegirFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calender_elegirFechaPropertyChange
       
        //if(evt.getOldValue() != null){
        //    SimpleDateFormat fecha_formateada = new SimpleDateFormat("yyyy/mm/dd");
        //    campo_fechaNacimiento.setText(fecha_formateada.format(calender_elegirFecha.getCalendar().getTime()));    
        
        //}
    }//GEN-LAST:event_calender_elegirFechaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private com.toedter.calendar.JDateChooser calender_elegirFecha;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPasswordField campo_contrasena;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel cont_main;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_contraseña;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_fechaNacimiento;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
