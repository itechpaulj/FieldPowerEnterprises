/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ROBLES
 */
public class Process_Filter extends javax.swing.JFrame {
    Connection con; 
    String filename = null;
    public static byte[] images = null;
    Class_tables ct = new Class_tables();
    
    
    public Process_Filter() {
        initComponents();
        con = FPE_DB.getConnection();
        ct.ShowOrder();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Process_Filter_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        count_process = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Process_Filter_Customer_address = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Order_Table = new javax.swing.JTable();
        Process_Filter_Customer_email = new javax.swing.JTextField();
        Process_Filter_Customer_contact = new javax.swing.JTextField();
        Process_Filter_Agent_name = new javax.swing.JTextField();
        Process_Filter_Agent_contact = new javax.swing.JTextField();
        Process_Filter_Customer_name = new javax.swing.JTextField();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Process_Filter_Btn = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Process_Filter_Back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Process_Filter_Customer_dealing_info = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        quotation = new javax.swing.JTextField();
        yr = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        yearQuot = new javax.swing.JLabel();
        numQuot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Process_Filter_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Process_Filter_Display.setForeground(new java.awt.Color(255, 255, 255));
        Process_Filter_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Process_Filter_Display.setText("FILTER / PARTS PROCESS");
        Process_Filter_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Process_Filter_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Process_Filter_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 162, 162));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 162, 162));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        KG2_ADD_STOCK_GENSET.add(count_process, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(20, 31, 31));
        id1.setText("NAME");
        id1.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 100, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(20, 31, 31));
        jLabel21.setText("ADDRESS");
        jLabel21.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 100, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(20, 31, 31));
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 100, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(20, 31, 31));
        jLabel18.setText("CONTACT NO.");
        jLabel18.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 100, 30));

        id3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id3.setForeground(new java.awt.Color(20, 31, 31));
        id3.setText("AGENT NAME");
        id3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 100, 30));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(20, 31, 31));
        jLabel24.setText("CONTACT");
        jLabel24.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 100, 30));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Process_Filter_Customer_address.setColumns(10);
        Process_Filter_Customer_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Process_Filter_Customer_address.setForeground(new java.awt.Color(20, 31, 31));
        Process_Filter_Customer_address.setRows(5);
        Process_Filter_Customer_address.setTabSize(5);
        Process_Filter_Customer_address.setAlignmentX(3.0F);
        Process_Filter_Customer_address.setAlignmentY(2.0F);
        Process_Filter_Customer_address.setBorder(null);
        Process_Filter_Customer_address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(Process_Filter_Customer_address);

        KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 180, 30));

        Order_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Order_Table);

        KG2_ADD_STOCK_GENSET.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 630, 420));

        Process_Filter_Customer_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Process_Filter_Customer_email.setForeground(new java.awt.Color(20, 31, 31));
        Process_Filter_Customer_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Process_Filter_Customer_email.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Process_Filter_Customer_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 180, 30));

        Process_Filter_Customer_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Process_Filter_Customer_contact.setForeground(new java.awt.Color(20, 31, 31));
        Process_Filter_Customer_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Process_Filter_Customer_contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Process_Filter_Customer_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 180, 30));

        Process_Filter_Agent_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Process_Filter_Agent_name.setForeground(new java.awt.Color(20, 31, 31));
        Process_Filter_Agent_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Process_Filter_Agent_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Process_Filter_Agent_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 180, 30));

        Process_Filter_Agent_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Process_Filter_Agent_contact.setForeground(new java.awt.Color(20, 31, 31));
        Process_Filter_Agent_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Process_Filter_Agent_contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Process_Filter_Agent_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 180, 30));

        Process_Filter_Customer_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Process_Filter_Customer_name.setForeground(new java.awt.Color(20, 31, 31));
        Process_Filter_Customer_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Process_Filter_Customer_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Process_Filter_Customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 180, 30));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));
        Stock_Genset_Panel_Update.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        Process_Filter_Btn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Process_Filter_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Process_Filter_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Process_Filter_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Save_Btn.png"))); // NOI18N
        Process_Filter_Btn.setText(" PROCEED");
        Process_Filter_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Process_Filter_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Process_Filter_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Process_Filter_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_UpdateLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Update);
        Stock_Genset_Panel_Update.setLayout(Stock_Genset_Panel_UpdateLayout);
        Stock_Genset_Panel_UpdateLayout.setHorizontalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Process_Filter_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Process_Filter_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 210, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 173, 51));
        Stock_Genset_Panel_Back.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        Process_Filter_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Process_Filter_Back.setForeground(new java.awt.Color(255, 255, 255));
        Process_Filter_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Process_Filter_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        Process_Filter_Back.setText(" CANCEL ");
        Process_Filter_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Process_Filter_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Process_Filter_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Process_Filter_BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_BackLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back);
        Stock_Genset_Panel_Back.setLayout(Stock_Genset_Panel_BackLayout);
        Stock_Genset_Panel_BackLayout.setHorizontalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Process_Filter_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Process_Filter_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 179));

        Supplier_List_Btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Supplier_List_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplier_List_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Exist.png"))); // NOI18N
        Supplier_List_Btn.setText(" CUSTOMER LIST   ");
        Supplier_List_Btn.setAlignmentY(1.0F);
        Supplier_List_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplier_List_BtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 180, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "ORDER LIST", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 670, 480));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(20, 31, 31));
        jLabel20.setText("DEALING INFO");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 100, 30));

        Process_Filter_Customer_dealing_info.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Process_Filter_Customer_dealing_info.setForeground(new java.awt.Color(20, 31, 31));
        Process_Filter_Customer_dealing_info.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Process_Filter_Customer_dealing_info.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Process_Filter_Customer_dealing_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 180, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setToolTipText("");
        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "CUSTOMER INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 330, 280));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(20, 31, 31));
        jLabel25.setText("QUOTATION");
        jLabel25.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 100, 30));

        quotation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        quotation.setForeground(new java.awt.Color(20, 31, 31));
        quotation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quotation.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(quotation, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 180, 30));

        yr.setText("YEAR - QUOTATION");
        yr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(yr, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 180, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setToolTipText("");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "AGENT NFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 330, 180));

        yearQuot.setText("0000");
        KG2_ADD_STOCK_GENSET.add(yearQuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 60, 20));

        numQuot.setText("1");
        KG2_ADD_STOCK_GENSET.add(numQuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 80, 20));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Process_Filter_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Process_Filter_BtnMouseClicked
      PreparedStatement ps;
      ResultSet rs;
        
     String unique = count_process.getText(); // count process
     String qout = quotation.getText();
     
     String name = Process_Filter_Customer_name.getText();
     String address = Process_Filter_Customer_address.getText();
     String email = Process_Filter_Customer_email.getText();
     String cotact = Process_Filter_Customer_contact.getText();
     String agent_name = Process_Filter_Agent_name.getText();
     String agent_contact = Process_Filter_Agent_contact.getText();
     String dealing_info = Process_Filter_Customer_dealing_info.getText();
     String count_processed = count_process.getText();
     String subject = "FILTER / PARTS / OTHERS";
            
     
     try{
        ps=FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DATE`, `DESCRIPTION`, `TYPE`, `QUANTITY`, `PRICE`, `TOTAL PRICE` FROM `add_cart`");
        rs = ps.executeQuery();
        
        if(rs.next()){
          

            if(!Class_Order.UpdateHistoryFilter(qout, unique, name, address, email, cotact, agent_name, agent_contact,dealing_info) && !Class_Cart.DeleteCart()){
                JOptionPane.showMessageDialog(null, "SUCCESS"); ct.ShowCart(); ct.ShowOrder();
                    Mainpage.cartIfEmpty.setText("1");
                    JasperDesign jasperdesign =JRXmlLoader.load("src/FPE/printfilter.jrxml");
                    String sql = "SELECT `ID`, CONCAT(`BRAND`,' ',`DESCRIPTION`) AS `DESCRIPTION` , `PRICE`, `QUANTITY`, `TOTAL PRICE` FROM `history_filter` WHERE `COUNT_PROCESS`='"+unique+"'";
                    JRDesignQuery jrdesignquery = new JRDesignQuery();
                    jrdesignquery.setText(sql);
                    jasperdesign.setQuery(jrdesignquery);
                    JasperReport jaspereport = JasperCompileManager.compileReport(jasperdesign);

                    HashMap<String, Object> params = new HashMap<String, Object>();
                    BufferedImage image = ImageIO.read(getClass().getResource("logo.png"));
                    params.put("logo", image);
                    params.put("quot", qout);
                    params.put("cus_name", name);
                    params.put("cus_add", address);
                    params.put("subject", subject);
                    params.put("cus_email", email);
                    params.put("counted_process", count_processed);
                    params.put("agent_name", agent_name);
                    params.put("agent_contact", agent_contact);

                    JasperPrint jasperprint = JasperFillManager.fillReport(jaspereport, params,con);
                    JasperViewer.viewReport(jasperprint,false);
                    dispose();
            }

           
        }
        else{
            JOptionPane.showMessageDialog(null, "EMPTY CART","",JOptionPane.ERROR_MESSAGE);
        }
     }
     catch(Exception e){
           System.out.println(e.getMessage());
           JOptionPane.showMessageDialog(null, e);
     }
    
     
     

     
    
    }//GEN-LAST:event_Process_Filter_BtnMouseClicked

    private void Process_Filter_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Process_Filter_BtnMouseEntered
        Process_Filter_Btn.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Process_Filter_BtnMouseEntered

    private void Process_Filter_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Process_Filter_BtnMouseExited
        Process_Filter_Btn.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Process_Filter_BtnMouseExited

    private void Process_Filter_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Process_Filter_BackMouseClicked
        
    dispose();
    }//GEN-LAST:event_Process_Filter_BackMouseClicked

    private void Process_Filter_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Process_Filter_BackMouseEntered
        Process_Filter_Back.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Process_Filter_BackMouseEntered

    private void Process_Filter_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Process_Filter_BackMouseExited
        Process_Filter_Back.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Process_Filter_BackMouseExited

    private void Process_Filter_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Process_Filter_DisplayAncestorAdded
            
        if(Process_Filter_Display.getText().equals("FILTER / PARTS PROCESS")){
         try{
              
              PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `QUOTATION`,`COUNT_PROCESS` FROM `history_filter` ORDER BY `ID` DESC LIMIT 1");
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  count_process.setText(rs.getString("COUNT_PROCESS"));
                  
                  if(rs.getString("QUOTATION").equals("")){
                      yearQuot.setText("0000");
                      numQuot.setText("1");
                      
                    try{
                        quotation.setText(year.yr.getSelectedItem().toString()+" - "+year.quot_number.getText());
                        yearQuot.setText(year.yr.getSelectedItem().toString());
                        numQuot.setText(year.quot_number.getText());  

                    }catch(Exception e ){
                       // e.printStackTrace();
                    }
                  }
                  else{
                        try{
                            quotation.setText(year.yr.getSelectedItem().toString()+" - "+year.quot_number.getText());
                            yearQuot.setText(year.yr.getSelectedItem().toString());
                            numQuot.setText(year.quot_number.getText());  

                        }catch(Exception e ){
                           // e.printStackTrace();
                        }  
                  }
               }
          }catch(Exception e){
              e.printStackTrace();
          }
        }
    }//GEN-LAST:event_Process_Filter_DisplayAncestorAdded

    private void Supplier_List_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_BtnMouseClicked
        Table_Customer ts = new Table_Customer();
        ts.setVisible(true);
        Table_Customer.Add.setText("SELECT");
        Table_Customer.Path.setText("3");

    }//GEN-LAST:event_Supplier_List_BtnMouseClicked

    private void yrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrActionPerformed
        year yr = new year();
        yr.yearCompared.setText("2");
        yr.setVisible(true);
    }//GEN-LAST:event_yrActionPerformed

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
            java.util.logging.Logger.getLogger(Process_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Process_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Process_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Process_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Process_Filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JTable Order_Table;
    public static javax.swing.JTextField Process_Filter_Agent_contact;
    public static javax.swing.JTextField Process_Filter_Agent_name;
    private javax.swing.JLabel Process_Filter_Back;
    private javax.swing.JLabel Process_Filter_Btn;
    public static javax.swing.JTextArea Process_Filter_Customer_address;
    public static javax.swing.JTextField Process_Filter_Customer_contact;
    public static javax.swing.JTextField Process_Filter_Customer_dealing_info;
    public static javax.swing.JTextField Process_Filter_Customer_email;
    public static javax.swing.JTextField Process_Filter_Customer_name;
    public static javax.swing.JLabel Process_Filter_Display;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Supplier_List_Btn;
    private javax.swing.JLabel count_process;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numQuot;
    public static javax.swing.JTextField quotation;
    private javax.swing.JLabel yearQuot;
    private javax.swing.JButton yr;
    // End of variables declaration//GEN-END:variables
}
