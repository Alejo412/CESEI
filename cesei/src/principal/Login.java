package principal;
 
import administrador.Menu_Admin;
import alerta.Alerta;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.Usuario;
import vigilante.Menu_vigilante;


public class Login extends javax.swing.JFrame {
    
    BaseDatos basedatos = new BaseDatos();
    Usuario usuario;
    int xMouse, yMouse;
    
    public Login(BaseDatos basedatos) {
       
        this.basedatos=basedatos;
        initComponents();
        initAlternCompoinents();
    }
    
    public void initAlternCompoinents(){
        setTitle("Login");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logofinal.png")));
        
    }
           
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        javax.swing.JLabel favicon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        campo_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logofinal.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 310, 220));

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setForeground(new java.awt.Color(255, 255, 255));
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoseguridad.png"))); // NOI18N
        favicon.setText("CESEI");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, -1));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("INICIAR SESIÓN");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setBorder(null);
        bg.add(campo_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 410, 20));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        campo_password.setBorder(null);
        bg.add(campo_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 410, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 410, 20));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tipoAdmi = "Administrador";
       String tipoVigi = "Vigilante";
        
      String cedulaUsuario = campo_cedula.getText();
      String passwordUsuario = campo_password.getText();
      
      if (cedulaUsuario.equals(" ") || passwordUsuario.equals(" ")){
          Alerta ventana = new Alerta("Todos los campos son obligatorios.");
          System.out.println("Tiene que llenar todos los campos");
      }else{
          usuario = basedatos.validarIngreso(cedulaUsuario);
          if(usuario != null){
              System.out.println(usuario.getCedula());
              System.out.println(usuario.getNombres());
              
          }else{
              Alerta ventana = new Alerta("El usuario no existe.");
              campo_cedula.setText(" ");
              campo_password.setText(" ");
              System.out.println("El objeto usuario es null");
          }
          
          
          if(usuario.getTipo().equals(tipoAdmi)){
                System.out.println("Se ha encontrado un usuario-Administrador");
                Menu_Admin menuAdmi = new Menu_Admin(cedulaUsuario,  basedatos);
                dispose();
                
            }else if(usuario.getTipo().equals(tipoVigi)){
                System.out.println("Se ha encontrado un usuario-Vigialante");
                Menu_vigilante menuVigilante = new Menu_vigilante(cedulaUsuario, basedatos);
                dispose();
            }
          
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPasswordField campo_password;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
