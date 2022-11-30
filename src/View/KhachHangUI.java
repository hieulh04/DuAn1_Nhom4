package View;

import Model.KhachHang_Model;
import Service.IKhachHangService;
import Service_impl.KhachHang_Service;
import ViewModel.KhachHang_View;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hung duong
 */
public class KhachHangUI extends javax.swing.JFrame {

    private IKhachHangService _iHangService;

    public KhachHangUI() {
        initComponents();
        _iHangService = new KhachHang_Service();
        setLocationRelativeTo(this);
    }

    public void loadTable() {
        List<KhachHang_View> ds = this._iHangService.getALllDM();
        DefaultTableModel dtm = (DefaultTableModel) this.tblKhachHang.getModel();
        dtm.setRowCount(0);
        for (KhachHang_View d : ds) {
            Object[] rowData = {
                d.getStt(),
                d.getMa(),
                d.getHoTen(),
                d.getNgaySinh(),
                d.getGioiTinh() == 0 ? "Nam" : "Nữ",
                d.getDiaChi(),
                d.getSdt()
            };
            dtm.addRow(rowData);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnKhachMoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnKhachCu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        txtMa = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        btnBatMay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Số điện thoại");

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ma", "Ho Ten", "Ngay Sinh", "Gioi Tinh", "Dia Chi", "Sdt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        txtSearch.setMinimumSize(new java.awt.Dimension(60, 25));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Khách Hàng");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_add_30px_1.png"))); // NOI18N
        btnNew.setText("Làm Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel8.setText("Tìm Kiếm");

        jLabel1.setText("Mã khách hàng");

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_refresh_30px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnKhachMoi.setText("Khách Mới");

        jLabel2.setText("Họ Tên");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_30px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnKhachCu.setText("Khách Cũ");
        btnKhachCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachCuActionPerformed(evt);
            }
        });

        jLabel3.setText("Ngày sinh");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_30px.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Giới Tính");

        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        jLabel5.setText("Địa chỉ");

        rdoNu.setText("Nữ");

        txtMa.setPreferredSize(new java.awt.Dimension(65, 20));

        txtSdt.setPreferredSize(new java.awt.Dimension(65, 20));

        txtHoten.setPreferredSize(new java.awt.Dimension(65, 20));

        txtDiaChi.setPreferredSize(new java.awt.Dimension(65, 20));

        txtNgaySinh.setMinimumSize(new java.awt.Dimension(65, 20));

        btnBatMay.setText("Bật Máy");
        btnBatMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatMayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnKhachMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnKhachCu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(rdoNam)
                                .addGap(11, 11, 11)
                                .addComponent(rdoNu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBatMay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addGap(14, 14, 14)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhachMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachCu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBatMay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        int row = this.tblKhachHang.getSelectedRow();
        if (row == -1) {
            return;
        }
        String ma = this.tblKhachHang.getValueAt(row, 1).toString();
        String hoTen = this.tblKhachHang.getValueAt(row, 2).toString();
        String ngaySinh = this.tblKhachHang.getValueAt(row, 3).toString();
        String gioiTinh = this.tblKhachHang.getValueAt(row, 4).toString();
        String dc = this.tblKhachHang.getValueAt(row, 5).toString();
        String sdt = this.tblKhachHang.getValueAt(row, 6).toString();

        txtDiaChi.setText(dc);
        txtHoten.setText(hoTen);
        txtMa.setText(ma);
        txtNgaySinh.setText(ngaySinh);
        txtSdt.setText(sdt);
        if (gioiTinh.equals("Nam")) {
            this.rdoNam.setSelected(true);
        } else {
            this.rdoNu.setSelected(true);
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String keyWord = txtSearch.getText();
        findKH(txtSearch.getText().trim());
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (_iHangService.getDMByMa(txtMa.getText()) != null) {
            KhachHang_Model kh = this.getFormData();
            _iHangService.update(kh);
            loadTable();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Chức Vũ không tồn tại");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        if (_iHangService.getDMByMa(txtMa.getText()) == null) {
            KhachHang_Model kh = this.getFormData();
            _iHangService.add(kh);
            loadTable();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Mã khach hang đã tồn tại");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnKhachCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachCuActionPerformed
        this.loadTable();
    }//GEN-LAST:event_btnKhachCuActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (_iHangService.getDMByMa(txtMa.getText()) != null) {
            KhachHang_Model kh = this.getFormData();
            _iHangService.delete(kh);
            loadTable();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Chức vụ không tồn tại");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBatMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatMayActionPerformed
        new TongUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBatMayActionPerformed

    public void findKH(String keyWord) {
        List<KhachHang_View> ds = this._iHangService.findKH(keyWord);
        DefaultTableModel dtm = (DefaultTableModel) this.tblKhachHang.getModel();
        dtm.setRowCount(0);
        for (KhachHang_View d : ds) {
            Object[] rowData = {
                d.getStt(),
                d.getMa(),
                d.getHoTen(),
                d.getNgaySinh(),
                d.getGioiTinh() == 0 ? "Nam" : "Nữ",
                d.getDiaChi(),
                d.getSdt()
            };
            dtm.addRow(rowData);
        }
    }

    public KhachHang_Model getFormData() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ma = txtMa.getText();
        String hoTen = txtHoten.getText();
        String ngaySinh = txtNgaySinh.getText();
        String dc = txtDiaChi.getText();
        int gt = rdoNam.isSelected() ? 0 : 1;
        String sdt = txtSdt.getText();
        if (ma.trim().length() == 0 || hoTen.trim().length() == 0 || ngaySinh.trim().length() == 0 || dc.trim().length() == 0 || sdt.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return null;
        }

        if (ma.indexOf(" ") > 0) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong ma");
            return null;
        }

        String isPhone = "0[0-9]{9,10}";

        if (!(sdt).matches(isPhone)) {
            JOptionPane.showMessageDialog(this, "Sai dinh dang so dien thoai");
            return null;
        }

        try {
            KhachHang_Model kh = new KhachHang_Model(ma, hoTen, (Date) sdf.parse(ngaySinh), gt, dc, sdt);
            return kh;
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ngay sinh sai dinh dang");
            return null;
        }

    }

    public void clearForm() {
        txtMa.setText("");
        txtHoten.setText("");
        txtDiaChi.setText("");
        txtNgaySinh.setText("");
        txtSdt.setText("");
    }

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
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatMay;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKhachCu;
    private javax.swing.JButton btnKhachMoi;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
