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
public class Computador implements Serializable {
    
    private String tipo;
    private int capacidad;
    private int ram;
    private String procesador;

    public Computador(String tipo, int capacidad, int ram, String procesador) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ram = ram;
        this.procesador = procesador;
    }
 
    Computador() {}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
}
