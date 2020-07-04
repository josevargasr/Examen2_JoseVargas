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
public class Procesador extends Parte implements Serializable{
    private int nucleos;
    private double velocidad;
    private static final long serialVersionUID=777L;

    public Procesador(int nucleos, double velocidad, int tiempo) {
        super(tiempo);
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" + "Nucleos = " + nucleos + ", Velocidad = " + velocidad + '}';
    }
    
    
}
