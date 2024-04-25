
package alerta;

import java.awt.Image;
import javax.swing.ImageIcon;
import principal.Login;
import utils.BaseDatos;


public class AlertaSiNo extends javax.swing.JFrame {

    String texto;
    Boolean click;
    BaseDatos basedatos = new BaseDatos();
    public AlertaSiNo(String texto, Boolean click) {
        this.texto = texto;
        this.click = click;
        initComponents();
        initAlternComponents();
    }
    
     public void initAlternComponents(){
        setLocationRelativeTo(null);
        setVisible(true);
        
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_warning.png") ) );
        
        Image img_warning = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_warning.png") );
        img_warning = img_warning.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        etqImagen.setIcon(new ImageIcon(img_warning));
            
        etqtexto.setText(texto);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conte_alertaEliminar = new javax.swing.JPanel();
        etqImagen = new javax.swing.JLabel();
        etqtexto = new javax.swing.JLabel();
        btn_si = new javax.swing.JButton();
        btn_no = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conte_alertaEliminar.setBackground(new java.awt.Color(204, 204, 204));
        conte_alertaEliminar.setFocusTraversalPolicyProvider(true);

        etqtexto.setForeground(new java.awt.Color(0, 0, 0));

        btn_si.setBackground(new java.awt.Color(102, 102, 255));
        btn_si.setForeground(new java.awt.Color(255, 255, 255));
        btn_si.setText("Si");
        btn_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siActionPerformed(evt);
            }
        });

        btn_no.setBackground(new java.awt.Color(0, 0, 204));
        btn_no.setForeground(new java.awt.Color(255, 255, 255));
        btn_no.setText("No");
        btn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conte_alertaEliminarLayout = new javax.swing.GroupLayout(conte_alertaEliminar);
        conte_alertaEliminar.setLayout(conte_alertaEliminarLayout);
        conte_alertaEliminarLayout.setHorizontalGroup(
            conte_alertaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conte_alertaEliminarLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conte_alertaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conte_alertaEliminarLayout.createSequentialGroup()
                        .addComponent(etqtexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conte_alertaEliminarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(btn_si, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_no, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        conte_alertaEliminarLayout.setVerticalGroup(
            conte_alertaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conte_alertaEliminarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(conte_alertaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conte_alertaEliminarLayout.createSequentialGroup()
                        .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(conte_alertaEliminarLayout.createSequentialGroup()
                        .addComponent(etqtexto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(conte_alertaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_si)
                            .addComponent(btn_no))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte_alertaEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(conte_alertaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siActionPerformed
        click = true;
        cerrarSesion();
        dispose();
    }//GEN-LAST:event_btn_siActionPerformed

    private void btn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noActionPerformed
        click = false;
        dispose();
    }//GEN-LAST:event_btn_noActionPerformed

    
    private void cerrarSesion() {
    // Cerrar sesión y cerrar la ventana
    dispose(); // Cerrar la ventana
    Login cerrar = new Login(basedatos);
    this.dispose();
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_no;
    private javax.swing.JButton btn_si;
    private javax.swing.JPanel conte_alertaEliminar;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqtexto;
    // End of variables declaration//GEN-END:variables
}
