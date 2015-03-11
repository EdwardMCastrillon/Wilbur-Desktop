/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Utilidades.*;
import Listas.*;
import Nodos.NodoParto;

/**
 *
 * @author EDWARD:.
 */
public class ReportePartos extends JFrame {

    JTable tabla;//tabla

    JScrollPane scroll;

    public ReportePartos(NodoParto P) {
        super("Reporte de Partos");
        JScrollPane caja;
        JLabel lbtitulo;
        DefaultTableModel modelo = null;
        String Identificadores[] = new String[13];
        String Secundarios[] = new String[13];
        int i = 0;
        Identificadores[0] = "Codigo del Parto";
        Identificadores[1] = "Fecha del parto";
        Identificadores[2] = "Codigo Madre";
        Identificadores[3] = "Raza Madre";
        Identificadores[4] = "Edad Madre";
        Identificadores[5] = "Numero de Vivos";
        Identificadores[6] = "Numero de Muertos";
        //modelo 
        modelo = new DefaultTableModel();//inicializa
        for (int j = 0; j <= 6; j++) //añaden columnas
        {
            modelo.addColumn(Identificadores[j]);
        }
        while (P != null) {

            Secundarios[0] = P.getParto().getCodPart();
            Secundarios[1] = P.getParto().getFechaParto().toString();
            Secundarios[2] = P.getParto().getCodigo();
            Secundarios[3] = P.getParto().getRaza();
            Secundarios[4] = P.getParto().getEdad();
            Secundarios[5] = P.getParto().getNroVivos();
            Secundarios[6] = P.getParto().getNroMuertos();

            modelo.addRow(Secundarios);//se añade el registro al modelo
            i++;
            P = P.getLiga();
        }

        tabla = new JTable(modelo);//se añade el modelo a la tabla

        caja = new JScrollPane(tabla);//se añade la tabla al scroll (contenedor)
        caja.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(caja);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1100, 325);
        this.setVisible(true);
        repaint();
    }

    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    //hora actual
    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }

}
