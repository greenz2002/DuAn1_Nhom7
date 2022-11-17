/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author natsu
 */
public class ViewQuanLy extends javax.swing.JFrame {

    /**
     * Creates new form viewQuanLy
     */
    public ViewQuanLy() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bttSP = new javax.swing.JButton();
        bttNV = new javax.swing.JButton();
        bttHoaDon = new javax.swing.JButton();
        bttLichSu = new javax.swing.JButton();
        bttTaiKhoan = new javax.swing.JButton();
        bttDangXuat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlSP = new javax.swing.JPanel();
        pnlNV = new javax.swing.JPanel();
        pnlHoaDon = new javax.swing.JPanel();
        pnlLichSu = new javax.swing.JPanel();
        pnlTaiKhoan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttSP.setText("San pham");
        bttSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSPActionPerformed(evt);
            }
        });
        jPanel1.add(bttSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        bttNV.setText("Nhan vien");
        bttNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNVActionPerformed(evt);
            }
        });
        jPanel1.add(bttNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        bttHoaDon.setText("Hoa don");
        bttHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttHoaDonActionPerformed(evt);
            }
        });
        jPanel1.add(bttHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, -1));

        bttLichSu.setText("Lich su");
        bttLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLichSuActionPerformed(evt);
            }
        });
        jPanel1.add(bttLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, -1));

        bttTaiKhoan.setText("Tai khoan");
        bttTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTaiKhoanActionPerformed(evt);
            }
        });
        jPanel1.add(bttTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, -1));

        bttDangXuat.setText("Dang xuat");
        jPanel1.add(bttDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 90, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        pnlSP.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout pnlSPLayout = new javax.swing.GroupLayout(pnlSP);
        pnlSP.setLayout(pnlSPLayout);
        pnlSPLayout.setHorizontalGroup(
            pnlSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        pnlSPLayout.setVerticalGroup(
            pnlSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jPanel2.add(pnlSP, "card2");

        pnlNV.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pnlNVLayout = new javax.swing.GroupLayout(pnlNV);
        pnlNV.setLayout(pnlNVLayout);
        pnlNVLayout.setHorizontalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        pnlNVLayout.setVerticalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jPanel2.add(pnlNV, "card3");

        pnlHoaDon.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jPanel2.add(pnlHoaDon, "card4");

        pnlLichSu.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlLichSuLayout = new javax.swing.GroupLayout(pnlLichSu);
        pnlLichSu.setLayout(pnlLichSuLayout);
        pnlLichSuLayout.setHorizontalGroup(
            pnlLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        pnlLichSuLayout.setVerticalGroup(
            pnlLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jPanel2.add(pnlLichSu, "card5");

        pnlTaiKhoan.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlTaiKhoanLayout = new javax.swing.GroupLayout(pnlTaiKhoan);
        pnlTaiKhoan.setLayout(pnlTaiKhoanLayout);
        pnlTaiKhoanLayout.setHorizontalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        pnlTaiKhoanLayout.setVerticalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jPanel2.add(pnlTaiKhoan, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSPActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(true);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttSPActionPerformed

    private void bttNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNVActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(true);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttNVActionPerformed

    private void bttHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttHoaDonActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(true);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttHoaDonActionPerformed

    private void bttLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLichSuActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(true);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttLichSuActionPerformed

    private void bttTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTaiKhoanActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(true);
    }//GEN-LAST:event_bttTaiKhoanActionPerformed

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
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDangXuat;
    private javax.swing.JButton bttHoaDon;
    private javax.swing.JButton bttLichSu;
    private javax.swing.JButton bttNV;
    private javax.swing.JButton bttSP;
    private javax.swing.JButton bttTaiKhoan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlLichSu;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlSP;
    private javax.swing.JPanel pnlTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
