/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Javinez
 */
public class InsertSupplier extends javax.swing.JFrame {


    public static byte [] person_images1 = null;
    public InsertSupplier() {
        initComponents();
        id_supplier.setVisible(false);
        sup_id.setVisible(false);
    }
    
    public InsertSupplier(byte [] person_images) {
        initComponents();  
        person_images1 = person_images;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel5 = new keeptoo.KGradientPanel();
        sup_name = new javax.swing.JTextField();
        sup_id = new javax.swing.JLabel();
        id_supplier = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sup_address = new javax.swing.JTextField();
        sup_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sup_contact = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        save_supplier = new javax.swing.JPanel();
        Save_Btn = new javax.swing.JLabel();
        AddSup = new javax.swing.JLabel();
        sup_gen_fil = new javax.swing.JLabel();
        supplier_list = new javax.swing.JPanel();
        sup_listed = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel5.setkEndColor(new java.awt.Color(153, 204, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(0, 255, 153));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sup_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_name.setAlignmentY(1.0F);
        sup_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sup_nameKeyReleased(evt);
            }
        });
        kGradientPanel5.add(sup_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 280, 31));

        sup_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sup_id.setText("NONE");
        kGradientPanel5.add(sup_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 280, 30));

        id_supplier.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id_supplier.setText("ID");
        id_supplier.setAlignmentY(1.0F);
        kGradientPanel5.add(id_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 26));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel17.setText("NAME");
        jLabel17.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, 26));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("ADDRESS");
        jLabel16.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 26));

        sup_address.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_address.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 280, 31));

        sup_email.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_email.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 280, 31));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 26));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel18.setText("CONTACT");
        jLabel18.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 100, 26));

        sup_contact.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_contact.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 280, 31));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CANCEL");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 160, 50));

        Save_Btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Save_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Save_Btn.setText("SAVE");
        Save_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_BtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout save_supplierLayout = new javax.swing.GroupLayout(save_supplier);
        save_supplier.setLayout(save_supplierLayout);
        save_supplierLayout.setHorizontalGroup(
            save_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Save_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        save_supplierLayout.setVerticalGroup(
            save_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Save_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel5.add(save_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 160, 50));

        AddSup.setText("1");
        kGradientPanel5.add(AddSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 40));

        sup_gen_fil.setText("1");
        kGradientPanel5.add(sup_gen_fil, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 110, 40));

        sup_listed.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_listed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sup_listed.setText("SUPPLIER LIST");
        sup_listed.setAlignmentY(1.0F);
        sup_listed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_listedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout supplier_listLayout = new javax.swing.GroupLayout(supplier_list);
        supplier_list.setLayout(supplier_listLayout);
        supplier_listLayout.setHorizontalGroup(
            supplier_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(supplier_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sup_listed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );
        supplier_listLayout.setVerticalGroup(
            supplier_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(supplier_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(supplier_listLayout.createSequentialGroup()
                    .addComponent(sup_listed, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        kGradientPanel5.add(supplier_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 280, 30));

        getContentPane().add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 420));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("ADD SUPPLIER");
        display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 11, 450, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Save_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_BtnMouseClicked
              
        // Insert Supplier
        String s_name,address,email,contact,id;
        s_name= sup_name.getText().toUpperCase();
        address = sup_address.getText().toUpperCase();
        email = sup_email.getText().toUpperCase();
        contact = sup_contact.getText().toUpperCase();
        id = sup_id.getText(); // update id in supplier table
        // Insert Supplier

        String comparedTo = AddSup.getText();
        String Banner = display.getText();
        /*  comparedTo variable 
            1 - ADD supplier
            2 - ADD supplier / Genset
            3 - ADD supplier / Filter Parts
            4 - Only add Genset Product but Can't add new Supplier because Exist Supplier (GENSET)
            5 - Only add Genset Product but Can't add new Supplier because Exist Supplier (FILTER/ PART / OTHER)
            6 - Update supplier
        */

        if(comparedTo.equals("1") && Banner.equals("ADD SUPPLIER")){
            // Add supplier
            sup_id.setVisible(false);
            id_supplier.setVisible(false);
            
            if(s_name.equals("") || address.equals("") || email.equals("") || contact.equals("") ){
                JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input!","",JOptionPane.ERROR_MESSAGE);
            }
            else if(!Class_Supplier.ExistSupplier(s_name)){
                JOptionPane.showMessageDialog(null, "Already Exist Supplier!\nPlease Select Supplier List!","",JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(!Class_Supplier.AddSupplier(s_name, address, contact, email)){
                    Class_table ct = new Class_table();
                    ct.Supplier();
                JOptionPane.showMessageDialog(null, "ADD supplier","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else if(comparedTo.equals("2") && Banner.equals("ADD SUPPLIER")){
                // ADD supplier and ADD genset
                /*
                basically if global varible result Java null error because already get the value
                */
            // insert genset
            String date1 = Insert_Genset.as_date.getText().toUpperCase(); 
            String brand1 = Insert_Genset.as_brand.getText().toUpperCase(); 
            String phasing1 = Insert_Genset.as_phasing.getText().toUpperCase(); 
            String unit_type1 = Insert_Genset.as_unitType.getText().toUpperCase(); 
            String dimen1 = Insert_Genset.as_dimension.getText().toUpperCase();
            String kva1 = Insert_Genset.as_kva.getText().toUpperCase();
            String price1 = Insert_Genset.as_price.getText().toUpperCase(); 
            String model1 = Insert_Genset.as_model.getText().toUpperCase(); 
            String a = Insert_Genset.eng_sn.getSelectedItem().toString(); 
            String b = Insert_Genset.alt_sn.getSelectedItem().toString(); 
            String engines_sn1 = Insert_Genset.as_engine_sn.getText().toUpperCase() +" "+ a; 
            String alters1_sn = Insert_Genset.as_alternator_sn.getText().toUpperCase() +" " + b;
            String id1 = Insert_Genset.as_id.getText().toUpperCase();
            // insert genset
            
            String imgValidate = Insert_Genset.as_pic.getText();

            if(date1.equals("") || brand1.equals("") || phasing1.equals("") || unit_type1.equals("") || dimen1.equals("") || kva1.equals("") || price1.equals("") || model1.equals("") || a.equals("SELECT") || b.equals("SELECT") || engines_sn1.equals("") || alters1_sn.equals("")  ){
                JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input! (GENSET)","",JOptionPane.ERROR_MESSAGE);
            }
            else if(imgValidate.equals(null) || imgValidate.equals("2x2")){
            JOptionPane.showMessageDialog(null, "Empty Image!","",JOptionPane.ERROR_MESSAGE);
            }
            else if(s_name.equals("") || address.equals("") || email.equals("") || contact.equals("") ){
                JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input! (SUPPLIER)","",JOptionPane.ERROR_MESSAGE);
            }
            else if(!Class_Supplier.ExistSupplier(s_name)){
                JOptionPane.showMessageDialog(null, "Already Exist Supplier!\nPlease Select Supplier List!","",JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(!Class_Supplier.AddSupplier(s_name, address, contact, email) && !Class_Stock.AddStock(date1, brand1, phasing1, unit_type1, dimen1, kva1, price1, model1, engines_sn1, alters1_sn, person_images1, s_name))
               {
                   Class_table ct = new Class_table();
                   ct.Show_Stock_Genset_Table();
                   ct.Supplier();
                   JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
               }                
            }

        }
        else if(comparedTo.equals("3") && Banner.equals("ADD SUPPLIER")){
            //JOptionPane.showMessageDialog(null, "ADD SUPPLIER / FILTER AND PARTS","",JOptionPane.INFORMATION_MESSAGE);
            String date2 = Insert_Filter.af_date.getText().toUpperCase();
            String brand2 = Insert_Filter.af_brand.getText().toUpperCase();
            String name2 = Insert_Filter.af_name.getText().toUpperCase();
            String des2 = Insert_Filter.af_des.getText().toUpperCase();
            String quantity2 = Insert_Filter.af_quantity.getText().toUpperCase();
            String price2 = Insert_Filter.af_price.getText().toUpperCase();
            String types2 = Insert_Filter.types.getSelectedItem().toString();
            
            String imgValidate = Insert_Filter.af_pic.getText();
            if(date2.equals("")|| brand2.equals("") || name2.equals("") || des2.equals("") || quantity2.equals("") || price2.equals("") || types2.equals("SELECT") ){
             JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input!(FILTER / PART / OTHER)","",JOptionPane.ERROR_MESSAGE);   
            }
            else if(s_name.equals("") || address.equals("") || email.equals("") || contact.equals("") ){
                JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input! (SUPPLIER)","",JOptionPane.ERROR_MESSAGE);
            }
            else if(imgValidate.equals(null) || imgValidate.equals("2x2")){
            JOptionPane.showMessageDialog(null, "Empty Image!","",JOptionPane.ERROR_MESSAGE);
            }
            else if(!Class_Supplier.ExistSupplier(s_name)){
                JOptionPane.showMessageDialog(null, "Already Exist Supplier!\nPlease Select Supplier List!","",JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(!Class_Supplier.AddSupplier(s_name, address, contact, email) && !Class_Filter.AddFilter(date2, name2, des2, brand2, types2, price2, quantity2, Insert_Filter.person_imageFilter,s_name)){
                    Class_table ct = new Class_table();
                    ct.Show_Stock_Filter_Table();
                    JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            
            
        }
        else if(comparedTo.equals("4") && Banner.equals("EXIST SUPPLIER")){
            // exist supplier but can add only genset
            // this genset exist supplier
                /*
                basically if global varible result Java null error because already get the value
                */
            // insert genset


            String date2 = Insert_Genset.as_date.getText().toUpperCase(); 
            String brand2 = Insert_Genset.as_brand.getText().toUpperCase(); 
            String phasing2 = Insert_Genset.as_phasing.getText().toUpperCase(); 
            String unit_type2 = Insert_Genset.as_unitType.getText().toUpperCase(); 
            String dimen2 = Insert_Genset.as_dimension.getText().toUpperCase();
            String kva2 = Insert_Genset.as_kva.getText().toUpperCase();
            String price2 = Insert_Genset.as_price.getText().toUpperCase(); 
            String model2 = Insert_Genset.as_model.getText().toUpperCase(); 
            String a = Insert_Genset.eng_sn.getSelectedItem().toString(); 
            String b = Insert_Genset.alt_sn.getSelectedItem().toString(); 
            String engines_sn2 = Insert_Genset.as_engine_sn.getText().toUpperCase() +" "+ a; 
            String alters2_sn = Insert_Genset.as_alternator_sn.getText().toUpperCase() +" " + b;
            String id1 = Insert_Genset.as_id.getText().toUpperCase();
            // insert genset
            String imgValidate = Insert_Genset.as_pic.getText();
            //JOptionPane.showMessageDialog(null, "Only new insert genset but supplier is Exist1","",JOptionPane.INFORMATION_MESSAGE);
            if(date2.equals("") || brand2.equals("") || phasing2.equals("") || unit_type2.equals("") || dimen2.equals("") || kva2.equals("") || price2.equals("") || model2.equals("") || a.equals("SELECT") || b.equals("SELECT") || engines_sn2.equals("") || alters2_sn.equals("")  ){
                JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input! (GENSET)","",JOptionPane.ERROR_MESSAGE);
            }            
            else if(imgValidate.equals(null) || imgValidate.equals("2x2")){
            JOptionPane.showMessageDialog(null, "Empty Image!","",JOptionPane.ERROR_MESSAGE);
            }else{
                    if(!Class_Stock.AddStock(date2, brand2, phasing2, unit_type2, dimen2, kva2, price2, model2, engines_sn2, alters2_sn, Insert_Genset.person_image, s_name))
                   {
                       JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
                   }   
            }
        }
        else if(comparedTo.equals("5") && Banner.equals("EXIST SUPPLIER")){
            // exist supplier but can add only genset
            // this filter part exist supplier
                /*
                basically if global varible result Java null error because already get the value
                */
            // insert filter
            String date2 = Insert_Filter.af_date.getText().toUpperCase();
            String brand2 = Insert_Filter.af_brand.getText().toUpperCase();
            String name2 = Insert_Filter.af_name.getText().toUpperCase();
            String des2 = Insert_Filter.af_des.getText().toUpperCase();
            String quantity2 = Insert_Filter.af_quantity.getText().toUpperCase();
            String price2 = Insert_Filter.af_price.getText().toUpperCase();
            String types2 = Insert_Filter.types.getSelectedItem().toString();

            String imgValidate = Insert_Filter.af_pic.getText();
            if(date2.equals("")|| brand2.equals("") || name2.equals("") || des2.equals("") || quantity2.equals("") || price2.equals("") || types2.equals("SELECT") ){
             JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input!(FILTER / PART / OTHER)","",JOptionPane.ERROR_MESSAGE);   
            }
            else if(s_name.equals("") || address.equals("") || email.equals("") || contact.equals("") ){
                JOptionPane.showMessageDialog(null, "Fill Blanks!\nPlease Check your input! (SUPPLIER)","",JOptionPane.ERROR_MESSAGE);
            }
            else if(imgValidate.equals(null) || imgValidate.equals("2x2")){
            JOptionPane.showMessageDialog(null, "Empty Image!","",JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(!Class_Filter.AddFilter(date2, name2, des2, brand2, types2, price2, quantity2, Insert_Filter.person_imageFilter,s_name)){
                    Class_table ct = new Class_table();
                    ct.Show_Stock_Filter_Table();
                    JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
                }
            }            
 
        }
        else {
            //UPDATE supplier
            if(comparedTo.equals("6") && Banner.equals("UPDATE SUPPLIER")){
                //
                if(!Class_Supplier.UpdateSupplier(s_name, address, contact, email, id)){
                    Class_table ct = new Class_table();
                    ct.Supplier();
                    JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULLY!","",JOptionPane.INFORMATION_MESSAGE);
                }
                    
             }
        }            
 
           

        


    }//GEN-LAST:event_Save_BtnMouseClicked

    private void sup_listedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_listedMouseClicked
        Table_Supplier tbs = new Table_Supplier();
        
        String comparedTo = AddSup.getText();
        if(comparedTo.equals("2")){
        Table_Supplier.sup_list.setText("2"); // exist supplier in genset
        tbs.add_panel_supplier.setVisible(false);
        tbs.update_panel_supplier.setVisible(false);
        tbs.delete_panel_supplier.setVisible(false);
        tbs.displays.setText("EXIST SUPPLIER LIST");
        tbs.setVisible(true);
        dispose();
        
        }
        
        else if(comparedTo.equals("3")){
        Table_Supplier.sup_list.setText("3"); // exist supplier in filter
        tbs.add_panel_supplier.setVisible(false);
        tbs.update_panel_supplier.setVisible(false);
        tbs.delete_panel_supplier.setVisible(false);
        tbs.displays.setText("EXIST SUPPLIER LIST");
        tbs.setVisible(true);
        dispose();
        
        }
        
        
    }//GEN-LAST:event_sup_listedMouseClicked

    private void displayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displayAncestorAdded
        String Banner = display.getText();

        if(Banner.equals("EXIST SUPPLIER"))
        {
            String supplier_id = Table_Supplier.supplier_id.getText();
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = "+supplier_id+"");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    sup_id.setText(supplier_id);
                    sup_name.setText(rs.getString("NAME"));
                    sup_address.setText(rs.getString("ADDRESS"));
                    sup_email.setText(rs.getString("EMAIL"));
                    sup_contact.setText(rs.getString("CONTACT"));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            sup_id.setEnabled(false);
            sup_name.setEnabled(false);
            sup_address.setEnabled(false);
            sup_email.setEnabled(false);
            sup_contact.setEnabled(false);
        }
        
        if(Banner.equals("UPDATE SUPPLIER"))
        {
            String supplier_id = Table_Supplier.supplier_id.getText();
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = "+supplier_id+"");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    sup_id.setText(supplier_id);
                    sup_name.setText(rs.getString("NAME"));
                    sup_address.setText(rs.getString("ADDRESS"));
                    sup_email.setText(rs.getString("EMAIL"));
                    sup_contact.setText(rs.getString("CONTACT"));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_displayAncestorAdded

    private void sup_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sup_nameKeyReleased

    }//GEN-LAST:event_sup_nameKeyReleased

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
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InsertSupplier().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel AddSup;
    public static javax.swing.JLabel Save_Btn;
    public static javax.swing.JLabel display;
    public static javax.swing.JLabel id_supplier;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel5;
    public static javax.swing.JPanel save_supplier;
    public static javax.swing.JTextField sup_address;
    public static javax.swing.JTextField sup_contact;
    public static javax.swing.JTextField sup_email;
    public static javax.swing.JLabel sup_gen_fil;
    public static javax.swing.JLabel sup_id;
    private javax.swing.JLabel sup_listed;
    public static javax.swing.JTextField sup_name;
    public static javax.swing.JPanel supplier_list;
    // End of variables declaration//GEN-END:variables
}
