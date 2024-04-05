/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vigilante;

/**
 *
 * @author alejo
 */
public class Panel_Historialingresos extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Historialingresos
     */
    public Panel_Historialingresos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_Historialingresos = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_historialingresos = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        campo_id = new javax.swing.JTextField();
        userLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        campo_id1 = new javax.swing.JTextField();
        userLabel8 = new javax.swing.JLabel();

        contenedor_Historialingresos.setBackground(new java.awt.Color(0, 74, 173));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setText("Historial Ingresos");

        btn_buscar.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabla_historialingresos.setAutoCreateRowSorter(true);
        tabla_historialingresos.setBackground(new java.awt.Color(56, 128, 255));
        tabla_historialingresos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla_historialingresos.setForeground(new java.awt.Color(255, 255, 255));
        tabla_historialingresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Código-equipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_historialingresos);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        campo_id.setBackground(new java.awt.Color(0, 74, 173));
        campo_id.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_id.setForeground(new java.awt.Color(204, 204, 255));
        campo_id.setText("Buscar por Cédula");
        campo_id.setBorder(null);
        campo_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_idMousePressed(evt);
            }
        });

        userLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel7.setForeground(new java.awt.Color(255, 255, 255));
        userLabel7.setText("Cédula de usuario");

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        campo_id1.setBackground(new java.awt.Color(0, 74, 173));
        campo_id1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_id1.setForeground(new java.awt.Color(204, 204, 255));
        campo_id1.setText("Buscar por fecha");
        campo_id1.setBorder(null);
        campo_id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_id1MousePressed(evt);
            }
        });

        userLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel8.setForeground(new java.awt.Color(255, 255, 255));
        userLabel8.setText("Fecha");

        javax.swing.GroupLayout contenedor_HistorialingresosLayout = new javax.swing.GroupLayout(contenedor_Historialingresos);
        contenedor_Historialingresos.setLayout(contenedor_HistorialingresosLayout);
        contenedor_HistorialingresosLayout.setHorizontalGroup(
            contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_HistorialingresosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                                .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userLabel7)
                                    .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userLabel8)
                                    .addComponent(campo_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etq_titulo))
                        .addGap(88, 88, 88))))
        );
        contenedor_HistorialingresosLayout.setVerticalGroup(
            contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(etq_titulo)
                .addGap(18, 18, 18)
                .addComponent(userLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLabel8))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_Historialingresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_Historialingresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_idMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_idMousePressed

    private void campo_id1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_id1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_id1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField campo_id;
    private javax.swing.JTextField campo_id1;
    private javax.swing.JPanel contenedor_Historialingresos;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tabla_historialingresos;
    private javax.swing.JLabel userLabel7;
    private javax.swing.JLabel userLabel8;
    // End of variables declaration//GEN-END:variables
}
