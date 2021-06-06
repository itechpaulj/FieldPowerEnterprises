/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
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
        jScrollPane4 = new javax.swing.JScrollPane();
        reciept_genset = new javax.swing.JPanel();
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
        attention_label = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        unit_price_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Receipt_Cooments = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Receipt_subject = new javax.swing.JTextArea();
        Reciept_Intent = new javax.swing.JTextField();
        Reciept_Count = new javax.swing.JTextField();
        Reciept_Spect = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        frame = new javax.swing.JTextField();
        unit_price = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        unit_type = new javax.swing.JTextField();
        start_system = new javax.swing.JTextField();
        body_type = new javax.swing.JTextField();
        kva = new javax.swing.JTextField();
        dimen = new javax.swing.JTextField();
        fuel_tank = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        agent_name = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cancel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        print = new javax.swing.JLabel();

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

        reciept_genset.setBackground(new java.awt.Color(255, 255, 255));
        reciept_genset.setPreferredSize(new java.awt.Dimension(1300, 850));
        reciept_genset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 145, 716, 10));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel2.setText("FIELD POWER ENTERPRISES");
        reciept_genset.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 460, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/logo.png"))); // NOI18N
        reciept_genset.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 10, 150, 130));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel4.setText("T : 02-734-4318, 0956-1845577");
        reciept_genset.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 210, 30));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel5.setText("1467 , ABAD SANTOS, METRO MANILA");
        reciept_genset.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 230, 20));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel6.setText("www.fieldpowerenterprises.com");
        reciept_genset.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 10));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel7.setText("E : fieldpowergen@gmail.com");
        reciept_genset.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 210, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("SUBJECT  :");
        reciept_genset.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 100, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setText("Dear Ma'am / Sir :");
        reciept_genset.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, 30));

        Recieipt_c_name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Recieipt_c_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reciept_genset.add(Recieipt_c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 400, 30));

        Recieipt_c_address.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Recieipt_c_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reciept_genset.add(Recieipt_c_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 580, 30));

        attention_label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        attention_label.setText("ATTENTION :");
        reciept_genset.add(attention_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 30));

        image.setBorder(new javax.swing.border.MatteBorder(null));
        reciept_genset.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 290, 270));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel42.setText(" PRODUCT SPECIFICATION :");
        reciept_genset.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 210, 30));

        unit_price_label.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        unit_price_label.setText("UNIT PRICE");
        reciept_genset.add(unit_price_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 920, 90, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        Receipt_Cooments.setColumns(20);
        Receipt_Cooments.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Receipt_Cooments.setRows(5);
        Receipt_Cooments.setTabSize(5);
        Receipt_Cooments.setText("In compliance with your requirements, we are pleased to offer the offer the following for your consideration");
        Receipt_Cooments.setAlignmentX(5.0F);
        jScrollPane2.setViewportView(Receipt_Cooments);

        reciept_genset.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 690, 60));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Receipt_subject.setColumns(20);
        Receipt_subject.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Receipt_subject.setRows(5);
        Receipt_subject.setTabSize(5);
        jScrollPane3.setViewportView(Receipt_subject);

        reciept_genset.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 580, 60));

        Reciept_Intent.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Reciept_Intent.setText("In compliance with your requirement, we are pleased to offer the following for your consideration.");
        Reciept_Intent.setBorder(null);
        Reciept_Intent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reciept_IntentActionPerformed(evt);
            }
        });
        reciept_genset.add(Reciept_Intent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 690, 30));

        Reciept_Count.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Reciept_Count.setText("1. (ONE) Unit");
        Reciept_Count.setBorder(null);
        Reciept_Count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reciept_CountActionPerformed(evt);
            }
        });
        reciept_genset.add(Reciept_Count, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 200, 30));

        Reciept_Spect.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Reciept_Spect.setText("KVA BRAND MODEL");
        Reciept_Spect.setBorder(null);
        reciept_genset.add(Reciept_Spect, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 380, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 217, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField2.setText(" MODEL");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 180, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 217, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.setText(" UNIT TYPE ");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField1.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 180, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 217, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField3.setText(" BODY TYPE");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField3.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 180, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 217, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField5.setText(" FUEL TANK CAPACITY");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField5.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, 180, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 217, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField4.setText(" STARTING SYSTEM");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField4.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, 180, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 217, 255));
        jTextField6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField6.setText(" FRAME");
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField6.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 870, 180, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(102, 217, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField7.setText(" DIMENSION");
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField7.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 780, 180, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 217, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField8.setText(" VAC");
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField8.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 750, 180, 31));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 217, 255));
        jTextField9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField9.setText(" WEIGHT");
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jTextField9.setCaretColor(new java.awt.Color(102, 102, 102));
        reciept_genset.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 840, 180, 31));

        frame.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        frame.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 870, 220, 30));

        unit_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        reciept_genset.add(unit_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 920, 290, 30));

        model.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        model.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 220, 30));

        unit_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        unit_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(unit_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 220, 30));

        start_system.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        start_system.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(start_system, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, 220, 30));

        body_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        body_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(body_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, 220, 30));

        kva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        kva.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 750, 220, 30));

        dimen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dimen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(dimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 780, 220, 30));

        fuel_tank.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fuel_tank.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(fuel_tank, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 810, 220, 30));

        weight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        weight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        reciept_genset.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 840, 220, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Should there be anyting we can clarify, please do not hesitiate to call us.");
        reciept_genset.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1020, 710, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Thank you.");
        reciept_genset.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1050, 710, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Very truly yours,");
        reciept_genset.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1080, 710, 20));

        agent_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agent_name.setText("AGENT NAME");
        reciept_genset.add(agent_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1110, 710, 20));

        contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contact.setText("Contact");
        reciept_genset.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1140, 710, 20));

        jScrollPane4.setViewportView(reciept_genset);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 590));

        jPanel3.setBackground(new java.awt.Color(2, 71, 94));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 194, 102));

        cancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("CANCEL");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 210, 50));

        jPanel5.setBackground(new java.awt.Color(51, 187, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        print.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("PRINT");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 210, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 880, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

    }//GEN-LAST:event_jPanel5MouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void Reciept_IntentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reciept_IntentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reciept_IntentActionPerformed

    private void Reciept_CountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reciept_CountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reciept_CountActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        printRecord(reciept_genset);
    }//GEN-LAST:event_printMouseClicked

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
    private javax.swing.JLabel agent_name;
    private javax.swing.JLabel attention_label;
    private javax.swing.JTextField body_type;
    public static javax.swing.JLabel cancel;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField dimen;
    private javax.swing.JTextField frame;
    private javax.swing.JTextField fuel_tank;
    public static javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    public static javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    private javax.swing.JTextField kva;
    private javax.swing.JTextField model;
    public static javax.swing.JLabel print;
    private javax.swing.JPanel reciept_genset;
    private javax.swing.JTextField start_system;
    public static javax.swing.JLabel unit_price;
    public static javax.swing.JLabel unit_price_label;
    private javax.swing.JTextField unit_type;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables

    private void printRecord(JPanel reciept_genset) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
                // Set Printer Job Name
                printerJob.setJobName("Print Record");
                // Set Printable
                printerJob.setPrintable(new Printable() {
                    @Override
                    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                        // Check If No Printable Content
                        if(pageIndex > 0){
                            return Printable.NO_SUCH_PAGE;
                        }

                        // Make 2D Graphics to map content
                        Graphics2D graphics2D = (Graphics2D)graphics;
                        // Set Graphics Translations
                        // A Little Correction here Multiplication was not working so I replaced with addition
                        graphics2D.translate(pageFormat.getImageableX()+50, pageFormat.getImageableY()+50);
                        // This is a page scale. Default should be 0.3 I am using 0.5
                        graphics2D.scale(0.5, 0.5);

                        // Now paint panel as graphics2D
                        //reciept_genset.paint(graphics2D);

                        // return if page exists
                        return Printable.PAGE_EXISTS;
                    }
                });
                // Store printerDialog as boolean
                boolean returningResult = printerJob.printDialog();
                // check if dilog is showing
                if(returningResult){
                    // Use try catch exeption for failure
                    try{
                        // Now call print method inside printerJob to print
                        printerJob.print();
                    }catch (PrinterException printerException){
                        JOptionPane.showMessageDialog(this, "Print Error: " + printerException.getMessage());
                    }
                }
            }
    
    }