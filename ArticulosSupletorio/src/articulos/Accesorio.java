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
public class Accesorio implements Serializable{
    
    private String tipo;
    private String color;

    public Accesorio(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }
    
    public Accesorio() {}
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
