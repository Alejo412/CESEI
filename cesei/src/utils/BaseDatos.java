package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
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
import java.sql.Types;

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

    public Usuario validarIngreso(String cedula){
       
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
                    String password = registros.getNString("password");
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
                    
                    encontrado = new Usuario(cedula, nombres, apellidos, telefono, correo, getMD5(password), tipo, fecha_nacimiento, foto);
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
    
    public Sede [] extraerSedes(){
        try {
            Sede arreglo [] = new Sede[100];
            String consulta = "SELECT * FROM Sede";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                int i = 0;
                do{
                    String id_sede = registros.getString("id_sede");
                    String direccion = registros.getString("direccion");
                    String contacto = registros.getString("contacto");
                    String id_usuario = registros.getString("id_usuario");
                
                    
                    arreglo[i] = new Sede(id_sede, direccion, contacto, id_usuario);
                    i++;
                }while(registros.next());
                 
                System.out.println("SELECT exitoso ");
                return arreglo;
            }else{
                return arreglo;
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
        String consulta = "INSERT INTO sede ( id_sede,  direccion,  contacto,  id_usuario) VALUES ('" + Nsede + "', '" + direccion + "', '" + contacto + "', '" + cedulaAdmin + "')";
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
            String consulta = "INSERT INTO usuario_sede ( id_usuario,  id_sede,  fecha_inicio,  fecha_fin) VALUES (?, ?, ?, ?)";
            

        try( PreparedStatement statement = conexion.prepareStatement(consulta)) {
       
        statement.setString(1, id_usuario);
        statement.setString(2, id_sede);
        statement.setString(3, fecha_inicio);
 
        // Si fecha_fin es null, establecerlo como null en la consulta
            if (fecha_fin == null) {
               statement.setNull(4, Types.TIMESTAMP);
            } else {
                statement.setString(4, fecha_fin);
            }

        //  Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();
            System.out.println("Usuario_Sede insertado correctamente.");
        } catch (SQLException ex) {
            System.out.println("Error al insertar Usuario_Sede:");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public Sede buscarSedesAcargo( String id_usuario){
          Sede sedeEncontrada = null;
        try {
  
            String consulta = "SELECT * FROM usuario_sede  JOIN sede ON ( usuario_sede.id_sede=sede.id_sede) WHERE  usuario_sede.id_usuario = '"+id_usuario+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                
             String id_sede = registros.getString("id_sede"); 
             String direccion = registros.getString("direccion");
             String contacto = registros.getString("contacto");
            
            
                
                sedeEncontrada = new Sede(id_sede, direccion, contacto, id_usuario);
                return sedeEncontrada;
           
            }
               
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        
        }
         return sedeEncontrada;
    }
    
    public Usuario_Sede validarUsuario_Sede( String id_usuario){
          Usuario_Sede usuario_sedeEncontrado = null;
        try {
  
            String consulta = "SELECT * FROM usuario_sede  JOIN sede ON ( usuario_sede.id_sede=sede.id_sede) WHERE  usuario_sede.id_usuario = '"+id_usuario+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                
                
             String id_sede = registros.getString("id_sede");
             String fecha_inicio = registros.getString("fecha_inicio");
               String fecha_fin = registros.getString("fecha_fin");
            
            
                
                usuario_sedeEncontrado = new Usuario_Sede(id_usuario, id_sede, fecha_inicio, fecha_fin);
                return usuario_sedeEncontrado;
           
            }
               
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        
        }
         return usuario_sedeEncontrado;
    }
    
     public boolean editarFechaFinUsuario_Sede(String id_usuario,String id_sede, String fecha_fin){
          boolean respuesta = false;
        try {
            String consulta = "UPDATE Usuario_Sede SET fecha_fin='"+fecha_fin+"' WHERE id_usuario='"+id_usuario+"' AND id_sede='"+id_sede+"'";
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
    
    


public Usuario BuscarUsuario(String documento) {
    Usuario encontrado = null;

    try {
        String consulta = "SELECT * FROM usuario WHERE usuario.id_usuario = '" + documento + "'";
        ResultSet registros = manipularDB.executeQuery(consulta);

        if (registros.next()) {
            String nombres = registros.getString("nombres");
            String apellidos = registros.getString("apellidos");
            String telefono = registros.getString("telefono");
            String correo = registros.getString("correo");
            String tipo = registros.getString("tipo");
            String password = registros.getString("password");
            
            // Obtener la fecha de nacimiento como un objeto java.sql.Date
            java.sql.Date fechaNacimientoSql = registros.getDate("f_nacimiento");
            
            // Convertir la fecha de nacimiento a una cadena (string)
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaNacimiento = sdf.format(fechaNacimientoSql);
            
            Image foto = null;

            // Cargar la foto BLOB en un objeto Image
            InputStream inputStream = registros.getBinaryStream("foto");
            if (inputStream != null) {
                byte[] bytes = new byte[inputStream.available()];
                inputStream.read(bytes);
                foto = new ImageIcon(bytes, documento).getImage();
            }

            encontrado = new Usuario(documento, nombres, apellidos, telefono, correo, password, tipo, fechaNacimiento, foto);
        }
    } catch (IOException ex) {
        System.out.println("Se presentó un error al extraer la foto: " + ex.getMessage());
    } catch (SQLException ex) {
        System.out.println("Error al ejecutar el SELECT: " + ex.getMessage());
    }

    return encontrado;
}



public boolean editarUsuario(String cedula, String nombre, String apellido, String correo, String telefono, String fechaNacimiento, ImageIcon nuevaImagen) {
    try {
        // Convertir la imagen a un array de bytes
        byte[] nuevaImagenBytes = null;
        if (nuevaImagen != null) {
            Image img = nuevaImagen.getImage();
            BufferedImage bImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D bImageGraphics = bImage.createGraphics();
            bImageGraphics.drawImage(img, 0, 0, null);
            bImageGraphics.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bImage, "png", baos);
            nuevaImagenBytes = baos.toByteArray();
        }
        
        // Crear la consulta SQL para actualizar los datos del usuario
        String consulta;
        if (nuevaImagenBytes != null) {
            consulta = "UPDATE usuario SET nombres = ?, apellidos = ?, correo = ?, telefono = ?, f_nacimiento = ?, foto = ? WHERE id_usuario = ?";
        } else {
            consulta = "UPDATE usuario SET nombres = ?, apellidos = ?, correo = ?, telefono = ?, f_nacimiento = ? WHERE id_usuario = ?";
        }
        
        // Preparar la consulta SQL
        PreparedStatement statement = conexion.prepareStatement(consulta);
        
        // Establecer los valores de los parámetros de la consulta
        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.setString(3, correo);
        statement.setString(4, telefono);
        
        // Convertir la fecha de nacimiento a un objeto Date de manera segura
        java.sql.Date fechaSql = null;
        if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
            fechaSql = java.sql.Date.valueOf(fechaNacimiento);
        }
        statement.setDate(5, fechaSql);
        
        // Establecer la nueva imagen como un Blob
        if (nuevaImagenBytes != null) {
            ByteArrayInputStream bais = new ByteArrayInputStream(nuevaImagenBytes);
            statement.setBinaryStream(6, bais, nuevaImagenBytes.length);
            statement.setString(7, cedula);
        } else {
            statement.setString(6, cedula);
        }
        
        // Ejecutar la consulta SQL
        int filasActualizadas = statement.executeUpdate();
        
        // Verificar si se actualizaron correctamente las filas
        if (filasActualizadas > 0) {
            return true; // La edición fue exitosa
        } else {
            return false; // No se actualizó ninguna fila, puede que el usuario no exista
        }
    } catch (SQLException ex) {
        System.out.println("Error al ejecutar la consulta de actualización: " + ex.getMessage());
        return false;
    } catch (IOException ex) {
        System.out.println("Error al convertir la imagen: " + ex.getMessage());
        return false;
    }
}
}







