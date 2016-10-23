/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom28.quanlibanhang.ui;

import java.util.prefs.Preferences;

import javax.swing.SwingWorker;

import com.nhom28.quanlibanhang.common.DialogMessages;
import com.nhom28.quanlibanhang.common.GlobalVariables;
import com.nhom28.quanlibanhang.service.NguoiDungService;
import com.nhom28.quanlibanhang.service.impl.NguoiDungServiceImpl;
import java.awt.Window;
import javax.swing.SwingUtilities;

/**
 *
 * @author lehuyen
 */
public class DangNhap extends javax.swing.JFrame {
	
	NguoiDungService nguoiDungService = new NguoiDungServiceImpl();
	
	
	 Preferences prefs = Preferences.userNodeForPackage(DangNhap.class);

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        String userName = prefs.get("user", "");
        
        if(!userName.equals("")){
            this.txtUsername.setText(userName);
            this.jcheckboxRemember.setSelected(true);
        }
        String passName = prefs.get("pass", "");
        if(!passName.equals("")){
            this.txtPassword.setText(passName);
        }
    }
    
 // Process in background
    public class DoLogin extends SwingWorker{
        public void done(){
            // On successfull login save user data
            prefs.put("user", txtUsername.getText());
            prefs.put("pass", txtPassword.getText());
        }

        public String doInBackground(){
			return null;
            // Process login
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCanCel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jcheckboxRemember = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setText("Tài khoản :");

        jLabel3.setText("Mật khẩu :");

        btnLogin.setText("Đăng Nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCanCel.setText("Kết thúc");
        btnCanCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanCelActionPerformed(evt);
            }
        });

        jcheckboxRemember.setText("Nhớ Mật Khẩu");
        jcheckboxRemember.setToolTipText("");
        jcheckboxRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxRememberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnLogin)
                        .addGap(41, 41, 41)
                        .addComponent(btnCanCel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcheckboxRemember)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(txtPassword)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jcheckboxRemember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCanCel))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    	String username = txtUsername.getText();
		String password = txtPassword.getText();
		
		if(jcheckboxRemember.isSelected() && !jcheckboxRemember.getText().isEmpty()) {
			DoLogin log = new DoLogin();
	        log.done();
		}
       
		
		if (nguoiDungService.checkLogin(username, password)) {
			GlobalVariables.CURRENT_USER_NAME = username;
			DialogMessages.infoBox("Dang Nhap thanh cong", "Thanh Cong!");
			MainJFrame mainFrame = new MainJFrame();
			mainFrame.setVisible(true);
			
			setVisible(false);
                        dispose();
		} else {
			DialogMessages.errorBox("Dang Nhap that bai, xin vui long thu lai", "That bai!");
		}
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCanCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanCelActionPerformed
        setVisible(false);
      
    }//GEN-LAST:event_btnCanCelActionPerformed

    private void jcheckboxRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxRememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckboxRememberActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanCel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox jcheckboxRemember;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
