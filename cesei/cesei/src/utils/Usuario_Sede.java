
package utils;


public class Usuario_Sede {
    
    String id_usuario;
    String id_sede;
    String fecha_inicio;
    String fecha_fin;

    public Usuario_Sede(String id_usuario, String id_sede, String fecha_inicio, String fecha_fin) {
        this.id_usuario = id_usuario;
        this.id_sede = id_sede;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public String getId_sede() {
        return id_sede;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_sede(String id_sede) {
        this.id_sede = id_sede;
    }

    public void setFecha_inicio(String fechaInicio) {
        this.fecha_inicio = fechaInicio;
    }

    public void setFecha_fin(String fechaFin) {
        this.fecha_fin = fechaFin;
    }
    
    
    
}
