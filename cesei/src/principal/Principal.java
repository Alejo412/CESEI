
package principal;


import administrador.Menu_Admin;
import utils.BaseDatos;
import utils.Usuario;
import vigilante.Menu_vigilante;


public class Principal {
     public static void main(String[] args) {
         
         BaseDatos basedatos = new BaseDatos();
         //Usuario usuario = new Usuario();
         
       
         //String cedulaUsuario = usuario.getCedula();
         //String passwordUsuario = usuario.getPassword();
        
         Login login = new Login(basedatos);
         //Menu_vigilante menu = new Menu_vigilante(cedulaUsuario, passwordUsuario, basedatos);
         //Menu_Admin menuAdmi = new Menu_Admin(cedulaUsuario, passwordUsuario, basedatos);
         
         
        
        
        
    }  
}
