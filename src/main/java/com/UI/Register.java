/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import com.raven.model.Account;
import com.raven.services.AccountServiceImpl;
import com.raven.services.IAccountService;
import java.awt.event.KeyEvent;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    private final IAccountService accountService;
    public Register() {
        this.accountService = new AccountServiceImpl();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        STDDky_txt = new javax.swing.JTextField();
        Password_txt = new javax.swing.JPasswordField();
        Disable = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1077, 558));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Văn phòng phẩm LTD");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backgroup.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(245, 221, 198));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Đăng ký thành viên");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Welcome to LTD!!!");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pass.png"))); // NOI18N
        jLabel6.setText("Mật khẩu:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 265, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("_________________________________________________________");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 210, 370, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Phone.png"))); // NOI18N
        jLabel8.setText("Số điện thoại:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("_________________________________________________________");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 333, 370, 35));

        jButton3.setBackground(new java.awt.Color(204, 102, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dky.png"))); // NOI18N
        jButton3.setText("Đăng ký");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 401, 490, -1));

        STDDky_txt.setBackground(new java.awt.Color(231, 180, 130));
        STDDky_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        STDDky_txt.setText("0");
        STDDky_txt.setBorder(null);
        STDDky_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                STDDky_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                STDDky_txtKeyTyped(evt);
            }
        });
        jPanel3.add(STDDky_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 370, 40));

        Password_txt.setBackground(new java.awt.Color(228, 186, 143));
        Password_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Password_txt.setBorder(null);
        jPanel3.add(Password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 370, 40));

        Disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eyePL.png"))); // NOI18N
        Disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisableMouseClicked(evt);
            }
        });
        jPanel3.add(Disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 60, -1));

        Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eysP.png"))); // NOI18N
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        jPanel3.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1094, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String username = STDDky_txt.getText();
        char[] password = Password_txt.getPassword();
        String passwordStr = new String(password);
         if (username.isEmpty() || passwordStr.length() == 0) {
            JOptionPane.showMessageDialog(this, "Tài khoản và mật khẩu không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (accountService.registerAccount(new Account(username, passwordStr))) {
            JOptionPane.showMessageDialog(null, "Đăng ký tài khoản thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            Login dnhap = new Login();
            dnhap.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        // TODO add your handling code here:
        Password_txt.setEchoChar((char)8226);
        Disable.setVisible(true);
        Disable.setEnabled(true);
        Show.setEnabled(false);
        Show.setEnabled(false);
    }//GEN-LAST:event_ShowMouseClicked

    private void DisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisableMouseClicked
        // TODO add your handling code here:
        Password_txt.setEchoChar((char)0);
        Disable.setVisible(false);
        Disable.setEnabled(false);
        Show.setEnabled(true);
        Show.setEnabled(true);
    }//GEN-LAST:event_DisableMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Login dnhap = new Login();
        dnhap.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void STDDky_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_STDDky_txtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
            // Allow backspace and delete keys
            return;
        }

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_STDDky_txtKeyPressed

    private void STDDky_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_STDDky_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        int length = STDDky_txt.getText().length();

        if (length == 0 && c != '0') {
            getToolkit().beep();
            evt.consume();
            return;
        }

        if (!Character.isDigit(c) || length >= 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_STDDky_txtKeyTyped

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disable;
    private javax.swing.JPasswordField Password_txt;
    private javax.swing.JTextField STDDky_txt;
    private javax.swing.JLabel Show;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}