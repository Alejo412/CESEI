
package principal;


import administrador.Menu_Admin;
import utils.BaseDatos;
import vigilante.Menu_vigilante;


public class Principal {
     public static void main(String[] args) {
         
         BaseDatos basedatos = new BaseDatos();
        
         //Login login = new Login(basedatos);
         //Menu_vigilante menu = new Menu_vigilante();
         Menu_Admin menu = new Menu_Admin(basedatos);
         
         
        
        
        
    }  
}
