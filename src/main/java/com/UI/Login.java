/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import com.raven.main.Main;
import com.raven.main.Main1;
import com.raven.main.Main2;
import com.raven.model.Account;
import com.raven.services.AccountServiceImpl;
import com.raven.services.IAccountService;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */

    private static String userId;


    private final IAccountService accountService;
    
    public Login() {
        this.accountService = new AccountServiceImpl();
        initComponents();
    }
    public static String getUserId() {
        return userId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Dky_label = new javax.swing.JLabel();
        Login_txt = new javax.swing.JTextField();
        Password_txt = new javax.swing.JPasswordField();
        Disable = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Button_Login.png"))); // NOI18N
        jButton2.setText("Đăng nhập");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(246, 223, 199));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Đăng nhập");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 45, -1, -1));

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
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 210, 380, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login.png"))); // NOI18N
        jLabel8.setText("Tài khoản đăng nhập: ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("_________________________________________________________");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 333, 370, 35));

        Login_Button.setBackground(new java.awt.Color(236, 139, 73));
        Login_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(0, 0, 0));
        Login_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dky.png"))); // NOI18N
        Login_Button.setText("Đăng nhập");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 401, 490, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Bạn chưa có tài khoản?");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 492, -1, -1));

        Dky_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Dky_label.setForeground(new java.awt.Color(0, 0, 255));
        Dky_label.setText("Đăng ký ngay!!!");
        Dky_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dky_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dky_labelMouseClicked(evt);
            }
        });
        jPanel3.add(Dky_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 492, -1, -1));

        Login_txt.setBackground(new java.awt.Color(246, 202, 156));
        Login_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Login_txt.setBorder(null);
        jPanel3.add(Login_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 390, 40));

        Password_txt.setBackground(new java.awt.Color(235, 199, 163));
        Password_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Password_txt.setBorder(null);
        jPanel3.add(Password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 370, 40));

        Disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eyePL.png"))); // NOI18N
        Disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisableMouseClicked(evt);
            }
        });
        jPanel3.add(Disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 50, 30));

        Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eysP.png"))); // NOI18N
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        jPanel3.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 50, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backgroup.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Văn phòng phẩm LTD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1083, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // TODO add your handling code here:
        String username = Login_txt.getText();
        char[] password = Password_txt.getPassword();
        String passwordStr = new String(password);

        if (username.isEmpty() || passwordStr.length() == 0) {
            JOptionPane.showMessageDialog(this, "Tài khoản và mật khẩu không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        Account account = new Account(username, passwordStr);

        if (username.startsWith("AD") && accountService.checkAccountNV(account)){
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            userId = accountService.accountIdHolder();
            Main ad = new Main();
            ad.setVisible(true);
            setVisible(false);
        }else if (username.startsWith("NV") && accountService.checkAccountNV(account)){
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            userId = accountService.accountIdHolder();
            Main2 nv = new Main2();
            nv.setVisible(true);
            setVisible(false);
        }else if (username.startsWith("0") && accountService.checkAccountKH(account)){
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            userId = accountService.accountIdHolder();
            Main1 kh = new Main1();
            kh.setVisible(true);
            setVisible(false);
        }else {
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        // Xóa mật khẩu khỏi bộ nhớ sau khi sử dụng
        java.util.Arrays.fill(password, ' ');
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void DisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisableMouseClicked
        // TODO add your handling code here:
        Password_txt.setEchoChar((char)0);
        Disable.setVisible(false);
        Disable.setEnabled(false);
        Show.setEnabled(true);
        Show.setEnabled(true);
    }//GEN-LAST:event_DisableMouseClicked

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        // TODO add your handling code here:
        Password_txt.setEchoChar((char)8226);
        Disable.setVisible(true);
        Disable.setEnabled(true);
        Show.setEnabled(false);
        Show.setEnabled(false);
    }//GEN-LAST:event_ShowMouseClicked

    private void Dky_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dky_labelMouseClicked
        // TODO add your handling code here:
        Register dky = new Register();
        dky.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Dky_labelMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disable;
    private javax.swing.JLabel Dky_label;
    private javax.swing.JButton Login_Button;
    private javax.swing.JTextField Login_txt;
    private javax.swing.JPasswordField Password_txt;
    private javax.swing.JLabel Show;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
