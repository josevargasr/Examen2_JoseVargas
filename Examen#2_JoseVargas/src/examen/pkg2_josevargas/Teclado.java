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
public class Teclado extends Parte implements Serializable{
    private String material;
    private Color color;
    private static final long serialVersionUID=777L;

    public Teclado(String material, Color color, int tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "Material = " + material + ", Color = " + color + '}';
    }
    
    
}
