package administrador;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.BaseDatos;
import administrador.Panel_RegistrarVigilante;

public class GuardarImagenBD extends javax.swing.JFrame {
    
    BaseDatos basedatos;
    ImageIcon imagenTemporal;
    String cedula;
    
    public GuardarImagenBD(String cedula, BaseDatos basedatos) {
        this.cedula = cedula;
        this.basedatos = basedatos;
        
        initComponents();
        initAlternComponent();
    }
    
    public void initAlternComponent(){
        setTitle("Guardar Imagen en Base de Datos");
        setLocationRelativeTo(null);
        setVisible(true);
        imagenTemporal = null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        btnLoadImage = new javax.swing.JButton();
        panelPreview = new javax.swing.JPanel();
        etqPreview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imagenLabel = new javax.swing.JLabel();
        btnUploadImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("GUARDAR IMAGEN BASE DATOS");

        btnLoadImage.setBackground(new java.awt.Color(0, 51, 255));
        btnLoadImage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLoadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnLoadImage.setText("Buscar Imagen");
        btnLoadImage.setFocusable(false);
        btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelPreview.setBackground(new java.awt.Color(255, 255, 255));

        etqPreview.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqPreview.setText("Vista Previa");

        imagenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(imagenLabel);

        btnUploadImage.setBackground(new java.awt.Color(0, 102, 51));
        btnUploadImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUploadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadImage.setText("Guardar");
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPreviewLayout = new javax.swing.GroupLayout(panelPreview);
        panelPreview.setLayout(panelPreviewLayout);
        panelPreviewLayout.setHorizontalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPreviewLayout.setVerticalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addComponent(etqPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUploadImage, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);
        
        int seleccion = fileChooser.showOpenDialog(panelPreview);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            imagenTemporal = new ImageIcon(rutaImagen);
            Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);

            imagenLabel.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed
            
            
            basedatos.uploadPhoto(cedula, imagenTemporal);
            
            dispose();
        
    }//GEN-LAST:event_btnUploadImageActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JLabel etqPreview;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelPreview;
    // End of variables declaration//GEN-END:variables
}
