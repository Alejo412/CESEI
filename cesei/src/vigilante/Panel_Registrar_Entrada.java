
package vigilante;

import alerta.Alerta;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.Computador;




public class Panel_Registrar_Entrada extends javax.swing.JPanel {

   DefaultTableModel modelo;
   Date fechaHora = new Date();
   BaseDatos basedatos;
   Computador listadoDeComputadores [];
   String id_persona;
   String id_usuario;
   
    public Panel_Registrar_Entrada(String id_usuario, BaseDatos basedatos) {
        this.basedatos = basedatos;
        this.id_usuario = id_usuario;
        initComponents();
        initAlternComponents();
    }
    
     public void initAlternComponents(){
        
        setVisible(true);
        modelo = (DefaultTableModel) tabla_computador.getModel();
        
        tabla_computador.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabla_computador.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());
        
        
        tabla_computador.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla_computador.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabla_computador.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla_computador.getColumnModel().getColumn(3).setPreferredWidth(100);
        
        
        tabla_computador.getTableHeader().setReorderingAllowed(false);
        tabla_computador.getTableHeader().setResizingAllowed(false);
        
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_computador.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_computador.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        
        tabla_computador.setRowHeight(20);
    }
     
     
     
     


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jSeparator8 = new javax.swing.JSeparator();
        campo_cedulaPersona = new javax.swing.JTextField();
        etq_cedulaPersona = new javax.swing.JLabel();
        etq_registrarentrada = new javax.swing.JLabel();
        btn_buscarpc = new javax.swing.JButton();
        btn_registrarentrada = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_computador = new javax.swing.JTable();
        campo_codigoSeleccionado = new javax.swing.JTextField();
        campo_marcaSeleccionada = new javax.swing.JTextField();
        campo_idPersonaSeleccionado = new javax.swing.JTextField();

        setBackground(new java.awt.Color(242, 242, 242));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        campo_cedulaPersona.setBackground(new java.awt.Color(242, 242, 242));
        campo_cedulaPersona.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedulaPersona.setForeground(new java.awt.Color(0, 0, 0));
        campo_cedulaPersona.setText("Ingrese cedula");
        campo_cedulaPersona.setBorder(null);
        campo_cedulaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaPersonaMousePressed(evt);
            }
        });

        etq_cedulaPersona.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedulaPersona.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedulaPersona.setText("Cedula de persona");

        etq_registrarentrada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_registrarentrada.setForeground(new java.awt.Color(0, 0, 0));
        etq_registrarentrada.setText("REGISTRAR ENTRADA");

        btn_buscarpc.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscarpc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscarpc.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarpc.setText("Buscar Pc");
        btn_buscarpc.setBorder(null);
        btn_buscarpc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarpcActionPerformed(evt);
            }
        });

        btn_registrarentrada.setBackground(new java.awt.Color(0, 191, 99));
        btn_registrarentrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrarentrada.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarentrada.setText("Registrar Entrada");
        btn_registrarentrada.setBorder(null);
        btn_registrarentrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrarentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarentradaActionPerformed(evt);
            }
        });

        tabla_computador.setBackground(new java.awt.Color(204, 204, 204));
        tabla_computador.setForeground(new java.awt.Color(0, 0, 0));
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

        campo_codigoSeleccionado.setBackground(new java.awt.Color(204, 204, 204));
        campo_codigoSeleccionado.setForeground(new java.awt.Color(0, 204, 51));
        campo_codigoSeleccionado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campo_marcaSeleccionada.setBackground(new java.awt.Color(204, 204, 204));
        campo_marcaSeleccionada.setForeground(new java.awt.Color(0, 204, 51));
        campo_marcaSeleccionada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campo_idPersonaSeleccionado.setBackground(new java.awt.Color(204, 204, 204));
        campo_idPersonaSeleccionado.setForeground(new java.awt.Color(0, 204, 51));
        campo_idPersonaSeleccionado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btn_registrarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(campo_codigoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_marcaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_idPersonaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etq_cedulaPersona)
                        .addComponent(campo_cedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscarpc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97))
                .addGroup(layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(etq_registrarentrada)
                    .addGap(204, 204, 204))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_codigoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_marcaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_idPersonaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_registrarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(etq_registrarentrada)
                    .addGap(56, 56, 56)
                    .addComponent(etq_cedulaPersona)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_cedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscarpc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(156, 156, 156)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void imprimirListadoDeSedes(){
     modelo.setRowCount(0);
     
     listadoDeComputadores = basedatos.extraerComputadores(id_persona);
     
        if(listadoDeComputadores != null && listadoDeComputadores.length > 0){
            for(int i = 0; i < listadoDeComputadores.length; i++){
                if(listadoDeComputadores[i] != null){
                String codigo = listadoDeComputadores[i].getCodigo();
                String marca = listadoDeComputadores[i].getMarca();
                String id_persona = listadoDeComputadores[i].getId_persona();
                
                JButton btnEleccionPc = new JButton();
                btnEleccionPc.setBackground(Color.white);
                Image icono_editar = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/marca_seleccionPc.png") );
                icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                btnEleccionPc.setIcon( new ImageIcon(icono_editar) );
                
             
                Object objeto[] = new Object[]{codigo,marca, id_persona, btnEleccionPc}; 
                modelo.addRow(objeto);
                
                Panel_Registrar_Entrada ventanaActual = this;
                final int posicion = i;
                btnEleccionPc.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //FormularioEdicion ventana = new FormularioEdicion( ventanaActual, posicion );
                        String codigoSelec = listadoDeComputadores[posicion].getCodigo();
                        String maracaSelec = listadoDeComputadores[posicion].getMarca();
                        String id_personaSelec = listadoDeComputadores[posicion].getId_persona();
                        
                        campo_codigoSeleccionado.setText(codigoSelec);
                        campo_marcaSeleccionada.setText(maracaSelec);
                        campo_idPersonaSeleccionado.setText(id_personaSelec);
                        
                    }
                });
             
                }
             
            }
        }
    }
    
    private void campo_cedulaPersonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_cedulaPersonaMousePressed
         if (campo_cedulaPersona.getText().equals("Ingrese cedula")) {
            campo_cedulaPersona.setText("");
            campo_cedulaPersona.setForeground(Color.black);
        }
    }//GEN-LAST:event_campo_cedulaPersonaMousePressed

    private void btn_buscarpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarpcActionPerformed
        
        id_persona = campo_cedulaPersona.getText();
        basedatos.extraerComputadores(id_persona);
        imprimirListadoDeSedes();
        
    }//GEN-LAST:event_btn_buscarpcActionPerformed

    private void btn_registrarentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarentradaActionPerformed
        
        String codigo = campo_codigoSeleccionado.getText();
        String marca = campo_marcaSeleccionada.getText();
        String id_persona = campo_idPersonaSeleccionado.getText();
      
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaIngreso = sdf.format(fechaHora);
        String fechaSalida = null;
        
        
        if( codigo.equals("") || marca.equals("") || id_persona.equals("")){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
             basedatos.insertarPersona_computador(id_persona, codigo, fechaIngreso, fechaSalida, id_usuario);
             campo_codigoSeleccionado.setText(" ");
             campo_marcaSeleccionada.setText(" ");
             campo_idPersonaSeleccionado.setText(" ");
        }
        
    }//GEN-LAST:event_btn_registrarentradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarpc;
    private javax.swing.JButton btn_registrarentrada;
    private javax.swing.JTextField campo_cedulaPersona;
    private javax.swing.JTextField campo_codigoSeleccionado;
    private javax.swing.JTextField campo_idPersonaSeleccionado;
    private javax.swing.JTextField campo_marcaSeleccionada;
    private javax.swing.JLabel etq_cedulaPersona;
    private javax.swing.JLabel etq_registrarentrada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tabla_computador;
    // End of variables declaration//GEN-END:variables
}
