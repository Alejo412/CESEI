
package utils;


public class Persona {
    
    String id_persona;
    String nombres;
    String apellidos;
    String telefono;

    
    public Persona(String id_persona, String nombres, String apellidos, String telefono) {
        this.id_persona = id_persona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    
    public String getId_persona() {
        return id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    
    
    
}
