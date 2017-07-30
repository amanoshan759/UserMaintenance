package usermaintenance;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import usermaintenance.beans.UserBean;
import usermaintenance.services.ManageProfileServices;
import usermaintenance.services.UserMaintenanceServices;

public class ManageUser extends javax.swing.JPanel {

    private ArrayList<UserBean> al;
    private int count = 0;
    private int addupdateflag = -1;

    public ManageUser() {
        initComponents();
        al = UserMaintenanceServices.getAllUser();
        if (al.size() > 0) {
            showRecord();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        ddlUsertype = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rbActive = new javax.swing.JRadioButton();
        rbInActive = new javax.swing.JRadioButton();
        lblUserid = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContact = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPANY INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("USERID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("USERTYPE");

        ddlUsertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a User Type", "administrator", "User" }));
        ddlUsertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlUsertypeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("USERSTATUS");

        buttonGroup1.add(rbActive);
        rbActive.setText("ACTIVE");
        rbActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActiveActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbInActive);
        rbInActive.setText("INACTIVE");
        rbInActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInActiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(rbActive)
                            .addGap(18, 18, 18)
                            .addComponent(rbInActive))
                        .addComponent(txtPassword)
                        .addComponent(txtUsername)
                        .addComponent(ddlUsertype, 0, 187, Short.MAX_VALUE))
                    .addComponent(lblUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUserid))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ddlUsertype, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbInActive)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(rbActive)))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERSONAL INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("NAME");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CONTACT");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("DOB");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("EMAIL");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ADDRESS");

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("GENDER");

        buttonGroup2.add(rbMale);
        rbMale.setText("MALE");

        buttonGroup2.add(rbFemale);
        rbFemale.setText("FEMALE");

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane1.setViewportView(taAddress);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContact)
                    .addComponent(txtDob)
                    .addComponent(txtName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbFemale)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtEmail)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addContainerGap())
        );

        btnFirst.setText("FIRST");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("PREVIOUS");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText("LAST");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnFirst)
                        .addGap(34, 34, 34)
                        .addComponent(btnPrevious)
                        .addGap(38, 38, 38)
                        .addComponent(btnNext)
                        .addGap(32, 32, 32)
                        .addComponent(btnLast)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnAdd)
                        .addGap(33, 33, 33)
                        .addComponent(btnEdit)
                        .addGap(32, 32, 32)
                        .addComponent(btnSave)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancel))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        count = Integer.parseInt(lblUserid.getText()) - 1;
        count++;
        al = UserMaintenanceServices.getAllUser();
        if (al.size() > 0) {
            showRecord();
        }
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
        btnLast.setEnabled(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        enableAll(true);
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnAdd.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        addupdateflag = 1;
    }//GEN-LAST:event_btnEditActionPerformed

    private void ddlUsertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlUsertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlUsertypeActionPerformed

    private void rbActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbActiveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        enableAll(true);
        txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
        txtContact.setText("");
        txtDob.setText("");
        taAddress.setText("");
        txtEmail.setText("");
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        lblUserid.setText(String.valueOf(UserMaintenanceServices.getMaxUserid()));//id is int to convert use string.valueof
        addupdateflag = 0;
    }//GEN-LAST:event_btnAddActionPerformed

    private void afterSave() {
        al = UserMaintenanceServices.getAllUser();
        if (addupdateflag == 0) {
            count = al.size() - 1;
            showRecord();
        } else if (addupdateflag == 1) {
            showRecord();
        }
        addupdateflag = -1;
    }

    private void showRecord() {
        UserBean objbean = al.get(count);
        lblUserid.setText(String.valueOf(objbean.getUserid()));
        txtUsername.setText(objbean.getUsername());
        txtPassword.setText(objbean.getPassword());
        ddlUsertype.setSelectedItem(objbean.getUsertype());
        if (objbean.isUserstatus()) {
            rbActive.setSelected(true);
        } else {
            rbInActive.setSelected(true);
        }
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
        if (count == 0) {
            btnFirst.setEnabled(false);
            btnPrevious.setEnabled(false);
        } else if (count == al.size() - 1) {
            btnLast.setEnabled(false);
            btnNext.setEnabled(false);
        } else {
            btnFirst.setEnabled(true);
            btnPrevious.setEnabled(true);
            btnLast.setEnabled(true);
            btnNext.setEnabled(true);
        }
        btnSave.setEnabled(false);
        enableAll(false);
    }

    public void enableAll(boolean flag) {
        txtUsername.setEditable(flag);
        txtPassword.setEditable(flag);
        ddlUsertype.setEnabled(flag);
        rbActive.setEnabled(flag);
        rbInActive.setEnabled(flag);
        txtName.setEditable(flag);
        txtContact.setEditable(flag);
        txtDob.setEditable(flag);
        txtEmail.setEditable(flag);
        taAddress.setEditable(flag);
        rbMale.setEnabled(flag);
        rbFemale.setEnabled(flag);
    }
    private void rbInActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbInActiveActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        UserBean objbean = new UserBean();

        if (txtUsername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plz enter user name", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
            txtUsername.requestFocus();
        } else if (txtPassword.getText().isEmpty()) {
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
                objbean.setUsername(txtUsername.getText());
                objbean.setPassword(txtPassword.getText());
                objbean.setUsertype("" + ddlUsertype.getSelectedItem());
                if (rbActive.isSelected()) {
                    objbean.setUserstatus(true);
                } else {
                    objbean.setUserstatus(false);
                }
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
                if (addupdateflag == 0) {
                    check = UserMaintenanceServices.addUser(objbean);

                    if (check) {
                        JOptionPane.showMessageDialog(this, "record added", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "record not addedd", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (addupdateflag == 1) {
                    check = UserMaintenanceServices.updateUser(objbean);
                    if (check) {
                        JOptionPane.showMessageDialog(this, "record updated", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(this, "record not updated", "EMPTY FIELD", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                afterSave();
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        if (addupdateflag == 0) {
            count = al.size() - 1;
            showRecord();
        } else if (addupdateflag == 1) {
            showRecord();
        }
        MainFrame.c.removeAll();
        MainFrame.c.setVisible(false);

        addupdateflag = -1;
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        count = 0;
        al = UserMaintenanceServices.getAllUser();
        if (al.size() > 0) {
            showRecord();
        }
        btnNext.setEnabled(true);
        btnLast.setEnabled(true);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        count = Integer.parseInt(lblUserid.getText()) - 1;
        count--;
        al = UserMaintenanceServices.getAllUser();
        if (al.size() > 0) {
            showRecord();
        }
        btnFirst.setEnabled(true);
        btnNext.setEnabled(true);
        btnLast.setEnabled(true);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here
        count = al.size() - 1;
        al = UserMaintenanceServices.getAllUser();
        if (al.size() > 0) {
            showRecord();
        }
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
    }//GEN-LAST:event_btnLastActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> ddlUsertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserid;
    private javax.swing.JRadioButton rbActive;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbInActive;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JFormattedTextField txtContact;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
