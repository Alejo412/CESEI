
package utils;


public class Persona_computador {
    
    String id_ingreso ;
    String id_persona;
    String codigo_eqipo;
    String fecha_ingreso;
    String fecha_salida ;
    

    public Persona_computador(String id_ingreso, String id_persona, String codigo_eqipo, String fecha_ingreso, String fecha_salida) {
        this.id_ingreso = id_ingreso;
        this.id_persona = id_persona;
        this.codigo_eqipo = codigo_eqipo;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        
    }

    public String getId_ingreso() {
        return id_ingreso;
    }

    public String getId_persona() {
        return id_persona;
    }

    public String getCodigo_eqipo() {
        return codigo_eqipo;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    

    public void setId_ingreso(String id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public void setCodigo_eqipo(String codigo_eqipo) {
        this.codigo_eqipo = codigo_eqipo;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    
    
    
    
    
}
