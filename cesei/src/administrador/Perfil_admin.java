
package administrador;

import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.Usuario;

public class Perfil_admin extends javax.swing.JPanel {

    
    Usuario usuarioValidado;
    BaseDatos basedatos;
    String cedula;
    
   
    public Perfil_admin(String cedula, BaseDatos basedatos) {
         this.basedatos=basedatos;
        this.cedula=cedula;
        initComponents();
        initAlternComponents();
    }
    
    
    
    
    public void initAlternComponents(){
        
        usuarioValidado = basedatos.validarIngreso(cedula);
        
        if (usuarioValidado != null) {
            String nombres = usuarioValidado.getNombres();
            String apellidos = usuarioValidado.getApellidos();
            String correo = usuarioValidado.getEmail();
            String telefono = usuarioValidado.getTelefono();
            String fecha_nacimiento = usuarioValidado.getFecha_nacimiento();

            campo_nombre.setText(nombres);
            campo_apellidos.setText(apellidos);
            campo_correo.setText(correo);
            campo_telefono.setText(telefono);
            campo_fecha_nacimiento.setText(fecha_nacimiento);

            Image foto_perfil = usuarioValidado.getFoto();
            if (foto_perfil != null) {
                foto_perfil = foto_perfil.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(foto_perfil);

                // Asegúrate de que esta operación de interfaz de usuario se realice en el hilo de despacho de eventos de Swing
                //SwingUtilities.invokeLater(() -> {
                    etq_fotoAdmin.setIcon(icono);
                
            } else {
                System.out.println("La foto de perfil está en null");
            }
        } else {
            System.out.println("No se encontró el usuario");
            // Manejar el caso en el que no se encuentra el usuario
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etq_fechaNacimiento = new javax.swing.JLabel();
        etq_fotoAdmin = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        campo_correo = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        etq_telefono = new javax.swing.JLabel();
        etq_correo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etq_nombre = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        etq_apellido = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        campo_fecha_nacimiento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(56, 128, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Perfil Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 74, 173));

        etq_fechaNacimiento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_fechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        etq_fechaNacimiento.setText("Fecha de nacimiento");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        campo_correo.setBackground(new java.awt.Color(0, 74, 173));
        campo_correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_correo.setForeground(new java.awt.Color(204, 204, 255));
        campo_correo.setBorder(null);

        campo_nombre.setBackground(new java.awt.Color(0, 74, 173));
        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(204, 204, 255));
        campo_nombre.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        etq_telefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("Telefono");

        etq_correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(255, 255, 255));
        etq_correo.setText("Correo");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        etq_nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setText("Nombre");

        campo_apellidos.setBackground(new java.awt.Color(0, 74, 173));
        campo_apellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_apellidos.setForeground(new java.awt.Color(204, 204, 255));
        campo_apellidos.setBorder(null);
        campo_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_apellidosActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        etq_apellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_apellido.setForeground(new java.awt.Color(255, 255, 255));
        etq_apellido.setText("Apellido");

        campo_telefono.setBackground(new java.awt.Color(0, 74, 173));
        campo_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono.setForeground(new java.awt.Color(204, 204, 255));
        campo_telefono.setBorder(null);

        campo_fecha_nacimiento.setBackground(new java.awt.Color(0, 74, 173));
        campo_fecha_nacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_fecha_nacimiento.setForeground(new java.awt.Color(204, 204, 255));
        campo_fecha_nacimiento.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(etq_fotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(etq_telefono)
                            .addGap(245, 245, 245))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_nombre)
                        .addComponent(etq_apellido)
                        .addComponent(jSeparator1)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etq_fechaNacimiento)
                        .addComponent(jSeparator2)
                        .addComponent(campo_fecha_nacimiento)
                        .addComponent(jSeparator3)
                        .addComponent(campo_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(etq_correo)
                        .addComponent(campo_correo)
                        .addComponent(jSeparator5))
                    .addContainerGap(167, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(etq_nombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(etq_apellido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(etq_fechaNacimiento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(etq_correo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_fotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(etq_telefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_apellidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_fecha_nacimiento;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_fechaNacimiento;
    private javax.swing.JLabel etq_fotoAdmin;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
