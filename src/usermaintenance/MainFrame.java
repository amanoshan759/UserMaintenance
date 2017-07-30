package usermaintenance;

import java.awt.Container;
import java.awt.Toolkit;
import usermaintenance.beans.UserBean;
import usermaintenance.reports.ReportFrame;
import usermaintenance.reports.UserActivityReport;
import usermaintenance.services.UserActivityServices;

public class MainFrame extends javax.swing.JFrame {

    public static Container c;
    private int activityid;
    //private UserBean objbean;
    public static int userid;
    public MainFrame(int activityid,UserBean objbean) {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(false);
        c = getContentPane();//reference to frame
        this.activityid=activityid;
        this.userid=objbean.getUserid();
        if(objbean.getUsertype().equalsIgnoreCase("User"))
        {
            mbMainFrame.remove(mnuReport);
            mnuManage.remove(miManagerUser);
            mbMainFrame.remove(miActivityReport);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbMainFrame = new javax.swing.JMenuBar();
        mnuLogout = new javax.swing.JMenu();
        mnuManage = new javax.swing.JMenu();
        miManagerUser = new javax.swing.JMenuItem();
        miManageProfile = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenu();
        miUserReport = new javax.swing.JMenuItem();
        miActivityReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        mbMainFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));

        mnuLogout.setText("LOGOUT");
        mnuLogout.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuLogoutItemStateChanged(evt);
            }
        });
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        mbMainFrame.add(mnuLogout);

        mnuManage.setText("MANAGE");

        miManagerUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, java.awt.event.InputEvent.CTRL_MASK));
        miManagerUser.setText("ManageUser");
        miManagerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miManagerUserActionPerformed(evt);
            }
        });
        mnuManage.add(miManagerUser);

        miManageProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        miManageProfile.setText("ManageProfile");
        miManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miManageProfileActionPerformed(evt);
            }
        });
        mnuManage.add(miManageProfile);

        mbMainFrame.add(mnuManage);

        mnuReport.setText("REPORT");

        miUserReport.setText("UserReport");
        miUserReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUserReportActionPerformed(evt);
            }
        });
        mnuReport.add(miUserReport);

        miActivityReport.setText("ActivityReport");
        miActivityReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActivityReportActionPerformed(evt);
            }
        });
        mnuReport.add(miActivityReport);

        mbMainFrame.add(mnuReport);

        setJMenuBar(mbMainFrame);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuLogoutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuLogoutItemStateChanged
        // TODO add your handling code here:
        boolean a=UserActivityServices.updategetTime(activityid);
        System.out.println(activityid+"kjhg");
        System.out.println(a);
        if(a)
        {
            this.dispose();
            LoginPage obj = new LoginPage();
            obj.setVisible(true);
        }
    }//GEN-LAST:event_mnuLogoutItemStateChanged

    private void miManagerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miManagerUserActionPerformed
        // TODO add your handling code here:

        c.removeAll();//when multiple panel are there then it is neccesary
        c.setVisible(false);
        ManageUser objMu = new ManageUser();
        objMu.setBounds(10, 10, 500, 700);
        c.add(objMu);
        c.setVisible(true);
    }//GEN-LAST:event_miManagerUserActionPerformed

    private void miUserReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUserReportActionPerformed
        // TODO add your handling code here:
        ReportFrame obj=new ReportFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_miUserReportActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void miManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miManageProfileActionPerformed
        // TODO add your handling code here:
        c.removeAll();//when multiple panel are there then it is neccesary
        c.setVisible(false);
        ManageProfile objMu = new ManageProfile();
        objMu.setBounds(10, 10, 500, 700);
        c.add(objMu);
        c.setVisible(true);
    }//GEN-LAST:event_miManageProfileActionPerformed

    private void miActivityReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActivityReportActionPerformed
        // TODO add your handling code here:
        UserActivityReport obj=new UserActivityReport();
        obj.setVisible(true);
    }//GEN-LAST:event_miActivityReportActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mbMainFrame;
    private javax.swing.JMenuItem miActivityReport;
    private javax.swing.JMenuItem miManageProfile;
    private javax.swing.JMenuItem miManagerUser;
    private javax.swing.JMenuItem miUserReport;
    private javax.swing.JMenu mnuLogout;
    private javax.swing.JMenu mnuManage;
    private javax.swing.JMenu mnuReport;
    // End of variables declaration//GEN-END:variables
}
