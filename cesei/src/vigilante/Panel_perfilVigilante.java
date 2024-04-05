
package vigilante;

import java.awt.Color;
import utils.BaseDatos;
import utils.Usuario;


public class Panel_perfilVigilante extends javax.swing.JPanel {

    BaseDatos basedatos;
    Usuario usuario;
    String cedula;
    String password;
    
   
    public Panel_perfilVigilante(String cedula, String password, BaseDatos basedatos) {
        this.basedatos=basedatos;
        this.cedula=cedula;
        this.password=password;
        initComponents();
        initAleternComponents();
    }
    
    public void initAleternComponents(){
        
        usuario = basedatos.validarIngreso(cedula, password);
        
        String nombres = usuario.getNombres();
        String apellidos = usuario.getApellidos();
        String correo = usuario.getEmail();
        String telefono = usuario.getTelefono();
        String fecha_nacimiento = usuario.getFecha_nacimiento();
        
       
      
        campo_nombre.setText(nombres);
        campo_apellidos.setText(apellidos);
        campo_correo.setText(correo);
        campo_telefono.setText(telefono);
        campo_fecha_nacimiento.setText(fecha_nacimiento);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        campo_telefono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        etq_fechaNacimiento = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        campo_nombre = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etq_nombre = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        etq_apellido = new javax.swing.JLabel();
        campo_fecha_nacimiento = new javax.swing.JTextField();
        etq_titulo = new javax.swing.JLabel();
        etq_fotoVigilante = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        etq_correo = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(0, 74, 173));
        contenedor.setForeground(new java.awt.Color(255, 255, 255));

        campo_telefono.setBackground(new java.awt.Color(0, 74, 173));
        campo_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono.setForeground(new java.awt.Color(204, 204, 255));
        campo_telefono.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        etq_fechaNacimiento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_fechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        etq_fechaNacimiento.setText("Fecha de nacimiento");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        campo_nombre.setBackground(new java.awt.Color(0, 74, 173));
        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(204, 204, 255));
        campo_nombre.setBorder(null);

        etq_telefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("Telefono");

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

        campo_fecha_nacimiento.setBackground(new java.awt.Color(0, 74, 173));
        campo_fecha_nacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_fecha_nacimiento.setForeground(new java.awt.Color(204, 204, 255));
        campo_fecha_nacimiento.setBorder(null);

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setText("Vigilante");

        campo_correo.setBackground(new java.awt.Color(0, 74, 173));
        campo_correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_correo.setForeground(new java.awt.Color(204, 204, 255));
        campo_correo.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        etq_correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(255, 255, 255));
        etq_correo.setText("Correo");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(etq_fotoVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addComponent(etq_telefono)
                        .addGap(245, 245, 245))
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_nombre)
                    .addComponent(etq_apellido)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etq_fechaNacimiento)
                    .addComponent(jSeparator2)
                    .addComponent(campo_fecha_nacimiento)
                    .addComponent(jSeparator3)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(etq_correo)
                    .addComponent(campo_correo)
                    .addComponent(jSeparator5))
                .addGap(73, 73, 73))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(etq_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(etq_titulo)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
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
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_fotoVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_fechaNacimiento;
    private javax.swing.JLabel etq_fotoVigilante;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
