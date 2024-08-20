/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.utils.Repo;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Form_6 extends javax.swing.JPanel {

    private DefaultTableModel tableModel;

    /**
     * Creates new form Form_6
     */
    public Form_6() {
        initComponents();
        update_table();
    }

    private final Repo repo = Repo.getInstance();

    public void update_table() {
        tableModel = (DefaultTableModel) ViewDSKH.getModel();
        tableModel.setRowCount(0);

        String sql = "SELECT * FROM KhacHhang where maLKH ='LKH001' or maLKH ='LKH002' or maLKH ='LKH003'";
        ResultSet rs = repo.executeQuery(sql);
        try {
            while (rs.next()) {
                // Lấy dữ liệu từ ResultSet và thêm vào tableModel
                Object[] row = {
                    rs.getString("tenKH"),
                    rs.getString("diachi"),
                    rs.getString("email"),
                    rs.getString("SDT"),
                    rs.getString("MaLKH")
                };
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isValidEmail(String email) {
        // Biểu thức chính quy để kiểm tra định dạng email
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:gmail)\\.(?:com)$";

        // Tạo mẫu từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // So khớp email với mẫu
        Matcher matcher = pattern.matcher(email);

        // Trả về true nếu email khớp với mẫu, ngược lại trả về false
        return matcher.matches();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewDSKH = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        rdoKL = new javax.swing.JRadioButton();
        rdoTN = new javax.swing.JRadioButton();
        rdoTT = new javax.swing.JRadioButton();
        btnSua = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDC = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 51, 0));
        jLabel15.setText("DANH SÁCH KHÁCH HÀNG  ");

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        ViewDSKH.setBackground(new java.awt.Color(255, 255, 255));
        ViewDSKH.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        ViewDSKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên khách hàng ", "Địa chỉ ", "Email", "Số điện thoại ", "Loại khách hàng"
            }
        ));
        ViewDSKH.setRowHeight(30);
        ViewDSKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewDSKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ViewDSKH);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loại khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(204, 51, 0))); // NOI18N

        rdoKL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoKL.setForeground(new java.awt.Color(0, 0, 0));
        rdoKL.setText("Khách lẻ");

        rdoTN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoTN.setForeground(new java.awt.Color(0, 0, 0));
        rdoTN.setText("Khách tiềm năng");
        rdoTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTNActionPerformed(evt);
            }
        });

        rdoTT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoTT.setForeground(new java.awt.Color(0, 0, 0));
        rdoTT.setText("Khách thân thiết");
        rdoTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoKL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoTN))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoTT, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoKL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoTT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(rdoTN)
                .addContainerGap())
        );

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 0, 0));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-edit-64.png"))); // NOI18N
        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-48.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm ");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-48 (1).png"))); // NOI18N
        btnDelete.setText("Xóa ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClean.setBackground(new java.awt.Color(255, 255, 255));
        btnClean.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnClean.setForeground(new java.awt.Color(0, 0, 0));
        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-clean-80.png"))); // NOI18N
        btnClean.setText("Hủy");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tên khách hàng");

        txtTenKH.setBackground(new java.awt.Color(255, 255, 255));
        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenKH.setForeground(new java.awt.Color(0, 0, 0));
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setText("@gmail.com");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("SĐT");

        txtSDT.setBackground(new java.awt.Color(255, 255, 255));
        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(0, 0, 0));
        txtSDT.setText("0");
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSDTKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Địa chỉ");

        txtDC.setBackground(new java.awt.Color(255, 255, 255));
        txtDC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDC.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel4))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmail)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(718, 718, 718)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoTTActionPerformed

    private void rdoTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoTNActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String username = txtSDT.getText();
        int xacNhan = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa dữ liệu bảng Khách Hàng?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

        if (xacNhan == JOptionPane.YES_OPTION) {
            try {
                String query1 = "delete from taikhoankh WHERE SDT = ?";
                PreparedStatement stmt1 = repo.getConnection().prepareStatement(query1);
                stmt1.setString(1, username);
                int rowsAffected1 = stmt1.executeUpdate();
                String query = "UPDATE KhachHang  set maLKH ='LKH004' WHERE SDT = ?";
                PreparedStatement stmt = repo.getConnection().prepareStatement(query);
                stmt.setString(1, username);
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    // Cập nhật lại dữ liệu trong tableModel
                    update_table();
                    JOptionPane.showMessageDialog(null, "Đã xóa khách hàng thành công!");
                } else {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy khách hàng có số điện thoại '" + username + "'.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Lỗi khi xóa khách hàng: " + e.getMessage());
                e.printStackTrace();
            }
        }
        txtSDT.setText("");
        txtTenKH.setText("");
        txtDC.setText("");
        txtEmail.setText("");
        rdoKL.setSelected(false);
        rdoTT.setSelected(false);
        rdoTN.setSelected(false);
    }//GEN-LAST:event_btnDeleteActionPerformed
    // lick dữ liệu trên bảng xuất hiện tại text 
    private void ViewDSKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewDSKHMouseClicked
        // TODO add your handling code here:
        txtSDT.setEditable(true);
        DefaultTableModel Df = (DefaultTableModel) ViewDSKH.getModel();
        int selectedIndex = ViewDSKH.getSelectedRow();

        txtTenKH.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtDC.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtEmail.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtSDT.setText(Df.getValueAt(selectedIndex, 3).toString());
        String maLKH = Df.getValueAt(selectedIndex, 4).toString();
        // Kiểm tra và thiết lập giá trị cho radio button tương ứng
        if (maLKH.equals("LKH001")) {
            rdoKL.setSelected(true);
            rdoTT.setSelected(false);
            rdoTN.setSelected(false);
        } else if (maLKH.equals("LKH002")) {
            rdoKL.setSelected(false);
            rdoTT.setSelected(true);
            rdoTN.setSelected(false);
        } else if (maLKH.equals("LKH003")) {
            rdoKL.setSelected(false);
            rdoTT.setSelected(false);
            rdoTN.setSelected(true);
        }

    }//GEN-LAST:event_ViewDSKHMouseClicked

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed
    // nút tìm kiếm để ẩn các txt khác để nhập sdt
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String sdt = txtSDT.getText();
        tableModel = (DefaultTableModel) ViewDSKH.getModel();
        tableModel.setRowCount(0);

        String sql = "SELECT tenKH, diachi, email, SDT, MaLKH FROM KhachHang WHERE SDT = ?";
        try {
            PreparedStatement stmt = repo.getConnection().prepareStatement(sql);
            stmt.setString(1, sdt);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Lấy dữ liệu từ ResultSet và thêm vào tableModel
                Object[] row = {
                    rs.getString("tenKH"),
                    rs.getString("diachi"),
                    rs.getString("email"),
                    rs.getString("SDT"),
                    rs.getString("MaLKH")
                };
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
            // Allow backspace and delete keys
            return;
        }

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSDTKeyPressed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        txtSDT.setText("");
        txtTenKH.setText("");
        txtDC.setText("");
        txtEmail.setText("");
        rdoKL.setSelected(false);
        rdoTT.setSelected(false);
        rdoTN.setSelected(false);
