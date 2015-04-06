/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.awt.Desktop;
import Listas.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import Reportes.*;

/**
 *
 * @author Ivan
 */
public class MenuPrincipal implements ActionListener {

    JFrame FraMenuPri;
    JMenuBar MenuBarPPal;
    JMenu menuPersonal, menuAnimal, menuJaulas, menuMaestros, menuAlmacen, menuPublicidad, menuAyuda, menuInformes;
    JMenuItem menItemPersonal, menItemPerfil, menItemModContra, menItemSalir, menItemAnimal, menItemHojaVida, menItemAsigJaula, menItemAliJaula;
    JMenuItem menItemAlimentos, menItemMedica, menItemPublicidad, menItemWeb, menItemBackup, menItemManual, menItemAcerca, menItemPartos;
    JMenuItem menItemDepar, menItemMuni, menItemRazas, menItemJaulas, menItemVacunas, menItemPermisos, menItemEtapa, menItemAgentes, menItemRecuperar,
              menItemReportesPersonal,menItemReportesPartos,menItemReportesAnimal;
    ImageIcon iconFondo, icoMensajePre;
    Image icoCabecera;
    JLabel labelFondo;
    int control;
    ListaAnimal listaAnima;
    ListaPartos listaPart;
    ListaRazas listaRazas;
    ListaUsuario listaPersona;
    ListaPerfil listaPerfi;
    ReporteAnimal reporteAnimal;
    ReportePartos reportePartos;
    ReportePersonal reportePersonal;

