/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Identidades.DatosPersonal;
import crudBaseDatos.CrudPersonal;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
    List<DatosPersonal> listaPersonal;
    CrudPersonal basePersonal;

    public ReporteUsu() {
        super("Reporte de Personal");
        JScrollPane caja;
        JLabel lbtitulo;
        DefaultTableModel modelo = null;
        String Identificadores[] = new String[13];
        String datosUsuarios[] = new String[13];
        int i = 0;
        basePersonal = new CrudPersonal();
        Identificadores[0] = "Número Documento";
        Identificadores[1] = "Tipo Documento";
        Identificadores[2] = "Nombres";
        Identificadores[3] = "Apellido1";
        Identificadores[4] = "Apellido2";
        Identificadores[5] = "Fecha Nacimiento";
        Identificadores[6] = "Dirección";
        Identificadores[7] = "Teléfono Fijo";
        Identificadores[8] = "Correo";
        Identificadores[9] = "Profesion";
        Identificadores[10] = "Cargo";
        Identificadores[11] = "Tipo Contrato";
        Identificadores[12] = "Fecha Contrato";

        //modelo 
        modelo = new DefaultTableModel();//inicializa
        for (int j = 0; j < 12; j++) //añaden columnas
        {
            modelo.addColumn(Identificadores[j]);
        }
        listaPersonal = basePersonal.cargarUsuarios();
        for (DatosPersonal usuario : listaPersonal) {

            datosUsuarios[0] = String.valueOf(usuario.getDocumento());
            datosUsuarios[1] = usuario.getNombreTipoDoc();
            datosUsuarios[2] = usuario.getNombre();
            datosUsuarios[3] = usuario.getPrimerApellido();
            datosUsuarios[4] = usuario.getSegundoApellido();
            datosUsuarios[5] = usuario.getFechaNacimiento().toString();
            datosUsuarios[6] = usuario.getDireccion();
            datosUsuarios[7] = String.valueOf(usuario.getTelefono());
            datosUsuarios[8] = usuario.getCorreo();
            datosUsuarios[9] = usuario.getNombreProf();
            datosUsuarios[10] = usuario.getNombreCargo();
            datosUsuarios[11] = usuario.getNombreTipoCont();
            datosUsuarios[12] = usuario.getFechaContrato().toString();

            modelo.addRow(datosUsuarios);//se añade el registro al modelo

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
