package principal;

import administrador.Menu_Admin;
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
        
      //  Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/LOGOBLANCO.png"));
        //icono_registro = icono_registro.getScaledInstance(130, 114, Image.SCALE_SMOOTH);
        //logo.setIcon(new ImageIcon(icono_registro));
        //setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/LOGOBLANCO.png")));
        
        
    }
           
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        campo_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        btn_entrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 74, 173));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGOBLANCO.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 290, 180));

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("CESEI");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 290, 20));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 300, 500));

        header.setBackground(new java.awt.Color(0, 74, 173));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setBackground(new java.awt.Color(0, 74, 173));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(255, 255, 255));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setOpaque(true);
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 800, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setForeground(new java.awt.Color(255, 255, 255));
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        favicon.setText("CESEI");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, -1));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("INICIAR SESIÓN");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        campo_cedula.setBackground(new java.awt.Color(0, 74, 173));
        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setForeground(new java.awt.Color(255, 255, 255));
        campo_cedula.setBorder(null);
        bg.add(campo_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 410, 20));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        campo_password.setBackground(new java.awt.Color(0, 74, 173));
        campo_password.setForeground(new java.awt.Color(255, 255, 255));
        campo_password.setBorder(null);
        bg.add(campo_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 410, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 410, 20));

        loginBtn.setBackground(new java.awt.Color(0, 134, 190));

        btn_entrar.setBackground(new java.awt.Color(56, 182, 255));
        btn_entrar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_entrar.setText("ENTRAR");
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void btn_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseEntered
        loginBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btn_entrarMouseEntered

    private void btn_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseExited
        loginBtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_btn_entrarMouseExited

    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked

       String tipoAdmi = "Administrador";
       String tipoVigi = "Vigilante";
        
      String cedulaUsuario = campo_cedula.getText();
      String passwordUsuario = campo_password.getText();
      
      if (cedulaUsuario.equals(" ") || passwordUsuario.equals(" ")){
          //crear alerta
          System.out.println("Tiene que llenar todos los campos");
      }else{
          usuario = basedatos.validarIngreso(cedulaUsuario);
          if(usuario != null){
              System.out.println(usuario.getCedula());
              System.out.println(usuario.getNombres());
              System.out.println(usuario.getPassword());
          }else{
              System.out.println("El objeto usuario es null");
          }
          
          
          if(usuario.getTipo().equals(tipoAdmi)){
                System.out.println("Se ha encontrado un usuario-Administrador");
                Menu_Admin menuAdmi = new Menu_Admin(cedulaUsuario, passwordUsuario, basedatos);
                dispose();
                
            }else if(usuario.getTipo().equals(tipoVigi)){
                System.out.println("Se ha encontrado un usuario-Vigialante");
                Menu_vigilante menuVigilante = new Menu_vigilante(cedulaUsuario, passwordUsuario, basedatos);
                dispose();
            }
          
        }
      
      
    }//GEN-LAST:event_btn_entrarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btn_entrar;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPasswordField campo_password;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
