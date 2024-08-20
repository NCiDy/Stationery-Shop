package com.raven.form;

import com.UI.Login;
import com.raven.utils.Repo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Home extends javax.swing.JPanel {

    private final Repo repo = Repo.getInstance();
    private DefaultTableModel tableModel;
    private Object[] selectedProduct;

    public Form_Home() {

        initComponents();
        update_table();
    }

    public void update_table() {
        tableModel = (DefaultTableModel) TableSP.getModel();
        tableModel.setRowCount(0);

        String sql = "SELECT tenSP,DVT,dongia FROM sanpham";
        ResultSet rs = repo.executeQuery(sql);
        try {
            while (rs.next()) {
                // Lấy dữ liệu từ ResultSet và thêm vào tableModel
                Object[] row = {
                    rs.getString("tenSP"),
                    rs.getString("DVT"),
                    rs.getString("dongia")
                };
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSP = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BT_Xoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_TT = new javax.swing.JLabel();
        BT_TT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableHD = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        BT_Add = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        TableSP.setBackground(new java.awt.Color(252, 233, 227));
        TableSP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TableSP.setForeground(new java.awt.Color(0, 0, 0));
        TableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Đơn vị tính", "Đơn giá"
            }
        ));
        TableSP.setRowHeight(40);
        TableSP.getTableHeader().setResizingAllowed(false);
        TableSP.getTableHeader().setReorderingAllowed(false);
        TableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableSP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BT_Xoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BT_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-48 (1).png"))); // NOI18N
        BT_Xoa.setText("Xóa");
        BT_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_XoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tổng tiền: ");

        lb_TT.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb_TT.setForeground(new java.awt.Color(0, 0, 0));
        lb_TT.setText("0.00");

        BT_TT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BT_TT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-money-40.png"))); // NOI18N
        BT_TT.setText("Thanh Toán");
        BT_TT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_TTActionPerformed(evt);
            }
        });

        TableHD.setBackground(new java.awt.Color(255, 255, 255));
        TableHD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Đơn giá", "Số lượng", "Tổng tiền"
            }
        ));
        TableHD.setRowHeight(30);
        jScrollPane2.setViewportView(TableHD);

        jSpinner1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-number-50.png"))); // NOI18N
        jLabel2.setText("Số lượng: ");

        BT_Add.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BT_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-48.png"))); // NOI18N
        BT_Add.setText("Thêm vào giỏ hàng");
        BT_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AddActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-data-backup-40.png"))); // NOI18N
        jButton1.setText("Cập nhật dữ liệu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addComponent(BT_Add)
                            .addGap(36, 36, 36))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel)
                        .addGap(450, 450, 450))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addGap(116, 116, 116)
                                .addComponent(lb_TT))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BT_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BT_TT))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BT_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lb_TT, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_TT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(BT_Xoa)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateTotalPrice() {
        DefaultTableModel tableModelHD = (DefaultTableModel) TableHD.getModel();
        double totalPrice = 0.0;
        for (int i = 0; i < tableModelHD.getRowCount(); i++) {
            totalPrice += (Double) tableModelHD.getValueAt(i, 3); // Cột tổng tiền (giả sử là cột thứ 4, index 3)
        }
        lb_TT.setText(String.valueOf(totalPrice));
    }

    private void BT_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AddActionPerformed
        // TODO add your handling code here:
        if (selectedProduct != null) {
            int soLuong = (Integer) jSpinner1.getValue();
            if (soLuong > 0) {
                String tenSP = (String) selectedProduct[0];
                String dvt = (String) selectedProduct[1];
                double dongia = (Double) selectedProduct[2];
                boolean productExists = false;

                DefaultTableModel tableModelHD = (DefaultTableModel) TableHD.getModel();
                // Kiểm tra xem sản phẩm đã tồn tại trong TableHD chưa
                for (int i = 0; i < tableModelHD.getRowCount(); i++) {
                    if (tableModelHD.getValueAt(i, 0).equals(tenSP)) {
                        // Sản phẩm đã tồn tại, cập nhật số lượng và tổng tiền
                        int currentQuantity = (Integer) tableModelHD.getValueAt(i, 2);
                        int newQuantity = currentQuantity + soLuong;
                        double newTotalPrice = dongia * newQuantity;
                        tableModelHD.setValueAt(newQuantity, i, 2);
                        tableModelHD.setValueAt(newTotalPrice, i, 3);
                        productExists = true;
                        break;
                    }
                }

                if (!productExists) {
                    // Sản phẩm chưa tồn tại, thêm dòng mới vào TableHD
                    double tongTien = dongia * soLuong;
                    tableModelHD.addRow(new Object[]{tenSP, dongia, soLuong, tongTien});
                }

                // Cập nhật tổng tiền
                updateTotalPrice();

            } else {
                JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm từ bảng");
        }
    }//GEN-LAST:event_BT_AddActionPerformed

    private void TableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSPMouseClicked
        // TODO add your handling code here:
        int selectedRow = TableSP.getSelectedRow();
        if (selectedRow != -1) {
            // Lấy dữ liệu của hàng được chọn
            String tenSP = (String) TableSP.getValueAt(selectedRow, 0);
            String dvt = (String) TableSP.getValueAt(selectedRow, 1);
            double dongia = Double.parseDouble(TableSP.getValueAt(selectedRow, 2).toString());

            // Lưu dữ liệu vào biến tạm
            selectedProduct = new Object[]{tenSP, dvt, dongia};
        }
        jSpinner1.setValue(0);
    }//GEN-LAST:event_TableSPMouseClicked


    private void BT_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_XoaActionPerformed
        // TODO add your handling code here:
        int selectedRow = TableHD.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel tableModelHD = (DefaultTableModel) TableHD.getModel();
            tableModelHD.removeRow(selectedRow);

            // Cập nhật tổng tiền sau khi xóa dòng
            updateTotalPrice();
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm từ bảng để xóa");
        }
    }//GEN-LAST:event_BT_XoaActionPerformed
    Connection connection = repo.getConnection();

    private void pay() throws SQLException {
        String userId = Login.getUserId();
        String manv = null;
        String sdt = null;
        try {
            // Tạo mã hoá đơn ngẫu nhiên
            Random random = new Random();
            int randomNumber = random.nextInt(1000000);
            String maHD = "HD" + randomNumber;

            // Lấy ngày hiện tại
            java.util.Date date = new java.util.Date();
            java.sql.Date ngayThanhToan = new java.sql.Date(date.getTime());

            // Lấy tổng tiền từ label lb_TT
            double tongTien = Double.parseDouble(lb_TT.getText());

            if (userId != null) {
                if (userId.startsWith("NV") || userId.startsWith("AD")) {
                    manv = userId;
                    themHoaDonNV(maHD, ngayThanhToan, tongTien, manv);
                } else {
                    sdt = userId;
                    themHoaDonKH(maHD, ngayThanhToan, tongTien, sdt);
                }
            }

            // Thêm hóa đơn vào bảng HoaDon    
            // Thêm chi tiết hóa đơn vào bảng ChiTietHoaDon
            DefaultTableModel tableModelHD = (DefaultTableModel) TableHD.getModel();

            for (int i = 0; i < tableModelHD.getRowCount(); i++) {
                String tenSP = (String) tableModelHD.getValueAt(i, 0);

                Double donGia = (Double) tableModelHD.getValueAt(i, 1);
                int soLuong = (int) tableModelHD.getValueAt(i, 2);
                Double thanhTien = (Double) tableModelHD.getValueAt(i, 3);

                String maSP = getMaSPFromTenSP(tenSP);
                double donGiaValue = (donGia != null) ? donGia : 0.0; // Xác nhận donGia không null
                double thanhTienValue = (thanhTien != null) ? thanhTien : 0.0; // Xác nhận thanhTien không null
//                
                // Truy vấn SLTon từ bảng ChiTietSanPham
                String query = "SELECT SLTon FROM ctsanpham WHERE maSP = ?";
                PreparedStatement pstmt = repo.getConnection().prepareStatement(query);
                pstmt.setString(1, maSP);
                ResultSet rs = pstmt.executeQuery();

                // Kiểm tra kết quả truy vấn và cập nhật SLTon
                if (rs.next()) {
                    int SLTon = rs.getInt("SLTon");
                    int newSLTon = SLTon - soLuong;

                    // Cập nhật SLTon trong bảng ChiTietSanPham
                    String updateQuery = "UPDATE ctsanpham SET SLTon = ? WHERE maSP = ?";
                    PreparedStatement updateStmt = repo.getConnection().prepareStatement(updateQuery);
                    updateStmt.setInt(1, newSLTon);
                    updateStmt.setString(2, maSP);
                    updateStmt.executeUpdate();
                } else {
                    // Xử lý khi không tìm thấy mã sản phẩm
                    JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm tương ứng với tên: " + tenSP, "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                themChiTietHoaDon(maHD, maSP, soLuong, donGiaValue, thanhTienValue);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi thanh toán!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getMaSPFromTenSP(String tenSP) {
        String maSP = ""; // Khởi tạo mã sản phẩm
        try {
            // Tạo truy vấn SQL để lấy mã sản phẩm từ tên sản phẩm
            String sql = "SELECT maSP FROM SanPham WHERE tenSP = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, tenSP);
            ResultSet rs = statement.executeQuery();

            // Nếu có kết quả từ truy vấn
            if (rs.next()) {
                maSP = rs.getString("maSP"); // Lấy mã sản phẩm từ ResultSet
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Xử lý ngoại lệ khi có lỗi trong quá trình truy vấn
        }
        return maSP;
    }

    private void themHoaDonKH(String maHD, Date ngayThanhToan, double tongTien, String sdt) throws SQLException {
        String sql = "INSERT INTO HoaDon (maHD, ngayThanhToan, tongTien, sdt) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, maHD);
        preparedStatement.setDate(2, (java.sql.Date) ngayThanhToan);
        preparedStatement.setDouble(3, tongTien);
        preparedStatement.setString(4, sdt);
        preparedStatement.executeUpdate();
    }

    private void themHoaDonNV(String maHD, Date ngayThanhToan, double tongTien, String manv) throws SQLException {
        String sql = "INSERT INTO HoaDon (maHD, ngayThanhToan, tongTien, SDT, maNV) VALUES (?, ?, ?, NULL, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, maHD);
        preparedStatement.setDate(2, (java.sql.Date) ngayThanhToan);
        preparedStatement.setDouble(3, tongTien);
        preparedStatement.setString(4, manv);
        preparedStatement.executeUpdate();
    }

    // Phương thức thêm chi tiết hóa đơn vào bảng ChiTietHoaDon
    private void themChiTietHoaDon(String maHD, String maSP, int soLuong, double donGia, double thanhTien) throws SQLException {
        String sql = "INSERT INTO ChiTietHoaDon (maHD, maSP, soLuong, donGia, thanhTien) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, maHD);
        preparedStatement.setString(2, maSP);
        preparedStatement.setInt(3, soLuong);
        preparedStatement.setDouble(4, donGia);
        preparedStatement.setDouble(5, thanhTien);
        preparedStatement.executeUpdate();
    }
    private void BT_TTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_TTActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModelHD = (DefaultTableModel) TableHD.getModel();
        if (tableModelHD.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Không có sản phẩm nào trong giỏ hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Hiển thị hộp thoại xác nhận thanh toán với các tùy chọn "Tiền mặt" và "Qua thẻ"
        Object[] options = {"Tiền mặt", "QR code", "Hủy"};
        int choice = JOptionPane.showOptionDialog(null, "Vui lòng chọn phương thức thanh toán?", "Xác nhận thanh toán",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        // Kiểm tra lựa chọn của người dùng
        if (choice == 0) { // Tiền mặt
            try {
                pay(); // Thực hiện thanh toán
            } catch (SQLException ex) {
                Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Thanh toán bằng tiền mặt thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        if (choice == 1) { // Qua thẻ
            try {
                pay(); // Thực hiện thanh toán
            } catch (SQLException ex) {
                Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Thanh toán QR thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else if (choice == 2) { // Qua thẻ

            JOptionPane.showMessageDialog(null, "Hủy thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

        tableModelHD.setRowCount(0);
        lb_TT.setText("0.0");
    }//GEN-LAST:event_BT_TTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        update_table();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Add;
    private javax.swing.JButton BT_TT;
    private javax.swing.JButton BT_Xoa;
    private javax.swing.JTable TableHD;
    private javax.swing.JTable TableSP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lb_TT;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
