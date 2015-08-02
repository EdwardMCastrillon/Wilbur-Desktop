/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Identidades.DatosJaula;
import crudBaseDatos.CrudJaula;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import reportesListar.ReporteJaulas;

/**
 *
 * @author ivan
 */
public class formJaula extends javax.swing.JFrame {

    DatosJaula jaula, consultarJaula;
    int swModifi;
    CrudJaula baseJaula;
    ImageIcon icoMensajeInfor, icoMensajePre;
    List<DatosJaula> listaJaula;

    /**
     * Creates new form formJaula
     */
    public formJaula() {
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        baseJaula = new CrudJaula();
        icoMensajeInfor = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoInformacion.jpg");
        icoMensajePre = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoPregunta.jpg");
        this.desactivarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodJaula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox();
        jDateFechaCreacion = new com.toedter.calendar.JDateChooser();
        JBNuevo = new javax.swing.JButton();
        JBGuardarU = new javax.swing.JButton();
        JBConsultaru = new javax.swing.JButton();
        JBModificarU = new javax.swing.JButton();
        JBEliminarU = new javax.swing.JButton();
        JBListar = new javax.swing.JButton();
        JBLimpiarU = new javax.swing.JButton();
        JBVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNumCerdos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código Jaula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Area en Metros:");

        jLabel4.setText("Fecha Construción:");

        jLabel5.setText("Estado:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "....", "Activo", "Inactivo" }));

        jDateFechaCreacion.setEnabled(false);
        jDateFechaCreacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        JBNuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Crear.png"))); // NOI18N
        JBNuevo.setToolTipText("CREAR");
        JBNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBGuardarU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBGuardarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Guardar.png"))); // NOI18N
        JBGuardarU.setToolTipText("GUARDAR");
        JBGuardarU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBGuardarU.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBGuardarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarUActionPerformed(evt);
            }
        });

        JBConsultaru.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBConsultaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Buscar.png"))); // NOI18N
        JBConsultaru.setToolTipText("CONSULTAR");
        JBConsultaru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBConsultaru.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBConsultaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConsultaruActionPerformed(evt);
            }
        });

        JBModificarU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBModificarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Editar.png"))); // NOI18N
        JBModificarU.setToolTipText("MODIFICAR");
        JBModificarU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBModificarU.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBModificarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarUActionPerformed(evt);
            }
        });

        JBEliminarU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBEliminarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Eliminar.png"))); // NOI18N
        JBEliminarU.setToolTipText("ELIMINAR");
        JBEliminarU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBEliminarU.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarUActionPerformed(evt);
            }
        });

        JBListar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/List.png"))); // NOI18N
        JBListar.setToolTipText("LISTAR");
        JBListar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBListar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListarActionPerformed(evt);
            }
        });

        JBLimpiarU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBLimpiarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Clear_Limpiar.png"))); // NOI18N
        JBLimpiarU.setToolTipText("LIMPIAR");
        JBLimpiarU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBLimpiarU.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBLimpiarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarUActionPerformed(evt);
            }
        });

        JBVolver.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Atras.png"))); // NOI18N
        JBVolver.setToolTipText("SALIR");
        JBVolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBVolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVolverActionPerformed(evt);
            }
        });

        jLabel6.setText("Número de Cerdos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtArea)
                            .addComponent(txtCodJaula)
                            .addComponent(cmbEstado, 0, 100, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumCerdos)
                                .addGap(100, 100, 100))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(JBNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(JBGuardarU)
                        .addGap(18, 18, 18)
                        .addComponent(JBConsultaru)
                        .addGap(18, 18, 18)
                        .addComponent(JBModificarU)
                        .addGap(18, 18, 18)
                        .addComponent(JBEliminarU)
                        .addGap(18, 18, 18)
                        .addComponent(JBListar)
                        .addGap(18, 18, 18)
                        .addComponent(JBLimpiarU)
                        .addGap(18, 18, 18)
                        .addComponent(JBVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JBConsultaru, JBEliminarU, JBGuardarU, JBLimpiarU, JBListar, JBModificarU, JBNuevo, JBVolver});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtNumCerdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jDateFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBVolver)
                    .addComponent(JBLimpiarU)
                    .addComponent(JBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBModificarU)
                    .addComponent(JBConsultaru)
                    .addComponent(JBGuardarU)
                    .addComponent(JBNuevo)
                    .addComponent(JBEliminarU))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JBConsultaru, JBEliminarU, JBGuardarU, JBLimpiarU, JBListar, JBModificarU, JBNuevo, JBVolver});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        this.activarCampos();
        swModifi = 0;
        this.limpiarCampos();
        this.desactivarBotones();
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JBGuardarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarUActionPerformed

        this.guardarCampos();
        if (this.validarObligatorios().equals("")) {
            if (swModifi == 0) {
                if (!baseJaula.validarJaula((jaula.getCodJaula()))) {

                    if (baseJaula.ingresarDatosJaula(jaula)) {
                        JOptionPane.showMessageDialog(this, "Se guardó Correctamente", "Registro Jaulas - G.A.P", JOptionPane.YES_NO_OPTION,
                                icoMensajePre);
                        this.limpiarCampos();
                        this.activarBotones();
                        //JBGuardarU.setEnabled(false);

                    } else {
                        JOptionPane.showMessageDialog(this, "No se guardó correctamente", "Registro Personal - G.A.P", JOptionPane.YES_NO_OPTION,
                                icoMensajePre);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Este usuario ya existe", "Registro Personal - G.A.P", JOptionPane.YES_NO_OPTION,
                            icoMensajePre);
                }
            } else {
                int opc;
                opc = JOptionPane.showConfirmDialog(null, "Esta seguro que desea modificar este registro",
                        "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, icoMensajePre);
                if (opc == 0) {
                    if (baseJaula.modificarDatosJaula(jaula)) {

                        JOptionPane.showMessageDialog(null, "El registro se modifico correctamente", "Registro Personal - G.A.P",
                                JOptionPane.OK_OPTION, icoMensajeInfor);
                        this.limpiarCampos();
                        this.desactivarCampos();
                        this.activarBotones();
                        //   JBGuardarU.setEnabled(false);
                        JBNuevo.requestFocusInWindow();
                    } else {

                        JOptionPane.showMessageDialog(null, "El registro no fue modificado", "Registro Personal - G.A.P",
                                JOptionPane.OK_OPTION, icoMensajeInfor);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Se cancelo la modificación", "Registro Personal - G.A.P",
                            JOptionPane.OK_OPTION, icoMensajeInfor);
                    JBGuardarU.setEnabled(false);
                    this.limpiarCampos();
                    this.activarBotones();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡Complete los campos obligatorios(*)!", "Registro Personal - G.A.P", JOptionPane.YES_NO_OPTION,
                    icoMensajePre);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBGuardarUActionPerformed

    private void JBConsultaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsultaruActionPerformed

        swModifi = 0;
        this.llenarCampos();
        this.desactivarCampos();
        this.desactivarBotones();

        // TODO add your handling code here:
    }//GEN-LAST:event_JBConsultaruActionPerformed

    private void JBModificarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarUActionPerformed

        swModifi = 1;
        this.llenarCampos();
        this.activarCampos();
        this.desactivarBotones();

        // TODO add your handling code here:
    }//GEN-LAST:event_JBModificarUActionPerformed

    private void JBEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarUActionPerformed

        String s = JOptionPane.showInputDialog(this, "Ingrese el id de la jaula a eliminar");

        if (baseJaula.validarJaula(Integer.parseInt(s))) {
            JOptionPane.showMessageDialog(this, "Esta seguro que desea eliminar esta jaula", "Registro Jaulas - G.A.P", JOptionPane.YES_NO_OPTION,
                    icoMensajePre);
            if (baseJaula.eliminarRegistro(Integer.parseInt(s))) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente", "Registro Jaula - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
                this.limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la jaula", "Registro Jaulas - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
            }
        } else {
            JOptionPane.showMessageDialog(this, "La jaula no existe", "Registro Jaula - G.A.P", JOptionPane.YES_NO_OPTION,
                    icoMensajePre);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBEliminarUActionPerformed

    private void JBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListarActionPerformed
        listaJaula = baseJaula.cargarJaulas();
        if (listaJaula != null) {
            new ReporteJaulas(listaJaula);
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros almacenados", "Registro Jaulas - G.A.P",
                    JOptionPane.OK_OPTION, icoMensajeInfor);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JBListarActionPerformed

    private void JBLimpiarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarUActionPerformed
        this.limpiarCampos();
        this.desactivarCampos();
        this.activarBotones();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBLimpiarUActionPerformed

    private void JBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVolverActionPerformed
        int opc;
        opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir de Registro Personal?",
                "Salir.  Gestión Administrativa Porcícola - G.A.P.", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, icoMensajePre);
        if (opc == 0) {
            this.dispose();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formJaula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formJaula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formJaula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formJaula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formJaula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBConsultaru;
    private javax.swing.JButton JBEliminarU;
    private javax.swing.JButton JBGuardarU;
    private javax.swing.JButton JBLimpiarU;
    private javax.swing.JButton JBListar;
    private javax.swing.JButton JBModificarU;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBVolver;
    private javax.swing.JComboBox cmbEstado;
    private com.toedter.calendar.JDateChooser jDateFechaCreacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCodJaula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCerdos;
    // End of variables declaration//GEN-END:variables

    public void guardarCampos() {
        jaula = new DatosJaula();
        jaula.setCodJaula(Integer.parseInt(txtCodJaula.getText()));
        jaula.setNombre(txtNombre.getText());
        jaula.setArea(Float.parseFloat(txtArea.getText()));
        jaula.setFechaCons(jDateFechaCreacion.getDate());
        jaula.setEstado(cmbEstado.getSelectedIndex());
        jaula.setNumCerdos(Integer.parseInt(txtNumCerdos.getText()));
    }

    public void limpiarCampos() {
        txtCodJaula.setText("");
        txtNombre.setText("");
        txtArea.setText("");
        jDateFechaCreacion.setDate(null);
        cmbEstado.setSelectedIndex(0);
        txtNumCerdos.setText("");
    }

    public void llenarCampos() {
        String id = JOptionPane.showInputDialog("Ingrese el id a consultar");
        consultarJaula = baseJaula.consultarJaula(Integer.parseInt(id));
        if (consultarJaula != null) {
            txtCodJaula.setText(String.valueOf(consultarJaula.getCodJaula()));
            txtNombre.setText(consultarJaula.getNombre());
            txtArea.setText(String.valueOf(consultarJaula.getArea()));
            jDateFechaCreacion.setDate(consultarJaula.getFechaCons());
            cmbEstado.setSelectedIndex(consultarJaula.getEstado());
            txtNumCerdos.setText(String.valueOf(consultarJaula.getNumCerdos()));
        } else {
            JOptionPane.showMessageDialog(this, "La jaula no existe", "Registro Jaula - G.A.P", JOptionPane.YES_NO_OPTION,
                    icoMensajeInfor);
        }
    }

    public void activarCampos() {
        txtCodJaula.setEnabled(true);
        txtNombre.setEnabled(true);
        txtArea.setEnabled(true);
        jDateFechaCreacion.setEnabled(true);
        cmbEstado.setEnabled(true);
        txtNumCerdos.setEnabled(true);
    }

    public void desactivarCampos() {
        txtCodJaula.setEnabled(false);
        txtNombre.setEnabled(false);
        txtArea.setEnabled(false);
        jDateFechaCreacion.setEnabled(false);
        cmbEstado.setEnabled(false);
        txtNumCerdos.setEnabled(false);
    }

    public void desactivarBotones() {

        JBNuevo.setEnabled(false);
        JBModificarU.setEnabled(false);
        JBConsultaru.setEnabled(false);
        JBEliminarU.setEnabled(false);
        JBListar.setEnabled(false);
    }

    public void activarBotones() {

        JBNuevo.setEnabled(true);
        JBModificarU.setEnabled(true);
        JBConsultaru.setEnabled(true);
        JBEliminarU.setEnabled(true);
        JBListar.setEnabled(true);
    }

    public String validarObligatorios() {
        String mensaje = "";
        if (txtCodJaula.getText().equals("")) {
            mensaje = "Digite los campos obligatorios";
        }
        return mensaje;
    }

}