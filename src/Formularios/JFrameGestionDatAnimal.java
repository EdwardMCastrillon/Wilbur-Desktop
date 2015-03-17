/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Listas.*;
import Utilidades.ReporteAnimal;
import Utilidades.Validaciones;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import porcicolawilbur.*;
import Identidades.*;
import Nodos.NodoRazas;
import java.awt.event.ItemEvent;

/**
 *
 * @author EDWARD
 */
public class JFrameGestionDatAnimal extends javax.swing.JFrame {

    DatosAnimal datos, buscarAnimal;
    ListaAnimal listaAni;
    ListaRazas lr;
    ImageIcon icoMensajeInfor, icoMensajePre;
    int swModDatosAnimal = 0;
    Validaciones va;
    String nombreVentana;
    ListaPartos listaPar;

    public JFrameGestionDatAnimal() {

    }

    public JFrameGestionDatAnimal(ListaAnimal L, ListaRazas R, ListaPartos listaPar) {
        initComponents();
        this.listaAni = L;
        lr = R;
        this.validarCampos();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Gestionar Datos del Animal");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/1_Icono_Form.JPG")).getImage());
        icoMensajeInfor = new ImageIcon("C:\\Users\\Ivan\\Desktop\\Proyecto Git\\src\\Imagenes\\IconoInformacion.jpg");
        icoMensajePre = new ImageIcon("C:\\Users\\Ivan\\Desktop\\Proyecto Git\\src\\Imagenes\\IconoPregunta.jpg");

        this.jcbx_sexo.addItem("Hembra");
        this.jcbx_sexo.addItem("Macho");
        datos = new DatosAnimal();
        buscarAnimal = new DatosAnimal();
        va = new Validaciones();

        jd_fechaconsumo.setMinSelectableDate(new Date());
        jd_fechadest.setMinSelectableDate(new Date());
        jd_fechaparto.setMinSelectableDate(new Date());

        llenarComboRaza(lr);

        this.jcbx_razamadre.addItem("Hampshire");
        this.jcbx_razamadre.addItem("Duroc");
        this.jcbx_razamadre.addItem("Pietrain");
        this.jcbx_razamadre.addItem("Landrace");
        this.jcbx_razamadre.addItem("Yorkshire (Large White)");

        this.jcbx_razapadre.addItem("Hampshire");
        this.jcbx_razapadre.addItem("Duroc");
        this.jcbx_razapadre.addItem("Pietrain");
        this.jcbx_razapadre.addItem("Landrace");
        this.jcbx_razapadre.addItem("Yorkshire (Large White)");

        nombreVentana = "Datos Animal - G.A.P";
        this.listaPar = listaPar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbx_raza = new javax.swing.JComboBox();
        jcbx_sexo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jrbn_vivo = new javax.swing.JRadioButton();
        jrbn_muerto = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxt_pesonacer = new javax.swing.JTextField();
        jtxt_pesodest = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jd_fechaconsumo = new com.toedter.calendar.JDateChooser();
        jd_fechadest = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtxt_codparto = new javax.swing.JTextField();
        jtxt_codmadre = new javax.swing.JTextField();
        jd_fechaparto = new com.toedter.calendar.JDateChooser();
        jtxt_edadsem = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jcbx_razamadre = new javax.swing.JComboBox();
        jcbx_razapadre = new javax.swing.JComboBox();
        jrbn_reemplazo = new javax.swing.JRadioButton();
        jrbn_engorde = new javax.swing.JRadioButton();
        jtxt_codanimal = new javax.swing.JTextField();
        jcbx_procedencia = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jbtn_crear = new javax.swing.JButton();
        jbtn_guardar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_consultar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("(*) Campos Obligatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel2)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Identificación del Animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("*Código");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("*Raza");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Sexo");

        jcbx_raza.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbx_raza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..." }));
        jcbx_raza.setEnabled(false);
        jcbx_raza.setName(""); // NOI18N
        jcbx_raza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_razaActionPerformed(evt);
            }
        });

        jcbx_sexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbx_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..." }));
        jcbx_sexo.setEnabled(false);
        jcbx_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_sexoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Estado");

        jrbn_vivo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbn_vivo.setText("Vivo");
        jrbn_vivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbn_vivoActionPerformed(evt);
            }
        });

        jrbn_muerto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbn_muerto.setText("Muerto");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("*Al Nacer:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("*Al Destete:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Kg.");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Kg.");

        jtxt_pesonacer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxt_pesonacer.setEnabled(false);
        jtxt_pesonacer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_pesonacerFocusLost(evt);
            }
        });
        jtxt_pesonacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_pesonacerActionPerformed(evt);
            }
        });

        jtxt_pesodest.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxt_pesodest.setEnabled(false);
        jtxt_pesodest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_pesodestFocusLost(evt);
            }
        });
        jtxt_pesodest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_pesodestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jtxt_pesonacer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jtxt_pesodest, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jtxt_pesonacer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxt_pesodest, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Fecha del Destete:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Fecha Consumo de Alimento:");

        jd_fechaconsumo.setEnabled(false);

        jd_fechadest.setEnabled(false);
        jd_fechadest.setIcon(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos del Parto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Código del Parto:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Código de la Madre:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("*Fecha del Parto:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Edad en Semanas:");

        jtxt_codparto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxt_codparto.setEnabled(false);
        jtxt_codparto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_codpartoFocusLost(evt);
            }
        });
        jtxt_codparto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_codpartoActionPerformed(evt);
            }
        });

        jtxt_codmadre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxt_codmadre.setEnabled(false);
        jtxt_codmadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_codmadreFocusLost(evt);
            }
        });

        jd_fechaparto.setEnabled(false);
        jd_fechaparto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jd_fechapartoKeyPressed(evt);
            }
        });

        jtxt_edadsem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxt_edadsem.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Raza de la Madre:");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Raza del Padre:");

        jcbx_razamadre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbx_razamadre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..." }));
        jcbx_razamadre.setEnabled(false);

        jcbx_razapadre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbx_razapadre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..." }));
        jcbx_razapadre.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jtxt_codparto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jcbx_razamadre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(8, 8, 8)
                        .addComponent(jtxt_codmadre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jd_fechaparto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbx_razapadre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_edadsem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxt_codparto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jd_fechaparto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_codmadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbx_razapadre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbx_razamadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_edadsem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jcbx_razamadre, jd_fechaparto, jtxt_codmadre, jtxt_codparto, jtxt_edadsem});

        jrbn_reemplazo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbn_reemplazo.setText("Animal de Reemplazo");

        jrbn_engorde.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbn_engorde.setText("Animal de Engorde");

        jtxt_codanimal.setEnabled(false);
        jtxt_codanimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_codanimalActionPerformed(evt);
            }
        });

        jcbx_procedencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbx_procedencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Comprado", "GranjaWilbur" }));
        jcbx_procedencia.setEnabled(false);
        jcbx_procedencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbx_procedenciaItemStateChanged(evt);
            }
        });
        jcbx_procedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_procedenciaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Procedencia:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_codanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jrbn_vivo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jrbn_muerto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbx_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jcbx_procedencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jd_fechadest, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jd_fechaconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jrbn_reemplazo)
                .addGap(58, 58, 58)
                .addComponent(jrbn_engorde)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbx_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxt_codanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbx_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbn_vivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbn_muerto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jd_fechadest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jd_fechaconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbn_reemplazo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbn_engorde, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbtn_crear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Crear.png"))); // NOI18N
        jbtn_crear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_crear.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_crearActionPerformed(evt);
            }
        });

        jbtn_guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Guardar.png"))); // NOI18N
        jbtn_guardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarActionPerformed(evt);
            }
        });

        jbtn_modificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Editar.png"))); // NOI18N
        jbtn_modificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificarActionPerformed(evt);
            }
        });

        jbtn_consultar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Buscar.png"))); // NOI18N
        jbtn_consultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_consultar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_consultarActionPerformed(evt);
            }
        });

        jbtn_eliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbtn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Eliminar.png"))); // NOI18N
        jbtn_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Icono_Form.JPG"))); // NOI18N

        jbtn_volver.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_Atras.png"))); // NOI18N
        jbtn_volver.setToolTipText("");
        jbtn_volver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_volver.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbtn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jbtn_consultar, jbtn_crear, jbtn_eliminar, jbtn_guardar, jbtn_modificar, jbtn_volver});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_crear)
                    .addComponent(jbtn_guardar)
                    .addComponent(jbtn_modificar)
                    .addComponent(jbtn_consultar)
                    .addComponent(jbtn_eliminar)
                    .addComponent(jButton1)
                    .addComponent(jbtn_volver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jbtn_consultar, jbtn_crear, jbtn_eliminar, jbtn_guardar, jbtn_modificar, jbtn_volver});

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed

        int opc;
        opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir de Datos Animal?",
                "Salir.  Gestión Administrativa Porcícola - G.A.P.", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, icoMensajePre);
        if (opc == 0) {
            this.dispose();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jtxt_codanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_codanimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_codanimalActionPerformed

    private void jtxt_pesodestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_pesodestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_pesodestActionPerformed

    private void jrbn_vivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbn_vivoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jrbn_vivoActionPerformed

    private void jtxt_pesonacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_pesonacerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_pesonacerActionPerformed

    private void jbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarActionPerformed

        datos = this.Guardar_Campos();
        if (swModDatosAnimal == 0) {
            if (validacionObligatorios(datos)) {
                if (!listaAni.existe(datos.getCod_animal())) {
                    if (listaAni.guardarCerdo(datos)) {
                        JOptionPane.showMessageDialog(this, "Se Guardo Correctamente", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                                icoMensajePre);
                        this.Limpiar_Campos();
                        this.DesactivarCampos();

                    } else {
                        JOptionPane.showMessageDialog(this, "No Se pudo guardar correctamete", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                                icoMensajePre);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Este Cerdo ya existe", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                            icoMensajePre);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese los campos obligatorios", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
            }
        } else {
            int opc;
            opc = JOptionPane.showConfirmDialog(null, "Esta seguro que desea modificar este registro",
                    "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, icoMensajePre);
            if (opc == 0) {
                if (listaAni.modificarCerdo(datos)) {

                    JOptionPane.showMessageDialog(null, "El registro se modifico correctamente", "Datos Animal - G.A.P",
                            JOptionPane.OK_OPTION, icoMensajeInfor);
                    this.Limpiar_Campos();
                    this.DesactivarCampos();
                } else {

                    JOptionPane.showMessageDialog(null, "El registro no fue modificado", "Datos Animal - G.A.P",
                            JOptionPane.OK_OPTION, icoMensajeInfor);
                }
            }
        }
    }//GEN-LAST:event_jbtn_guardarActionPerformed

    private void jcbx_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_sexoActionPerformed

    }//GEN-LAST:event_jcbx_sexoActionPerformed

    private void jcbx_razaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_razaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_razaActionPerformed

    private void jbtn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_crearActionPerformed
        swModDatosAnimal = 0;
        int Cod = listaAni.NuevoCod();
        jtxt_codanimal.setText(this.codigoAnimales(Cod));
        this.ActivarCampos();
// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_crearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ReporteAnimal(listaAni.getPrimero());

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificarActionPerformed

        swModDatosAnimal = 1;
        this.LlenarDatos();

// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_modificarActionPerformed

    private void jbtn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_consultarActionPerformed

        swModDatosAnimal = 0;
        this.LlenarDatos();
        this.DesactivarCampos();

// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_consultarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        String s = JOptionPane.showInputDialog(this, "Ingrese el codigo del cerdo a eliminar");

        if (listaAni.existe(s)) {
            JOptionPane.showMessageDialog(this, "Esta seguro que desea eliminar este cerdo", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                    icoMensajePre);
            if (listaAni.EliminarCerdo(s)) {
                JOptionPane.showMessageDialog(this, "Se a eliminado correctamente", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
                this.Limpiar_Campos();
            } else {
                JOptionPane.showMessageDialog(this, "no se pudo eliminar", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                        icoMensajePre);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El cerdo no existe", "Datos Animal - G.A.P", JOptionPane.YES_NO_OPTION,
                    icoMensajePre);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jd_fechapartoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jd_fechapartoKeyPressed

// TODO add your handling code here:
    }//GEN-LAST:event_jd_fechapartoKeyPressed

    private void jtxt_pesonacerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_pesonacerFocusLost

        va.validarObligatorios(jtxt_pesonacer, nombreVentana);
// TODO add your handling code here:
    }//GEN-LAST:event_jtxt_pesonacerFocusLost

    private void jtxt_pesodestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_pesodestFocusLost

        va.validarObligatorios(jtxt_pesonacer, nombreVentana);
// TODO add your handling code here:
    }//GEN-LAST:event_jtxt_pesodestFocusLost

    private void jtxt_codpartoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_codpartoFocusLost

// TODO add your handling code here:
    }//GEN-LAST:event_jtxt_codpartoFocusLost

    private void jtxt_codmadreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_codmadreFocusLost

        va.validarObligatorios(jtxt_codmadre, nombreVentana);
