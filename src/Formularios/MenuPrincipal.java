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

/**
 *
 * @author Ivan
 */
public class MenuPrincipal implements ActionListener {

    JFrame FraMenuPri;
    JMenuBar MenuBarPPal;
    JMenu menuPersonal, menuAnimal, menuJaulas, menuMaestros, menuAlmacen, menuPublicidad, menuAyuda, menuInformes;
    JMenuItem menItemPersonal, menItemPerfil, menItemModContra, menItemSalir, menItemAnimal, menItemHojaVida, menItemAsigJaula, menItemAliJaula;
    JMenuItem menItemAlimentos, menItemMedica, menItemPublicidad, menItemWeb, menItemReportes, menItemBackup, menItemManual, menItemAcerca, menItemPartos;
    JMenuItem menItemDepar, menItemMuni, menItemRazas, menItemJaulas, menItemVacunas, menItemPermisos, menItemEtapa, menItemAgentes, menItemRecuperar;
    ImageIcon iconFondo, icoMensajePre;
    Image icoCabecera;
    JLabel labelFondo;
    int control, perfil;
    ListaAnimal listaAnima;
    ListaPartos listaPart;
    ListaRazas listaRazas;
    ListaUsuario listaPersona;
    //ReportePerfiles reporte;
    String perfil1;
    String[][] usuarios;

    public MenuPrincipal(String[][] usuarios, int perfil, ListaAnimal listaAnima, ListaUsuario listaPersona, ListaPartos listaPart, ListaRazas R) {

        FraMenuPri = new JFrame("Menú Principal - PERFIL ");
        FraMenuPri.setBounds(10, 10, 1350, 710);
        FraMenuPri.setLayout(null);
        FraMenuPri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER LA EJECUCIÓN CUANDO CIERRE
        FraMenuPri.setResizable(false);
        icoCabecera = Toolkit.getDefaultToolkit().getImage("Imagenes\\Menui.jpg");
        FraMenuPri.setIconImage(icoCabecera);
        FraMenuPri.setVisible(true);

        iconFondo = new ImageIcon("Imagenes\\FondoPrin.jpg");
        labelFondo = new JLabel(iconFondo);
        labelFondo.setBounds(0, 0, 1350, 700);
        FraMenuPri.add(labelFondo);
        labelFondo.setVisible(true);

        MenuBarPPal = new JMenuBar();
        FraMenuPri.setJMenuBar(MenuBarPPal);
        perfil1 = "ADMINISTRADOR";

        if (perfil1.equals("ADMINISTRADOR")) {

            control = 1;
        } else {

            if (perfil1.equals("VETERINARIO")) {

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
                menItemRecuperar = new JMenuItem("Recuperar Contraseña");
                menuPersonal.add(menItemRecuperar);
                menItemRecuperar.addActionListener(this);
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
                menItemReportes = new JMenuItem("Reportes");
                menuInformes.add(menItemReportes);
                menItemReportes.addActionListener(this);
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

                menuInformes = new JMenu("Gestionar Informes");
                MenuBarPPal.add(menuInformes);
                menItemReportes = new JMenuItem("Reportes");
                menuInformes.add(menItemReportes);

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

                menuAyuda = new JMenu("Ayuda");
                MenuBarPPal.add(menuAyuda);
                menItemManual = new JMenuItem("Manual de Usuario");
                menItemManual.addActionListener(this);
                menuAyuda.add(menItemManual);
                break;

        }

        icoMensajePre = new ImageIcon("Imagenes\\IconoPregunta.jpg");
        this.listaAnima = listaAnima;
        this.listaPart = listaPart;
        this.listaRazas = R;
        this.listaPersona = listaPersona;
        this.usuarios = usuarios;
        //reporte = new ReportePerfiles();

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menItemPersonal) {

            RegistroPersonal rp = new RegistroPersonal(listaPersona);

        }

        if (e.getSource() == menItemPerfil) {

            AsignarPerfil gPer = new AsignarPerfil(usuarios, listaPersona);

        }

        if (e.getSource() == menItemRecuperar) {

            RecuperarPass rC = new RecuperarPass(listaPersona.getPrimero(), usuarios);

        }

        if (e.getSource() == menItemModContra) {

            JFrameCambiarContraseña cc = new JFrameCambiarContraseña(usuarios, perfil);
        }

        if (e.getSource() == menItemReportes) {
            String Tabla = "Perfiles";
            String Campo = "Registros";
            //reporte.crearInformeTabla(Tabla,Campo,listaPerfi);

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
                Ingreso i = new Ingreso(usuarios, listaPersona, listaPart, listaAnima, listaRazas);

            }
        }

        if (e.getSource() == menItemAcerca) {

            //AcercaDe Ad=new AcercaDe();
        }

    }
}
