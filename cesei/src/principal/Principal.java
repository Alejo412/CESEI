
package principal;

import utils.BaseDatos;
import vigilante.Menu;


public class Principal {
     public static void main(String[] args) {
         
         BaseDatos basedatos = new BaseDatos();
         
         Login login = new Login(basedatos);
        
        
        
    }  
}
