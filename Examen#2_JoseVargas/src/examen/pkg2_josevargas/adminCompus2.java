/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_josevargas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josevargas
 */
public class adminCompus2 {
    private ArrayList<Orden_Ensamblaje> listafallos = new ArrayList();
    private File archivo = null;

    public adminCompus2(String path) {
        archivo = new File(path);
    }

    public ArrayList<Orden_Ensamblaje> getListafallos() {
        return listafallos;
    }

    public void setListafallos(ArrayList<Orden_Ensamblaje> listafallos) {
        this.listafallos = listafallos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminCompus2{" + "listafallos=" + listafallos + '}';
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write("Informe de Fallo:");
            for (Orden_Ensamblaje p : listafallos) {
                bw.newLine();
                bw.write("La computadora serie " + p.getComputadora().getSerie());
                bw.write(" falló al ser ensamblada por " + p.getTecnico());
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    
}
