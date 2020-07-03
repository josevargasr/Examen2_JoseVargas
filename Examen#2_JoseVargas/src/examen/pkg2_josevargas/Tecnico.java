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
public class Tecnico {
    private String nombre;
    private int edad;
    private String genero;
    private int cant_compus;

    public Tecnico(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        cant_compus = 0;
    }

    public Tecnico(String nombre, int edad, String genero, int cant_compus) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cant_compus = cant_compus;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCant_compus() {
        return cant_compus;
    }

    public void setCant_compus(int cant_compus) {
        this.cant_compus = cant_compus;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
