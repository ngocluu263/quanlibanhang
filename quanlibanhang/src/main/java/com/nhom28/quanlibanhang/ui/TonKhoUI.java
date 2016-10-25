/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom28.quanlibanhang.ui;

import java.sql.SQLException;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.nhom28.quanlibanhang.pojo.DonViTinh;
import com.nhom28.quanlibanhang.pojo.HangHoa;
import com.nhom28.quanlibanhang.pojo.NhaPhanPhoi;
import com.nhom28.quanlibanhang.pojo.NhomHang;
import com.nhom28.quanlibanhang.service.TonKhoService;
import com.nhom28.quanlibanhang.service.impl.TonKhoServiceImpl;

/**
 *
 * @author lehuyen
 */
public class TonKhoUI extends javax.swing.JFrame {

	private Integer id;
	private DonViTinh donViTinh;
	private NhaPhanPhoi nhaPhanPhoi;
	private NhomHang nhomHang;
	private String maHangHoa;
	private String maVachNhaSanXuat;
	private String tenHangHoa;
	private String xuatXu;
	private String thue;
	private long tonKhoToiThieu;
	private long tonKhoHienTai;
	private double giaMua;
	private double giaBanSi;
	private double giaBanLe;
	
	private HangHoa hangHoa;
	private TonKhoService tonKhoService = new TonKhoServiceImpl();
	
    /**
     * Creates new form TonKho
     * @throws SQLException 
     */
    public TonKhoUI() throws SQLException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @throws SQLException 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws SQLException {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("TỒN KHO");

        loadView();

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void loadView() throws SQLException{
    	List<HangHoa> rs = tonKhoService.getAll();
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Mã Hàng Hoá", "Mã Vạch Sản Xuất", 
        		"Tên Hàng Hoá", "Xuất Xứ", "Thuế", 
        		"Tồn Kho Tối Thiểu", "Tồn Kho Hiện Tại", 
        		"Giá Mua", "Giá  Bán Sỉ", "Giá Bán Lẻ"};
        model.setColumnIdentifiers(columnNames);
        jTable2.setModel(model);
        for(HangHoa hangHoa : rs){
        	maHangHoa = hangHoa.getMaHangHoa();
            maVachNhaSanXuat = hangHoa.getMaHangHoa();
            tenHangHoa = hangHoa.getTenHangHoa();
            xuatXu = hangHoa.getXuatXu();
            thue = hangHoa.getThue();
            tonKhoToiThieu = hangHoa.getTonKhoToiThieu();
            tonKhoHienTai = hangHoa.getTonKhoHienTai();
            giaMua = hangHoa.getGiaMua();
            giaBanSi = hangHoa.getGiaBanSi();
            giaBanLe = hangHoa.getGiaBanLe();
            model.addRow(new Object[]{
            		maHangHoa,
            		maVachNhaSanXuat,
            		tenHangHoa,
            		xuatXu,
            		thue,
            		tonKhoToiThieu,
            		tonKhoHienTai,
            		giaMua,
            		giaBanSi,
            		giaBanLe,});
        }
        
        jScrollPane2.setViewportView(jTable2);
    }
    
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
            java.util.logging.Logger.getLogger(TonKhoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TonKhoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TonKhoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TonKhoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new TonKhoUI().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}