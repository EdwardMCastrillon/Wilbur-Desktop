package Formularios;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.net.*;

public class AcercaDe extends JFrame implements ActionListener {
	
	ImageIcon iconFondo, icoSalir, icoMensajePre;
	JLabel labelFondo, labelTitulo, labelTitulo1, labelVersion, labelElaborado, labelJuan, labelEdward, labelIvan;
	JLabel labelDer, labelDer1, labelLicencia, labelLicencia1;
	JButton botonPagina, botonSalir;	
	Image icoCabecera;

    public AcercaDe() {    	
    	
    	super("Acerca de Gestión Administrativa Porcícola – G.A.P.");
        getContentPane().setLayout(null);
        icoCabecera=Toolkit.getDefaultToolkit().getImage("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\LogoForm_Mod.jpg");
        setIconImage(icoCabecera);
        this.getContentPane().setBackground(Color.white);
        setSize(800, 390);
        setResizable(false);
        setLocation(350, 150);
        setVisible(true);
        
         
        iconFondo = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\Logo.jpg");
        labelFondo = new JLabel(iconFondo);
        labelFondo.setBounds(387, 0, 410, 360);
        this.getContentPane().add(labelFondo); 
        setVisible(true);
        
        labelTitulo = new JLabel("Gestión Administrativa Porcícola");
        labelTitulo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
        labelTitulo.setBounds(10, 10, 435, 25);
        this.getContentPane().add(labelTitulo);
        labelTitulo.setVisible(true);
        
        labelTitulo1 = new JLabel("G.A.P.");
        labelTitulo1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
        labelTitulo1.setBounds(150, 30, 400, 40);
        this.getContentPane().add(labelTitulo1);
        labelTitulo1.setVisible(true);
         
        labelVersion = new JLabel("Versión 1.0");
        labelVersion.setBounds(250, 30, 400, 40);
        this.getContentPane().add(labelVersion);
        labelVersion.setVisible(true);
        
        labelElaborado = new JLabel("Elaborado por:");
        labelElaborado.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
        labelElaborado.setBounds(140, 80, 150, 25);
        this.getContentPane().add(labelElaborado);
        labelTitulo.setVisible(true); 
        	
        labelEdward = new JLabel("Edward Monsalve Castrillón"); 
        labelEdward.setBounds(130, 105, 200, 25);
        this.getContentPane().add(labelEdward);
        labelEdward.setVisible(true); 
        
        labelIvan = new JLabel("Iván Darío Villa Ramírez"); 
        labelIvan.setBounds(140, 130, 200, 25);
        this.getContentPane().add(labelIvan);
        labelIvan.setVisible(true); 
        
        labelJuan = new JLabel("Juan Esteban Acevedo Gallego"); 
        labelJuan.setBounds(120, 155, 200, 25);
        this.getContentPane().add(labelJuan);
        labelJuan.setVisible(true);
        
        botonPagina = new JButton("www.GAP.com");
        botonPagina.setBounds(120, 190, 150, 25);
        this.getContentPane().add(botonPagina);
        botonPagina.setVisible(true);
        botonPagina.addActionListener(this);
        
        labelLicencia = new JLabel("La Licencia es Según  los términos del Software "); 
        labelLicencia.setBounds(70, 225, 300, 25);
        this.getContentPane().add(labelLicencia);
        labelLicencia.setVisible(true);
        
        labelLicencia1 = new JLabel("Gestión Administrativa Porcícola – G.A.P."); 
        labelLicencia1.setBounds(80, 240, 300, 25);
        this.getContentPane().add(labelLicencia1);
        labelLicencia1.setVisible(true);
        
        labelDer = new JLabel("2014-2015 Proyecto PPI,");
        labelDer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        labelDer.setBounds(130, 275, 250, 25);
        this.getContentPane().add(labelDer);
        labelDer.setVisible(true);
        
        labelDer1 = new JLabel("Todos Los Derechos Reservados");
        labelDer1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        labelDer1.setBounds(65, 290, 350, 25);
        this.getContentPane().add(labelDer1);
        labelDer1.setVisible(true);
        
        icoSalir = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\1_Atras.png");
        botonSalir = new JButton(icoSalir);
        botonSalir.setBounds(155, 315, 70, 40);
        this.getContentPane().add(botonSalir);
        botonSalir.setVisible(true);
        botonSalir.addActionListener(this);  
    	
    	icoMensajePre = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoPregunta.jpg"); 
    	repaint();		
    }
    
    public void actionPerformed(ActionEvent event) {
    	
    	if (event.getSource() == botonSalir) {
            int opc ;
            opc = JOptionPane.showConfirmDialog(null,"¿Está seguro que desea salir de Acerca De?",
                                               "Salir.  Gestión Administrativa Porcícola - G.A.P.",JOptionPane.YES_NO_OPTION,
                                               JOptionPane.QUESTION_MESSAGE,icoMensajePre);
	    if (opc == 0) 
            {
                this.dispose();		
            }
        }    
    }   
}