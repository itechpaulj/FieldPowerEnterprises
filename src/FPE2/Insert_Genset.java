/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class Insert_Genset extends javax.swing.JFrame {
    
    String choose;
    String date,brand,phasing,unit_type,dimen,kva,price,model,fuel_tank,body_type,engines_sn,alter_sn,idEditgenset;
    String engine_sn;
    String alters_sn; 
    String save_add; 
    
    String filename = null;
    public static byte[] person_image = null;
    

    
    public Insert_Genset() {
        initComponents();
        id.setVisible(false);
        as_id.setVisible(false);
        as_supplierNone.setVisible(false);
        supplierTxt.setVisible(false);
    }
    
    public Insert_Genset(byte [] person_images1) {
        initComponents();  
        person_image = person_images1;
        id.setVisible(false);
        as_id.setVisible(false);
        as_supplierNone.setVisible(false);
        supplierTxt.setVisible(false);
    }    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        as_brand = new javax.swing.JTextField();
        as_model = new javax.swing.JTextField();
        as_kva = new javax.swing.JTextField();
        as_engine_sn = new javax.swing.JTextField();
        as_alternator_sn = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        as_unitType = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        as_dimension = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        as_pic = new javax.swing.JLabel();
        alt_sn = new javax.swing.JComboBox<>();
        eng_sn = new javax.swing.JComboBox<>();
        as_date = new datechooser.beans.DateChooserCombo();
        jLabel29 = new javax.swing.JLabel();
        as_price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        as_phasing = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        gensetBtn = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        as_id = new javax.swing.JLabel();
        as_supplierNone = new javax.swing.JLabel();
        supplierTxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        as_brand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_brand.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, 31));

        as_model.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_model.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 210, 31));

        as_kva.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_kva.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 210, 31));

        as_engine_sn.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_engine_sn.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_engine_sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, 31));

        as_alternator_sn.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_alternator_sn.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_alternator_sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 140, 31));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel20.setText("UNIT TYPE");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 26));

        as_unitType.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_unitType.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_unitType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, 31));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel22.setText("DIMESION");
        jLabel22.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 26));

        as_dimension.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_dimension.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_dimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, 31));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("BRAND");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 26));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("MODEL");
        jLabel3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 26));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("KVA");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 26));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel11.setText("ENGINE_SN");
        jLabel11.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 120, 26));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setText("ALTERNATOR_SN");
        jLabel15.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 130, 26));

        id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id.setText("ID");
        id.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 26));

        as_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        as_pic.setText("2x2");
        as_pic.setAlignmentY(1.0F);
        as_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        as_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                as_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(as_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 350, 200));

        alt_sn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "ALTER OLD", "ALTER NEW" }));
        alt_sn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alt_snMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(alt_sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 90, 30));

        eng_sn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "ENGINE OLD", "ENGINE NEW" }));
        eng_sn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eng_snMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(eng_sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 90, 30));

        as_date.setCalendarPreferredSize(new java.awt.Dimension(400, 200));
        KG2_ADD_STOCK_GENSET.add(as_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 210, 30));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel29.setText("PRICE");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 100, 26));

        as_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_price.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 230, 31));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setText("PHASING");
        jLabel10.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 26));

        as_phasing.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_phasing.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, 31));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 210, 50));

        gensetBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        gensetBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gensetBtn.setText("NEXT");
        gensetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gensetBtnMouseClicked(evt);
            }
        });
        gensetBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gensetBtnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 210, 50));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("DATE");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, 26));

        as_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_id.setText("NONE");
        as_id.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 26));

        as_supplierNone.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        as_supplierNone.setText("NONE");
        as_supplierNone.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(as_supplierNone, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 110, 26));

        supplierTxt.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        supplierTxt.setText("SUPPLIER");
        supplierTxt.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(supplierTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 26));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 820, 610));

        jPanel4.setBackground(new java.awt.Color(3, 33, 73));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("ADD GENSET PRODUCT");
        display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void gensetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gensetBtnMouseClicked
        
    String date1 = as_date.getText().toUpperCase(); 
    String brand1 = as_brand.getText().toUpperCase(); 
    String phasing1 = as_phasing.getText().toUpperCase(); 
    String unit_type1 = Insert_Genset.as_unitType.getText().toUpperCase(); 
    String dimen1 = as_dimension.getText().toUpperCase();
    String kva1 = as_kva.getText().toUpperCase();
    String price1 = as_price.getText().toUpperCase(); 
    String model1 = as_model.getText().toUpperCase(); 
    String a = eng_sn.getSelectedItem().toString(); 
    String b = alt_sn.getSelectedItem().toString(); 
    String engines_sn1 = as_engine_sn.getText().toUpperCase() +" "+ a; 
    String alters1_sn = as_alternator_sn.getText().toUpperCase() +" " + b; 
    
    String sup_name = as_supplierNone.getText();
    String as_idGenset = as_id.getText();
                      
        Class_table ct = new Class_table();
        String Banner = display.getText();
        String genset = gensetBtn.getText();
        if(Banner.equals("ADD GENSET PRODUCT") && genset.equals("NEXT")){
            InsertSupplier is = new InsertSupplier(person_image);
            is.setVisible(true);
            InsertSupplier.AddSup.setText("2"); // add genset and add supplier
            
        }
