/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulos;

import java.io.Serializable;


/**
 *
 * @author ESFOT
 */
public class Articulos implements Serializable {

    private String nombre;
    private int precio;
    private String marca;
    private String tipo;
    public Articulos() {
    }

    public Articulos(String nombre, int precio, String marca, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre+" "+ precio+" "+ marca+" "+ tipo;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
