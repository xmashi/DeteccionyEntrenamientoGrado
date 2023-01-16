package model;

public class Senales {
    public String nombre;
    public String codigo;
    public String tipo;
    public String significado;

    public Senales(String nombre, String codigo, String tipo, String significado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.significado = significado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }
}
