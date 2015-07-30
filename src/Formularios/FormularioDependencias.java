/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Identidades.DatosDependencias;
import Identidades.DatosPersonal;
import Utilidades.Validaciones;
import crudBaseDatos.CrudDependencias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ivan
 */
public class FormularioDependencias implements ActionListener {

    JLabel labelId, labelNombre;
    JTextField txtId, txtNombre;
    JFrame formulario;
    String nombreId, nombreNom, nombreForm, nombreTabla, nombreIdCon, nombreDescrip;
    JButton botonNuevo, botonGuardar, botonConsultar, botonModificar, botonEliminar, botonLimpiar, botonSalir, botonListar;
    ImageIcon icoGuardar, icoNuevo, icoEliminar, icoConsultar, icoModificar, icoListar, icoSalir,
            icoLimpiar, icoMensajeInfor, icoMensajePre;
    DatosDependencias dependencia, buscarDependencia;
    int swModificar;
    CrudDependencias baseDependencia;

    public FormularioDependencias(String nombreId, String nombreNom, String nombreForm, String nombreTabla, String nombreIdCon, String nombreDescrip) {
        this.nombreId = nombreId;
        this.nombreNom = nombreNom;
        this.nombreForm = nombreForm;
        this.nombreTabla = nombreTabla;
        this.nombreIdCon = nombreIdCon;
        this.nombreDescrip = nombreDescrip;

        formulario = new JFrame(nombreForm);
        formulario.setBounds(350, 250, 585, 250);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelId = new JLabel(nombreId);
        formulario.add(labelId);
        labelId.setBounds(20, 25, 130, 35);
        labelId.setVisible(true);

        txtId = new JTextField();
        formulario.add(txtId);
        txtId.setBounds(180, 25, 100, 25);
        txtId.setVisible(true);

        labelNombre = new JLabel(nombreNom);
        formulario.add(labelNombre);
        labelNombre.setBounds(20, 65, 130, 35);
        labelNombre.setVisible(true);

        txtNombre = new JTextField();
        formulario.add(txtNombre);
        txtNombre.setBounds(180, 65, 300, 25);
        txtNombre.setVisible(true);

        icoNuevo = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/1_Crear.png");
        botonNuevo = new JButton(icoNuevo);
        formulario.add(botonNuevo);
        botonNuevo.setBounds(20, 120, 55, 38);
        botonNuevo.setVisible(true);
        botonNuevo.addActionListener(this);

        icoGuardar = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/1_Guardar.png");
        botonGuardar = new JButton(icoGuardar);
        formulario.add(botonGuardar);
        botonGuardar.setBounds(90, 120, 55, 38);
        botonGuardar.setVisible(true);
        botonGuardar.addActionListener(this);

        icoConsultar = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/1_Buscar.png");
        botonConsultar = new JButton(icoConsultar);
        formulario.add(botonConsultar);
        botonConsultar.setBounds(160, 120, 55, 38);
        botonConsultar.setVisible(true);
        botonConsultar.addActionListener(this);

        icoModificar = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/1_Editar.png");
        botonModificar = new JButton(icoModificar);
        formulario.add(botonModificar);
        botonModificar.setBounds(230, 120, 55, 38);
        botonModificar.setVisible(true);
        botonModificar.addActionListener(this);

        icoEliminar = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/1_Eliminar.png");
        botonEliminar = new JButton(icoEliminar);
        formulario.add(botonEliminar);
        botonEliminar.setBounds(300, 120, 55, 38);
        botonEliminar.setVisible(true);
        botonEliminar.addActionListener(this);

        icoListar = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/List.png");
        botonListar = new JButton(icoListar);
        formulario.add(botonListar);
        botonListar.setBounds(370, 120, 55, 38);
        botonListar.setVisible(true);
        botonListar.addActionListener(this);

        icoLimpiar = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/1_Clear_Limpiar.png");
        botonLimpiar = new JButton(icoLimpiar);
        formulario.add(botonLimpiar);
        botonLimpiar.setBounds(440, 120, 55, 38);
        botonLimpiar.setVisible(true);
        botonLimpiar.addActionListener(this);

        icoSalir = new ImageIcon("/home/ivan/Escritorio/Wilbur-Desktop/src/Imagenes/1_Atras.png");
        botonSalir = new JButton(icoSalir);
        formulario.add(botonSalir);
        botonSalir.setBounds(510, 120, 55, 38);
        botonSalir.setVisible(true);
        botonSalir.addActionListener(this);
        swModificar = 0;
        baseDependencia = new CrudDependencias();
        icoMensajeInfor = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoInformacion.jpg");
        icoMensajePre = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoPregunta.jpg");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonGuardar) {
            this.guardarCampos();
            if (this.validarObligatorios().equals("")) {
                if (swModificar == 0) {
                    if (!baseDependencia.validarDependencia(nombreTabla, nombreIdCon, dependencia.getId())){

                        if (baseDependencia.insertarDependencia(nombreTabla, nombreIdCon, nombreDescrip, dependencia)) {
                            JOptionPane.showMessageDialog(null, "Se guardó Correctamente", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                                    icoMensajePre);
                            this.limpiarCampos();
                            this.activarBotones();
                            botonGuardar.setEnabled(false);

                        } else {
                            JOptionPane.showMessageDialog(null, "No se guardó correctamente", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                                    icoMensajePre);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Este usuario ya existe", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                                icoMensajePre);
                    }
                } else {
                    int opc;
                    opc = JOptionPane.showConfirmDialog(null, "Esta seguro que desea modificar este registro",
                            nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, icoMensajePre);
                    if (opc == 0) {
                        if (baseDependencia.modificarDependencia(nombreTabla, nombreIdCon, nombreDescrip, dependencia)) {

                            JOptionPane.showMessageDialog(null, "El registro se modifico correctamente", nombreForm + " - G.A.P",
                                    JOptionPane.OK_OPTION, icoMensajeInfor);
                            this.limpiarCampos();
                            this.desactivarCampos();
                            this.activarBotones();
                            botonGuardar.setEnabled(false);
                            botonNuevo.requestFocusInWindow();
                        } else {

                            JOptionPane.showMessageDialog(null, "El registro no fue modificado", nombreForm + " - G.A.P",
                                    JOptionPane.OK_OPTION, icoMensajeInfor);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Se cancelo la modificación", nombreForm + " - G.A.P",
                                JOptionPane.OK_OPTION, icoMensajeInfor);
                        botonGuardar.setEnabled(false);
                        this.limpiarCampos();
                        this.activarBotones();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Complete los campos obligatorios(*)!", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
            }
        }

        if (e.getSource() == botonNuevo) {
            swModificar = 0;
            this.ActivarCampos();
            this.desactivarBotones();

        }

        if (e.getSource() == botonEliminar) {
            String id = JOptionPane.showInputDialog(null, "Ingrese el id a eliminar");

            if (baseDependencia.validarDependencia(nombreTabla, nombreIdCon, Integer.parseInt(id))) {
                JOptionPane.showMessageDialog(null, "Esta seguro que desea eliminar este id", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
                if (baseDependencia.eliminarDependencia(nombreTabla, nombreIdCon, Integer.parseInt(id))) {
                    JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                            icoMensajePre);
                    this.limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el id", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                            icoMensajePre);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El id no existe", nombreForm + " - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
            }
        }

        if (e.getSource() == botonModificar) {
            swModificar = 1;
            this.cargarCampos();
            this.ActivarCampos();
            txtId.setEditable(false);
            this.desactivarBotones();
        }

        if (e.getSource() == botonConsultar) {

            swModificar = 0;
            this.cargarCampos();
            this.desactivarBotones();
        }

        if (e.getSource() == botonLimpiar) {
            this.limpiarCampos();
            this.desactivarCampos();
            this.activarBotones();
            swModificar = 0;
        }

        if (e.getSource() == botonSalir) {
            int opc;
            opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?",
                    "Salir.  Gestión Administrativa Porcícola - G.A.P.", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, icoMensajePre);
            if (opc == 0) {
                formulario.dispose();

            }
        }
    }

    public void guardarCampos() {
        dependencia = new DatosDependencias();
        dependencia.setId(Integer.parseInt(txtId.getText()));
        dependencia.setNombre(txtNombre.getText());
    }

    public void cargarCampos() {
        int id;
        if (swModificar == 1) {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a modificar"));
        } else {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a consultar"));
        }
        buscarDependencia = baseDependencia.consultarDependencia(nombreTabla, nombreIdCon, nombreDescrip, id);
        if (buscarDependencia != null) {
            txtId.setText(String.valueOf(buscarDependencia.getId()));
            txtNombre.setText(buscarDependencia.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "El id no esta registrado");
        }
    }

    public void desactivarCampos() {
        txtId.setEditable(false);
        txtNombre.setEditable(false);
    }

    public void ActivarCampos() {
        txtId.setEditable(true);
        txtNombre.setEditable(true);
    }

    public void activarBotones() {
        botonNuevo.setEnabled(true);
        botonConsultar.setEnabled(true);
        botonModificar.setEnabled(true);
        botonEliminar.setEnabled(true);
        botonSalir.setEnabled(true);
        botonListar.setEnabled(true);
    }

    public void desactivarBotones() {
        botonNuevo.setEnabled(false);
        botonConsultar.setEnabled(false);
        botonModificar.setEnabled(false);
        botonEliminar.setEnabled(false);
        botonSalir.setEnabled(false);
        botonListar.setEnabled(false);
    }

    public void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
    }
    
    public String validarObligatorios(){
        String mensaje;
        if ( txtId.getText().equals("") && txtNombre.getText().equals("")){
            mensaje = "Complete los campos obligatorios";
        }else{
            mensaje = "";
        }
        return mensaje;
    }
}
