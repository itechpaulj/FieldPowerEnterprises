/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class InsertSupplier extends javax.swing.JFrame {

    String date1,brand1,phasing1,kva1,price1,model1,fuel_tank1,body_type1,engines_sn1,alter_sn1,alters1_sn,engine1;
    String quantity1,type1,des1,id1,names1;
    public InsertSupplier() {
        initComponents();
    }

    public InsertSupplier(String date, String brand, String phasing, String kva, String price, String model, String fuel_tank, String body_type, String engines_sn,String engine_sn,String alters_sn, String alter_sn) {
      date1 = date ;
      brand1 = brand;
      phasing1 = phasing;
      kva1 = kva;
      price1 = price;
      model1 = model;
      fuel_tank1 = fuel_tank;
      body_type1 = body_type;
      engine1 = engine_sn;
      engines_sn1 = engines_sn;
      alters1_sn = alters_sn;
      alter_sn1 = alter_sn;
      
      
      initComponents();
     
        
    }

    public InsertSupplier(String date, String names, String des, String brand, String type, String price, String quantity, String ids) {
        id1 = ids;
        date1 = date ;
        names1 = names;
        brand1 = brand;
        des1 = des;
        price1 = price;
        quantity1 = quantity;
        type1 = type;
        initComponents(); 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CUSTOMER_MENU = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        sup_name = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        id_customer = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sup_address = new javax.swing.JTextField();
        sup_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sup_contact = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dis1 = new javax.swing.JLabel();
        dis2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CUSTOMER_MENU.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        CUSTOMER_MENU.setForeground(new java.awt.Color(255, 255, 255));
        CUSTOMER_MENU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CUSTOMER_MENU.setText("ADD SUPPLIER");
        jPanel1.add(CUSTOMER_MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 11, 365, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 100));

        kGradientPanel5.setkEndColor(new java.awt.Color(153, 204, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(0, 255, 153));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sup_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_name.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 280, 31));

        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id.setText("NONE");
        kGradientPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 280, 30));

        id_customer.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id_customer.setText("ID");
        id_customer.setAlignmentY(1.0F);
        kGradientPanel5.add(id_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 26));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel17.setText("NAME");
        jLabel17.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 26));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("ADDRESS");
        jLabel16.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, 26));

        sup_address.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_address.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 280, 31));

        sup_email.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_email.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 280, 31));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 100, 26));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel18.setText("CONTACT");
        jLabel18.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, 26));

        sup_contact.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_contact.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 280, 31));

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

        kGradientPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 160, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SAVE");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 160, 50));

        dis1.setText("jLabel3");
        kGradientPanel5.add(dis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 40));

        dis2.setText("jLabel3");
        kGradientPanel5.add(dis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 40));

        getContentPane().add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 530, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       String s_name,address,email,contact;
               s_name= sup_name.getText();
               address = sup_address.getText();
               email = sup_email.getText();
               contact = sup_contact.getText();
               String eng_com = engines_sn1+engine1;
               String alt_com = alters1_sn+ alter_sn1;
               
               int d2 = Integer.parseInt(dis2.getText());
               
               if(d2 == 1)
               {
                  if(!Class_Supplier_1.AddSupplier(s_name, address, contact, email) && Class_Stock.AddStock(date1, brand1, phasing1, body_type1, names1, kva1, price1, model1, fuel_tank1, body_type1, engines_sn1, alter_sn1))
                    { JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD"); Class_table ct = new Class_table(); ct.showGenset(); } 
               }
               else if(d2 ==2)
               {
                  if(!Class_Supplier_1.AddSupplier(s_name, address, contact, email) && Class_Filter.AddFilter(date1, names1, des1, brand1, type1, price1, quantity1))
                    { JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD"); Class_table ct = new Class_table(); ct.showGenset(); } 
               
               }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dis1.setText(date1);
    }//GEN-LAST:event_formWindowOpened

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CUSTOMER_MENU;
    private javax.swing.JLabel dis1;
    public static javax.swing.JLabel dis2;
    public static javax.swing.JLabel id;
    public static javax.swing.JLabel id_customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel5;
    public static javax.swing.JTextField sup_address;
    public static javax.swing.JTextField sup_contact;
    public static javax.swing.JTextField sup_email;
    public static javax.swing.JTextField sup_name;
    // End of variables declaration//GEN-END:variables
}