    public MenuPrincipal( String perfil, ListaAnimal listaAnima, ListaUsuario listaPersona, ListaPartos listaPart, ListaRazas R, ListaPerfil listaPerfi) {

        FraMenuPri = new JFrame("Menú Principal - " + perfil);
        FraMenuPri.setBounds(10, 10, 1350, 710);
        FraMenuPri.setLayout(null);
        FraMenuPri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER LA EJECUCIÓN CUANDO CIERRE
        FraMenuPri.setResizable(false);
        icoCabecera = Toolkit.getDefaultToolkit().getImage("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\1_Icono_Form.jpg");
        FraMenuPri.setIconImage(icoCabecera);
        FraMenuPri.setVisible(true);

        iconFondo = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\granjaHome.jpg");
        labelFondo = new JLabel(iconFondo);
        labelFondo.setBounds(0, 0, 1550, 750);
        FraMenuPri.add(labelFondo);
        labelFondo.setVisible(true);

        MenuBarPPal = new JMenuBar();
        FraMenuPri.setJMenuBar(MenuBarPPal); 

        if (perfil.equals("Administrador")) {

            control = 1;
        } else {

            if (perfil.equals("Veterinario")) {

                control = 2;
            } else {

                control = 3;
            }
        }

        switch (control) {

            case 1:
                menuPersonal = new JMenu("Gestionar Personal");
                MenuBarPPal.add(menuPersonal);
                menItemPersonal = new JMenuItem("Registrar Personal");
                menuPersonal.add(menItemPersonal);
                menItemPersonal.addActionListener(this);
                menItemPerfil = new JMenuItem("Asignar Perfil");
                menuPersonal.add(menItemPerfil);
                menItemPerfil.addActionListener(this); 
                menItemModContra = new JMenuItem("Modificar Contraseña");
                menuPersonal.add(menItemModContra);
                menItemModContra.addActionListener(this);
                menItemSalir = new JMenuItem("Salir");
                menuPersonal.add(menItemSalir);
                menItemSalir.addActionListener(this);

                menuAnimal = new JMenu("Gestionar Animal");
                MenuBarPPal.add(menuAnimal);
                menItemAnimal = new JMenuItem("Datos Animales");
                menuAnimal.add(menItemAnimal);
                menItemAnimal.addActionListener(this);
                menItemPartos = new JMenuItem("Datos Partos");
                menuAnimal.add(menItemPartos);
                menItemPartos.addActionListener(this);
                menItemHojaVida = new JMenuItem("Trazabilidad del Animal");
                menuAnimal.add(menItemHojaVida);
                menuAnimal.addActionListener(this);

                menuJaulas = new JMenu("Gestionar Jaulas");
                MenuBarPPal.add(menuJaulas);
                menItemAsigJaula = new JMenuItem("Asignar Animal a Jaula");
                menuJaulas.add(menItemAsigJaula);
                menItemAliJaula = new JMenuItem("Asignar Alimentos por Jaula");
                menuJaulas.add(menItemAliJaula);

                menuAlmacen = new JMenu("Gestionar Almacén");
                MenuBarPPal.add(menuAlmacen);
                menItemAlimentos = new JMenuItem("Bodega Alimentos");
                menuAlmacen.add(menItemAlimentos);
                menItemMedica = new JMenuItem("Bodega Medicamentos");
                menuAlmacen.add(menItemMedica);

                menuInformes = new JMenu("Gestionar Informes");
                MenuBarPPal.add(menuInformes);
                menItemReportesPartos = new JMenuItem("Reportes Partos");
                menuInformes.add(menItemReportesPartos);
                menItemReportesPartos.addActionListener(this);
                menItemReportesPersonal = new JMenuItem("Reportes Personal");
                menuInformes.add(menItemReportesPersonal);
                menItemReportesPersonal.addActionListener(this);
                menItemReportesAnimal = new JMenuItem("Reportes Animales");
                menuInformes.add(menItemReportesAnimal);
                menItemReportesAnimal.addActionListener(this);
                menItemBackup = new JMenuItem("Copia de Seguridad");
                menuInformes.add(menItemBackup);

                menuPublicidad = new JMenu("Publicidad");
                MenuBarPPal.add(menuPublicidad);
                menItemPublicidad = new JMenuItem("Catalogo");
                menuPublicidad.add(menItemPublicidad);
                menItemWeb = new JMenuItem("Página Web");
                menuPublicidad.add(menItemWeb);

                menuAyuda = new JMenu("Ayuda");
                MenuBarPPal.add(menuAyuda);
                menItemManual = new JMenuItem("Manual de Usuario");
                menItemManual.addActionListener(this);
                menuAyuda.add(menItemManual);
                menItemAcerca = new JMenuItem("Acerca de");
                menItemAcerca.addActionListener(this);
                menuAyuda.add(menItemAcerca);
                break;
            case 2:
                menuPersonal = new JMenu("Gestionar Personal");
                MenuBarPPal.add(menuPersonal);
                menItemModContra = new JMenuItem("Modificar Contraseña");
                menuPersonal.add(menItemModContra);
                menItemSalir = new JMenuItem("Salir");
                menuPersonal.add(menItemSalir);
                menItemSalir.addActionListener(this);

                menuAnimal = new JMenu("Gestionar Animal");
                MenuBarPPal.add(menuAnimal);
                menItemAnimal = new JMenuItem("Datos Animales");
                menuAnimal.add(menItemAnimal);
                menItemAnimal.addActionListener(this);
                menItemPartos = new JMenuItem("Datos Partos");
                menuAnimal.add(menItemPartos);
                menItemPartos.addActionListener(this);
                menItemHojaVida = new JMenuItem("Trazabilidad del Animal");
                menuAnimal.add(menItemHojaVida);
                menuAnimal.addActionListener(this);

                menuAlmacen = new JMenu("Gestionar Almacén");
                MenuBarPPal.add(menuAlmacen);
                menItemMedica = new JMenuItem("Bodega Medicamentos");
                menuAlmacen.add(menItemMedica); 

                menuPublicidad = new JMenu("Publicidad");
                MenuBarPPal.add(menuPublicidad);
                menItemWeb = new JMenuItem("Página Web");
                menuPublicidad.add(menItemWeb);

                menuAyuda = new JMenu("Ayuda");
                MenuBarPPal.add(menuAyuda);
                menItemManual = new JMenuItem("Manual de Usuario");
                menItemManual.addActionListener(this);
                menuAyuda.add(menItemManual);
                break;
            case 3:
                menuPersonal = new JMenu("Gestionar Personal");
                MenuBarPPal.add(menuPersonal);
                menItemModContra = new JMenuItem("Modificar Contraseña");
                menuPersonal.add(menItemModContra);
                menItemSalir = new JMenuItem("Salir");
                menuPersonal.add(menItemSalir);
                menItemSalir.addActionListener(this); 

                menuJaulas = new JMenu("Gestionar Jaulas");
                MenuBarPPal.add(menuJaulas);
                menItemAsigJaula = new JMenuItem("Asignar Animal a Jaula");
                menuJaulas.add(menItemAsigJaula);
                menItemAliJaula = new JMenuItem("Asignar Alimentos por Jaula");
                menuJaulas.add(menItemAliJaula);

                menuAlmacen = new JMenu("Gestionar Almacén");
                MenuBarPPal.add(menuAlmacen);
                menItemAlimentos = new JMenuItem("Bodega Alimentos");
                menuAlmacen.add(menItemAlimentos);
                menItemMedica = new JMenuItem("Bodega Medicamentos");
                menuAlmacen.add(menItemMedica);

                menuAyuda = new JMenu("Ayuda");
                MenuBarPPal.add(menuAyuda);
                menItemManual = new JMenuItem("Manual de Usuario");
                menItemManual.addActionListener(this);
                menuAyuda.add(menItemManual);
                break;

        }

        icoMensajePre = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoPregunta.jpg");
        this.listaAnima = listaAnima;
        this.listaPart = listaPart;
        this.listaRazas = R;
        this.listaPersona = listaPersona; 
        this.listaPerfi=listaPerfi;
        this.reporteAnimal = new ReporteAnimal();
        this.reportePartos = new ReportePartos();
        this.reportePersonal = new ReportePersonal();

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menItemPersonal) {

            RegistroPersonal rp = new RegistroPersonal(listaPersona);

        }

