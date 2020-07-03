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
public class administrarTecnicos {
    private ArrayList<Tecnico> listatecnicos = new ArrayList();
    private File archivo = null;

    public administrarTecnicos(String path) {
        archivo = new File(path);
                
    }

    public ArrayList<Tecnico> getListatecnicos() {
        return listatecnicos;
    }

    public void setListatecnicos(ArrayList<Tecnico> listatecnicos) {
        this.listatecnicos = listatecnicos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarTecnicos{" + "listatecnicos=" + listatecnicos + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Tecnico p : listatecnicos) {
                bw.write(p.getNombre() + ";");
                bw.write(p.getEdad() + ";");
                bw.write(p.getGenero() + ";");
                bw.write(p.getCant_compus()+ ";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        listatecnicos = new ArrayList();
        if(archivo.exists()){
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    listatecnicos.add(new Tecnico(sc.next(), sc.nextInt(), sc.next(), sc.nextInt()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
        
    }
}
