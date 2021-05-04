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


public class Insert_Filter extends javax.swing.JFrame {
    String filename = null;
    public static byte[] person_imageFilter = null;    
    String choose;

    Class_table ct  = new Class_table();
    public Insert_Filter() {
        initComponents();
        supTxt.setVisible(false);
        supplier.setVisible(false);
        
    }
    public Insert_Filter(byte[] image) {
        initComponents();
        person_imageFilter = image;
        supTxt.setVisible(false);
        supplier.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        af_brand = new javax.swing.JTextField();
        af_name = new javax.swing.JTextField();
        af_des = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        af_quantity = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        af_pic = new javax.swing.JLabel();
        af_date = new datechooser.beans.DateChooserCombo();
        jLabel10 = new javax.swing.JLabel();
        af_price = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        filterBtn = new javax.swing.JLabel();
        types = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        supTxt = new javax.swing.JLabel();
        supplier = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        displays = new javax.swing.JLabel();

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

        af_brand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        af_brand.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(af_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 210, 31));

        af_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        af_name.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(af_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 210, 31));

        af_des.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        af_des.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(af_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 210, 31));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel20.setText("QUANTITY");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 26));

        af_quantity.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        af_quantity.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(af_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, 31));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel22.setText("TYPE");
        jLabel22.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 26));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("BRAND");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 26));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("NAME");
        jLabel3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 26));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("DESCRIPTION");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, 26));

        id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id.setText("NONE");
        id.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 26));

        af_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        af_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        af_pic.setText("2x2");
        af_pic.setAlignmentY(1.0F);
        af_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        af_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                af_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(af_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 220, 200));

        af_date.setCalendarPreferredSize(new java.awt.Dimension(400, 200));
        KG2_ADD_STOCK_GENSET.add(af_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 210, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setText("PRICE");
        jLabel10.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 26));

        af_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        af_price.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(af_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 210, 31));

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

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 210, 50));

        filterBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        filterBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterBtn.setText("NEXT");
        filterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 210, 50));

        types.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        types.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "FILTER", "PARTS", "OTHER" }));
        KG2_ADD_STOCK_GENSET.add(types, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 210, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setText("DATE");
        jLabel13.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 110, 26));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setText("ID");
        jLabel14.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 26));

        supTxt.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        supTxt.setText("SUPPLIER");
        supTxt.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(supTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 110, 26));

        supplier.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        supplier.setText("NONE");
        supplier.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, 26));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 720, 570));

        jPanel4.setBackground(new java.awt.Color(3, 33, 73));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displays.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        displays.setForeground(new java.awt.Color(255, 255, 255));
        displays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displays.setText("ADD FILTER/PARTS PRODUCT");
        displays.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displaysAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(displays, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        dispose();
     
    }//GEN-LAST:event_jLabel5MouseClicked

    private void filterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBtnMouseClicked
       String date,names,des,brand,type,price,quantity,ids;
//       
//       String save_add = filterBtn.getText();
       ids = id.getText();
       names = af_name.getText();
       date = af_date.getText();
       brand = af_brand.getText();
       price = af_price.getText();
       type = types.getSelectedItem().toString();
       quantity= af_quantity.getText();
       des = af_des.getText();

        String Banner = displays.getText();
        String filter = filterBtn.getText();
        if(Banner.equals("ADD FILTER/PARTS PRODUCT")){
        InsertSupplier is = new InsertSupplier();
        is.setVisible(true);
        is.AddSup.setText("3"); // add supplier and filter
        }
//        else{
//            if(Banner.equals("UPDATE FILTER / PARTS / OTHER PRODUCT") && filter.equals("UPDATE") ){
//                //JOptionPane.showMessageDialog(null, "UPDATE FILTER","",JOptionPane.INFORMATION_MESSAGE);
//                
//                
//                if(!Class_Filter.UpdateFilter(date, names, des, brand, type, price, quantity, person_imageFilter, ids)){
//                    Class_table ct = new Class_table();
//                    ct.Show_Stock_Filter_Table();
//                            
//                    JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULLY","",JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        }
              
    }//GEN-LAST:event_filterBtnMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // display123.setText(dis1);
    }//GEN-LAST:event_formWindowOpened

    private void displaysAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displaysAncestorAdded
        String Banner = displays.getText();
         
        if(Banner.equals("UPDATE FILTER / PARTS / OTHER PRODUCT")){
            String filter_id = id.getText();
            supTxt.setVisible(true);
            supplier.setVisible(true);
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `filter_table` WHERE `ID`='"+filter_id+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    af_date.setText(rs.getString("DATE"));
                    af_brand.setText(rs.getString("BRAND"));
                    af_name.setText(rs.getString("NAME"));
                    af_des.setText(rs.getString("DESCRIPTION"));
                    af_quantity.setText(rs.getString("QUANTITY"));
                    af_price.setText(rs.getString("PRICE"));
                    
                    String type = rs.getString("TYPE");
                    
                    if(type.equals("FILTER")){
                        types.setSelectedIndex(1);
                    }
                    
                    if(type.equals("PARTS")){
                        types.setSelectedIndex(2);
                    }
                    
                     if(type.equals("OTHER")){
                        types.setSelectedIndex(3);
                    }
                     
                    ImageIcon imageicon = new ImageIcon (new ImageIcon(rs.getBytes("IMAGE")).getImage().getScaledInstance(af_pic.getWidth(), af_pic.getHeight(),Image.SCALE_SMOOTH) );
                    af_pic.setIcon(imageicon);
                    person_imageFilter = rs.getBytes("IMAGE");
                    supplier.setText(rs.getString("SUPPLIER"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_displaysAncestorAdded

    private void af_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_af_picMouseClicked
        //af_pic.setText(null);
        af_pic.setText("");
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        af_pic.setText(filename);
        
        //Image getAbsolutePath = null;
        //ImageIcon icon = new ImageIcon(filename);
        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(af_pic.getWidth(), af_pic.getHeight(),Image.SCALE_SMOOTH) );
        af_pic.setIcon(imageicon);

        try{
            File image = new File(filename);
            FileImageInputStream fis = new FileImageInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for(int readNum;(readNum=fis.read(buf)) !=-1;){
                bos.write(buf,0,readNum);
            }
            person_imageFilter=bos.toByteArray();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_af_picMouseClicked

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
            java.util.logging.Logger.getLogger(Insert_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JTextField af_brand;
    public static datechooser.beans.DateChooserCombo af_date;
    public static javax.swing.JTextField af_des;
    public static javax.swing.JTextField af_name;
    public static javax.swing.JLabel af_pic;
    public static javax.swing.JTextField af_price;
    public static javax.swing.JTextField af_quantity;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JLabel displays;
    public static javax.swing.JLabel filterBtn;
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel supTxt;
    public static javax.swing.JLabel supplier;
    public static javax.swing.JComboBox<String> types;
    // End of variables declaration//GEN-END:variables
}
