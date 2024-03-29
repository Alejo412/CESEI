/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

/**
 *
 * @author alejo
 */
public class Panel_RegistrarSalida extends javax.swing.JPanel {

    /**
     * Creates new form Panel_RegistrarSalida
     */
    public Panel_RegistrarSalida() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        contenedor_registrarSalida = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        etq_asteriscoCedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        btn_buscarPc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_computador = new javax.swing.JTable();
        btn_registrarSalida = new javax.swing.JButton();

        contenedor_registrarSalida.setBackground(new java.awt.Color(0, 74, 173));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Registrar Salida");

        etq_cedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedula.setText("Cédula");

        etq_asteriscoCedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_asteriscoCedula.setForeground(new java.awt.Color(255, 0, 0));
        etq_asteriscoCedula.setText("*");

        campo_cedula.setBackground(new java.awt.Color(102, 102, 255));
        campo_cedula.setForeground(new java.awt.Color(255, 255, 255));
        campo_cedula.setBorder(null);

        btn_buscarPc.setBackground(new java.awt.Color(102, 0, 0));
        btn_buscarPc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscarPc.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarPc.setText("Buscar pc");
        btn_buscarPc.setToolTipText("");

        tabla_computador.setBackground(new java.awt.Color(56, 128, 255));
        tabla_computador.setForeground(new java.awt.Color(255, 255, 255));
        tabla_computador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código_equipo", "Marca", "Persona", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_computador);

        btn_registrarSalida.setBackground(new java.awt.Color(102, 0, 0));
        btn_registrarSalida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_registrarSalida.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarSalida.setText("Registrar Salida");

        javax.swing.GroupLayout contenedor_registrarSalidaLayout = new javax.swing.GroupLayout(contenedor_registrarSalida);
        contenedor_registrarSalida.setLayout(contenedor_registrarSalidaLayout);
        contenedor_registrarSalidaLayout.setHorizontalGroup(
            contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(etq_cedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_asteriscoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btn_buscarPc)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(etq_titulo)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(btn_registrarSalida)
                        .addGap(222, 222, 222))))
        );
        contenedor_registrarSalidaLayout.setVerticalGroup(
            contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(etq_asteriscoCedula)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_cedula)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarPc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_registrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_registrarSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_registrarSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarPc;
    private javax.swing.JButton btn_registrarSalida;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPanel contenedor_registrarSalida;
    private javax.swing.JLabel etq_asteriscoCedula;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_computador;
    // End of variables declaration//GEN-END:variables
}
