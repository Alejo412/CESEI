
package administrador;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import administrador.SemiNavsSede;
import administrador.Perfil_admin;
import administrador.SemiNavsSede;
import javax.swing.JFrame;
import utils.BaseDatos;
import administrador.Panel_RegistrarVigilante;


public class Menu_Admin extends javax.swing.JFrame {

    
    int xMouse, yMouse;
    BaseDatos basedatos = new BaseDatos();
    String cedulaAdmin;
   
    public Menu_Admin(String cedulaAdmin, BaseDatos basedatos) {
        this.cedulaAdmin = cedulaAdmin;
        this.basedatos=basedatos;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        initAlternComponents();
        
        
        
        
    }
    
    public void initAlternComponents(){
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/logofinal.png") ) );
        
        Image img_warning = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/logofinal.png") );
        img_warning = img_warning.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(img_warning));
        
        Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_perfil_slta.png"));
        icono_registro = icono_registro.getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        imgUsuario.setIcon(new ImageIcon(icono_registro));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        nav_Principal = new javax.swing.JPanel();
        btnSede = new javax.swing.JButton();
        btnVigilante = new javax.swing.JButton();
        imgUsuario = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        ventana_emergente = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                headerMouseMoved(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        nav_Principal.setBackground(new java.awt.Color(0, 0, 0));

        btnSede.setBackground(new java.awt.Color(0, 0, 0));
        btnSede.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        btnSede.setForeground(new java.awt.Color(255, 255, 255));
        btnSede.setText("SEDES");
        btnSede.setBorder(null);
        btnSede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSedeActionPerformed(evt);
            }
        });

        btnVigilante.setBackground(new java.awt.Color(0, 0, 0));
        btnVigilante.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        btnVigilante.setForeground(new java.awt.Color(255, 255, 255));
        btnVigilante.setText("VIGILANTES");
        btnVigilante.setBorder(null);
        btnVigilante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVigilanteActionPerformed(evt);
            }
        });

        imgUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nav_PrincipalLayout = new javax.swing.GroupLayout(nav_Principal);
        nav_Principal.setLayout(nav_PrincipalLayout);
        nav_PrincipalLayout.setHorizontalGroup(
            nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav_PrincipalLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(btnSede, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btnVigilante)
                .addGap(127, 127, 127)
                .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        nav_PrincipalLayout.setVerticalGroup(
            nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav_PrincipalLayout.createSequentialGroup()
                .addGroup(nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(nav_PrincipalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSede, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout ventana_emergenteLayout = new javax.swing.GroupLayout(ventana_emergente);
        ventana_emergente.setLayout(ventana_emergenteLayout);
        ventana_emergenteLayout.setHorizontalGroup(
            ventana_emergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ventana_emergenteLayout.setVerticalGroup(
            ventana_emergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ventana_emergente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nav_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nav_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventana_emergente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMouseClicked

    private void headerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMouseMoved

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void imgUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUsuarioMouseClicked
        //crear contenedor nuevo
        Perfil_admin nuevo = new Perfil_admin(cedulaAdmin, basedatos, this);
        //ajustar tamaño
        nuevo.setPreferredSize(ventana_emergente.getPreferredSize());
        nuevo.setSize(ventana_emergente.getSize());
        //eliminar contenido del content principal
        ventana_emergente.removeAll();
        //agregar contenido listar
        ventana_emergente.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_imgUsuarioMouseClicked

    private void btnVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVigilanteActionPerformed
        //crear contenedor nuevo
        SemiNavsVigilantes nuevo = new SemiNavsVigilantes(basedatos);
        //ajustar tamaño
        nuevo.setPreferredSize(ventana_emergente.getPreferredSize());
        nuevo.setSize(ventana_emergente.getSize());
        //eliminar contenido del content principal
        ventana_emergente.removeAll();
        //agregar contenido listar
        ventana_emergente.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnVigilanteActionPerformed

    private void btnSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSedeActionPerformed
        //crear contenedor nuevo
        SemiNavsSede nuevo = new SemiNavsSede(basedatos);
        //ajustar tamaño
        nuevo.setPreferredSize(ventana_emergente.getPreferredSize());
        nuevo.setSize(ventana_emergente.getSize());
        //eliminar contenido del content principal
        ventana_emergente.removeAll();
        //agregar contenido listar
        ventana_emergente.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnSedeActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSede;
    private javax.swing.JButton btnVigilante;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel nav_Principal;
    private javax.swing.JPanel ventana_emergente;
    // End of variables declaration//GEN-END:variables
}
