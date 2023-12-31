/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.ewhale.jenis_kategori;

import id.ac.unpas.ewhale.approval_kurir.Kurir;
import id.ac.unpas.ewhale.approval_kurir.KurirFrame;
import id.ac.unpas.ewhale.approval_masyarakat.Masyarakat;
import id.ac.unpas.ewhale.approval_masyarakat.MasyarakatFrame;
import id.ac.unpas.ewhale.dao.JenisKatDao;
import id.ac.unpas.ewhale.dao.KurirDao;
import id.ac.unpas.ewhale.dao.MasyarakatDao;
import id.ac.unpas.ewhale.jenis_kategori.JenisKat;
import id.ac.unpas.ewhale.jenis_kategori.JenisKatFrame;
import id.ac.unpas.ewhale.jenis_kategori.JenisKatModelTable;
import id.ac.unpas.ewhale.main.UbahJenisKat;
import id.ac.unpas.ewhale.main.TambahJenisKat;
import id.ac.unpas.ewhale.main.TambahKurir;
import id.ac.unpas.ewhale.main.TambahMasyarakat;

import java.util.List;
/**
 *
 * @author ACER
 */
public class JenisKatFrame extends javax.swing.JFrame {
    private MasyarakatDao masyarakatDao;
    private MasyarakatFrame masyarakatFrame;
    private List<Masyarakat> masyarakatList;
    private TambahMasyarakat tambahMasyarakat;
//    private KurirModelTable modelTable;
    private KurirDao kurirDao;
    private KurirFrame kurirFrame;
    private List<Kurir> kurirList;
    private TambahKurir tambahKurir;
    private TambahJenisKat tambahJenisKat;
    private List<JenisKat> jeniskatList;
    private JenisKatFrame jenisKatFrame;
    private JenisKatDao jenisKatDao;
    private JenisKatModelTable modelTable;
    private UbahJenisKat ubahJenisKat;
    
