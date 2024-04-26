
package administrador;

import alerta.Alerta;
import alerta.AlertaAccion;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.Sede;
import utils.Usuario;
import utils.Usuario_Sede;


public class Panel_AdjuntarVigilante extends javax.swing.JPanel {

    Usuario usuario;
    Usuario_Sede usuarioSede;
    BaseDatos basedatos;
    Date fechaHora = new Date();
    Sede sede;
    String cedula;
    String fechaInicio = null;
    String fechaFin = null;

    
    public Panel_AdjuntarVigilante(String cedula, BaseDatos basedatos) {
        this.cedula = cedula;
        this.basedatos = basedatos;
        this.fechaFin = null;
        initComponents();
        initAlternComponents();
    }
    
     public void initAlternComponents(){
        
        Image img_warning = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/cesei_logoNuevo.png") );
        img_warning = img_warning.getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
        etq_fotoVigilante.setIcon(new ImageIcon(img_warning));
        
         Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/cesei_logoNuevo.png"));
        icono_registro = icono_registro.getScaledInstance(80, 84, Image.SCALE_SMOOTH);
        etq_fotoVigilante.setIcon(new ImageIcon(icono_registro));
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        cont_main = new javax.swing.JPanel();
        etq_fechaNacimiento = new javax.swing.JLabel();
        campo_cedulaVigilante = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        etq_vigilante = new javax.swing.JLabel();
        etq_cedulaVigilante = new javax.swing.JLabel();
        campo_IdSede = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        etq_nombre = new javax.swing.JLabel();
        etq_Nsede = new javax.swing.JLabel();
        btn_adjuntar = new javax.swing.JButton();
        etq_apellido = new javax.swing.JLabel();
        userLabel3 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        campo_nombre = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        campo_Fnacimiento = new javax.swing.JTextField();
        campo_correo = new javax.swing.JTextField();
        btn_desajuntar = new javax.swing.JButton();
        etq_sedesAcargo = new javax.swing.JLabel();
        campo_sedesAcargo = new javax.swing.JTextField();
        etq_fotoVigilante = new javax.swing.JLabel();

        jButton2.setBackground(new java.awt.Color(0, 74, 173));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cont_main.setBackground(new java.awt.Color(242, 242, 242));
        cont_main.setForeground(new java.awt.Color(0, 0, 0));

        etq_fechaNacimiento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_fechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        etq_fechaNacimiento.setText("Fecha de nacimiento: ");

        campo_cedulaVigilante.setBackground(new java.awt.Color(242, 242, 242));
        campo_cedulaVigilante.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedulaVigilante.setForeground(new java.awt.Color(0, 0, 0));
        campo_cedulaVigilante.setText("Ingrese cédula");
        campo_cedulaVigilante.setBorder(null);
        campo_cedulaVigilante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaVigilanteMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        etq_vigilante.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        etq_vigilante.setForeground(new java.awt.Color(51, 51, 51));
        etq_vigilante.setText("Vigilante");

        etq_cedulaVigilante.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedulaVigilante.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedulaVigilante.setText("Cédula del vigilante");

        campo_IdSede.setBackground(new java.awt.Color(242, 242, 242));
        campo_IdSede.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_IdSede.setForeground(new java.awt.Color(0, 0, 0));
        campo_IdSede.setText("Ingrese ID de la sede");
        campo_IdSede.setBorder(null);
        campo_IdSede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_IdSedeMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        etq_nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setText("Nombres:");

        etq_Nsede.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_Nsede.setForeground(new java.awt.Color(0, 0, 0));
        etq_Nsede.setText("N° Sede");

        btn_adjuntar.setBackground(new java.awt.Color(0, 191, 99));
        btn_adjuntar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_adjuntar.setForeground(new java.awt.Color(255, 255, 255));
        btn_adjuntar.setText("Adjuntar");
        btn_adjuntar.setBorder(null);
        btn_adjuntar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_adjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adjuntarActionPerformed(evt);
            }
        });

        etq_apellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_apellido.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellido.setText("Apellidos:");

        userLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel3.setForeground(new java.awt.Color(0, 0, 0));
        userLabel3.setText("Correo:");

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

        campo_nombre.setBackground(new java.awt.Color(242, 242, 242));
        campo_nombre.setForeground(new java.awt.Color(0, 0, 0));
        campo_nombre.setBorder(null);

        campo_apellido.setBackground(new java.awt.Color(242, 242, 242));
        campo_apellido.setForeground(new java.awt.Color(0, 0, 0));
        campo_apellido.setBorder(null);

        campo_Fnacimiento.setBackground(new java.awt.Color(242, 242, 242));
        campo_Fnacimiento.setForeground(new java.awt.Color(0, 0, 0));
        campo_Fnacimiento.setBorder(null);

        campo_correo.setBackground(new java.awt.Color(242, 242, 242));
        campo_correo.setForeground(new java.awt.Color(0, 0, 0));
        campo_correo.setBorder(null);

        btn_desajuntar.setBackground(new java.awt.Color(255, 0, 0));
        btn_desajuntar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_desajuntar.setForeground(new java.awt.Color(255, 255, 255));
        btn_desajuntar.setText("Desajuntar");
        btn_desajuntar.setBorder(null);
        btn_desajuntar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_desajuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desajuntarActionPerformed(evt);
            }
        });

        etq_sedesAcargo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_sedesAcargo.setForeground(new java.awt.Color(0, 0, 0));
        etq_sedesAcargo.setText("Sedes a cargo: ");

        campo_sedesAcargo.setBackground(new java.awt.Color(242, 242, 242));
        campo_sedesAcargo.setForeground(new java.awt.Color(0, 0, 0));
        campo_sedesAcargo.setBorder(null);

        javax.swing.GroupLayout cont_mainLayout = new javax.swing.GroupLayout(cont_main);
        cont_main.setLayout(cont_mainLayout);
        cont_mainLayout.setHorizontalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mainLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_Nsede)
                        .addComponent(campo_IdSede)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_cedulaVigilante)
                            .addComponent(campo_cedulaVigilante)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(etq_vigilante)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(etq_fotoVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addComponent(etq_fechaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_Fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addComponent(etq_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_apellido)
                                    .addComponent(userLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addComponent(etq_sedesAcargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_sedesAcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_adjuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_desajuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        cont_mainLayout.setVerticalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mainLayout.createSequentialGroup()
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addComponent(etq_cedulaVigilante)
                                .addGap(18, 18, 18)
                                .addComponent(campo_cedulaVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(etq_Nsede)
                        .addGap(18, 18, 18)
                        .addComponent(campo_IdSede, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont_mainLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_fotoVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cont_mainLayout.createSequentialGroup()
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etq_nombre)
                                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etq_apellido)
                                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(userLabel3)
                                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etq_fechaNacimiento)
                                    .addComponent(campo_Fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etq_sedesAcargo)
                                    .addComponent(campo_sedesAcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(etq_vigilante)))
                .addGap(54, 54, 54)
                .addGroup(cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adjuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_desajuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cont_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_cedulaVigilanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaVigilanteMousePressed
         if (campo_cedulaVigilante.getText().equals("Ingrese cédula")) {
            campo_cedulaVigilante.setText("");
            campo_cedulaVigilante.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_cedulaVigilanteMousePressed

    private void campo_IdSedeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_IdSedeMousePressed
         if (campo_IdSede.getText().equals("Ingrese ID de la sede")) {
            campo_IdSede.setText("");
            campo_IdSede.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_IdSedeMousePressed

    private void btn_adjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adjuntarActionPerformed
        
        String cedulaVigilante = campo_cedulaVigilante.getText();
        String IdSede = campo_IdSede.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaInicio = sdf.format(fechaHora);
        
        
        
         if( cedulaVigilante.equals("") || IdSede.equals(" ")){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
             basedatos.insertarUsuario_Sede(cedulaVigilante, IdSede, fechaInicio, fechaFin );
             AlertaAccion alertaEditar = new AlertaAccion("Vigilante Adjuntado correctamente");
           
         }
        
    }//GEN-LAST:event_btn_adjuntarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String cedulaVigilante = campo_cedulaVigilante.getText();
        if( cedulaVigilante.equals("")){
            Alerta ventana = new Alerta("La cédula del vigilante es obligatoria.");
        }else{
            
            usuario = basedatos.buscarusuario(cedulaVigilante);
            if(usuario != null){
                String nombre = usuario.getNombres();
                String apellido = usuario.getApellidos();
                String correo = usuario.getEmail();
                String fechaNacimiento = usuario.getFecha_nacimiento();
                sede = basedatos.buscarSedesAcargo(cedulaVigilante);
                if(sede != null){
                    campo_sedesAcargo.setText(sede.getDireccion());
                }else{
                    campo_sedesAcargo.setText("Ninguna");
                }
          
                campo_nombre.setText(nombre);
                campo_apellido.setText(apellido);
                campo_correo.setText(correo);
                campo_Fnacimiento.setText(fechaNacimiento);
            
            
                Image foto_perfil = usuario.getFoto();
                if (foto_perfil != null) {
                   foto_perfil = foto_perfil.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(foto_perfil);
                     etq_fotoVigilante.setIcon(icono);  
                } else {
                    System.out.println("La foto de perfil está en null");
                }
            
            }else{
                System.out.println("Usuario es null");
            }
            
            
        
        }
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_desajuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desajuntarActionPerformed
        String cedulaVigilante = campo_cedulaVigilante.getText();
        String IdSede = campo_IdSede.getText();
        
        if( cedulaVigilante.equals("") || IdSede.equals(" ")){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
            usuarioSede = basedatos.validarUsuario_Sede(cedulaVigilante);
            if(usuarioSede.getFecha_fin() == null){
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String fechaFin = sdf.format(fechaHora);
                
                Boolean editarFechaFin = basedatos.editarFechaFinUsuario_Sede(cedulaVigilante, IdSede, fechaFin);
                
                 if(editarFechaFin == true){
                    System.out.println("Se edito fechafin exitosasmente");
                    AlertaAccion alertaEditar = new AlertaAccion("Vigilante ha terminado turno");
           
                }else{
                    System.out.println("No se edito fechafin");
           }
                
                
            }
            
             
         }
        

    }//GEN-LAST:event_btn_desajuntarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adjuntar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_desajuntar;
    private javax.swing.JTextField campo_Fnacimiento;
    private javax.swing.JTextField campo_IdSede;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedulaVigilante;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_sedesAcargo;
    private javax.swing.JPanel cont_main;
    private javax.swing.JLabel etq_Nsede;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_cedulaVigilante;
    private javax.swing.JLabel etq_fechaNacimiento;
    private javax.swing.JLabel etq_fotoVigilante;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_sedesAcargo;
    private javax.swing.JLabel etq_vigilante;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel userLabel3;
    // End of variables declaration//GEN-END:variables
}
