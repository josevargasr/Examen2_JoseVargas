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
public class Pantalla extends Parte implements Serializable{
    private boolean tactil;
    private String tipo;
    private static final long serialVersionUID=777L;

    public Pantalla(boolean tactil, String tipo, int tiempo) {
        super(tiempo);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "tactil=" + tactil + ", tipo=" + tipo + '}';
    }
    
    
}
