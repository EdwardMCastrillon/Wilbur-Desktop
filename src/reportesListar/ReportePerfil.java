/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportesListar;

import Identidades.DatosPerfil;
import crudBaseDatos.CrudPerfil;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ReportePerfil extends JFrame{

    JTable tablaPartos = null;//tabla
    JScrollPane scroll;
    DefaultTableModel modeloPartos;
    CrudPerfil basePerfil;
    List<DatosPerfil> listaPerfiles ;

    public ReportePerfil() {

        super("Base de Datos Partos");
        setSize(1300, 325);
        setVisible(true);
        setResizable(false);
        setLocation(10, 150);
        String Identificadores[] = new String[4];
        String datosPerfil[] = new String[4];
        modeloPartos = new DefaultTableModel();
        tablaPartos = new JTable(modeloPartos);//se añade el modelo a la tabla
        scroll = new JScrollPane(tablaPartos);//se añade la tabla al scroll (contenedor)
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(scroll);
        basePerfil = new CrudPerfil();
        int i = 0;
        Identificadores[0] = "Id Perfil";
        Identificadores[1] = "Número de Documento";
        Identificadores[2] = "Perfil";
        Identificadores[3] = "Nombre de Usuario"; 

        for (int j = 0; j < 3; j++) //añaden columnas
        {
            modeloPartos.addColumn(Identificadores[j]);
        }

        try {
            listaPerfiles = basePerfil.cargarPerfiles();
            for (DatosPerfil perfil : listaPerfiles) {

                datosPerfil[0] = String.valueOf(perfil.getIdPerfil());
                datosPerfil[1] = String.valueOf(perfil.getNumCedula());
                datosPerfil[2] = perfil.getNombrePerfil();
                datosPerfil[3] = perfil.getUsuario(); 

                modeloPartos.addRow(datosPerfil);//se añade el registro al modelo

            }
        } catch (Exception ex) {
            System.out.print(ex);
        }

        this.repaint();
    }
}
