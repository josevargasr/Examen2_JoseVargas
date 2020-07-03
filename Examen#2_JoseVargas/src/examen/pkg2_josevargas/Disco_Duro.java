/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_josevargas;

import java.io.Serializable;

/**
 *
 * @author josevargas
 */
public class Disco_Duro extends Parte implements Serializable{
    private int tamaño;
    private String marca;
    private static final long serialVersionUID=777L;

    public Disco_Duro(int tamaño, String marca, int tiempo) {
        super(tiempo);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ram{" + "tamaño=" + tamaño + ", marca=" + marca + '}';
    }
}
