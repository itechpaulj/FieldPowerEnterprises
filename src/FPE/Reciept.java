/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import FPE2.*;
import javax.swing.JPanel;

/**
 *
 * @author ROBLES
 */
public class Reciept extends javax.swing.JFrame {

    /**
     * Creates new form Reciept
     */
    public Reciept() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Recieipt_c_name = new javax.swing.JLabel();
        Recieipt_c_address = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Receipt_Cooments = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Receipt_subject = new javax.swing.JTextArea();
        Reciept_Intent = new javax.swing.JTextField();
        Reciept_Count = new javax.swing.JTextField();
        Reciept_Spect = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel41.setText("PRODUCT SPECIFICATION :");
        jLabel41.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(825, 1230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 145, 716, 10));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel2.setText("FIELD POWER ENTERPRISES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 460, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 10, 150, 130));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel4.setText("T : 02-734-4318, 0956-1845577");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 210, 30));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel5.setText("1467 , ABAD SANTOS, METRO MANILA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 230, 20));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel6.setText("www.fieldpowerenterprises.com");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 10));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel7.setText("E : fieldpowergen@gmail.com");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 210, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("SUBJECT  :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 100, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setText("Dear Maa'm");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 100, 30));

        Recieipt_c_name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Recieipt_c_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Recieipt_c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 400, 30));

        Recieipt_c_address.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Recieipt_c_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Recieipt_c_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 580, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("ATTENTION :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 220, 31));

        jLabel25.setText("PRODUCT SPECIFICATION :");
        jLabel25.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 290, 270));

        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 220, 31));

        jLabel30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, 220, 31));

        jLabel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, 220, 31));

        jLabel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 810, 220, 31));

        jLabel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 870, 220, 31));

        jLabel37.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 780, 220, 31));

        jLabel38.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 750, 220, 31));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel42.setText(" PRODUCT SPECIFICATION :");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 210, 30));

        jLabel44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 840, 220, 31));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 920, 200, 30));

        jLabel46.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel46.setText("UNIT PRICE");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 920, 130, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        Receipt_Cooments.setColumns(20);
        Receipt_Cooments.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Receipt_Cooments.setRows(5);
        Receipt_Cooments.setTabSize(5);
        Receipt_Cooments.setAlignmentX(5.0F);
        jScrollPane2.setViewportView(Receipt_Cooments);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 690, 60));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Receipt_subject.setColumns(20);
        Receipt_subject.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Receipt_subject.setRows(5);
        Receipt_subject.setTabSize(5);
        jScrollPane3.setViewportView(Receipt_subject);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 580, 60));

        Reciept_Intent.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Reciept_Intent.setText("jTextField1");
        Reciept_Intent.setBorder(null);
        jPanel2.add(Reciept_Intent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 690, 30));

        Reciept_Count.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Reciept_Count.setText("jTextField1");
        Reciept_Count.setBorder(null);
        jPanel2.add(Reciept_Count, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 200, 30));

        Reciept_Spect.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Reciept_Spect.setText("jTextField1");
        Reciept_Spect.setBorder(null);
        jPanel2.add(Reciept_Spect, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 380, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 217, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.setText(" UNIT TYPE ");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField1.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 180, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 217, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField2.setText(" MODEL");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 180, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 217, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField3.setText(" BODY TYPE");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField3.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 180, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 217, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField4.setText(" STARTING SYSTEM");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField4.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, 180, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 217, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField5.setText(" FUEL TANK CAPACITY");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField5.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, 180, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 217, 255));
        jTextField6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField6.setText(" FRAME");
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField6.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 870, 180, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(102, 217, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField7.setText(" DIMENSION");
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField7.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 780, 180, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 217, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField8.setText(" VAC");
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField8.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 750, 180, 31));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 217, 255));
        jTextField9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField9.setText(" WEIGTH");
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField9.setCaretColor(new java.awt.Color(102, 102, 102));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 840, 180, 31));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 590));

        jPanel3.setBackground(new java.awt.Color(2, 71, 94));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 194, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 210, 50));

        jPanel5.setBackground(new java.awt.Color(51, 187, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 210, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 880, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciept().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Receipt_Cooments;
    public static javax.swing.JTextArea Receipt_subject;
    public static javax.swing.JLabel Recieipt_c_address;
    public static javax.swing.JLabel Recieipt_c_name;
    public static javax.swing.JTextField Reciept_Count;
    public static javax.swing.JTextField Reciept_Intent;
    public static javax.swing.JTextField Reciept_Spect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel34;
    public static javax.swing.JLabel jLabel36;
    public static javax.swing.JLabel jLabel37;
    public static javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    public static javax.swing.JLabel jLabel42;
    public static javax.swing.JLabel jLabel44;
    public static javax.swing.JLabel jLabel45;
    public static javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void print(JPanel jPanel2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printRecord(JPanel jPanel2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