    /**
     * Creates new form JenisKatFrame
     */
    public JenisKatFrame(JenisKatDao jenisKatDao) {
        this.jenisKatDao = jenisKatDao;
        this.jeniskatList = this.jenisKatDao.findAll();
        this.modelTable = new JenisKatModelTable(jeniskatList);
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    public void setModelTable(JenisKatModelTable jeniskatmodelTable) {
        // Set this.id dengan parameter id
        this.modelTable = modelTable;
    }
    
    // Dapatkan nilai dari ids
    public JenisKatModelTable getModelTable() {
        // Kembalikan nilai dari this.id
        return this.modelTable;
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        approvalregistrasi = new javax.swing.JLabel();
        datamaster = new javax.swing.JLabel();
        iconMasyarakat = new javax.swing.JLabel();
        masyarakatButton = new javax.swing.JButton();
        iconKurir = new javax.swing.JLabel();
        kurirButton = new javax.swing.JButton();
        iconJeniskat = new javax.swing.JLabel();
        jeniskatButton = new javax.swing.JButton();
        iconKonversi = new javax.swing.JLabel();
        konversiButton = new javax.swing.JButton();
        iconDropbox = new javax.swing.JLabel();
        dropboxButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tambahJenisKatButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJenisKat = new javax.swing.JTable();
        hapusJenisKatButton = new javax.swing.JButton();
        ubahJenisKatButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(37, 43, 59));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        approvalregistrasi.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        approvalregistrasi.setForeground(new java.awt.Color(204, 204, 204));
        approvalregistrasi.setText("APPROVAL REGISTRASI");

        datamaster.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        datamaster.setForeground(new java.awt.Color(204, 204, 204));
        datamaster.setText("DATAMASTER");

        masyarakatButton.setBackground(new java.awt.Color(37, 43, 59));
        masyarakatButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        masyarakatButton.setForeground(new java.awt.Color(255, 255, 255));
        masyarakatButton.setText("Approval Masyarakat");
        masyarakatButton.setBorderPainted(false);
        masyarakatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masyarakatButtonActionPerformed(evt);
            }
        });

        kurirButton.setBackground(new java.awt.Color(37, 43, 59));
        kurirButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kurirButton.setForeground(new java.awt.Color(255, 255, 255));
        kurirButton.setText("Approval Kurir");
        kurirButton.setBorderPainted(false);
        kurirButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kurirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurirButtonActionPerformed(evt);
            }
        });

        jeniskatButton.setBackground(new java.awt.Color(37, 43, 59));
        jeniskatButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jeniskatButton.setForeground(new java.awt.Color(255, 255, 255));
        jeniskatButton.setText("Jenis dan Kategori");
        jeniskatButton.setBorderPainted(false);
        jeniskatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniskatButtonActionPerformed(evt);
            }
        });

        konversiButton.setBackground(new java.awt.Color(37, 43, 59));
        konversiButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        konversiButton.setForeground(new java.awt.Color(255, 255, 255));
        konversiButton.setText("Konversi Poin");
        konversiButton.setBorderPainted(false);
        konversiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiButtonActionPerformed(evt);
            }
        });

        dropboxButton.setBackground(new java.awt.Color(37, 43, 59));
        dropboxButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dropboxButton.setForeground(new java.awt.Color(255, 255, 255));
        dropboxButton.setText("Drop Box");
        dropboxButton.setBorderPainted(false);
        dropboxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(approvalregistrasi))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(datamaster))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kurirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconMasyarakat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masyarakatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(iconJeniskat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jeniskatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconDropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropboxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(konversiButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(approvalregistrasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconMasyarakat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masyarakatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(datamaster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconJeniskat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jeniskatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(iconKonversi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(konversiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconDropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropboxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 209, 550));

        jPanel3.setOpaque(false);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        tambahJenisKatButton.setBackground(new java.awt.Color(51, 102, 0));
        tambahJenisKatButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tambahJenisKatButton.setText("Tambah Data");
        tambahJenisKatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahJenisKatButtonActionPerformed(evt);
            }
        });

        tableJenisKat.setModel(modelTable);
        jScrollPane1.setViewportView(tableJenisKat);

        hapusJenisKatButton.setBackground(new java.awt.Color(255, 0, 0));
        hapusJenisKatButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hapusJenisKatButton.setText("Hapus Data");
        hapusJenisKatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusJenisKatButtonActionPerformed(evt);
            }
        });

        ubahJenisKatButton.setBackground(new java.awt.Color(255, 255, 0));
        ubahJenisKatButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ubahJenisKatButton.setText("Edit Data");
        ubahJenisKatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahJenisKatButtonActionPerformed(evt);
            }
        });

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
                        .addComponent(tambahJenisKatButton)
                        .addGap(18, 18, 18)
                        .addComponent(ubahJenisKatButton)
                        .addGap(18, 18, 18)
                        .addComponent(hapusJenisKatButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahJenisKatButton)
                    .addComponent(hapusJenisKatButton)
                    .addComponent(ubahJenisKatButton))
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
//    Sidebar
    private void masyarakatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masyarakatButtonActionPerformed
        // TODO add your handling code here:
        masyarakatDao = new MasyarakatDao();
        masyarakatFrame = new MasyarakatFrame(masyarakatDao);
        masyarakatFrame.setVisible(true);
    }//GEN-LAST:event_masyarakatButtonActionPerformed

    private void kurirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurirButtonActionPerformed
        // TODO add your handling code here:
        kurirDao = new KurirDao();
        kurirFrame = new KurirFrame(kurirDao);
        kurirFrame.setVisible(true);
    }//GEN-LAST:event_kurirButtonActionPerformed

    private void jeniskatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniskatButtonActionPerformed
        // TODO add your handling code here:
        jenisKatDao = new JenisKatDao();
        jenisKatFrame = new JenisKatFrame(jenisKatDao);
        jenisKatFrame.setVisible(true);
    }//GEN-LAST:event_jeniskatButtonActionPerformed

    private void konversiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konversiButtonActionPerformed

    private void dropboxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropboxButtonActionPerformed

    private void tambahJenisKatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahJenisKatButtonActionPerformed
        // TODO add your handling code here:
        tambahJenisKat = new TambahJenisKat();
        tambahJenisKat.setVisible(true);
    }//GEN-LAST:event_tambahJenisKatButtonActionPerformed

    public void delete(JenisKat jeniskat) {
        // Tambahkan permintaan ke tableModel
        modelTable.delete(jeniskat);
    }
    
    private void hapusJenisKatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusJenisKatButtonActionPerformed
        // TODO add your handling code here:
        int row = this.tableJenisKat.getSelectedRow();
        int column = this.tableJenisKat.getSelectedColumn();

        if (row == -1 || column == -1) {
            return;
        } else {
            String newValue = (String) this.tableJenisKat.getModel().getValueAt(row, column);

            JenisKat id = new JenisKat();

            String col = "";

            switch (column) {
                case 0:
                col = "jenisSampah";
                break;
                case 1:
                col = "kategoriSampah";
                break;
                default:
                System.out.println("Kolom tidak ditemukan");
                break;
            }
            id = this.jenisKatDao.select(col, newValue);

            this.delete(id);
            this.jenisKatDao.delete(id);
        }
    }//GEN-LAST:event_hapusJenisKatButtonActionPerformed

    
    
    private void ubahJenisKatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahJenisKatButtonActionPerformed
        // TODO add your handling code here:
        int row = this.tableJenisKat.getSelectedRow();
        int column = this.tableJenisKat.getSelectedColumn();
        
        if (row == -1 || column == -1) {
            return;
        } else {
            String newValue = (String) this.tableJenisKat.getModel().getValueAt(row, column);

            JenisKat id = new JenisKat();

            String col = "";

            switch (column) {
                case 0:
                col = "jenisSampah";
                break;
                case 1:
                col = "kategoriSampah";
                break;
                default:
                System.out.println("Kolom tidak ditemukan");
                break;
            }
            id = this.jenisKatDao.select(col, newValue);

//            this.update(id);
//            this.jenisKatDao.update(id);
                ubahJenisKat = new UbahJenisKat(id);
                ubahJenisKat.setVisible(true);
        }
    }//GEN-LAST:event_ubahJenisKatButtonActionPerformed


 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approvalregistrasi;
    private javax.swing.JLabel datamaster;
    private javax.swing.JButton dropboxButton;
    private javax.swing.JButton hapusJenisKatButton;
    private javax.swing.JLabel iconDropbox;
    private javax.swing.JLabel iconJeniskat;
    private javax.swing.JLabel iconKonversi;
    private javax.swing.JLabel iconKurir;
    private javax.swing.JLabel iconMasyarakat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jeniskatButton;
    private javax.swing.JButton konversiButton;
    private javax.swing.JButton kurirButton;
    private javax.swing.JButton masyarakatButton;
    private javax.swing.JTable tableJenisKat;
    private javax.swing.JButton tambahJenisKatButton;
    private javax.swing.JButton ubahJenisKatButton;
    // End of variables declaration//GEN-END:variables
}
