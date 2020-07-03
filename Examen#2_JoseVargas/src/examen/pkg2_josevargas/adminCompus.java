/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_josevargas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author josevargas
 */
public class adminCompus {
    private ArrayList<Computadora> listacompus = new ArrayList();
    private File archivo = null;

    public adminCompus(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getListacompus() {
        return listacompus;
    }

    public void setListacompus(ArrayList<Computadora> listacompus) {
        this.listacompus = listacompus;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCompu(Computadora c) {
        this.listacompus.add(c);
    }

    @Override
    public String toString() {
        return "adminCompus{" + "listacompus=" + listacompus + '}';
    }
    
    public void cargarArchivo() {
        try {            
            listacompus = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        listacompus.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora t : listacompus) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
