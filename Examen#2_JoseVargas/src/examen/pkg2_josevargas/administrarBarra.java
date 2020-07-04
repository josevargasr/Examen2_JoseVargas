package examen.pkg2_josevargas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;

public class administrarBarra extends Thread {

    private JProgressBar barra;
    private boolean vive;
    private Orden_Ensamblaje o;
    private JTable tabla;
    private JDialog ventana;
    private JList lista;

    public administrarBarra(JProgressBar barra, Orden_Ensamblaje o, JTable tabla, JDialog ventana, JList lista) {
        this.barra = barra;
        vive = true;
        this.o = o;
        this.tabla = tabla;
        this.ventana = ventana;
        this.lista = lista;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Orden_Ensamblaje getO() {
        return o;
    }

    public void setO(Orden_Ensamblaje o) {
        this.o = o;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void run() {
        int cont = 0;
        while (vive) {
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
            for (int i = 0; i < 6; i++) {
                barra.setValue(0);
                switch (i) {
                    case 0:
                        barra.setMaximum(o.getComputadora().getRam().getTiempo());
                        break;
                    case 1:
                        barra.setMaximum(o.getComputadora().getDisco().getTiempo());
                        break;
                    case 2:
                        barra.setMaximum(o.getComputadora().getBateria().getTiempo());
                        break;
                    case 3:
                        barra.setMaximum(o.getComputadora().getTeclado().getTiempo());
                        break;
                    case 4:
                        barra.setMaximum(o.getComputadora().getPantalla().getTiempo());
                        break;
                    case 5:
                        barra.setMaximum(o.getComputadora().getProcesador().getTiempo());
                        break;
                }
                for (int j = 0; j < barra.getMaximum(); j++) {
                    barra.setValue(barra.getValue() + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                switch (i) {
                    case 0:
                        Object[] row = {"Ram", o.getComputadora().getRam().getTiempo() + " segundos"};
                        m.addRow(row);
                        break;
                    case 1:
                        Object[] row2 = {"Disco Duro", o.getComputadora().getDisco().getTiempo() + " segundos"};
                        m.addRow(row2);
                        break;
                    case 2:
                        Object[] row3 = {"Bateria", o.getComputadora().getBateria().getTiempo() + " segundos"};
                        m.addRow(row3);
                        break;
                    case 3:
                        Object[] row4 = {"Teclado", o.getComputadora().getTeclado().getTiempo() + " segundos"};
                        m.addRow(row4);
                        break;
                    case 4:
                        Object[] row5 = {"Pantalla", o.getComputadora().getPantalla().getTiempo() + " segundos"};
                        m.addRow(row5);
                        break;
                    case 5:
                        Object[] row6 = {"Procesador", o.getComputadora().getProcesador().getTiempo() + " segundos"};
                        m.addRow(row6);
                        break;
                }
                tabla.setModel(m);
                barra.setValue(0);
            }
            boolean valid = ensamble();
            if(valid){
                JOptionPane.showMessageDialog(null, "Se ensambló la computadora con éxito");
                adminCompus ac=new adminCompus("./ensambladas.jfv");
                ac.cargarArchivo();
                ac.setCompu(o.getComputadora());
                ac.escribirArchivo();
                ((DefaultListModel) lista.getModel()).clear();
                DefaultListModel modelo2  = (DefaultListModel) lista.getModel();
                for (Computadora c : ac.getListacompus()) {
                    modelo2.addElement(c);
                }
                lista.setModel(modelo2);
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error al ensamblar la computadora");
                adminCompus2 ac=new adminCompus2("./fallos.txt");
                ac.getListafallos().add(o);
                try {
                    ac.escribirArchivo();
                } catch (IOException ex) {
                    
                }
            }
            ventana.dispose();
            vive = false;
        }
    }
    private boolean ensamble(){
        boolean valid = true;
        Random r = new Random();
        int comps = o.getTecnico().getCant_compus();
        int posib = r.nextInt(10);
        if(comps <= 5){
            if(posib<=3){
                valid = false;
            }
        }else if(comps <= 15){
            if(posib<=2){
                valid = false;
            }
        }else if(comps <= 30){
            if(posib<=1){
                valid = false;
            }
        }else{
            if(posib<=1){
                valid = false;
            }
        }
        return valid;
    }

}
