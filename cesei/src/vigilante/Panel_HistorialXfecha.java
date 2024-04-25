
package vigilante;

import alerta.Alerta;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona_computador;

public class Panel_HistorialXfecha extends javax.swing.JPanel {

    DefaultTableModel modelo;
    BaseDatos basedatos;
    String fecha;
    Persona_computador listadoXfecha [];
    public Panel_HistorialXfecha(String fecha, BaseDatos basedatos) {
        this.basedatos = basedatos;
        this.fecha = fecha;
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
        jSeparator8 = new javax.swing.JSeparator();
        etq_fecha = new javax.swing.JLabel();
        btn_buscarXfecha = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_historialingresos = new javax.swing.JTable();
        calender_fecha = new com.toedter.calendar.JDateChooser();

        contenedor_Historialingresos.setBackground(new java.awt.Color(242, 242, 242));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        etq_fecha.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_fecha.setForeground(new java.awt.Color(0, 0, 0));
        etq_fecha.setText("Fecha");

        btn_buscarXfecha.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscarXfecha.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_buscarXfecha.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarXfecha.setText("Buscar");
        btn_buscarXfecha.setBorder(null);
        btn_buscarXfecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarXfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarXfechaActionPerformed(evt);
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
                "ID_ingreso", "Persona", "Código-equipo", "Fecha ingreso", "Fecha salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_historialingresos);

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
                .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_fecha)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calender_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_buscarXfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        contenedor_HistorialingresosLayout.setVerticalGroup(
            contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_HistorialingresosLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(etq_fecha)
                .addGap(7, 7, 7)
                .addGroup(contenedor_HistorialingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarXfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calender_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    public void imprimirListadoXfecha(){
     modelo.setRowCount(0);
     SimpleDateFormat fecha_formateada = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_elegida = (fecha_formateada.format(calender_fecha.getCalendar().getTime()));
     listadoXfecha = basedatos.extraerIngresosXfecha(fecha_elegida);
     
        if(listadoXfecha != null && listadoXfecha.length > 0){
            for(int i = 0; i < listadoXfecha.length; i++){
                if(listadoXfecha[i] != null){
                String id_ingreso = listadoXfecha[i].getId_ingreso();
                String id_persona = listadoXfecha[i].getId_persona();
                String codigoPc = listadoXfecha[i].getCodigo_eqipo();
                String fecha_ingreso = listadoXfecha[i].getFecha_ingreso();
                String fecha_salida = listadoXfecha[i].getFecha_salida();
               
             
                Object objeto[] = new Object[]{id_ingreso, id_persona, codigoPc, fecha_ingreso, fecha_salida}; 
                modelo.addRow(objeto);
             
                }
             
            }
        }
    }
    
    private void btn_buscarXfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarXfechaActionPerformed
       
        SimpleDateFormat fecha_formateada = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_elegida = (fecha_formateada.format(calender_fecha.getCalendar().getTime()));
         
         if(fecha_elegida.equals(" ")){
              Alerta ventana = new Alerta("Ingrese una fecha YYYY/MM/DD.");
         }else{
             imprimirListadoXfecha();
         }
    }//GEN-LAST:event_btn_buscarXfechaActionPerformed

    
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarXfecha;
    private com.toedter.calendar.JDateChooser calender_fecha;
    private javax.swing.JPanel contenedor_Historialingresos;
    private javax.swing.JLabel etq_fecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabla_historialingresos;
    // End of variables declaration//GEN-END:variables
}
