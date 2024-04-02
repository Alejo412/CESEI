
package utils;


public class Usuario {
      
    String cedula;
    String nombres;
    String apellidos;
    String telefono;
    String email;
    String password;
    String tipo;
    String fecha_nacimiento;
    String foto;

    public Usuario(String cedula, String nombres, String apellidos, String telefono, String email, String password, String tipo, String fecha_nacimiento, String foto) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
        this.fecha_nacimiento=fecha_nacimiento;
        this.foto = foto;
    }

    public String getCedula() {
        return cedula;
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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }


    public String getFoto() {
        return foto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
}
