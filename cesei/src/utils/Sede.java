
package utils;


public class Sede {
   
    String Nsede;
    String direccion;
    String contacto;
    String cedulaAdmin;

    public Sede(String Nsede, String direccion, String contacto, String cedulaAdmin) {
        this.Nsede = Nsede;
        this.direccion = direccion;
        this.contacto = contacto;
        this.cedulaAdmin = cedulaAdmin;
    }

    public String getNsede() {
        return Nsede;
    }

    public String getContacto() {
        return contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedulaAdmin() {
        return cedulaAdmin;
    }

    public void setNsede(String Nsede) {
        this.Nsede = Nsede;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedulaAdmin(String cedulaAdmin) {
        this.cedulaAdmin = cedulaAdmin;
    }
    
    
    
    
}
