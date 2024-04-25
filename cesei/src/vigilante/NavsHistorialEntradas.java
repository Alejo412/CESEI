
package vigilante;

import utils.BaseDatos;


public class NavsHistorialEntradas extends javax.swing.JPanel {

    BaseDatos basedatos;
    String cedula;
    public NavsHistorialEntradas(String cedula, BaseDatos basedatos) {
        this.basedatos = basedatos;
        this.cedula = cedula;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_porFecha = new javax.swing.JButton();
        btn_porCedula = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        panel_opciones = new javax.swing.JPanel();

        setBackground(new java.awt.Color(242, 242, 242));

        btn_porFecha.setBackground(new java.awt.Color(242, 242, 242));
        btn_porFecha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_porFecha.setText("Buscar por fecha");
        btn_porFecha.setBorder(null);
        btn_porFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_porFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porFechaActionPerformed(evt);
            }
        });

        btn_porCedula.setBackground(new java.awt.Color(242, 242, 242));
        btn_porCedula.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_porCedula.setText("Buscar por cédula");
        btn_porCedula.setBorder(null);
        btn_porCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_porCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porCedulaActionPerformed(evt);
            }
        });

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setText("Historial Ingresos");

        panel_opciones.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btn_porCedula)
                        .addGap(118, 118, 118)
                        .addComponent(btn_porFecha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(etq_titulo)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addComponent(panel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(etq_titulo)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_porCedula)
                    .addComponent(btn_porFecha))
                .addGap(18, 18, 18)
                .addComponent(panel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_porFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porFechaActionPerformed
        
         Panel_HistorialXfecha nuevo = new Panel_HistorialXfecha(cedula, basedatos);

        nuevo.setPreferredSize(panel_opciones.getPreferredSize());
        nuevo.setSize(panel_opciones.getSize());

        panel_opciones.removeAll();

        panel_opciones.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_porFechaActionPerformed

    private void btn_porCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porCedulaActionPerformed

      
        Panel_HistorialXcedula nuevo = new Panel_HistorialXcedula(cedula, basedatos);

        nuevo.setPreferredSize(panel_opciones.getPreferredSize());
        nuevo.setSize(panel_opciones.getSize());

        panel_opciones.removeAll();

        panel_opciones.add(nuevo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_porCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_porCedula;
    private javax.swing.JButton btn_porFecha;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel panel_opciones;
    // End of variables declaration//GEN-END:variables
}
