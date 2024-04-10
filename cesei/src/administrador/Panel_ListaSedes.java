
package administrador;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Sede;


public class Panel_ListaSedes extends javax.swing.JPanel {

   DefaultTableModel modelo;
   BaseDatos basedatos;
   Sede listadoDeSedes [];
    public Panel_ListaSedes(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initAlternComponents();
        imprimirListadoDeSedes();
    }
    
    public void initAlternComponents(){
        
        setVisible(true);
        modelo = (DefaultTableModel) tabla_listaSedes.getModel();
        
        tabla_listaSedes.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla_listaSedes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabla_listaSedes.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_listaSedes.getColumnModel().getColumn(3).setPreferredWidth(100);
        
        
        tabla_listaSedes.getTableHeader().setReorderingAllowed(false);
        tabla_listaSedes.getTableHeader().setResizingAllowed(false);
        
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_listaSedes.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_listaSedes.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        
        tabla_listaSedes.setRowHeight(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_head = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        cont_main = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_listaSedes = new javax.swing.JTable();

        cont_head.setBackground(new java.awt.Color(56, 128, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista Sedes");

        javax.swing.GroupLayout cont_headLayout = new javax.swing.GroupLayout(cont_head);
        cont_head.setLayout(cont_headLayout);
        cont_headLayout.setHorizontalGroup(
            cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cont_headLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(etq_titulo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        cont_headLayout.setVerticalGroup(
            cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(cont_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cont_headLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(etq_titulo)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );

        cont_main.setBackground(new java.awt.Color(0, 74, 173));

        tabla_listaSedes.setForeground(new java.awt.Color(0, 0, 0));
        tabla_listaSedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Sede", "Dirección", "Contacto", "Administrador"
            }
        ));
        jScrollPane1.setViewportView(tabla_listaSedes);

        javax.swing.GroupLayout cont_mainLayout = new javax.swing.GroupLayout(cont_main);
        cont_main.setLayout(cont_mainLayout);
        cont_mainLayout.setHorizontalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        cont_mainLayout.setVerticalGroup(
            cont_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cont_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cont_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

public void imprimirListadoDeSedes(){
     modelo.setRowCount(0);
     
     listadoDeSedes = basedatos.extraerSedes();
     
     if(listadoDeSedes != null && listadoDeSedes.length > 0){
         for(int i = 0; i < listadoDeSedes.length; i++){
             if(listadoDeSedes[i] != null){
                String id_sede = listadoDeSedes[i].getNsede();
                String direccion = listadoDeSedes[i].getDireccion();
                String contacto = listadoDeSedes[i].getContacto();
                String id_usuario = listadoDeSedes[i].getCedulaAdmin();
             
             Object objeto[] = new Object[]{id_sede,direccion, contacto, id_usuario }; 
             modelo.addRow(objeto);
             
             }
             
         }
     }
     
     
    
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_head;
    private javax.swing.JPanel cont_main;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_listaSedes;
    // End of variables declaration//GEN-END:variables
}