        if (e.getSource() == menItemPerfil) {

            AsignarPerfil gPer = new AsignarPerfil(listaPersona, listaPerfi);

        }

        if (e.getSource() == menItemRecuperar) {

            RecuperarPass rC = new RecuperarPass(listaPersona.getPrimero(), listaPerfi.getCabeza());

        }

        if (e.getSource() == menItemModContra) {

            JFrameCambiarContraseña cc = new JFrameCambiarContraseña(listaPerfi, listaPersona);
        }

        if (e.getSource() == menItemReportesPartos) {
            String Tabla = "Partos";
            String Campo = "Registros";
            reportePartos.crearInformeTabla(Tabla,Campo,listaPart);

        }
        
        if (e.getSource() == menItemReportesPersonal) {
            String Tabla = "Personal";
            String Campo = "Registros";
            reportePersonal.crearInformeTabla(Tabla,Campo,listaPersona);

        }
        
        if (e.getSource() == menItemReportesAnimal) {
            String Tabla = "Animales";
            String Campo = "Registros";
            reporteAnimal.crearInformeTabla(Tabla,Campo,listaAnima);

        }

        if (e.getSource() == menItemAnimal) {
            JFrameGestionDatAnimal da = new JFrameGestionDatAnimal(listaAnima, listaRazas, listaPart);
        }
        
        if (e.getSource() == menItemPartos) {
            JFramePartos da = new JFramePartos(listaPart, listaAnima);
        }

        if (e.getSource() == menItemManual) {

            try {
                File path = new File("src/Manual/Manual.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No fue posible cargar el manual","Menú Principal - G.A.P", JOptionPane.YES_NO_OPTION, icoMensajePre);
            } 
        }

        if (e.getSource() == menItemSalir) {
            int opc;
            opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir del menú principal?",
                    "Salir.  Sistematización Grajas Porcícolas - S.G.P.", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, icoMensajePre);
            if (opc == 0) {
                FraMenuPri.dispose();
                Ingreso i = new Ingreso( listaPersona, listaPart, listaAnima, listaRazas, listaPerfi);

            }
        }

        if (e.getSource() == menItemAcerca) {

            //AcercaDe Ad=new AcercaDe();
        }

    }
}
