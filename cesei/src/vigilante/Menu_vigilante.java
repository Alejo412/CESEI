
package vigilante;
import vigilante.Panel_Registrar_Computador;
import vigilante.Panel_Registrar_Entrada;
import vigilante.Panel_RegistrarSalida;
import vigilante.Panel_Historialingresos;
import vigilante.Panel_Registrar_Persona;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import utils.BaseDatos;
import utils.Usuario;



public class Menu_vigilante extends javax.swing.JFrame {

   BaseDatos basedatos = new BaseDatos();
   Usuario usuario;
   String cedula;
   
   
   
    public Menu_vigilante(String cedula, BaseDatos basedatos) {
        this.basedatos=basedatos;
        this.cedula=cedula;
        initComponents();
        initAlternComponents();
        etq_registrarEquipoMouseClicked(null);
        etq_registrarPersonaMouseClicked(null);
        etq_registrarEntradaMouseClicked(null);
        etq_registrarSalidaMouseClicked(null);
        etq_verHistorialMouseClicked(null);
      
        
    }
    
    public void initAlternComponents(){
        setTitle("Menu Vigilante");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Image icono_crear = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_perfilM.png"));
        icono_crear = icono_crear.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        etq_perfil_Igm.setIcon(new ImageIcon(icono_crear));
        etq_perfil_Igm.setForeground(new Color(0, 200, 0));
        
        
        //Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/CESEILOGO.png"));
        //icono_registro = icono_registro.getScaledInstance(130, 114, Image.SCALE_SMOOTH);
        //imgUsuario.setIcon(new ImageIcon(icono_registro));
        //setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_usuario.png")));
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        contenedor_menu_vigilante.setBackground(new java.awt.Color(0, 0, 0));
        contenedor_menu_vigilante.setForeground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("CESEI");

        etq_perfil_Igm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_perfil_Igm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq_perfil_IgmMouseClicked(evt);
            }
        });

        etq_registrarEquipo.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
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

        etq_registrarPersona.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
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

        etq_registrarEntrada.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
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

        etq_registrarSalida.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
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

        etq_verHistorial.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
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
                .addGap(35, 35, 35)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(57, Short.MAX_VALUE))
        );

        contenedor_principal.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout contenedor_principalLayout = new javax.swing.GroupLayout(contenedor_principal);
        contenedor_principal.setLayout(contenedor_principalLayout);
        contenedor_principalLayout.setHorizontalGroup(
            contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_principalLayout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(etq_temporal)
                .addGap(285, 285, 285))
        );
        contenedor_principalLayout.setVerticalGroup(
            contenedor_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_temporal)
                .addGap(251, 251, 251))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor_menu_vigilante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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
        
        Panel_Registrar_Computador nuevo = new Panel_Registrar_Computador(basedatos);
        
        
        nuevo.setPreferredSize(contenedor_principal.getPreferredSize());
        nuevo.setSize(contenedor_principal.getSize());
        
   
        contenedor_principal.removeAll();
        
   
        contenedor_principal.add(nuevo);
        
        
        repaint();
        revalidate();
    }//GEN-LAST:event_etq_registrarEquipoMouseClicked

    private void etq_registrarPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarPersonaMouseClicked
   
        Panel_Registrar_Persona nuevo = new Panel_Registrar_Persona(basedatos);
        
   
        nuevo.setPreferredSize(contenedor_principal.getPreferredSize());
        nuevo.setSize(contenedor_principal.getSize());
        
    
        contenedor_principal.removeAll();
        
    
        contenedor_principal.add(nuevo);
        
        
        repaint();
        revalidate();
    }//GEN-LAST:event_etq_registrarPersonaMouseClicked

    private void etq_registrarEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEntradaMouseClicked
        
        Panel_Registrar_Entrada nuevo = new Panel_Registrar_Entrada(cedula, basedatos);
        
        
        nuevo.setPreferredSize(contenedor_principal.getPreferredSize());
        nuevo.setSize(contenedor_principal.getSize());
        
        
        contenedor_principal.removeAll();
        
        
        contenedor_principal.add(nuevo);
        
        
        repaint();
        revalidate();
    }//GEN-LAST:event_etq_registrarEntradaMouseClicked

    private void etq_registrarSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarSalidaMouseClicked
        
        Panel_RegistrarSalida nuevo = new Panel_RegistrarSalida(cedula, basedatos);
        
        nuevo.setPreferredSize(contenedor_principal.getPreferredSize());
        nuevo.setSize(contenedor_principal.getSize());
        
        
        contenedor_principal.removeAll();
        

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
        etq_registrarSalida.setForeground(Color.BLUE);
    }//GEN-LAST:event_etq_registrarSalidaMouseEntered

    private void etq_registrarSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarSalidaMouseExited
        // Devuelve el color a su estado original
        etq_registrarSalida.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarSalidaMouseExited

    private void etq_verHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_verHistorialMouseEntered
        etq_verHistorial.setForeground(Color.BLUE);
    }//GEN-LAST:event_etq_verHistorialMouseEntered

    private void etq_verHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_verHistorialMouseExited
        etq_verHistorial.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_verHistorialMouseExited

    private void etq_registrarEquipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEquipoMouseEntered
        etq_registrarEquipo.setForeground(Color.BLUE);
    }//GEN-LAST:event_etq_registrarEquipoMouseEntered

    private void etq_registrarEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEquipoMouseExited
        etq_registrarEquipo.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarEquipoMouseExited

    private void etq_registrarPersonaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarPersonaMouseEntered
        etq_registrarPersona.setForeground(Color.BLUE);
    }//GEN-LAST:event_etq_registrarPersonaMouseEntered

    private void etq_registrarPersonaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarPersonaMouseExited
        etq_registrarPersona.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarPersonaMouseExited

    private void etq_registrarEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEntradaMouseEntered
        etq_registrarEntrada.setForeground(Color.BLUE);
    }//GEN-LAST:event_etq_registrarEntradaMouseEntered

    private void etq_registrarEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_registrarEntradaMouseExited
         etq_registrarEntrada.setForeground(Color.WHITE);
    }//GEN-LAST:event_etq_registrarEntradaMouseExited

    private void etq_perfil_IgmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_perfil_IgmMouseClicked
        Panel_perfilVigilante nuevo = new Panel_perfilVigilante(cedula, basedatos);
        
       
        nuevo.setPreferredSize(contenedor_principal.getPreferredSize());
        nuevo.setSize(contenedor_principal.getSize());
        
       
        contenedor_principal.removeAll();
        
        
        contenedor_principal.add(nuevo);
        
        
        repaint();
        revalidate();
    }//GEN-LAST:event_etq_perfil_IgmMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor_menu_vigilante;
    private javax.swing.JPanel contenedor_principal;
    private javax.swing.JLabel etq_perfil_Igm;
    private javax.swing.JLabel etq_registrarEntrada;
    private javax.swing.JLabel etq_registrarEquipo;
    private javax.swing.JLabel etq_registrarPersona;
    private javax.swing.JLabel etq_registrarSalida;
    private javax.swing.JLabel etq_temporal;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_verHistorial;
    // End of variables declaration//GEN-END:variables
}
