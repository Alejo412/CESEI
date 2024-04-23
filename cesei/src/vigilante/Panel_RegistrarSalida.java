
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

public class Panel_RegistrarSalida extends javax.swing.JPanel {
    
   DefaultTableModel modelo;
   Date fechaHora = new Date();
   BaseDatos basedatos;
   Computador listadoDeComputadores [];
   String id_persona;
   String id_usuario;
   
    public Panel_RegistrarSalida(String id_usuario, BaseDatos basedatos) {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        contenedor_registrarSalida = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        btn_buscarPc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_computador = new javax.swing.JTable();
        btn_registrarSalida = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        campo_cedulaPersona = new javax.swing.JTextField();
        etq_cedulaPersona = new javax.swing.JLabel();
        campo_codigoSeleccionado = new javax.swing.JTextField();
        campo_marcaSeleccionado = new javax.swing.JTextField();
        campo_id_personaSeleccionado = new javax.swing.JTextField();

        contenedor_registrarSalida.setBackground(new java.awt.Color(242, 242, 242));

        etq_titulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Registrar Salida");

        btn_buscarPc.setBackground(new java.awt.Color(0, 191, 99));
        btn_buscarPc.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btn_buscarPc.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarPc.setText("Buscar pc");
        btn_buscarPc.setToolTipText("");
        btn_buscarPc.setBorder(null);
        btn_buscarPc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPcActionPerformed(evt);
            }
        });

        tabla_computador.setBackground(new java.awt.Color(204, 204, 204));
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

        btn_registrarSalida.setBackground(new java.awt.Color(0, 191, 99));
        btn_registrarSalida.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btn_registrarSalida.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarSalida.setText("Registrar Salida");
        btn_registrarSalida.setBorder(null);
        btn_registrarSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarSalidaActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        campo_cedulaPersona.setBackground(new java.awt.Color(242, 242, 242));
        campo_cedulaPersona.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedulaPersona.setForeground(new java.awt.Color(0, 0, 0));
        campo_cedulaPersona.setText("Ingrese Cédula");
        campo_cedulaPersona.setBorder(null);
        campo_cedulaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_cedulaPersonaMousePressed(evt);
            }
        });

        etq_cedulaPersona.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        etq_cedulaPersona.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedulaPersona.setText("Cédula de persona");

        campo_codigoSeleccionado.setBackground(new java.awt.Color(204, 204, 204));
        campo_codigoSeleccionado.setForeground(new java.awt.Color(0, 204, 51));
        campo_codigoSeleccionado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campo_marcaSeleccionado.setBackground(new java.awt.Color(204, 204, 204));
        campo_marcaSeleccionado.setForeground(new java.awt.Color(0, 204, 51));
        campo_marcaSeleccionado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campo_id_personaSeleccionado.setBackground(new java.awt.Color(204, 204, 204));
        campo_id_personaSeleccionado.setForeground(new java.awt.Color(0, 204, 51));
        campo_id_personaSeleccionado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contenedor_registrarSalidaLayout = new javax.swing.GroupLayout(contenedor_registrarSalida);
        contenedor_registrarSalida.setLayout(contenedor_registrarSalidaLayout);
        contenedor_registrarSalidaLayout.setHorizontalGroup(
            contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(etq_titulo)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_cedulaPersona)
                            .addComponent(campo_cedulaPersona)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarPc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(btn_registrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                        .addComponent(campo_codigoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_marcaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_id_personaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        contenedor_registrarSalidaLayout.setVerticalGroup(
            contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_registrarSalidaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(etq_titulo)
                .addGap(53, 53, 53)
                .addComponent(etq_cedulaPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarPc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenedor_registrarSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_codigoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_marcaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_id_personaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btn_registrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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
                
                Panel_RegistrarSalida ventanaActual = this;
                final int posicion = i;
                btnEleccionPc.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //FormularioEdicion ventana = new FormularioEdicion( ventanaActual, posicion );
                        String codigoSelec = listadoDeComputadores[posicion].getCodigo();
                        String maracaSelec = listadoDeComputadores[posicion].getMarca();
                        String id_personaSelec = listadoDeComputadores[posicion].getId_persona();
                        
                        campo_codigoSeleccionado.setText(codigoSelec);
                        campo_marcaSeleccionado.setText(maracaSelec);
                        campo_id_personaSeleccionado.setText(id_personaSelec);
                        
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

    private void btn_registrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarSalidaActionPerformed
        
        String codigo = campo_codigoSeleccionado.getText();
        String marca = campo_marcaSeleccionado.getText();
        String id_persona = campo_id_personaSeleccionado.getText();
      
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaSalida = sdf.format(fechaHora);
        
        
        
        if( codigo.equals("") || marca.equals("") || id_persona.equals("")){
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }else{
             basedatos.editarFechaFinPersona_Computador(id_usuario, fechaSalida);
             campo_codigoSeleccionado.setText(" ");
             campo_marcaSeleccionado.setText(" ");
             campo_id_personaSeleccionado.setText(" ");
        }
        
    }//GEN-LAST:event_btn_registrarSalidaActionPerformed

    private void btn_buscarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPcActionPerformed
        id_persona = campo_cedulaPersona.getText();
        basedatos.extraerPcQueHanEntrado(id_persona);
        imprimirListadoDeSedes();
    }//GEN-LAST:event_btn_buscarPcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarPc;
    private javax.swing.JButton btn_registrarSalida;
    private javax.swing.JTextField campo_cedulaPersona;
    private javax.swing.JTextField campo_codigoSeleccionado;
    private javax.swing.JTextField campo_id_personaSeleccionado;
    private javax.swing.JTextField campo_marcaSeleccionado;
    private javax.swing.JPanel contenedor_registrarSalida;
    private javax.swing.JLabel etq_cedulaPersona;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabla_computador;
    // End of variables declaration//GEN-END:variables
}
