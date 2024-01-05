/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.ewhale.approval_masyarakat;

import id.ac.unpas.ewhale.dao.MasyarakatDao;
import id.ac.unpas.ewhale.main.TambahMasyarakat;
import java.util.List;

/**
 *
 * @author ACER
 */
public class MasyarakatFrame extends javax.swing.JFrame {
    private MasyarakatModelTable modelTable;
    private MasyarakatDao masyarakatDao;
    private MasyarakatFrame masyarakatFrame;
    private List<Masyarakat> masyarakatList;
    private TambahMasyarakat tambahMasyarakat;

    /**
     * Creates new form MasyarakatFrame
     */
    public MasyarakatFrame(MasyarakatDao masyarakatDao) {
        this.masyarakatDao = masyarakatDao;
        this.masyarakatList = this.masyarakatDao.findAll();
        this.modelTable = new MasyarakatModelTable(masyarakatList);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        approvalregistrasi1 = new javax.swing.JLabel();
        datamaster1 = new javax.swing.JLabel();
        iconMasyarakat1 = new javax.swing.JLabel();
        masyarakatButton1 = new javax.swing.JButton();
        iconKurir1 = new javax.swing.JLabel();
        kurirButton1 = new javax.swing.JButton();
        iconJeniskat1 = new javax.swing.JLabel();
        jeniskatButton1 = new javax.swing.JButton();
        iconKonversi1 = new javax.swing.JLabel();
        iconDropbox1 = new javax.swing.JLabel();
        konversiButton1 = new javax.swing.JButton();
        dropboxButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tambahmasyarakatButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(37, 43, 59));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

        approvalregistrasi1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        approvalregistrasi1.setForeground(new java.awt.Color(204, 204, 204));
        approvalregistrasi1.setText("APPROVAL REGISTRASI");

        datamaster1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        datamaster1.setForeground(new java.awt.Color(204, 204, 204));
        datamaster1.setText("DATAMASTER");

        iconMasyarakat1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\EWhale\\src\\main\\java\\id\\ac\\unpas\\ewhale\\main\\resources\\approval_masyarakat.png")); // NOI18N

        masyarakatButton1.setBackground(new java.awt.Color(37, 43, 59));
        masyarakatButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        masyarakatButton1.setForeground(new java.awt.Color(255, 255, 255));
        masyarakatButton1.setText("Approval Masyarakat");
        masyarakatButton1.setBorderPainted(false);
        masyarakatButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masyarakatButton1ActionPerformed(evt);
            }
        });

        iconKurir1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\EWhale\\src\\main\\java\\id\\ac\\unpas\\ewhale\\main\\resources\\approval-kurir.png")); // NOI18N

        kurirButton1.setBackground(new java.awt.Color(37, 43, 59));
        kurirButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kurirButton1.setForeground(new java.awt.Color(255, 255, 255));
        kurirButton1.setText("Approval Kurir");
        kurirButton1.setBorderPainted(false);
        kurirButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kurirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurirButton1ActionPerformed(evt);
            }
        });

        iconJeniskat1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\EWhale\\src\\main\\java\\id\\ac\\unpas\\ewhale\\main\\resources\\jenis-dan-kategori.png")); // NOI18N

        jeniskatButton1.setBackground(new java.awt.Color(37, 43, 59));
        jeniskatButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jeniskatButton1.setForeground(new java.awt.Color(255, 255, 255));
        jeniskatButton1.setText("Jenis dan Kategori");
        jeniskatButton1.setBorderPainted(false);
        jeniskatButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniskatButton1ActionPerformed(evt);
            }
        });

        iconKonversi1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\EWhale\\src\\main\\java\\id\\ac\\unpas\\ewhale\\main\\resources\\konversi-poin.png")); // NOI18N

        iconDropbox1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\EWhale\\src\\main\\java\\id\\ac\\unpas\\ewhale\\main\\resources\\drop-box.png")); // NOI18N

        konversiButton1.setBackground(new java.awt.Color(37, 43, 59));
        konversiButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        konversiButton1.setForeground(new java.awt.Color(255, 255, 255));
        konversiButton1.setText("Konvensi Poin");
        konversiButton1.setBorderPainted(false);
        konversiButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiButton1ActionPerformed(evt);
            }
        });

        dropboxButton1.setBackground(new java.awt.Color(37, 43, 59));
        dropboxButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dropboxButton1.setForeground(new java.awt.Color(255, 255, 255));
        dropboxButton1.setText("Drop Box");
        dropboxButton1.setBorderPainted(false);
        dropboxButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(approvalregistrasi1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconKurir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kurirButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconMasyarakat1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masyarakatButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(datamaster1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconJeniskat1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jeniskatButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iconKonversi1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iconDropbox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(konversiButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dropboxButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(approvalregistrasi1)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconMasyarakat1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(masyarakatButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconKurir1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kurirButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datamaster1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jeniskatButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconJeniskat1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(konversiButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropboxButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(iconKonversi1)
                        .addGap(18, 18, 18)
                        .addComponent(iconDropbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 209, 550));

        jPanel3.setOpaque(false);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        tambahmasyarakatButton.setBackground(new java.awt.Color(51, 102, 0));
        tambahmasyarakatButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tambahmasyarakatButton.setForeground(new java.awt.Color(255, 255, 255));
        tambahmasyarakatButton.setText("Tambah Data");
        tambahmasyarakatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahmasyarakatButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(modelTable);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tambahmasyarakatButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(tambahmasyarakatButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 790, 552));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\EWhale\\src\\main\\java\\id\\ac\\unpas\\ewhale\\main\\resources\\Tampilan Dashboard.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 625));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setModelTable(MasyarakatModelTable modelTable) {
        // Set this.id dengan parameter id
        this.modelTable = modelTable;
    }
    
    // Dapatkan nilai dari id
    public MasyarakatModelTable getModelTable() {
        // Kembalikan nilai dari this.id
        return this.modelTable;
    }  
    
    private void tambahmasyarakatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahmasyarakatButtonActionPerformed
        // TODO add your handling code here:
        tambahMasyarakat = new TambahMasyarakat();
        tambahMasyarakat.setVisible(true);
    }//GEN-LAST:event_tambahmasyarakatButtonActionPerformed

    private void masyarakatButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masyarakatButton1ActionPerformed
        // TODO add your handling code here:
        masyarakatDao = new MasyarakatDao();
        masyarakatFrame = new MasyarakatFrame(masyarakatDao);
        masyarakatFrame.setVisible(true);
    }//GEN-LAST:event_masyarakatButton1ActionPerformed

    private void kurirButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurirButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kurirButton1ActionPerformed

    private void jeniskatButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniskatButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeniskatButton1ActionPerformed

    private void konversiButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konversiButton1ActionPerformed

    private void dropboxButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropboxButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approvalregistrasi1;
    private javax.swing.JLabel datamaster1;
    private javax.swing.JButton dropboxButton1;
    private javax.swing.JLabel iconDropbox1;
    private javax.swing.JLabel iconJeniskat1;
    private javax.swing.JLabel iconKonversi1;
    private javax.swing.JLabel iconKurir1;
    private javax.swing.JLabel iconMasyarakat1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jeniskatButton1;
    private javax.swing.JButton konversiButton1;
    private javax.swing.JButton kurirButton1;
    private javax.swing.JButton masyarakatButton1;
    private javax.swing.JButton tambahmasyarakatButton;
    // End of variables declaration//GEN-END:variables
}
