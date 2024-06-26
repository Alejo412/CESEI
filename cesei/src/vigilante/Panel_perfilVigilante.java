
package vigilante;

import alerta.AlertaSiNo;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import principal.Login;
import utils.BaseDatos;
import utils.Usuario;


public class Panel_perfilVigilante extends javax.swing.JPanel {

    BaseDatos basedatos;
    Usuario usuarioValidado;
    String cedula;
    Boolean click = false;
    JFrame frame;
    
    public Panel_perfilVigilante(String cedula, BaseDatos basedatos, JFrame frame ) {
        this.basedatos=basedatos;
        this.cedula=cedula;
        this.frame = frame;
      
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
                foto_perfil = foto_perfil.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(foto_perfil);

                
                    etq_fotoVigilante.setIcon(icono);
                
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
        jButton1 = new javax.swing.JButton();

        contenedor.setBackground(new java.awt.Color(242, 242, 242));
        contenedor.setForeground(new java.awt.Color(255, 255, 255));

        campo_telefono.setBackground(new java.awt.Color(242, 242, 242));
        campo_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono.setForeground(new java.awt.Color(0, 0, 0));
        campo_telefono.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        etq_fechaNacimiento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_fechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        etq_fechaNacimiento.setText("Fecha de nacimiento");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        campo_nombre.setBackground(new java.awt.Color(242, 242, 242));
        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(0, 0, 0));
        campo_nombre.setBorder(null);

        etq_telefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(0, 0, 0));
        etq_telefono.setText("Telefono");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        etq_nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setText("Nombre");

        campo_apellidos.setBackground(new java.awt.Color(242, 242, 242));
        campo_apellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        campo_apellidos.setBorder(null);
        campo_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_apellidosActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        etq_apellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_apellido.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellido.setText("Apellido");

        campo_fecha_nacimiento.setBackground(new java.awt.Color(242, 242, 242));
        campo_fecha_nacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_fecha_nacimiento.setForeground(new java.awt.Color(0, 0, 0));
        campo_fecha_nacimiento.setBorder(null);

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setText("Vigilante");

        campo_correo.setBackground(new java.awt.Color(242, 242, 242));
        campo_correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_correo.setForeground(new java.awt.Color(0, 0, 0));
        campo_correo.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        etq_correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(0, 0, 0));
        etq_correo.setText("Correo");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_fotoVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                                    .addComponent(etq_telefono)
                                    .addGap(157, 157, 157))
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(etq_fotoVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       frame.dispose(); // Cerrar la ventana
        Login cerrar = new Login(basedatos);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    


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
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
