
package administrador;

import utils.BaseDatos;


public class SemiNavsSede extends javax.swing.JPanel {

    BaseDatos basedatos = new BaseDatos();
    String cedula;
    String id_sede;
   
    public SemiNavsSede(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
        
        
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_registrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_verSedes = new javax.swing.JButton();
        btn_adjuntarVigilante = new javax.swing.JButton();
        panel_opciones = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 74, 173));

        btn_registrar.setBackground(new java.awt.Color(0, 74, 173));
        btn_registrar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(0, 74, 173));
        btn_editar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.setBorder(null);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(0, 74, 173));
        btn_eliminar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_verSedes.setBackground(new java.awt.Color(0, 74, 173));
        btn_verSedes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_verSedes.setForeground(new java.awt.Color(255, 255, 255));
        btn_verSedes.setText("Ver sedes");
        btn_verSedes.setBorder(null);
        btn_verSedes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_verSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verSedesActionPerformed(evt);
            }
        });

        btn_adjuntarVigilante.setBackground(new java.awt.Color(0, 74, 173));
        btn_adjuntarVigilante.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_adjuntarVigilante.setForeground(new java.awt.Color(255, 255, 255));
        btn_adjuntarVigilante.setText("Adjuntar Vigilante");
        btn_adjuntarVigilante.setBorder(null);
        btn_adjuntarVigilante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_adjuntarVigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adjuntarVigilanteActionPerformed(evt);
            }
        });

        panel_opciones.setBackground(new java.awt.Color(0, 74, 173));

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1131, Short.MAX_VALUE)
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btn_registrar)
                .addGap(60, 60, 60)
                .addComponent(btn_editar)
                .addGap(71, 71, 71)
                .addComponent(btn_eliminar)
                .addGap(67, 67, 67)
                .addComponent(btn_adjuntarVigilante)
                .addGap(51, 51, 51)
                .addComponent(btn_verSedes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_editar)
                    .addComponent(btn_registrar)
                    .addComponent(btn_adjuntarVigilante)
                    .addComponent(btn_verSedes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
   
        Panel_RegistroSede nuevo = new Panel_RegistroSede(basedatos);
 
        nuevo.setPreferredSize(panel_opciones.getPreferredSize());
        nuevo.setSize(panel_opciones.getSize());

        panel_opciones.removeAll();
  
        panel_opciones.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        //crear contenedor nuevo
        Panel_EliminarSede nuevo = new Panel_EliminarSede(id_sede, basedatos);
        //ajustar tamaño
        nuevo.setPreferredSize(panel_opciones.getPreferredSize());
        nuevo.setSize(panel_opciones.getSize());
        //eliminar contenido del content principal
        panel_opciones.removeAll();
        //agregar contenido listar
        panel_opciones.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_adjuntarVigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adjuntarVigilanteActionPerformed
        //crear contenedor nuevo
        Panel_AdjuntarVigilante nuevo = new Panel_AdjuntarVigilante(cedula, basedatos);
        //ajustar tamaño
        nuevo.setPreferredSize(panel_opciones.getPreferredSize());
        nuevo.setSize(panel_opciones.getSize());
        //eliminar contenido del content principal
        panel_opciones.removeAll();
        //agregar contenido listar
        panel_opciones.add(nuevo);
        repaint();
        revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_btn_adjuntarVigilanteActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       Panel_EditarSede nuevo = new Panel_EditarSede(id_sede, basedatos);
 
        nuevo.setPreferredSize(panel_opciones.getPreferredSize());
        nuevo.setSize(panel_opciones.getSize());

        panel_opciones.removeAll();
  
        panel_opciones.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_verSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verSedesActionPerformed
         Panel_ListaSedes nuevo = new Panel_ListaSedes(basedatos);
 
        nuevo.setPreferredSize(panel_opciones.getPreferredSize());
        nuevo.setSize(panel_opciones.getSize());

        panel_opciones.removeAll();
  
        panel_opciones.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_verSedesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adjuntarVigilante;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_verSedes;
    private javax.swing.JPanel panel_opciones;
    // End of variables declaration//GEN-END:variables
}
