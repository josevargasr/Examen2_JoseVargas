/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_josevargas;

/**
 *
 * @author josevargas
 */
public class Orden_Ensamblaje {
    private Computadora computadora;
    private Tecnico tecnico;

    public Orden_Ensamblaje(Computadora computadora, Tecnico tecnico) {
        this.computadora = computadora;
        this.tecnico = tecnico;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Orden_Ensamblaje{" + "computadora=" + computadora + ", tecnico=" + tecnico + '}';
    }
    
    
}
