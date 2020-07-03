/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_josevargas;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author josevargas
 */
public class Computadora implements Serializable{
    private int serie;
    private int año;
    private Color color;
     private String material;
    private Ram ram;
    private Disco_Duro disco;
    private Bateria bateria;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;
    private static final long serialVersionUID=777L;

    public Computadora(int serie, int año, Color color, String material, Ram ram, Disco_Duro disco, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.serie = serie;
        this.año = año;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disco = disco;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Disco_Duro getDisco() {
        return disco;
    }

    public void setDisco(Disco_Duro disco) {
        this.disco = disco;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora Serie: " + serie;
    }
    
    
}
