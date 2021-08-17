/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Robles
 */
public class Setting extends javax.swing.JFrame {

    public static String id = ""; 
    public Setting() {
        initComponents();
        Webpage.ct.Admin();
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
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admin_table = new javax.swing.JTable();
        backs = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        adds = new javax.swing.JPanel();
        add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 51, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        jLabel5.setText(" Management");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 440, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 120));

        jPanel4.setBackground(new java.awt.Color(42, 142, 142));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setToolTipText("");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 43, -1, -1));

        admin_table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        admin_table.setForeground(new java.awt.Color(51, 51, 51));
        admin_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        admin_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admin_table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 620, 320));

        backs.setBackground(new java.awt.Color(185, 144, 149));

        back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/left_35px.png"))); // NOI18N
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backsLayout = new javax.swing.GroupLayout(backs);
        backs.setLayout(backsLayout);
        backsLayout.setHorizontalGroup(
            backsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        backsLayout.setVerticalGroup(
            backsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel4.add(backs, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 180, 45));

        adds.setBackground(new java.awt.Color(24, 165, 88));

        add.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/plus_math_35px.png"))); // NOI18N
        add.setText(" ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });

        javax.swing.GroupLayout addsLayout = new javax.swing.GroupLayout(adds);
        adds.setLayout(addsLayout);
        addsLayout.setHorizontalGroup(
            addsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        addsLayout.setVerticalGroup(
            addsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel4.add(adds, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 180, 45));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 680, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorAdded

    }//GEN-LAST:event_jLabel5AncestorAdded

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
    Add_Admin aa = new Add_Admin();
    aa.setVisible(true);
        

    }//GEN-LAST:event_addMouseClicked

    private void admin_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_tableMouseClicked
       int i=admin_table.getSelectedRow();
        TableModel model = admin_table.getModel();
        id = model.getValueAt(i,0).toString();
         String[] options = new String[2];
        
        options[0] = (" UPDATE  ");
        options[1] = (" DELETE  ");
        
        int opt = JOptionPane.showOptionDialog(null," DO YOU WANT TO ", null,0,JOptionPane.UNDEFINED_CONDITION,null,options,null);
        
        if(opt == 0)
        {
            Add_Admin ic = new Add_Admin();
            ic.setVisible(true);
            Add_Admin.add_admin.setText(" UPDATE MEMBER ");  
            
        }
        else if(opt == 1)
        {
           if(id.equals(""))
           {
               JOptionPane.showMessageDialog(null, "PLEASE SELECT !",null,JOptionPane.UNDEFINED_CONDITION);
           }
           else
           {
               String[] deleteoptions = new String[2];
               deleteoptions[0] = (" YES ");
               deleteoptions[1] = (" NO  ");

               int opts = JOptionPane.showOptionDialog(null," DO YOU WANT TO DELETE ?",null, 0,JOptionPane.UNDEFINED_CONDITION,null,deleteoptions,null);

               if(opts == 0)
               {
                    if(!Class_Login.Delete(id))
                    {
                        JOptionPane.showMessageDialog(null, " SUCCESSFULY DELETED  !",null,JOptionPane.UNDEFINED_CONDITION); Webpage.ct.Admin();
                         id=""; 
                    }
               }

            }
           }
    }//GEN-LAST:event_admin_tableMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        adds.setBackground(new Color(163, 235, 177));
        add.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_addMouseEntered

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       backs.setBackground(new Color(163, 235,177));
        back.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_backMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
       adds.setBackground(new Color(24,165,88));
        add.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_addMouseExited

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       backs.setBackground(new Color(185,144,149));
        back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_backMouseExited

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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    public static javax.swing.JPanel adds;
    public static javax.swing.JTable admin_table;
    private javax.swing.JLabel back;
    public static javax.swing.JPanel backs;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
