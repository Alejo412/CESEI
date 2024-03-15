
package admin;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import admin.SemiNavs;


public class Menu_Admin extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Menu_Admin() {
        initComponents();
        setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_usuario.png"));
        icono_registro = icono_registro.getScaledInstance(130, 114, Image.SCALE_SMOOTH);
        imgUsuario.setIcon(new ImageIcon(icono_registro));
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_usuario.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        nav_Principal = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        btnSede = new javax.swing.JButton();
        btnVigilante = new javax.swing.JButton();
        imgUsuario = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();
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
        setUndecorated(true);
        setResizable(false);

        header.setBackground(new java.awt.Color(56, 128, 255));
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

        nav_Principal.setBackground(new java.awt.Color(56, 128, 255));

        etq_titulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CESEILOGO.png"))); // NOI18N

        btnSede.setBackground(new java.awt.Color(56, 128, 255));
        btnSede.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnSede.setForeground(new java.awt.Color(255, 255, 255));
        btnSede.setText("SEDES");
        btnSede.setBorder(null);
        btnSede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSedeActionPerformed(evt);
            }
        });

        btnVigilante.setBackground(new java.awt.Color(56, 128, 255));
        btnVigilante.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
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
                .addGap(30, 30, 30)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(btnSede)
                .addGap(74, 74, 74)
                .addComponent(btnVigilante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        nav_PrincipalLayout.setVerticalGroup(
            nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav_PrincipalLayout.createSequentialGroup()
                .addGroup(nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(nav_PrincipalLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(nav_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSede)
                            .addComponent(btnVigilante)))
                    .addGroup(nav_PrincipalLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitTxt.setBackground(new java.awt.Color(56, 128, 255));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(255, 255, 255));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setOpaque(true);
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                exitTxtMouseDragged(evt);
            }
        });
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitTxtMousePressed(evt);
            }
        });

        ventana_emergente.setBackground(new java.awt.Color(0, 74, 173));

        javax.swing.GroupLayout ventana_emergenteLayout = new javax.swing.GroupLayout(ventana_emergente);
        ventana_emergente.setLayout(ventana_emergenteLayout);
        ventana_emergenteLayout.setHorizontalGroup(
            ventana_emergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ventana_emergenteLayout.setVerticalGroup(
            ventana_emergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(ventana_emergente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nav_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ventana_emergente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSedeActionPerformed
        //crear contenedor nuevo
        SemiNavs nuevo = new SemiNavs();
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

    private void exitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMousePressed
        
    }//GEN-LAST:event_exitTxtMousePressed

    private void exitTxtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseDragged
        
    }//GEN-LAST:event_exitTxtMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitTxt.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitTxt.setBackground(new Color(56,128,255));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMouseMoved

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void btnVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVigilanteActionPerformed
         //crear contenedor nuevo
        SemiNavsVigilantes nuevo = new SemiNavsVigilantes();
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

    private void imgUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUsuarioMouseClicked
          //crear contenedor nuevo
        Perfil_admin nuevo = new Perfil_admin();
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

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSede;
    private javax.swing.JButton btnVigilante;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel nav_Principal;
    private javax.swing.JPanel ventana_emergente;
    // End of variables declaration//GEN-END:variables
}
