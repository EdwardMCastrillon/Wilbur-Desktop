/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Identidades.DatosPerfil;
import Identidades.DatosPersonal;
import Listas.ListaPerfil;
import Listas.ListaUsuario;
import javax.swing.ImageIcon; //Se importa la clase para poner el icono en los formularios.
import javax.swing.JOptionPane;
import Utilidades.*;
import Utilidades.EnviarEmail;
import javax.swing.JPasswordField;

/**
 * @author Equipo de desarrollo GAP (Edward Monsalve, Pedro Garces, Juan Esteban
 * Acevedo)
 */
public class JFrameCambiarContraseña extends javax.swing.JFrame {

    private String userName, actPass, newPass, confPass; 
    int nickName;
    ImageIcon icoMensajeInfor, icoMensajePre;
    DatosPerfil perfilModifiContra, datosPerfilEmail;
    DatosPersonal usuario;
    String pasActual, correo, usuari, nombre, contraseña;
    ListaPerfil listaPerfi;
    ListaUsuario listaPerso;
    EnviarEmail mail;
    String tipoMensaje = "Modificar Contraseña - G.A.P.";
    Validaciones vali;
    int[] conta;
    

    public JFrameCambiarContraseña() {
    }

    public JFrameCambiarContraseña(ListaPerfil listaPerfi, ListaUsuario listaPerso) {
        initComponents();
        this.ValidarEspacios();
        this.setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Cambiar Contraseña");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/1_Icono_Form.JPG")).getImage());
        icoMensajeInfor = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoInformacion.jpg");
        icoMensajePre = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoPregunta.jpg");

        jPactPass.requestFocus();

        this.listaPerfi = listaPerfi;
        this.listaPerso = listaPerso;
 
        jTuserName.setEnabled(true);
        perfilModifiContra = new DatosPerfil();
        vali = new Validaciones();
        conta = new int[4]; 
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
        jLabel2 = new javax.swing.JLabel();
        jBtnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTuserName = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jPactPass = new javax.swing.JPasswordField();
        jPnewPass = new javax.swing.JPasswordField();
        jPconfPass = new javax.swing.JPasswordField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Icono_Form.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Campos Obligatorios (*)");

        jBtnVolver.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Atras.png"))); // NOI18N
        jBtnVolver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("*Nombre de usuario:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("*Contraseña actual:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("*Nueva Contraseña:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("*Confirmar contraseña:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTuserName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTuserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTuserNameFocusLost(evt);
            }
        });

        jBtnGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Guardar.png"))); // NOI18N
        jBtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Clear_Limpiar.png"))); // NOI18N
        jBtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jPactPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPactPassFocusLost(evt);
            }
        });

        jPnewPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPnewPassFocusLost(evt);
            }
        });

        jPconfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPconfPassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPactPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTuserName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPnewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jBtnGuardar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPconfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnVolver)
                                        .addGap(28, 28, 28)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPactPass, jPconfPass, jPnewPass, jTuserName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnGuardar, jBtnLimpiar, jBtnVolver});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTuserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPactPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPnewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPconfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jBtnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPactPass, jPconfPass, jPnewPass, jTuserName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnGuardar, jBtnLimpiar, jBtnVolver});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed

        this.guardarModificacion();
        datosPerfilEmail = listaPerfi.modificarContraseñaIngrse(perfilModifiContra, pasActual);
        if (datosPerfilEmail != null) {
            usuario = listaPerso.cargarUsuario(datosPerfilEmail.getNumCedula());
            this.correo = usuario.getCorreo();
            this.nombre = usuario.getNombre();
            this.usuari = datosPerfilEmail.getUsuario();
            this.contraseña = datosPerfilEmail.getContraIngreso();
            mail = new EnviarEmail(correo, nombre, usuari, contraseña, tipoMensaje);
        } else {

            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Modificar Contraseña - S.G.P.", JOptionPane.OK_OPTION, icoMensajeInfor);
            jTuserName.requestFocus();
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // Limpiar los campos del formulario.
        this.LimpiarCampos();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jPnewPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPnewPassFocusLost

        this.inicializarCont(conta);
        if (!jPnewPass.getPassword().toString().equals("")) {

            if (!vali.validarContraseñ(vali.convertirPassword(jPnewPass.getPassword()), conta)) {

                JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos:" + "\n" + "1 caracter especial" + "\n" + "1 letra mayúscula, minúscula"
                        + "\n" + "1 número y un tamnaño como mínimo de 8 caracteres", "Asignar Perfil - S.A.P",
                        JOptionPane.OK_OPTION, icoMensajeInfor);
                jPnewPass.requestFocus();
                jPnewPass.setText("");
            } else {

                jPconfPass.requestFocusInWindow();
            }
        } else {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "Asignar Perfil - G.A.P", JOptionPane.YES_OPTION,
                    icoMensajeInfor);
            jPnewPass.requestFocusInWindow();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jPnewPassFocusLost

    private void jPconfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPconfPassFocusLost

        if (jPconfPass.getPassword().toString().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", "Asignar Perfil - G.A.P", JOptionPane.YES_OPTION,
                    icoMensajeInfor);
            jPconfPass.requestFocusInWindow();
        } else {

            if (!vali.convertirPassword(jPconfPass.getPassword()).equals(vali.convertirPassword(jPconfPass.getPassword()))) {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Asignar Perfil - G.A.P", JOptionPane.YES_OPTION,
                        icoMensajeInfor);
                jPconfPass.requestFocusInWindow();
                jPconfPass.setText("");
            } else { 
                jPconfPass.transferFocus();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jPconfPassFocusLost

    private void jTuserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTuserNameFocusLost

        vali.validarObligatorios(jTuserName, tipoMensaje);
// TODO add your handling code here:
    }//GEN-LAST:event_jTuserNameFocusLost

    private void jPactPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPactPassFocusLost

        vali.validarObligatoriosPas(jPactPass, tipoMensaje);
// TODO add your handling code here:
    }//GEN-LAST:event_jPactPassFocusLost

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
            java.util.logging.Logger.getLogger(JFrameCambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCambiarContraseña().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPactPass;
    private javax.swing.JPasswordField jPconfPass;
    private javax.swing.JPasswordField jPnewPass;
    private javax.swing.JTextField jTuserName;
    // End of variables declaration//GEN-END:variables

    
    public void inicializarCont(int cont[]) {

        for (int j = 0; j < 3; j++) {

            cont[j] = 0;
        }
    }
    public void LimpiarCampos() {
        //jTuserName.setText(null);
        jPactPass.setText(null);
        jPnewPass.setText(null);
        jPconfPass.setText(null);
    }
    
    public void guardarModificacion(){
        
        perfilModifiContra.setUsuario(jTuserName.getText());
        pasActual = jPactPass.getText();
        perfilModifiContra.setContraIngreso(jPnewPass.getText());
        perfilModifiContra.setRepetirContraIngreso(jPconfPass.getText());
    }

    public void ValidarEspacios() {
        this.jPnewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                SinEspacios(jPnewPass, e);
            }
        });
        this.jPconfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                SinEspacios(jPconfPass, e);
            }
        });
    }

    public void SinEspacios(JPasswordField j, java.awt.event.KeyEvent e) {
        char c = e.getKeyChar(); // para leer el caracter correspondiente a la tecla
        int numero = (int) (c);

        if (numero == 32) {
            e.consume();  // ignorar el evento de teclado
        }
    }
}
