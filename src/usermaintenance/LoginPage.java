
package usermaintenance;

import email.SendMail;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import sun.security.util.Password;
import usermaintenance.beans.UserBean;
import usermaintenance.services.LoginServices;
import usermaintenance.services.UserActivityServices;

public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnForgotPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PASSWORD");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnForgotPassword.setText("FORGOT PASSWORD");
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnForgotPassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnReset)
                    .addComponent(btnForgotPassword))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String un = txtUsername.getText().trim();
        String pwd = String.valueOf(txtPassword.getPassword());
        if (un.equals("")) {
            JOptionPane.showMessageDialog(this, "PLZ ENTER USERNAME", "EMPTY FIELD", JOptionPane.WARNING_MESSAGE);
        } else if (pwd.equals("")) {
            JOptionPane.showMessageDialog(this, "PLZ ENTER PASSWORD", "EMPTY FIELD", JOptionPane.WARNING_MESSAGE);
        } else {
            UserBean objbean = new LoginServices().authenticateUser(un, pwd);
            if (objbean != null) {
                if (objbean.isUserstatus()) {
                    //next page
                    System.out.println("aaaaa");
                    int activityid=UserActivityServices.addLoginTime(objbean.getUserid());
                    System.out.println("1234"+activityid);
                    MainFrame objMF = new MainFrame(activityid,objbean);
                    objMF.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "USER BLOCK BY ADMIN", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "INVALID USERNAME OR PASSWORD", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                txtPassword.setText("");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
        String un = txtUsername.getText().trim();
        String pwd = String.valueOf(txtPassword.getPassword());
        if (un.equals("")) {
            JOptionPane.showMessageDialog(this, "PLZ ENTER USERNAME", "EMPTY FIELD", JOptionPane.WARNING_MESSAGE);
        } else if (pwd.equals("")) {
            JOptionPane.showMessageDialog(this, "PLZ ENTER PASSWORD", "EMPTY FIELD", JOptionPane.WARNING_MESSAGE);
        } else {
            UserBean objbean = new LoginServices().authenticateUser(un, pwd);
            if (objbean != null) {
                if (objbean.isUserstatus()) {
                    int activityid=UserActivityServices.addLoginTime(objbean.getUserid());
                    System.out.println("1234"+activityid);
                    MainFrame objMF = new MainFrame(activityid,objbean);
                    objMF.setVisible(true);
                    this.dispose();
                } else {
                    //account block by admin
                    JOptionPane.showMessageDialog(this, "USER BLOCK BY ADMIN", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "INVALID USERNAME OR PASSWORD", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                txtPassword.setText("");
            }
        }
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        String un = txtUsername.getText().trim();
        String pwd = String.valueOf(txtPassword.getPassword());
        if (un.equals("")) {
            JOptionPane.showMessageDialog(this, "PLZ ENTER USERNAME", "EMPTY FIELD", JOptionPane.WARNING_MESSAGE);
        } else if (pwd.equals("")) {
            JOptionPane.showMessageDialog(this, "PLZ ENTER PASSWORD", "EMPTY FIELD", JOptionPane.WARNING_MESSAGE);
        } else {
            UserBean objbean = new LoginServices().authenticateUser(un, pwd);
            if (objbean != null) {
                if (objbean.isUserstatus()) {
                    int activityid=UserActivityServices.addLoginTime(objbean.getUserid());
                    MainFrame objMF = new MainFrame(activityid,objbean);
                    objMF.setVisible(true);
                    this.dispose();
                } else {
                    //account block by admin
                    JOptionPane.showMessageDialog(this, "USER BLOCK BY ADMIN", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "INVALID USERNAME OR PASSWORD", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                txtPassword.setText("");
            }
        }
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
        // TODO add your handling code here:
        if(txtUsername.getText().trim().isEmpty())
        {
              JOptionPane.showMessageDialog(this, "Enter Username", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            String s=txtUsername.getText().trim();
            System.out.println(s);
            String a[]=LoginServices.forgotPassword(s);
            //txtPassword.setText(objbean.getPassword());
            String result=SendMail.sendMail(a[0], "Your Password is"+a[1],"Password recovery");
            if(result.equalsIgnoreCase("sent"))
            {
                JOptionPane.showMessageDialog(this, "pass send", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "not sent", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnForgotPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
