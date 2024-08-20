/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.utils.Repo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Form_7 extends javax.swing.JPanel {

    private Connection connection;
    private final Repo repo = Repo.getInstance();

    /**
     * Creates new form Form_7
     */
    public Form_7() {
        initComponents();
        connection = repo.getConnection();
        
    }

    public void thongKeTheoThang() {
        // Xóa dữ liệu của bảng trước khi điền dữ liệu mới
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Lấy tháng được chọn từ combo box
        String thangDuocChon = (String) cbx_Thang.getSelectedItem();
        int index = thangDuocChon.indexOf(" ");
        String soThang = thangDuocChon.substring(index + 1);

        // Chuẩn bị câu truy vấn SQL để lấy dữ liệu cho tháng được chọn
        String query = "SELECT maHD, NgayThanhToan, TongTien FROM hoadon WHERE MONTH(NgayThanhToan) = ? and year(NgayThanhToan) = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, soThang);
            preparedStatement.setString(2, txtNam.getText());

            // Thực thi truy vấn và xử lý tập kết quả
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    // Lấy dữ liệu từ tập kết quả
                    String maHD = rs.getString("maHD");
                    String ngayThanhToan = rs.getString("NgayThanhToan");
                    String tongTien = rs.getString("TongTien");

                    // Tạo một mảng để chứa dữ liệu của hàng
                    Object[] row = {maHD, ngayThanhToan, tongTien};

                    // Thêm hàng vào model của bảng
                    model.addRow(row);
                }
            }
            tinhTongTienTheoThang();
        } catch (SQLException ex) {
            // Xử lý ngoại lệ nếu có
            ex.printStackTrace();
            // Có thể thêm các thao tác xử lý khác tại đây, như hiển thị thông báo lỗi
        }
    }

    public void thongKeTheoNam() {
        // Xóa dữ liệu của bảng trước khi điền dữ liệu mới
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        // Lấy năm được chọn từ combo box
        String namDuocChon = txtNam.getText();

        // Chuẩn bị câu truy vấn SQL để lấy dữ liệu cho năm được chọn
        String query = "SELECT maHD, NgayThanhToan, TongTien FROM hoadon WHERE YEAR(NgayThanhToan) = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, namDuocChon);

            // Thực thi truy vấn và xử lý tập kết quả
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    // Lấy dữ liệu từ tập kết quả
                    String maHD = rs.getString("maHD");
                    String ngayThanhToan = rs.getString("NgayThanhToan");
                    String tongTien = rs.getString("TongTien");

                    // Tạo một mảng để chứa dữ liệu của hàng
                    Object[] row = {maHD, ngayThanhToan, tongTien};

                    // Thêm hàng vào model của bảng
                    model.addRow(row);
                }
            }
            tinhTongTienTheoNam();
        } catch (SQLException ex) {
            // Xử lý ngoại lệ nếu có
            ex.printStackTrace();
            // Có thể thêm các thao tác xử lý khác tại đây, như hiển thị thông báo lỗi
        }
    }

    public void tinhTongTienTheoThang() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        double tongTien = 0;

        // Duyệt qua từng hàng trong bảng và tính tổng giá trị trong cột "TongTien"
        for (int i = 0; i < rowCount; i++) {
            Object value = model.getValueAt(i, 2);
            if (value != null) {
                try {
                    double giaTri = Double.parseDouble(value.toString());
                    tongTien += giaTri;
                } catch (NumberFormatException e) {
                    // Xử lý trường hợp giá trị không thể chuyển đổi thành số
                    e.printStackTrace();
                }
            }
        }

        // Hiển thị tổng lên label lb_TTtheoThang
        lb_TTtheoThang.setText(String.valueOf(tongTien));
    }
    public void tinhTongTienTheoNam() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
        double tongTien = 0;

        // Duyệt qua từng hàng trong bảng và tính tổng giá trị trong cột "TongTien"
        for (int i = 0; i < rowCount; i++) {
            Object value = model.getValueAt(i, 2);
            if (value != null) {
                try {
                    double giaTri = Double.parseDouble(value.toString());
                    tongTien += giaTri;
                } catch (NumberFormatException e) {
                    // Xử lý trường hợp giá trị không thể chuyển đổi thành số
                    e.printStackTrace();
                }
            }
        }

        // Hiển thị tổng lên label lb_TTtheoThang
        lb_TTtheoNam.setText(String.valueOf(tongTien));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbx_Thang = new javax.swing.JComboBox<>();
        txtNam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_TTtheoThang = new javax.swing.JLabel();
        lb_TTtheoNam = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setText("Thống kê doanh thu");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Thống kê theo năm: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Thống kê theo tháng: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Ngáy Thanh Toán", "Tổng Tiền"
            }
        ));
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày Thanh Toán", "Tổng Tiền"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        cbx_Thang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbx_Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        cbx_Thang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ThangActionPerformed(evt);
            }
        });

        txtNam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Tổng tiền theo năm: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Tổng tiền theo tháng: ");

        lb_TTtheoThang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lb_TTtheoThang.setText("0.0");

        lb_TTtheoNam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lb_TTtheoNam.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(lb_TTtheoThang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(62, 62, 62)
                .addComponent(lb_TTtheoNam)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(cbx_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lb_TTtheoThang))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lb_TTtheoNam))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_ThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ThangActionPerformed
        // TODO add your handling code here:
        thongKeTheoThang();
    }//GEN-LAST:event_cbx_ThangActionPerformed

    private void txtNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamActionPerformed
        // TODO add your handling code here:
        thongKeTheoNam();
    }//GEN-LAST:event_txtNamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_Thang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lb_TTtheoNam;
    private javax.swing.JLabel lb_TTtheoThang;
    private javax.swing.JTextField txtNam;
    // End of variables declaration//GEN-END:variables
}
