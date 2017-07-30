package usermaintenance;

import javax.swing.JOptionPane;
import usermaintenance.beans.UserBean;
import usermaintenance.services.ManageProfileServices;
import usermaintenance.services.UserMaintenanceServices;

public class ManageProfile extends javax.swing.JPanel {

    UserBean objbean = new UserBean();
    ManageProfileServices objmf = new ManageProfileServices();

    public ManageProfile() {
        initComponents();
        objbean = objmf.getByUserid(MainFrame.userid);
        showRecord();
    }

    private void showRecord() {
        objbean = objmf.getByUserid(MainFrame.userid);
        lblUserid.setText(String.valueOf(objbean.getUserid()));
        lblUsername.setText(objbean.getUsername());
        txtPassword.setText(objbean.getPassword());
        txtName.setText(objbean.getName());
        txtContact.setText(objbean.getContact());
        txtDob.setText(objbean.getDob());
        txtEmail.setText(objbean.getEmail());
        taAddress.setText(objbean.getAddress());
        if (objbean.isGender()) {
            rbMale.setSelected(true);
        } else {
            rbFemale.setSelected(true);
        }
        btnSave.setEnabled(false);
        enableAll(false);
    }

    public void enableAll(boolean flag) {

        txtPassword.setEditable(flag);
        txtName.setEditable(flag);
        txtContact.setEditable(flag);
        txtDob.setEditable(flag);
        txtEmail.setEditable(flag);
        taAddress.setEditable(flag);
        rbMale.setEnabled(flag);
        rbFemale.setEnabled(flag);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblUserid = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("USERID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("NAME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CONTACT");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("EMAIL ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ADDRESS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("GENDER");

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane1.setViewportView(taAddress);

        buttonGroup1.add(rbMale);
        rbMale.setText("MALE");

        buttonGroup1.add(rbFemale);
        rbFemale.setText("FEMALE");

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFemale))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPassword)
                                .addComponent(txtName)
                                .addComponent(txtDob)
                                .addComponent(txtContact)
                                .addComponent(txtEmail)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnCancel)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        MainFrame.c.removeAll();
        MainFrame.c.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        enableAll(true);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        UserBean objbean = new UserBean();

        if (txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plz enter Password", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            txtPassword.requestFocus();
        } else if (txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plz enter name", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            txtName.requestFocus();
        } else if (txtContact.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plz enter Conatct", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            txtContact.requestFocus();
        } else if (txtDob.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plz ente Dob", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            txtDob.requestFocus();
        } else if (txtEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plz enter Email", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            txtEmail.requestFocus();
        } else if (taAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plz enter Address", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            taAddress.requestFocus();
        } else if (txtEmail.getText().trim() != "") {
            boolean b = ManageProfileServices.checkEmail(txtEmail.getText());
            if (b == false) {
                JOptionPane.showMessageDialog(this, "Plz enter valid Email", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                txtEmail.requestFocus();
            } else {

                objbean.setUserid(Integer.parseInt(lblUserid.getText()));
                objbean.setUsername(lblUsername.getText());
                objbean.setPassword(txtPassword.getText());
                objbean.setName(txtName.getText());
                objbean.setContact(txtContact.getText());
                objbean.setDob(txtDob.getText());
                objbean.setEmail(txtEmail.getText());
                objbean.setAddress(taAddress.getText());
                if (rbMale.isSelected()) {
                    objbean.setGender(true);
                } else {
                    objbean.setGender(false);
                }
                boolean check = false;
                check = ManageProfileServices.updateUser(objbean);
                if (check) {
                    JOptionPane.showMessageDialog(this, "record updated", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                     showRecord();
                } else {
                    JOptionPane.showMessageDialog(this, "record not updated", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                }
               
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserid;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
