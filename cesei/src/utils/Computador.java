
package utils;


public class Computador {
    String codigo;
    String marca;
    String id_persona;

    public Computador(String codigo, String marca, String id_persona) {
        this.codigo = codigo;
        this.marca = marca;
        this.id_persona = id_persona;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }
    
    
    
}
