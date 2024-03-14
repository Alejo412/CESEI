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
        etq_codigoEquipo = new javax.swing.JLabel();
        etq_asteriscoCodiigoEquipo = new javax.swing.JLabel();
        campo_codigoEquipo = new javax.swing.JTextField();
        btn_registrarSalida = new javax.swing.JButton();

        contenedor_registrarSalida.setBackground(new java.awt.Color(0, 74, 173));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
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

        etq_codigoEquipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_codigoEquipo.setForeground(new java.awt.Color(255, 255, 255));
        etq_codigoEquipo.setText("Código-Equipo");

        etq_asteriscoCodiigoEquipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_asteriscoCodiigoEquipo.setForeground(new java.awt.Color(204, 0, 0));
        etq_asteriscoCodiigoEquipo.setText("*");

        campo_codigoEquipo.setBackground(new java.awt.Color(102, 102, 255));
        campo_codigoEquipo.setForeground(new java.awt.Color(255, 255, 255));
        campo_codigoEquipo.setBorder(null);

        btn_registrarSalida.setBackground(new java.awt.Color(0, 191, 99));
        btn_registrarSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_registrarSalida.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarSalida.setText("Registrar Salida");

        javax.swing.GroupLayout contenedor_registrarSalidaLayout = new javax.swing.GroupLayout(contenedor_registrarSalida);
        contenedor_registrarSalida.setLayout(contenedor_registrarSalidaLayout);
        contenedor_registrarSalidaLayout.setHorizontalGroup(
            contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_cedula)
                            .addComponent(etq_codigoEquipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_asteriscoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_asteriscoCodiigoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_codigoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(etq_titulo)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(btn_registrarSalida)
                        .addGap(228, 228, 228))))
        );
        contenedor_registrarSalidaLayout.setVerticalGroup(
            contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(etq_titulo)
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_cedula)))
                    .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_asteriscoCedula)
                        .addGap(15, 15, 15)))
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_codigoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_codigoEquipo)))
                    .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(etq_asteriscoCodiigoEquipo)))
                .addGap(138, 138, 138)
                .addComponent(btn_registrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
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
    private javax.swing.JButton btn_registrarSalida;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_codigoEquipo;
    private javax.swing.JPanel contenedor_registrarSalida;
    private javax.swing.JLabel etq_asteriscoCedula;
    private javax.swing.JLabel etq_asteriscoCodiigoEquipo;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_codigoEquipo;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
