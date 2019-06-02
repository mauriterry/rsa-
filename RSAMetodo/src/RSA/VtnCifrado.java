/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * VtnCifrado.java
 *
 * Created on 20/12/2010, 09:40:17 PM
 */
package RSA;

import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.util.StringTokenizer;
import static javax.management.Query.gt;
import static javax.management.Query.lt;
import javax.swing.JOptionPane;

public class VtnCifrado extends javax.swing.JFrame {

    public VtnCifrado() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtPrimoQ = new javax.swing.JTextField();
        txtPrimoP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblN = new javax.swing.JLabel();
        lblTotient = new javax.swing.JLabel();
        lblClaveE = new javax.swing.JLabel();
        lblClaveD = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblSelecE = new javax.swing.JLabel();
        lblCalcD = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jpDescrifrado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEntradaDescifrado = new javax.swing.JTextPane();
        lblDescifrar2 = new javax.swing.JLabel();
        lblDescifra1 = new javax.swing.JLabel();
        btnDescifrar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSalidaDescifrado = new javax.swing.JTextPane();
        jpCifrado = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEntradaCifrado = new javax.swing.JTextPane();
        lblCifrar3 = new javax.swing.JLabel();
        lblCifrar2 = new javax.swing.JLabel();
        btnCifrar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSalidaCifrado = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Criptográfico de Clave Publica (RSA)");
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(0, 51, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Generación Numeros Aleatoreos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Número q:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Número p:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Generar Números Primos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPrimoQ.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrimoQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimoQActionPerformed(evt);
            }
        });

        txtPrimoP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrimoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimoPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrimoQ, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(28, 28, 28)
                            .addComponent(txtPrimoP, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrimoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrimoQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), "Parametros RSA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Calcula n = pq =");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Clave Publica e:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Clave Privada d:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Calcula f(n)=(p-1)(q-1)=");
        jLabel4.setToolTipText("");

        lblN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblN.setToolTipText("");
        lblN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblClaveE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClaveE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblClaveD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClaveD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Selecciona e=");
        jLabel7.setToolTipText("");

        lblSelecE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSelecE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCalcD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCalcD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Calcula d=");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSelecE, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCalcD, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblClaveE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblClaveD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTotient, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblN, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotient, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblSelecE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblCalcD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblClaveE, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblClaveD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblClaveD, lblClaveE, lblN, lblTotient});

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton4.setText("Limpiar Campos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jpDescrifrado.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), "Descifrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jpDescrifrado.setToolTipText("");
        jpDescrifrado.setEnabled(false);

        txtEntradaDescifrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEntradaDescifrado.setEnabled(false);
        txtEntradaDescifrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradaDescifradoKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtEntradaDescifrado);

        lblDescifrar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescifrar2.setText("Mensaje Descifrado:");
        lblDescifrar2.setEnabled(false);

        lblDescifra1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescifra1.setText("Introduzca el mensaje descifrar:");
        lblDescifra1.setEnabled(false);

        btnDescifrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDescifrar.setText("Aceptar");
        btnDescifrar.setEnabled(false);
        btnDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescifrarActionPerformed(evt);
            }
        });

        txtSalidaDescifrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalidaDescifrado.setEnabled(false);
        jScrollPane4.setViewportView(txtSalidaDescifrado);

        javax.swing.GroupLayout jpDescrifradoLayout = new javax.swing.GroupLayout(jpDescrifrado);
        jpDescrifrado.setLayout(jpDescrifradoLayout);
        jpDescrifradoLayout.setHorizontalGroup(
            jpDescrifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescrifradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDescrifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDescrifradoLayout.createSequentialGroup()
                        .addComponent(lblDescifra1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpDescrifradoLayout.createSequentialGroup()
                        .addComponent(lblDescifrar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDescifrar))
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpDescrifradoLayout.setVerticalGroup(
            jpDescrifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescrifradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescifra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpDescrifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDescifrar)
                    .addComponent(lblDescifrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCifrado.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), "Cifrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jpCifrado.setEnabled(false);

        txtEntradaCifrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEntradaCifrado.setEnabled(false);
        jScrollPane5.setViewportView(txtEntradaCifrado);

        lblCifrar3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCifrar3.setText("Mensaje Cifrado (c=m^e (mod n))");
        lblCifrar3.setEnabled(false);

        lblCifrar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCifrar2.setText("Introduzca el mensaje para cifrar");
        lblCifrar2.setEnabled(false);

        btnCifrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCifrar.setText("Aceptar");
        btnCifrar.setEnabled(false);
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });

        txtSalidaCifrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalidaCifrado.setEnabled(false);
        txtSalidaCifrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalidaCifradoKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(txtSalidaCifrado);

        javax.swing.GroupLayout jpCifradoLayout = new javax.swing.GroupLayout(jpCifrado);
        jpCifrado.setLayout(jpCifradoLayout);
        jpCifradoLayout.setHorizontalGroup(
            jpCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCifradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCifradoLayout.createSequentialGroup()
                        .addGroup(jpCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addGroup(jpCifradoLayout.createSequentialGroup()
                                .addComponent(lblCifrar2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpCifradoLayout.createSequentialGroup()
                                .addComponent(lblCifrar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCifrar)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCifradoLayout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addContainerGap())))
        );
        jpCifradoLayout.setVerticalGroup(
            jpCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCifradoLayout.createSequentialGroup()
                .addComponent(lblCifrar2)
                .addGap(5, 5, 5)
                .addGroup(jpCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCifradoLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCifrar3)
                        .addGap(7, 7, 7))
                    .addComponent(btnCifrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("Juan Jimenez - Fernando Gomez - Maria Guerrero © Copyright 2017");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpCifrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpDescrifrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpCifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpDescrifrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimoPActionPerformed

    }//GEN-LAST:event_txtPrimoPActionPerformed

    private void txtPrimoQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimoQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimoQActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rsa = new RSA(10);
        txtPrimoP.setText("" + rsa.getP());
        txtPrimoQ.setText("" + rsa.getQ());
    }//GEN-LAST:event_jButton1ActionPerformed
    private RSA rsa;

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!txtPrimoP.getText().isEmpty() || !txtPrimoQ.getText().isEmpty()) {
            if (!txtPrimoP.getText().isEmpty()) {
                if (!txtPrimoQ.getText().isEmpty()) {
                    BigInteger p = new BigInteger(txtPrimoP.getText());
                    BigInteger q = new BigInteger(txtPrimoQ.getText());
                    cifradoRSA = new RSA(p, q, 10);
                    lblN.setText("" + cifradoRSA.getN());
                    lblSelecE.setText("" + cifradoRSA.getE());
                    lblCalcD.setText("" + cifradoRSA.getD());
                    lblClaveE.setText("{" + cifradoRSA.getE() + " , " + cifradoRSA.getN() + "}");
                    lblClaveD.setText("{" + cifradoRSA.getD() + " , " + cifradoRSA.getN() + "}");
                    lblTotient.setText("" + cifradoRSA.getTotient());
                    JOptionPane.showMessageDialog(this, "Ahora puede generar la Encriptacion");
                    btnCifrar.setEnabled(true);
                    jpCifrado.setEnabled(true);
                    lblCifrar2.setEnabled(true);
                    lblCifrar3.setEnabled(true);
                    txtEntradaCifrado.enable();
                    txtSalidaCifrado.enable();
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese el valor de q");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese el valor de p");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el valor de p y q");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtEntradaCifrado.setText("");
        txtSalidaCifrado.setText("");
        txtEntradaDescifrado.setText("");
        txtSalidaDescifrado.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed

        if (!("".equals(txtEntradaCifrado.getText()))) {
            BigInteger[] textoCifrado = cifradoRSA.encripta(txtEntradaCifrado.getText());
            txtSalidaCifrado.setText("");
            for (int i = 0; i < textoCifrado.length; i++) {
                txtSalidaCifrado.setText(txtSalidaCifrado.getText() + textoCifrado[i].toString() + "\t");
                if (i != textoCifrado.length - 1) {
                    txtSalidaCifrado.setText(txtSalidaCifrado.getText() + "");
                }
            }
            txtEntradaDescifrado.setText(txtSalidaCifrado.getText());
            jpDescrifrado.setEnabled(true);
            lblDescifra1.setEnabled(true);
            lblDescifrar2.setEnabled(true);
            txtEntradaDescifrado.enable();
            txtSalidaDescifrado.enable();
            btnDescifrar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "introduzca el texto a cifrar");
        }
    }//GEN-LAST:event_btnCifrarActionPerformed

    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed
        String x = txtSalidaCifrado.getText();
        String y = txtEntradaDescifrado.getText();
        if (x.equals(y)) {
            String letra = "";
            StringTokenizer st = new StringTokenizer(txtEntradaDescifrado.getText());
            BigInteger[] textoCifrado = new BigInteger[st.countTokens()];

            for (int i = 0; i < textoCifrado.length; i++) {
                letra = st.nextToken();
                textoCifrado[i] = new BigInteger(letra);
            }
            txtSalidaDescifrado.setText(cifradoRSA.desencripta(textoCifrado));
        } else {
            JOptionPane.showMessageDialog(this, "Los datos de la cadena encriptada no son validos, por favor verifique");
        }

        //}
    }//GEN-LAST:event_btnDescifrarActionPerformed

    private void txtEntradaDescifradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaDescifradoKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEntradaDescifradoKeyTyped

    private void txtSalidaCifradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalidaCifradoKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalidaCifradoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnCifrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel jpCifrado;
    private javax.swing.JPanel jpDescrifrado;
    private javax.swing.JLabel lblCalcD;
    private javax.swing.JLabel lblCifrar2;
    private javax.swing.JLabel lblCifrar3;
    private javax.swing.JLabel lblClaveD;
    private javax.swing.JLabel lblClaveE;
    private javax.swing.JLabel lblDescifra1;
    private javax.swing.JLabel lblDescifrar2;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblSelecE;
    private javax.swing.JLabel lblTotient;
    private javax.swing.JTextPane txtEntradaCifrado;
    private javax.swing.JTextPane txtEntradaDescifrado;
    private javax.swing.JTextField txtPrimoP;
    private javax.swing.JTextField txtPrimoQ;
    private javax.swing.JTextPane txtSalidaCifrado;
    private javax.swing.JTextPane txtSalidaDescifrado;
    // End of variables declaration//GEN-END:variables
    private RSA cifradoRSA;
}
