/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Nodos.NodoAnimal;
import Nodos.NodoUsuario;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDWARD:..
 */
public class ReporteUsu extends JFrame {

    JTable tabla;//tabla

    JScrollPane scroll;

    public ReporteUsu(NodoUsuario L) {
        super("Reporte de Personal");
        JScrollPane caja;
        JLabel lbtitulo;
        DefaultTableModel modelo = null;
        String Identificadores[] = new String[13];
        String Secundarios[] = new String[13];
        int i = 0;
        Identificadores[0] = "Tipo Documento";
        Identificadores[1] = "# Documento";
        Identificadores[2] = "Nombre y Apellido";
        Identificadores[3] = "Fecha Nacimiento";
        Identificadores[4] = "Direccion";
        Identificadores[5] = "Telefono";
        Identificadores[6] = "Movil";
        Identificadores[7] = "Correo";

        //modelo 
        modelo = new DefaultTableModel();//inicializa
        for (int j = 0; j <= 7; j++) //añaden columnas
        {
            modelo.addColumn(Identificadores[j]);
        }

        while (L != null) {

            Secundarios[0] = L.getUsuario().getTipoDoc();
            Secundarios[1] = L.getUsuario().getDocumento();
            Secundarios[2] = L.getUsuario().getNombre();
            Secundarios[3] = L.getUsuario().getFechaNacimiento().toString();
            Secundarios[4] = L.getUsuario().getDireccion();
            Secundarios[5] = L.getUsuario().getTelefono();
            Secundarios[6] = L.getUsuario().getMovil();
            Secundarios[7] = L.getUsuario().getCorreo();

            modelo.addRow(Secundarios);//se añade el registro al modelo
            i++;
            L = L.getLiga();

        }
        tabla = new JTable(modelo);//se añade el modelo a la tabla

        caja = new JScrollPane(tabla);//se añade la tabla al scroll (contenedor)
        caja.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(caja);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1200, 325);
        this.setVisible(true);
        repaint();
    }
    //Fecha Actual
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    //Hora actual
    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }

}