//        //chỉ đọc 
//        txtSDT.setEditable(true);
//        txtTenKH.setEditable(false);
//        txtDC.setEditable(false);
//        txtEmail.setEditable(false);
//        rdoKL.setEnabled(false);
//        rdoTT.setEnabled(false);
//        rdoTN.setEnabled(false);
        update_table();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String username = txtSDT.getText();
        int xacNhan = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn sửa dữ liệu bảng Khách Hàng?", "Xác nhận Sửa", JOptionPane.YES_NO_OPTION);
        String tenKH = txtTenKH.getText();
        String diaChi = txtDC.getText();
        String email = txtEmail.getText();

        // Kiểm tra xem email có đúng định dạng không
        if (!isValidEmail(email)) {
            // Nếu không đúng định dạng, hiển thị thông báo cho người dùng
            JOptionPane.showMessageDialog(null, "Vui lòng nhập email đúng định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Không tiếp tục thực hiện thêm nhân viên nếu email không hợp lệ
        }
        String sdt = txtSDT.getText();
        if (xacNhan == JOptionPane.YES_OPTION) {
            try {
                String query1 = "UPDATE KhachHang SET tenKH = ?, diachi = ?, email = ? WHERE SDT = ?";
                PreparedStatement stmt1 = repo.getConnection().prepareStatement(query1);
                stmt1.setString(1, tenKH);
                stmt1.setString(2, diaChi);
                stmt1.setString(3, email);
                stmt1.setString(4, sdt); // sử dụng sdt mới
                stmt1.setString(4, username); // sử dụng số điện thoại cũ làm điều kiện WHERE
                int rowsAffected = stmt1.executeUpdate();

                if (rowsAffected > 0) {
                    // Cập nhật lại dữ liệu trong tableModel
                    update_table();
                    JOptionPane.showMessageDialog(null, "Đã sửa khách hàng thành công!");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Lỗi khi sửa khách hàng: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        int length = txtSDT.getText().length();

        if (length == 0 && c != '0') {
            getToolkit().beep();
            evt.consume();
            return;
        }

        if (!Character.isDigit(c) || length >= 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSDTKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewDSKH;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoKL;
    private javax.swing.JRadioButton rdoTN;
    private javax.swing.JRadioButton rdoTT;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
