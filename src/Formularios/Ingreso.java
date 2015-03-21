package Formularios;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Listas.*;
import Utilidades.Validaciones;

/**
 *
 * @author Edward
 */
public class Ingreso extends javax.swing.JFrame {

    String Usuarios[][] = new String[8][4];
    String[][] departamentos = new String[33][126];
    String perfil;
    ListaAnimal A;
    ListaUsuario U;
    ListaPartos P;
    ListaRazas R;
    ImageIcon icoMensajeInfor, icoMensajePre;
    Validaciones validar;
    String nombreVentana;
    int posUsuario=0;

    public Ingreso() {
        initComponents();
    }

    /**
     * @param usuarios[][]: Represanta la matriz de los usuarios del sistema.
     * @param Lu : Lista de personal *
     */
    public Ingreso(String usuarios[][], ListaUsuario Lu, ListaPartos Lp, ListaAnimal La, ListaRazas Lr) {
        initComponents();
        setVisible(true);
        U = Lu;
        P = Lp;
        A = La;
        R = Lr;
        Usuarios = usuarios;
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ingreso al Sistema");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/1_Icono_Form.JPG")).getImage());
        icoMensajeInfor = new ImageIcon("../Imagenes/IconoInformacion.jpg");
        icoMensajePre = new ImageIcon("../Imagenes/IconoPregunta.jpg");
        validar = new Validaciones();
        nombreVentana = "Ingraso al Sistema - G.A.P.";

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        JTClave = new javax.swing.JPasswordField();
        JBSalida = new javax.swing.JButton();
        JBIngreso = new javax.swing.JButton();
        JBOlvido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoForm_Mod.JPG"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel4.setText("Gestión Administrativa");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel7.setText("Porcícola");

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblClave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblClave.setText("Contraseña:");

        JTUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTUsuarioFocusLost(evt);
            }
        });
        JTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTUsuarioActionPerformed(evt);
            }
        });

        JTClave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTClaveFocusLost(evt);
            }
        });
        JTClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTClaveActionPerformed(evt);
            }
        });

        JBSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Encendido.jpg"))); // NOI18N
        JBSalida.setToolTipText("Salir");
        JBSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBSalida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apagado.jpg"))); // NOI18N
        JBSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalidaActionPerformed(evt);
            }
        });

        JBIngreso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingre1.png"))); // NOI18N
        JBIngreso.setText("Ingresar");
        JBIngreso.setToolTipText("");
        JBIngreso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresoActionPerformed(evt);
            }
        });

        JBOlvido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBOlvido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda3.png"))); // NOI18N
        JBOlvido.setText("¿Olvido su clave?");
        JBOlvido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBOlvido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBOlvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBOlvidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(JBIngreso))
                            .addComponent(JBOlvido))
                        .addGap(49, 49, 49)
                        .addComponent(JBSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTClave, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(JBOlvido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(JBSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTClaveActionPerformed

    private void JBSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalidaActionPerformed
        int opc;
        opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir de Gestionar Perfil?",
                "Salir.  Gestión Administrativa Porcícola - G.A.P.", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, icoMensajePre);
        if (opc == 0) {
            this.dispose();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JBSalidaActionPerformed

    private void JBIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresoActionPerformed

        String usuario = JTUsuario.getText();
        String password = new String(JTClave.getPassword());

        if (usuario.equalsIgnoreCase("") || password.equals("")) {

            JOptionPane.showMessageDialog(this, "¡Debe diligenciar todos los campos!", "Información Incompleta", JOptionPane.YES_NO_OPTION,
                    icoMensajePre);

        } else {

            try {
                if (ValidarUsuario(usuario, password, Usuarios)) {
                    System.out.println(perfil);
                    MenuPrincipal mn = new MenuPrincipal(Usuarios, perfil, posUsuario, A, U, P, R);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Este usuario no está registrado.", "Gestión Administrativa Pórcicola", JOptionPane.YES_NO_OPTION,
                            icoMensajePre);
                    JTUsuario.setText("");
                    JTClave.setText("");
                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBIngresoActionPerformed

    private void JTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUsuarioActionPerformed
    }//GEN-LAST:event_JTUsuarioActionPerformed

    private void JBOlvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBOlvidoActionPerformed

        new RecuperarPass(U.getPrimero(), Usuarios);

        // TODO add your handling code here:
    }//GEN-LAST:event_JBOlvidoActionPerformed

    private void JTUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTUsuarioFocusLost

        validar.validarObligatorios(JTUsuario, nombreVentana);
// TODO add your handling code here:
    }//GEN-LAST:event_JTUsuarioFocusLost

    private void JTClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTClaveFocusLost

        validar.validarObligatoriosPas(JTClave, nombreVentana);
// TODO add your handling code here:
    }//GEN-LAST:event_JTClaveFocusLost

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBIngreso;
    private javax.swing.JButton JBOlvido;
    private javax.swing.JButton JBSalida;
    private javax.swing.JPasswordField JTClave;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    public boolean ValidarUsuario(String Usuario, String Password, String Usuarios[][]) throws UnknownHostException {
        boolean sw = false;
        for (int i = 0; i < Usuarios.length; i++) {
            if (Usuarios[i][0] != null) {
                if (Usuarios[i][1].equalsIgnoreCase(Usuario) && Usuarios[i][2].equals(Password)) {
                    JOptionPane.showMessageDialog(this, "*" + Usuario + "* Bienvenido a G.A.P.", "Bienvenido!", JOptionPane.INFORMATION_MESSAGE, icoMensajeInfor);
                    perfil = Usuarios[i][3];
                    posUsuario = i;
                    return true;
                }
            } else {
                return false;
            }
        }
        return sw;
    }
}
