package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

    public Usuario validarIngreso(String cedula, String password){
       
            Usuario encontrado = null;
        try {
  
            String consulta = "SELECT * FROM usuario  WHERE usuario.id_usuario = '"+cedula+"' AND usuario.password ='"+password+"'";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                
            
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
                    Image foto = null;
                
                    // Codigo para Cargar la Foto BLOB en un Objeto IMAGE
                    InputStream inputStream = registros.getBinaryStream("foto");
                    if (inputStream!=null) {
                        byte[] bytes = new byte[inputStream.available()];
                        inputStream.read(bytes);
                        foto = new ImageIcon(bytes, cedula).getImage();
                    }
                    
                    encontrado = new Usuario(cedula, nombres, apellidos, telefono, correo, password, tipo, fecha_nacimiento, foto);
                return encontrado;
           
            }
               
            
        } catch (IOException ex) {
            System.out.println("Se presento un error al extraer la foto: "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        
        }
         return encontrado;
    }
    
    
     public Usuario buscarusuario(String cedula){
       
            Usuario encontrado = null;
        try {
  
            String consulta = "SELECT * FROM usuario  WHERE usuario.id_usuario = '"+cedula+"'";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                
            
                    String nombres = registros.getString("nombres");
                    String apellidos = registros.getString("apellidos");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("correo");
                    String tipo = registros.getString("tipo");
                    String password = registros.getString("password");
                    // Obtener la fecha de nacimiento como un objeto java.sql.Date
                    java.sql.Date fecha_nacimiento_sql = registros.getDate("f_nacimiento");
                    // Convertir la fecha de nacimiento a una cadena (string)
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String fecha_nacimiento = sdf.format(fecha_nacimiento_sql);
                    Image foto = null;
                
                    // Codigo para Cargar la Foto BLOB en un Objeto IMAGE
                    InputStream inputStream = registros.getBinaryStream("foto");
                    if (inputStream!=null) {
                        byte[] bytes = new byte[inputStream.available()];
                        inputStream.read(bytes);
                        foto = new ImageIcon(bytes, cedula).getImage();
                    }
                    
                    encontrado = new Usuario(cedula, nombres, apellidos, telefono, correo, password, tipo, fecha_nacimiento, foto);
                return encontrado;
           
            }
               
            
        } catch (IOException ex) {
            System.out.println("Se presento un error al extraer la foto: "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        
        }
         return encontrado;
    }
     
    public Sede buscarSede(String id_sede){
          Sede sedeEncontrada = null;
        try {
  
            String consulta = "SELECT * FROM sede WHERE id_sede = '"+id_sede+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                
             String direccion = registros.getString("direccion");
                String contacto = registros.getString("contacto");
                String id_usuario = registros.getString("id_usuario");
                
                sedeEncontrada = new Sede(id_sede, direccion, contacto, id_usuario);
                return sedeEncontrada;
           
            }
               
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        
        }
         return sedeEncontrada;
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
    
    public void insertarUsuario(String idUsuario, String nombres, String apellidos, String correo, String password, String telefono, String fechaNacimiento) {
    try {
        String consulta = "INSERT INTO usuario (id_usuario, nombres, apellidos, correo, password, telefono, f_nacimiento) VALUES ('" + idUsuario + "', '" + nombres + "', '" + apellidos + "', '" + correo + "', '" + password + "', '" + telefono + "', '" + fechaNacimiento + "')";
        manipularDB.executeUpdate(consulta);
        System.out.println("Usuario insertado correctamente.");
    } catch (SQLException ex) {
        System.out.println("Error al insertar Usuario:");
        System.out.println(ex.getMessage());
    }
}
    public void insertarSede(String Nsede,String direccion, String contacto, String cedulaAdmin){
        try {
        String consulta = "INSERT INTO sede (String id_sede, String direccion, String contacto, String id_usuario) VALUES ('" + Nsede + "', '" + direccion + "', '" + contacto + "', '" + cedulaAdmin + "')";
        manipularDB.executeUpdate(consulta);
        System.out.println("Sede insertado correctamente.");
    } catch (SQLException ex) {
        System.out.println("Error al insertar Sede:");
        System.out.println(ex.getMessage());
    }
    }
    public boolean editarSede(String id_sede, String direccion, String contacto){
          boolean respuesta = false;
        try {
            String consulta = "UPDATE sede SET direccion='"+direccion+"', contacto='"+contacto+"'";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }
        return respuesta;
    }
    public boolean eliminarSede(String id_sede){
        boolean respuesta = false;
        try {
            String consulta = "DELETE FROM sede WHERE id_sede='"+id_sede+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }

    public void insertarUsuario_Sede(String id_usuario,String id_sede, String fecha_inicio, String fecha_fin){
        try {
        String consulta = "INSERT INTO usuario_sede (String id_usuario, String id_sede, String fecha_inicio, String fecha_fin) VALUES ('" + id_usuario + "', '" + id_sede + "', '" + fecha_inicio + "', '" + fecha_fin + "')";
        manipularDB.executeUpdate(consulta);
        System.out.println("Usuario_Sede insertado correctamente.");
    } catch (SQLException ex) {
        System.out.println("Error al insertar Usuario_Sede:");
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
