
package administrador;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Usuario;


public class Panel_ListaVigilantes extends javax.swing.JPanel {

   DefaultTableModel modelo;
   BaseDatos basedatos;
   Usuario listadoDeVigilantes [];
    public Panel_ListaVigilantes(BaseDatos basedatos) {
       this.basedatos = basedatos;
        initComponents();
        initAlternComponents();
        imprimirListadoDeSedes();
    }
    
     public void initAlternComponents(){
        
        setVisible(true);
        modelo = (DefaultTableModel) tabla_listaVigilantes.getModel();
        
        tabla_listaVigilantes.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla_listaVigilantes.getColumnModel().getColumn(1).setPreferredWidth(90);
        tabla_listaVigilantes.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_listaVigilantes.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabla_listaVigilantes.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_listaVigilantes.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabla_listaVigilantes.getColumnModel().getColumn(5).setPreferredWidth(100);
        
        
        tabla_listaVigilantes.getTableHeader().setReorderingAllowed(false);
        tabla_listaVigilantes.getTableHeader().setResizingAllowed(false);
        
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_listaVigilantes.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_listaVigilantes.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        
        tabla_listaVigilantes.setRowHeight(20);
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conte_main = new javax.swing.JPanel();
        conte_listadoVigilantes = new javax.swing.JScrollPane();
        tabla_listaVigilantes = new javax.swing.JTable();

        conte_main.setBackground(new java.awt.Color(0, 74, 173));

        tabla_listaVigilantes.setBackground(new java.awt.Color(242, 242, 242));
        tabla_listaVigilantes.setForeground(new java.awt.Color(0, 0, 0));
        tabla_listaVigilantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Tipo", "Nombres", "Apellidos", "Correo", "Teléfono", "Fecha Nacimieto"
            }
        ));
        conte_listadoVigilantes.setViewportView(tabla_listaVigilantes);

        javax.swing.GroupLayout conte_mainLayout = new javax.swing.GroupLayout(conte_main);
        conte_main.setLayout(conte_mainLayout);
        conte_mainLayout.setHorizontalGroup(
            conte_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte_listadoVigilantes, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        conte_mainLayout.setVerticalGroup(
            conte_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte_listadoVigilantes, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conte_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void imprimirListadoDeSedes(){
     modelo.setRowCount(0);
     
     listadoDeVigilantes = basedatos.extraerVigilantes();
     
        if(listadoDeVigilantes != null && listadoDeVigilantes.length > 0){
            for(int i = 0; i < listadoDeVigilantes.length; i++){
                if(listadoDeVigilantes[i] != null){
                String id_usuario = listadoDeVigilantes[i].getCedula();
                String tipo = listadoDeVigilantes[i].getTipo();
                String nombres = listadoDeVigilantes[i].getNombres();
                String apellidos = listadoDeVigilantes[i].getApellidos();
                String correo = listadoDeVigilantes[i].getEmail();
                String telefono = listadoDeVigilantes[i].getTelefono();
                String f_nacimiento = listadoDeVigilantes[i].getFecha_nacimiento();
                
             
                Object objeto[] = new Object[]{id_usuario, tipo, nombres, apellidos, correo, telefono, f_nacimiento}; 
                modelo.addRow(objeto);
             
                }
             
            }
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane conte_listadoVigilantes;
    private javax.swing.JPanel conte_main;
    private javax.swing.JTable tabla_listaVigilantes;
    // End of variables declaration//GEN-END:variables
}