// TODO add your handling code here:
    }//GEN-LAST:event_jtxt_codmadreFocusLost

    private void jtxt_codpartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_codpartoActionPerformed

        if (jcbx_procedencia.getSelectedIndex() == 2) {

            if (jtxt_codparto.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Ingrese el código del parto", "Gestionar Animal - S.G.P",
                        JOptionPane.OK_OPTION, icoMensajeInfor);
                jtxt_codparto.requestFocus();
            } else {

                Granja datosParto = listaPar.cargarDatosPartoAnimal(jtxt_codparto.getText());
                if (datosParto != null) {

                    this.llenarDatosPartoAnimal(datosParto);
                } else {

                    JOptionPane.showMessageDialog(null, "El código del parto no existe", "Gestionar Partos - S.G.P",
                            JOptionPane.OK_OPTION, icoMensajeInfor);
                    jtxt_codparto.setText("");
                    jtxt_codparto.requestFocus();
                }
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jtxt_codpartoActionPerformed

    private void jcbx_procedenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbx_procedenciaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (jcbx_procedencia.getSelectedIndex() == 2) {
                jd_fechaparto.setEnabled(false);
                jtxt_codmadre.setEnabled(false);
                jtxt_edadsem.setEnabled(false);
                jcbx_razamadre.setEnabled(false);
                jcbx_razapadre.setEnabled(false);
            } else {
                jd_fechaparto.setEnabled(true);
                jtxt_codmadre.setEnabled(true);
                jtxt_edadsem.setEnabled(true);
                jcbx_razamadre.setEnabled(true);
                jcbx_razapadre.setEnabled(true);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jcbx_procedenciaItemStateChanged

    private void jcbx_procedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_procedenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_procedenciaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameGestionDatAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionDatAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionDatAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionDatAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestionDatAnimal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtn_consultar;
    private javax.swing.JButton jbtn_crear;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_guardar;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JComboBox jcbx_procedencia;
    private javax.swing.JComboBox jcbx_raza;
    private javax.swing.JComboBox jcbx_razamadre;
    private javax.swing.JComboBox jcbx_razapadre;
    private javax.swing.JComboBox jcbx_sexo;
    private com.toedter.calendar.JDateChooser jd_fechaconsumo;
    private com.toedter.calendar.JDateChooser jd_fechadest;
    private com.toedter.calendar.JDateChooser jd_fechaparto;
    private javax.swing.JRadioButton jrbn_engorde;
    private javax.swing.JRadioButton jrbn_muerto;
    private javax.swing.JRadioButton jrbn_reemplazo;
    private javax.swing.JRadioButton jrbn_vivo;
    private javax.swing.JTextField jtxt_codanimal;
    private javax.swing.JTextField jtxt_codmadre;
    private javax.swing.JTextField jtxt_codparto;
    private javax.swing.JTextField jtxt_edadsem;
    private javax.swing.JTextField jtxt_pesodest;
    private javax.swing.JTextField jtxt_pesonacer;
    // End of variables declaration//GEN-END:variables

    public void Limpiar_Campos() {
        jtxt_codanimal.setText("");
        jtxt_codmadre.setText("");
        jtxt_codparto.setText("");
        jtxt_edadsem.setText("");
        jtxt_pesodest.setText("");
        jtxt_pesonacer.setText("");
        jd_fechaconsumo.setDate(null);
        jd_fechadest.setDate(null);
        jd_fechaparto.setDate(null);
        jcbx_raza.setSelectedItem(null);
        jcbx_procedencia.setSelectedItem(null);
        jcbx_razamadre.setSelectedItem(null);
        jcbx_razapadre.setSelectedItem(null);
        jcbx_sexo.setSelectedItem(null);
    }

    public DatosAnimal Guardar_Campos() {

        DatosAnimal d2 = new DatosAnimal();
        d2.setCod_animal(jtxt_codanimal.getText());
        d2.setCod_madre(jtxt_codmadre.getText());
        d2.setCod_parto(jtxt_codparto.getText());
        d2.setEdad_sem(jtxt_edadsem.getText());
        d2.setPeso_destete(jtxt_pesodest.getText());
        d2.setPeso_nacer(jtxt_pesonacer.getText());

        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");

        d2.setFecha_parto(formateador.format(jd_fechaparto.getDate()));
        d2.setFecha_dest(formateador.format(jd_fechadest.getDate()));
        d2.setFecha_consumo(formateador.format(jd_fechaconsumo.getDate()));

        d2.setRaza((String) jcbx_raza.getSelectedItem());
        d2.setSexo((String) jcbx_sexo.getSelectedItem());
        d2.setRazaMadre((String) jcbx_razamadre.getSelectedItem());
        d2.setRazaPadre((String) jcbx_razapadre.getSelectedItem());
        d2.setProcedencia((String) jcbx_procedencia.getSelectedItem());

        return d2;
    }

    public void LlenarDatos() {

        int opc = -2;
        String[] opciones = {"Código Animal", "Código Parto", "Código Madre"};
        if (swModDatosAnimal == 1) {

            buscarAnimal = listaAni.cargarCerdo(JOptionPane.showInputDialog("Ingrese el código del cerdo a modificar"));
            this.ActivarCampos();

        } else {

            opc = JOptionPane.showOptionDialog(null, "Seleccione la forma en que desea realizar la consulta",
                    "Consulta Animales. Sistematización Granjas Porcícola - S.G.P.", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, icoMensajePre, opciones, true);
            switch (opc) {

                case 0:
                    buscarAnimal = listaAni.cargarCerdo(JOptionPane.showInputDialog("Ingrese el código del animal a consultar"));
                    break;
                case 1:
                    buscarAnimal = listaAni.cargarCerdo(JOptionPane.showInputDialog("Ingrese el código del parto a consultar"));
                    break;
                case 2:
                    buscarAnimal = listaAni.cargarCerdo(JOptionPane.showInputDialog("Ingrese el código de la madre a consultar"));
                    break;
            }
        }
        if (opc != -1) {
            if (buscarAnimal != null) {
                jtxt_codanimal.setText(datos.getCod_animal());
                jtxt_codmadre.setText(datos.getCod_madre());
                jtxt_codparto.setText(datos.getCod_parto());
                jtxt_edadsem.setText(datos.getEdad_sem());
                jtxt_pesodest.setText(datos.getPeso_destete());
                jtxt_pesonacer.setText(datos.getPeso_nacer());
                jd_fechaconsumo.setDate(this.deStringToDate(datos.getFecha_consumo()));
                jd_fechadest.setDate(this.deStringToDate(datos.getFecha_dest()));
                jd_fechaparto.setDate(this.deStringToDate(datos.getFecha_parto()));
                jcbx_procedencia.setSelectedItem(datos.getProcedencia());
                jcbx_raza.setSelectedItem(datos.getRaza());
                jcbx_razamadre.setSelectedItem(datos.getRazaMadre());
                jcbx_razapadre.setSelectedItem(datos.getRazaPadre());
                jcbx_sexo.setSelectedItem(datos.getSexo());
            } else {

                JOptionPane.showMessageDialog(null, "El registro del animal no existe", "Datos Animal - S.G.P",
                        JOptionPane.OK_OPTION, icoMensajeInfor);
                this.DesactivarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se cancelo la consulta", "Datos Animal - S.G.P",
                    JOptionPane.OK_OPTION, icoMensajeInfor);
        }
        buscarAnimal = null;
    }

    public void llenarDatosPartoAnimal(Granja datos) {

        jtxt_codmadre.setText(datos.getCodigo());
        jd_fechaparto.setDate(datos.getFechaParto());
        jtxt_edadsem.setText(datos.getEdad());
        jcbx_razamadre.setSelectedItem(datos.getRaza());
    }

    public void ActivarCampos() {
        jtxt_codmadre.setEnabled(true);
        jtxt_codparto.setEnabled(true);
        jtxt_pesodest.setEnabled(true);
        jtxt_pesonacer.setEnabled(true);
        jd_fechaconsumo.setEnabled(true);
        jd_fechadest.setEnabled(true);
        jd_fechaparto.setEnabled(true);
        jcbx_procedencia.setEnabled(true);
        jcbx_raza.setEnabled(true);
        jcbx_razamadre.setEnabled(true);
        jcbx_razapadre.setEnabled(true);
        jcbx_sexo.setEnabled(true);
    }

    public void DesactivarCampos() {
        jtxt_codmadre.setEnabled(false);
        jtxt_codparto.setEnabled(false);
        jtxt_edadsem.setEnabled(false);
        jtxt_pesodest.setEnabled(false);
        jtxt_pesonacer.setEnabled(false);
        jd_fechaconsumo.setEnabled(false);
        jd_fechadest.setEnabled(false);
        jd_fechaparto.setEnabled(false);
        jcbx_procedencia.setEnabled(false);
        jcbx_raza.setEnabled(false);
        jcbx_razamadre.setEnabled(false);
        jcbx_razapadre.setEnabled(false);
        jcbx_sexo.setEnabled(false);
    }

    public void validarCampos() {
        this.jtxt_pesonacer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                va.validarLongitud(2, jtxt_pesonacer, e);
                va.soloNumeros(jtxt_pesonacer, e);
            }
        });
        this.jtxt_pesodest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                va.validarLongitud(2, jtxt_pesodest, e);
                va.soloNumeros(jtxt_pesodest, e);
            }
        });
        this.jtxt_codparto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                va.validarLongitud(2, jtxt_codparto, e);
                va.soloNumeros(jtxt_codparto, e);
            }
        });
        this.jtxt_codmadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                va.validarLongitud(2, jtxt_codmadre, e);
                va.soloNumeros(jtxt_codmadre, e);
            }
        });
    }

    private boolean validacionObligatorios(DatosAnimal Datos) {
        boolean sw = true;
        if (datos.getCod_animal().equals("") || Datos.getCod_parto().equals("") || Datos.getRaza().equals("") || Datos.getPeso_nacer().equals("") || Datos.getPeso_destete().equals("")) {
            sw = false;
        }
        return sw;
    }

    public String codigoAnimales(int contador) {

        int op;
        String longitud, codigo = "";
        longitud = String.valueOf(contador);
        op = longitud.length();
        switch (op) {

            case 1:
                codigo = "000" + longitud;
                break;
            case 2:
                codigo = "00" + longitud;
                break;
            case 3:
                codigo = "0" + longitud;
            case 4:
                codigo = longitud;
                break;
        }
        return codigo;
    }

    public Date deStringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        System.out.println(fechaInicioString);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double semanas = Math.floor((diferencia / (1000 * 60 * 60 * 24)) / 7);
        return ((int) semanas);
    }

    public void llenarComboRaza(ListaRazas Lr) {
        NodoRazas nr = Lr.getPrimero();
        while (nr != null) {
            jcbx_raza.addItem(nr.getRaza().getNombreRaza());

            nr = nr.getLiga();
        }

    }

}
