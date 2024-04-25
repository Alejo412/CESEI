
package vigilante;

import alerta.Alerta;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona_computador;


public class Panel_HistorialXcedula extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    BaseDatos basedatos;
    String cedula;
    Persona_computador listadoXcedula [];
    public Panel_HistorialXcedula(String cedula, BaseDatos basedatos) {
        this.basedatos = basedatos;
        this.cedula = cedula;
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        
        setVisible(true);
        modelo = (DefaultTableModel) tabla_historialingresos.getModel();
        
        tabla_historialingresos.getColumnModel().getColumn(0).setPreferredWidth(90);
        tabla_historialingresos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla_historialingresos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_historialingresos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_historialingresos.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        
        
        
        tabla_historialingresos.getTableHeader().setReorderingAllowed(false);
        tabla_historialingresos.getTableHeader().setResizingAllowed(false);
        
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_historialingresos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_historialingresos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        
        tabla_historialingresos.setRowHeight(20);
    }


   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_Historialingresos = new javax.swing.JPanel();
        btn_buscarXcedula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_historialingresos = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        campo_cedula = new javax.swing.JTextField();
        etq_cedula = new javax.swing.JLabel();

        contenedor_Historialingresos.setBackground(new java.awt.Color(242, 242, 242));

        btn_buscarXcedula.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscarXcedula.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_buscarXcedula.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarXcedula.setText("Buscar");
        btn_buscarXcedula.setBorder(null);
        btn_buscarXcedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarXcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarXcedulaActionPerformed(evt);
            }
        });

        tabla_historialingresos.setAutoCreateRowSorter(true);
        tabla_historialingresos.setBackground(new java.awt.Color(204, 204, 204));
        tabla_historialingresos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla_historialingresos.setForeground(new java.awt.Color(0, 0, 0));
        tabla_historialingresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Persona", "Código-equipo", "Fecha Ingreso", "Fecha Salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_historialingresos);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        campo_cedula.setBackground(new java.awt.Color(242, 242, 242));
        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setForeground(new java.awt.Color(0, 0, 0));
        campo_cedula.setText("Buscar por cedula");
        campo_cedula.setBorder(null);
        campo_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaMousePressed(evt);
            }
        });

        etq_cedula.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedula.setText("Cédula de usuario");

        javax.swing.GroupLayout contenedor_HistorialingresosLayout = new javax.swing.GroupLayout(contenedor_Historialingresos);
        contenedor_Historialingresos.setLayout(contenedor_HistorialingresosLayout);
        contenedor_HistorialingresosLayout.setHorizontalGroup(
            contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_HistorialingresosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_cedula)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_buscarXcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        contenedor_HistorialingresosLayout.setVerticalGroup(
            contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(etq_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarXcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
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

   
    private void campo_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaMousePressed
       if (campo_cedula.getText().equals("Buscar por cedula")) {
            campo_cedula.setText("");
            campo_cedula.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_cedulaMousePressed

     public void imprimirListadoXcedula(){
     modelo.setRowCount(0);
     cedula = campo_cedula.getText();
     listadoXcedula = basedatos.extraerIngresosXcedula(cedula);
     
        if(listadoXcedula != null && listadoXcedula.length > 0){
            for(int i = 0; i < listadoXcedula.length; i++){
                if(listadoXcedula[i] != null){
                String id_ingreso = listadoXcedula[i].getId_ingreso();
                String id_persona = listadoXcedula[i].getId_persona();
                String codigoPc = listadoXcedula[i].getCodigo_eqipo();
                String fecha_ingreso = listadoXcedula[i].getFecha_ingreso();
                String fecha_salida = listadoXcedula[i].getFecha_salida();
               
             
                Object objeto[] = new Object[]{id_ingreso, id_persona, codigoPc, fecha_ingreso, fecha_salida}; 
                modelo.addRow(objeto);
             
                }
             
            }
        }
    }
    
    
    private void btn_buscarXcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarXcedulaActionPerformed
          
         cedula = campo_cedula.getText();
         if(cedula.equals(" ")){
              Alerta ventana = new Alerta("Ingrese una cédula.");
         }else{
             imprimirListadoXcedula();
         }
        
    }//GEN-LAST:event_btn_buscarXcedulaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarXcedula;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPanel contenedor_Historialingresos;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabla_historialingresos;
    // End of variables declaration//GEN-END:variables
}
