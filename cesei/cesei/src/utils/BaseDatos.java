package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import utils.Usuario;

public class BaseDatos {

    Connection conexion;
    Statement manipularDB;

    public BaseDatos() {
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "cesei";
        String user = "root";
        String password = "";

        String url = "jdbc:mysql://" + hostname + ":" + puerto + "/" + databasename;

        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion exitosa.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }

    public Usuario validarIngreso(String cedula, String password) {
        Usuario encontrado = null;
        try {
            String consulta = "SELECT * FROM usuario  WHERE usuario.id_usuario = '" + cedula + "' AND usuario.password ='" + password + "'";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                String nombres = registros.getString("nombres");
                String apellidos = registros.getString("apellidos");
                String telefono = registros.getString("telefono");
                String correo = registros.getString("correo");
                String tipo = registros.getString("tipo");
                // Obtener la fecha de nacimiento como un objeto java.sql.Date
                java.sql.Date fecha_nacimiento_sql = registros.getDate("f_nacimiento");
                // Convertir la fecha de nacimiento a una cadena (string)
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecha_nacimiento = sdf.format(fecha_nacimiento_sql);
                String foto = registros.getString("foto");

                encontrado = new Usuario(cedula, nombres, apellidos, telefono, correo, password, tipo, fecha_nacimiento, foto);
                return encontrado;
            } else {
                return encontrado;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public String getMD5(String input) {
        try {
            // Obtener una instancia del algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Convertir el String a bytes
            byte[] messageDigest = md.digest(input.getBytes());

            // Convertir los bytes a un String hexadecimal
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            // Añadir ceros a la izquierda si es necesario
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            // Devolver el hash MD5
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
public void insertarVigilante(String idUsuario, String nombres, String apellidos, String correo, String password, String telefono, String fechaNacimiento) {
    try {
        String consulta = "INSERT INTO usuario (id_usuario, nombres, apellidos, correo, password, telefono, f_nacimiento) VALUES ('" + idUsuario + "', '" + nombres + "', '" + apellidos + "', '" + correo + "', '" + password + "', '" + telefono + "', '" + fechaNacimiento + "')";
        manipularDB.executeUpdate(consulta);
        System.out.println("Vigilante insertado correctamente.");
    } catch (SQLException ex) {
        System.out.println("Error al insertar vigilante:");
        System.out.println(ex.getMessage());
    }
}

public boolean uploadPhoto(String cedula, ImageIcon imageIcon) {
        boolean respuesta = false;

        try {
            // Get the underlying image from the ImageIcon
            Image image = imageIcon.getImage();

            // Create a BufferedImage with the same dimensions and type as the original image
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

            // Use graphics context to draw the original image onto the BufferedImage
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.drawImage(image, 0, 0, null);
            g2.dispose();

            // Convert the BufferedImage to byte[] 
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            byte[] imageBytes = baos.toByteArray();

            // Rest of your code remains the same
            Blob imageBlob = conexion.createBlob();
            imageBlob.setBytes(1, imageBytes);

            String consulta = "UPDATE usuario SET foto = ? WHERE id_usuario = ?";
            PreparedStatement prepared = conexion.prepareStatement(consulta);
            prepared.setBlob(1, imageBlob);
            prepared.setString(2, cedula);
            respuesta = prepared.execute();

        } catch (IOException ex) {
            System.out.println("Error en IO en Foto: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE Foto: " + ex.getMessage());
        }

        return respuesta;
    }
}
