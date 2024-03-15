
package principal;
import java.awt.Color;



public class Registrar_Persona extends javax.swing.JFrame {

   
    public Registrar_Persona() {
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
        etq_registrarpersonas = new javax.swing.JLabel();
        etq_asteriscoCedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etq_nombres = new javax.swing.JLabel();
        campo_nombres = new javax.swing.JTextField();
        asteriscoNombres = new javax.swing.JLabel();
        etq_apellidos = new javax.swing.JLabel();
        etq_asteriscoApellidos = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        etq_asteriscoTelefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();

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
                .addContainerGap(40, Short.MAX_VALUE))
        );

        contenedor_principal.setBackground(new java.awt.Color(0, 74, 173));

        etq_cedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedula.setText("CEDULA");

        etq_registrarpersonas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_registrarpersonas.setForeground(new java.awt.Color(255, 255, 255));
        etq_registrarpersonas.setText("REGISTRAR PERSONA");

        etq_asteriscoCedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_asteriscoCedula.setForeground(new java.awt.Color(255, 0, 0));
        etq_asteriscoCedula.setText("*");

        campo_cedula.setBackground(new java.awt.Color(204, 204, 204));

        etq_nombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombres.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombres.setText("NOMBRES");

        campo_nombres.setBackground(new java.awt.Color(204, 204, 204));

        asteriscoNombres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        asteriscoNombres.setForeground(new java.awt.Color(255, 0, 0));
        asteriscoNombres.setText("*");

        etq_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        etq_apellidos.setText("APELLIDOS");

        etq_asteriscoApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_asteriscoApellidos.setForeground(new java.awt.Color(255, 0, 0));
        etq_asteriscoApellidos.setText("*");

        campo_apellidos.setBackground(new java.awt.Color(204, 204, 204));
        campo_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_apellidosActionPerformed(evt);
            }
        });

        etq_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("TELEFONO");

        etq_asteriscoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_asteriscoTelefono.setForeground(new java.awt.Color(255, 0, 0));
        etq_asteriscoTelefono.setText("*");

        campo_telefono.setBackground(new java.awt.Color(204, 204, 204));
        campo_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_telefonoActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(51, 204, 0));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");

        javax.swing.GroupLayout contenedor_principalLayout = new javax.swing.GroupLayout(contenedor_principal);
        contenedor_principal.setLayout(contenedor_principalLayout);
        contenedor_principalLayout.setHorizontalGroup(
            contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_principalLayout.createSequentialGroup()
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(etq_registrarpersonas))
                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_nombres)
                            .addComponent(etq_cedula)
                            .addComponent(etq_apellidos)
                            .addComponent(etq_telefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedor_principalLayout.createSequentialGroup()
                                .addComponent(etq_asteriscoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(etq_temporal))
                                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                                        .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(contenedor_principalLayout.createSequentialGroup()
                                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                                        .addComponent(asteriscoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                                        .addComponent(etq_asteriscoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                                        .addComponent(etq_asteriscoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 4, Short.MAX_VALUE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        contenedor_principalLayout.setVerticalGroup(
            contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_principalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(etq_registrarpersonas)
                .addGap(96, 96, 96)
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_cedula)
                    .addComponent(asteriscoNombres))
                .addGap(18, 18, 18)
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_nombres)
                    .addComponent(etq_asteriscoCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_temporal)
                .addGap(18, 18, 18)
                .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etq_asteriscoApellidos)
                        .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedor_principalLayout.createSequentialGroup()
                        .addComponent(etq_telefono)
                        .addGap(21, 21, 21)
                        .addGroup(contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_apellidos)
                            .addComponent(etq_asteriscoTelefono)
                            .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
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

    private void campo_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_apellidosActionPerformed

    private void campo_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_telefonoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asteriscoNombres;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel contenedor_menu_vigilante;
    private javax.swing.JPanel contenedor_principal;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_asteriscoApellidos;
    private javax.swing.JLabel etq_asteriscoCedula;
    private javax.swing.JLabel etq_asteriscoTelefono;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_perfil_Igm;
    private javax.swing.JLabel etq_registrarEntrada;
    private javax.swing.JLabel etq_registrarEquipo;
    private javax.swing.JLabel etq_registrarPersona;
    private javax.swing.JLabel etq_registrarSalida;
    private javax.swing.JLabel etq_registrarpersonas;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_temporal;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_verHistorial;
    // End of variables declaration//GEN-END:variables
}