//        else{
//            if(Banner.equals("UPDATE GENSET PRODUCT") && genset.equals("UPDATE") ){
//                
//                //Class_Stock.UpdateStock(date1, brand1, phasing1, unit_type1, dimen1, kva1, price1, model1, engines_sn1, alters1_sn, person_image, sup_name, as_idGenset);
//                Class_Stock.UpdateStock(date1, brand1, phasing1, unit_type1, dimen1, kva1, price1, model1, engines_sn1, alters1_sn, person_image, sup_name, as_idGenset);
//                ct.Show_Stock_Genset_Table();
//                JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULLY","",JOptionPane.INFORMATION_MESSAGE);
//            }
//        }
        
      
    }//GEN-LAST:event_gensetBtnMouseClicked

    private void eng_snMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eng_snMouseClicked
       
       
    }//GEN-LAST:event_eng_snMouseClicked

    private void alt_snMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alt_snMouseClicked
        
    }//GEN-LAST:event_alt_snMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // display123.setText(dis1);
    }//GEN-LAST:event_formWindowOpened

    private void displayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displayAncestorAdded

    }//GEN-LAST:event_displayAncestorAdded

    private void as_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_as_picMouseClicked
        as_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        as_pic.setText(filename);
        
                //Image getAbsolutePath = null;
        //ImageIcon icon = new ImageIcon(filename);
        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(as_pic.getWidth(), as_pic.getHeight(),Image.SCALE_SMOOTH) );
        as_pic.setIcon(imageicon);

        try{
            File image = new File(filename);
            FileImageInputStream fis = new FileImageInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for(int readNum;(readNum=fis.read(buf)) !=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
            
        }
        catch(Exception e){
           // e.printStackTrace();
        }
    }//GEN-LAST:event_as_picMouseClicked

    private void gensetBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gensetBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gensetBtnKeyPressed

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
            java.util.logging.Logger.getLogger(Insert_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Genset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JComboBox<String> alt_sn;
    public static javax.swing.JTextField as_alternator_sn;
    public static javax.swing.JTextField as_brand;
    public static datechooser.beans.DateChooserCombo as_date;
    public static javax.swing.JTextField as_dimension;
    public static javax.swing.JTextField as_engine_sn;
    public static javax.swing.JLabel as_id;
    public static javax.swing.JTextField as_kva;
    public static javax.swing.JTextField as_model;
    public static javax.swing.JTextField as_phasing;
    public static javax.swing.JLabel as_pic;
    public static javax.swing.JTextField as_price;
    public static javax.swing.JLabel as_supplierNone;
    public static javax.swing.JTextField as_unitType;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JLabel display;
    public static javax.swing.JComboBox<String> eng_sn;
    public static javax.swing.JLabel gensetBtn;
    public static javax.swing.JLabel id;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel supplierTxt;
    // End of variables declaration//GEN-END:variables
}
