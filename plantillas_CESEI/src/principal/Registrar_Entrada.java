
package principal;
import java.awt.Color;



public class Registrar_Entrada extends javax.swing.JFrame {

   
    public Registrar_Entrada() {
        initComponents();
        initAlternComponents();
        etq_registrarEquipoMouseClicked(null);
        etq_registrarPersonaMouseClicked(null);
        etq_registrarEntradaMouseClicked(null);
        etq_registrarSalidaMouseClicked(null);
        etq_verHistorialMouseClicked(null);
        
    }
    
    public void initAlternComponents(){
        setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_menu_vigilante = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_perfil_Igm = new javax.swing.JLabel();
        etq_registrarEquipo = new javax.swing.JLabel();
        etq_registrarPersona = new javax.swing.JLabel();
        etq_registrarEntrada = new javax.swing.JLabel();
        etq_registrarSalida = new javax.swing.JLabel();
        etq_verHistorial = new javax.swing.JLabel();
        contenedor_principal = new javax.swing.JPanel();
        etq_temporal = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        etq_registrarentrada = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etq_asteriscocedula = new javax.swing.JLabel();
        btn_buscarpc = new javax.swing.JButton();
        btn_registrarentrada = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_computador = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_menu_vigilante.setBackground(new java.awt.Color(56, 128, 255));
        contenedor_menu_vigilante.setForeground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("CESEI");

        etq_perfil_Igm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_registrarEquipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_registrarEquipo.setForeground(new java.awt.Color(255, 255, 255));
        etq_registrarEquipo.setText("<html>Registrar<br>Equipo</html>");
        etq_registrarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_registrarEquipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etq_registrarEquipoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etq_registrarEquipoMouseExited(evt);
            }
        });

        etq_registrarPersona.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_registrarPersona.setForeground(new java.awt.Color(255, 255, 255));
        etq_registrarPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_registrarPersona.setText("<html>Registrar<br>Persona</html>");
        etq_registrarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_registrarPersonaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etq_registrarPersonaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etq_registrarPersonaMouseExited(evt);
            }
        });

        etq_registrarEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_registrarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        etq_registrarEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_registrarEntrada.setText("<html>Registrar<br>Entrada</html>");
        etq_registrarEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_registrarEntradaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etq_registrarEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etq_registrarEntradaMouseExited(evt);
            }
        });

        etq_registrarSalida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_registrarSalida.setForeground(new java.awt.Color(255, 255, 255));
        etq_registrarSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_registrarSalida.setText("<html>Registrar<br>Salida</html>");
        etq_registrarSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_registrarSalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etq_registrarSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etq_registrarSalidaMouseExited(evt);
            }
        });

        etq_verHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_verHistorial.setForeground(new java.awt.Color(255, 255, 255));
        etq_verHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_verHistorial.setText("<html>Ver<br>Historial</html>");
        etq_verHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_verHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etq_verHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etq_verHistorialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenedor_menu_vigilanteLayout = new javax.swing.GroupLayout(contenedor_menu_vigilante);
        contenedor_menu_vigilante.setLayout(contenedor_menu_vigilanteLayout);
        contenedor_menu_vigilanteLayout.setHorizontalGroup(
            contenedor_menu_vigilanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_menu_vigilanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedor_menu_vigilanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_menu_vigilanteLayout.createSequentialGroup()
                        .addComponent(etq_perfil_Igm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_menu_vigilanteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etq_titulo)
                        .addGap(18, 18, 18))))
            .addGroup(contenedor_menu_vigilanteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedor_menu_vigilanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_registrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedor_menu_vigilanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etq_verHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etq_registrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etq_registrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etq_registrarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenedor_menu_vigilanteLayout.setVerticalGroup(
            contenedor_menu_vigilanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_menu_vigilanteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etq_titulo)
                .addGap(27, 27, 27)
                .addComponent(etq_perfil_Igm, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_registrarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(etq_registrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(etq_registrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(etq_registrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(etq_verHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        contenedor_principal.setBackground(new java.awt.Color(0, 74, 173));

        etq_cedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedula.setText("CEDULA");

        etq_registrarentrada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_registrarentrada.setForeground(new java.awt.Color(255, 255, 255));
        etq_registrarentrada.setText("REGISTRAR ENTRADA");

        campo_cedula.setBackground(new java.awt.Color(204, 204, 204));

        etq_asteriscocedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_asteriscocedula.setForeground(new java.awt.Color(255, 0, 0));
        etq_asteriscocedula.setText("*");

        btn_buscarpc.setBackground(new java.awt.Color(51, 204, 0));
        btn_buscarpc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscarpc.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarpc.setText("Buscar Pc");
        btn_buscarpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarpcActionPerformed(evt);
            }
        });

        btn_registrarentrada.setBackground(new java.awt.Color(51, 204, 0));
        btn_registrarentrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrarentrada.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarentrada.setText("Registrar Entrada");
        btn_registrarentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarentradaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout contenedor_principalLayout = new javax.swing.GroupLayout(contenedor_principal);
        contenedor_principal.setLayout(contenedor_principalLayout);
        contenedor_principalLayout.setHorizontalGroup(
            contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_principalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                        .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedor_principalLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(etq_registrarentrada))
                            .addGroup(contenedor_principalLayout.createSequentialGroup()
                                .addGap(0, 466, Short.MAX_VALUE)
                                .addComponent(etq_temporal)))
                        .addContainerGap())
                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                        .addComponent(etq_cedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_asteriscocedula, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_buscarpc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_principalLayout.createSequentialGroup()
                        .addComponent(btn_registrarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_principalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        contenedor_principalLayout.setVerticalGroup(
            contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_principalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(etq_registrarentrada)
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarpc)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_asteriscocedula)
                        .addGap(11, 11, 11)))
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_temporal)
                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btn_registrarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor_menu_vigilante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_menu_vigilante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etq_registrarEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEquipoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etq_registrarEquipoMouseClicked

    private void etq_registrarPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarPersonaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etq_registrarPersonaMouseClicked

    private void etq_registrarEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEntradaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etq_registrarEntradaMouseClicked

    private void etq_registrarSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarSalidaMouseClicked
        //Crear el contenedor nuevo
        Panel_RegistrarSalida nuevo = new Panel_RegistrarSalida();
        
        //Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize(contenedor_principal.getPreferredSize());
        nuevo.setSize(contenedor_principal.getSize());
        
        //Eliminar el  contenido del contentPrincipal
        contenedor_principal.removeAll();
        
        //Agregar dentro del contentPrincipalel contenedor nuevo
        contenedor_principal.add(nuevo);
        
        
        repaint();
        revalidate();
    }//GEN-LAST:event_etq_registrarSalidaMouseClicked

    private void etq_verHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_verHistorialMouseClicked
        
        Panel_Historialingresos nuevo = new Panel_Historialingresos();
        
        nuevo.setPreferredSize(contenedor_principal.getPreferredSize());
        nuevo.setSize(contenedor_principal.getSize());
        contenedor_principal.removeAll();
        
      
        contenedor_principal.add(nuevo);
        
        
        repaint();
        revalidate();
    }//GEN-LAST:event_etq_verHistorialMouseClicked

    
    
    
    
    
    
    private void etq_registrarSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarSalidaMouseEntered
        // Cambia el color de fondo del JLabel cuando el mouse entra en él
        etq_registrarSalida.setForeground(Color.BLACK);
    }//GEN-LAST:event_etq_registrarSalidaMouseEntered

    private void etq_registrarSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarSalidaMouseExited
        // Devuelve el color a su estado original
        etq_registrarSalida.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarSalidaMouseExited

    private void etq_verHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_verHistorialMouseEntered
        etq_verHistorial.setForeground(Color.BLACK);
    }//GEN-LAST:event_etq_verHistorialMouseEntered

    private void etq_verHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_verHistorialMouseExited
        etq_verHistorial.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_verHistorialMouseExited

    private void etq_registrarEquipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEquipoMouseEntered
        etq_registrarEquipo.setForeground(Color.BLACK);
    }//GEN-LAST:event_etq_registrarEquipoMouseEntered

    private void etq_registrarEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEquipoMouseExited
        etq_registrarEquipo.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarEquipoMouseExited

    private void etq_registrarPersonaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarPersonaMouseEntered
        etq_registrarPersona.setForeground(Color.BLACK);
    }//GEN-LAST:event_etq_registrarPersonaMouseEntered

    private void etq_registrarPersonaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarPersonaMouseExited
        etq_registrarPersona.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarPersonaMouseExited

    private void etq_registrarEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEntradaMouseEntered
        etq_registrarEntrada.setForeground(Color.BLACK);
    }//GEN-LAST:event_etq_registrarEntradaMouseEntered

    private void etq_registrarEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEntradaMouseExited
         etq_registrarEntrada.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarEntradaMouseExited

    private void btn_buscarpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarpcActionPerformed

    private void btn_registrarentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarentradaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarpc;
    private javax.swing.JButton btn_registrarentrada;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPanel contenedor_menu_vigilante;
    private javax.swing.JPanel contenedor_principal;
    private javax.swing.JLabel etq_asteriscocedula;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_perfil_Igm;
    private javax.swing.JLabel etq_registrarEntrada;
    private javax.swing.JLabel etq_registrarEquipo;
    private javax.swing.JLabel etq_registrarPersona;
    private javax.swing.JLabel etq_registrarSalida;
    private javax.swing.JLabel etq_registrarentrada;
    private javax.swing.JLabel etq_temporal;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_verHistorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_computador;
    // End of variables declaration//GEN-END:variables
}
