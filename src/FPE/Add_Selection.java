/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;

/**
 *
 * @author Robles
 */
public class Add_Selection extends javax.swing.JFrame {

    
    public Add_Selection() {
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

        Panel_Gen = new javax.swing.JPanel();
        Gen = new javax.swing.JLabel();
        Panel_Parts = new javax.swing.JPanel();
        Parts = new javax.swing.JLabel();
        Panel_Office = new javax.swing.JPanel();
        Office = new javax.swing.JLabel();
        Panel_WH = new javax.swing.JPanel();
        WH = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Gen.setBackground(new java.awt.Color(24, 165, 88));
        Panel_Gen.setForeground(new java.awt.Color(204, 204, 204));
        Panel_Gen.setPreferredSize(new java.awt.Dimension(190, 59));
        Panel_Gen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Gen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Gen.setForeground(new java.awt.Color(255, 255, 255));
        Gen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/Generator.png"))); // NOI18N
        Gen.setText(" GENERATOR");
        Gen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GenMouseExited(evt);
            }
        });
        Panel_Gen.add(Gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 45));

        getContentPane().add(Panel_Gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 45));

        Panel_Parts.setBackground(new java.awt.Color(24, 165, 88));
        Panel_Parts.setForeground(new java.awt.Color(204, 204, 204));
        Panel_Parts.setPreferredSize(new java.awt.Dimension(190, 59));
        Panel_Parts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Parts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Parts.setForeground(new java.awt.Color(255, 255, 255));
        Parts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/warehouse.png"))); // NOI18N
        Parts.setText(" PARTS        ");
        Parts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PartsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PartsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PartsMouseExited(evt);
            }
        });
        Panel_Parts.add(Parts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 45));

        getContentPane().add(Panel_Parts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 180, 45));

        Panel_Office.setBackground(new java.awt.Color(24, 165, 88));
        Panel_Office.setForeground(new java.awt.Color(204, 204, 204));
        Panel_Office.setPreferredSize(new java.awt.Dimension(190, 59));
        Panel_Office.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Office.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Office.setForeground(new java.awt.Color(255, 255, 255));
        Office.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Office.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/department.png"))); // NOI18N
        Office.setText(" OFFICE       ");
        Office.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OfficeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OfficeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OfficeMouseExited(evt);
            }
        });
        Panel_Office.add(Office, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 45));

        getContentPane().add(Panel_Office, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 45));

        Panel_WH.setBackground(new java.awt.Color(24, 165, 88));
        Panel_WH.setForeground(new java.awt.Color(204, 204, 204));
        Panel_WH.setPreferredSize(new java.awt.Dimension(190, 59));
        Panel_WH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WH.setForeground(new java.awt.Color(255, 255, 255));
        WH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WH.setText("  WAREHOUSE");
        WH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WHMouseExited(evt);
            }
        });
        Panel_WH.add(WH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 45));

        getContentPane().add(Panel_WH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 180, 45));

        setBounds(17, 468, 180, 180);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
     
    
    }//GEN-LAST:event_formMouseExited

    private void GenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenMouseEntered
        Panel_Gen.setBackground(new Color(163, 235, 177));
        Gen.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_GenMouseEntered

    private void PartsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PartsMouseEntered
        Panel_Parts.setBackground(new Color(163, 235, 177));
        Parts.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_PartsMouseEntered

    private void OfficeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficeMouseEntered
        Panel_Office.setBackground(new Color(163, 235, 177));
        Office.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_OfficeMouseEntered

    private void WHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHMouseEntered
        Panel_WH.setBackground(new Color(163, 235, 177));
        WH.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_WHMouseEntered

    private void GenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenMouseExited
        Panel_Gen.setBackground(new Color(24,165,88));
        Gen.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_GenMouseExited

    private void PartsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PartsMouseExited
        Panel_Parts.setBackground(new Color(24,165,88));
        Parts.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_PartsMouseExited

    private void OfficeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficeMouseExited
       Panel_Office.setBackground(new Color(24,165,88));
       Office.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_OfficeMouseExited

    private void WHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHMouseExited
        Panel_WH.setBackground(new Color(24,165,88));
        WH.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_WHMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void GenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenMouseClicked
        Insert_Generator ig = new Insert_Generator();
        ig.setVisible(true);
        Panel_Gen.setBackground(new Color(24,165,88));
        Gen.setForeground(new Color(255,255,255));
        dispose();
    }//GEN-LAST:event_GenMouseClicked

    private void PartsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PartsMouseClicked
        Insert_Parts ig = new Insert_Parts();
        ig.setVisible(true);
        Panel_Parts.setBackground(new Color(24,165,88));
        Parts.setForeground(new Color(255,255,255));
        dispose();
    }//GEN-LAST:event_PartsMouseClicked

    private void OfficeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficeMouseClicked
        Insert_Office ig = new Insert_Office();
        ig.setVisible(true);
        Panel_Office.setBackground(new Color(24,165,88));
        Office.setForeground(new Color(255,255,255));
        dispose();
    }//GEN-LAST:event_OfficeMouseClicked

    private void WHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHMouseClicked
        Insert_Warehouse ig = new Insert_Warehouse();
        ig.setVisible(true);
        Panel_WH.setBackground(new Color(24,165,88));
        WH.setForeground(new Color(255,255,255));
        dispose();
    }//GEN-LAST:event_WHMouseClicked

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
            java.util.logging.Logger.getLogger(Add_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Selection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gen;
    private javax.swing.JLabel Office;
    private javax.swing.JPanel Panel_Gen;
    private javax.swing.JPanel Panel_Office;
    private javax.swing.JPanel Panel_Parts;
    private javax.swing.JPanel Panel_WH;
    private javax.swing.JLabel Parts;
    private javax.swing.JLabel WH;
    // End of variables declaration//GEN-END:variables
}
