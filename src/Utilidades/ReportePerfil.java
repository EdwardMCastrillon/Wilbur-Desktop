/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ReportePerfil extends JFrame{

    JTable tablaPartos = null;//tabla
    JScrollPane scroll;
    DefaultTableModel modeloPartos;

    public ReportePerfil() {

        super("Base de Datos Partos");
        setSize(1300, 325);
        setVisible(true);
        setResizable(false);
        setLocation(10, 150);
        String Identificadores[] = new String[4];
        String datosAnimal[] = new String[4];
        modeloPartos = new DefaultTableModel();
        tablaPartos = new JTable(modeloPartos);//se añade el modelo a la tabla
        scroll = new JScrollPane(tablaPartos);//se añade la tabla al scroll (contenedor)
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(scroll);
        int i = 0;
        Identificadores[0] = "Núumero Documento";
        Identificadores[1] = "Nombre";
        Identificadores[2] = "Perfil";
        Identificadores[3] = "Nombre Usuario"; 

        for (int j = 0; j < 3; j++) //añaden columnas
        {
            modeloPartos.addColumn(Identificadores[j]);
        }

        try {

       /*     while (auxi != null) {

                datosAnimal[0] = auxi.getPerfil().getNumCedula();
                datosAnimal[1] = auxi.getPerfil().getNombre();
                datosAnimal[2] = auxi.getPerfil().getPerfil();
                datosAnimal[3] = auxi.getPerfil().getUsuario(); 

                modeloPartos.addRow(datosAnimal);//se añade el registro al modelo

                auxi = auxi.getLiga();

            }*/
        } catch (Exception ex) {
            System.out.print(ex);
        }

        this.repaint();
    }
}
