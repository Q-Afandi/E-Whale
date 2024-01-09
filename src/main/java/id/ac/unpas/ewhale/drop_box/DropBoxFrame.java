/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.ewhale.drop_box;

/**
 *
 * @author ACER
 */
import id.ac.unpas.ewhale.approval_kurir.Kurir;
import id.ac.unpas.ewhale.approval_kurir.KurirFrame;
import id.ac.unpas.ewhale.approval_masyarakat.Masyarakat;
import id.ac.unpas.ewhale.approval_masyarakat.MasyarakatFrame;
import id.ac.unpas.ewhale.dao.JenisKatDao;
import id.ac.unpas.ewhale.dao.KonversiPoinDao;
import id.ac.unpas.ewhale.dao.KurirDao;
import id.ac.unpas.ewhale.dao.MasyarakatDao;
import id.ac.unpas.ewhale.dao.DropBoxDao;
import id.ac.unpas.ewhale.db.MySqlConnection;
import id.ac.unpas.ewhale.jenis_kategori.JenisKat;
import id.ac.unpas.ewhale.jenis_kategori.JenisKatFrame;
import id.ac.unpas.ewhale.konversi_poin.KonversiPoin;
import id.ac.unpas.ewhale.konversi_poin.KonversiPoinFrame;
import id.ac.unpas.ewhale.konversi_poin.KonversiPoinModelTable;
import id.ac.unpas.ewhale.main.TambahJenisKat;
import id.ac.unpas.ewhale.main.TambahKonversiPoin;
import id.ac.unpas.ewhale.main.TambahKurir;
import id.ac.unpas.ewhale.main.TambahMasyarakat;
import id.ac.unpas.ewhale.drop_box.DropBox;
import id.ac.unpas.ewhale.drop_box.DropBoxFrame;
import id.ac.unpas.ewhale.drop_box.DropBoxModelTable;
import id.ac.unpas.ewhale.main.TambahDropBox;
import id.ac.unpas.ewhale.main.UbahDropBox;
import java.util.List;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;




public class DropBoxFrame extends javax.swing.JFrame {

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
    private TambahKonversiPoin  tambahKonversiPoin;
    private List<KonversiPoin> poinList;
    private KonversiPoinFrame konversiPoinFrame;
    private KonversiPoinDao konversiPoinDao;
    private DropBoxModelTable modelTable;
    private DropBoxDao dropBoxDao;
    private List<DropBox> dropBoxList;
    private TambahDropBox tambahDropBox;
    private DropBoxFrame dropBoxFrame;
    private UbahDropBox ubahDropBox;
    
    
    public DropBoxFrame(DropBoxDao dropBoxDao) {
        this.dropBoxDao = dropBoxDao;
        this.dropBoxList = this.dropBoxDao.findAll();
        this.modelTable = new DropBoxModelTable(dropBoxList);
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void setModelTable(DropBoxModelTable dropboxmodelTable) {
        // Set this.id dengan parameter id
        this.modelTable = modelTable;
    }

        public DropBoxModelTable getModelTable() {
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
        tambahDropBoxButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDropBox = new javax.swing.JTable();
        hapusDropBox = new javax.swing.JButton();
        ubahDropBoxButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        previewButton = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
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

        tambahDropBoxButton.setBackground(new java.awt.Color(51, 102, 0));
        tambahDropBoxButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tambahDropBoxButton.setForeground(new java.awt.Color(255, 255, 255));
        tambahDropBoxButton.setText("Tambah Data");
        tambahDropBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahDropBoxButtonActionPerformed(evt);
            }
        });

        tableDropBox.setModel(modelTable);
        jScrollPane1.setViewportView(tableDropBox);

        hapusDropBox.setBackground(new java.awt.Color(255, 0, 0));
        hapusDropBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hapusDropBox.setForeground(new java.awt.Color(255, 255, 255));
        hapusDropBox.setText("Hapus Data");
        hapusDropBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDropBoxActionPerformed(evt);
            }
        });

        ubahDropBoxButton.setBackground(new java.awt.Color(255, 255, 0));
        ubahDropBoxButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ubahDropBoxButton.setForeground(new java.awt.Color(255, 255, 255));
        ubahDropBoxButton.setText("Edit Data");
        ubahDropBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahDropBoxButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print Data");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        previewButton.setText("Preview");
        previewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewButtonActionPerformed(evt);
            }
        });

        ExportButton.setText("Export to PDF");
        ExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportButtonActionPerformed(evt);
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
                        .addComponent(tambahDropBoxButton)
                        .addGap(18, 18, 18)
                        .addComponent(ubahDropBoxButton)
                        .addGap(18, 18, 18)
                        .addComponent(hapusDropBox)
                        .addGap(18, 18, 18)
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(previewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExportButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahDropBoxButton)
                    .addComponent(hapusDropBox)
                    .addComponent(ubahDropBoxButton)
                    .addComponent(printButton)
                    .addComponent(previewButton)
                    .addComponent(ExportButton))
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
        konversiPoinDao = new KonversiPoinDao();
        konversiPoinFrame = new KonversiPoinFrame(konversiPoinDao);
        konversiPoinFrame.setVisible(true);
    }//GEN-LAST:event_konversiButtonActionPerformed

    private void dropboxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxButtonActionPerformed
         dropBoxDao = new DropBoxDao();
        dropBoxFrame = new DropBoxFrame(dropBoxDao);
        dropBoxFrame.setVisible(true);
    }//GEN-LAST:event_dropboxButtonActionPerformed
       
    private void tambahDropBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahDropBoxButtonActionPerformed
        // TODO add your handling code here:
        tambahDropBox = new TambahDropBox();
        tambahDropBox.setVisible(true);
    }//GEN-LAST:event_tambahDropBoxButtonActionPerformed

    private void hapusDropBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDropBoxActionPerformed
        // TODO add your handling code here:
        int row = this.tableDropBox.getSelectedRow();
        int column = this.tableDropBox.getSelectedColumn();

        if (row == -1 || column == -1) {
            return;
        } else {
            String newValue = (String) this.tableDropBox.getModel().getValueAt(row, column);

            DropBox id = new DropBox();

            String col = "";

            switch (column) {
                case 0:
                col = "namaMasyarakat";
                break;
                case 1:
                col = "alamatMasyarakat";
                break;
                case 2:
                col = "jenisSampah";
                break;
                case 3:
                col = "kategoriSampah";
                break;
                case 4:
                col = "poinSampah";
                break;
                default:
                System.out.println("Kolom tidak ditemukan");
                break;
            }
            id = this.dropBoxDao.select(col, newValue);

            this.delete(id);
            this.dropBoxDao.delete(id);
        }
    }//GEN-LAST:event_hapusDropBoxActionPerformed
public void delete(DropBox dropBox) {
                   // Tambahkan permintaan ke tableModel
        modelTable.delete(dropBox);
    }
    private void ubahDropBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahDropBoxButtonActionPerformed
        int row = this.tableDropBox.getSelectedRow();
        int column = this.tableDropBox.getSelectedColumn();
        
        if (row == -1 || column == -1) {
            return;
        } else {
            String newValue = (String) this.tableDropBox.getModel().getValueAt(row, column);

            DropBox id = new DropBox();

            String col = "";

            switch (column) {
            case 0:
                col = "namaMasyarakat";
                break;
            case 1:
                col = "alamatMasyarakat";
                break;
            case 2 :
                col = "jenisSampah";
                break;
            case 3 :
                col = "kategoriSampah";
                break;
            case 4 :
                 col = "poinSampah";
                break;
                default:
                System.out.println("Kolom tidak ditemukan");
                break;
            }
            id = this.dropBoxDao.select(col, newValue);

//            this.update(id);
//            this.jenisKatDao.update(id);
                ubahDropBox = new UbahDropBox(id);
                ubahDropBox.setVisible(true);
        }
    }//GEN-LAST:event_ubahDropBoxButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
       try {
            // Mendapatkan path direktori laporan
            String reportPath = System.getProperty("user.dir") + File.separator + "report";
            
             // Mendapatkan path lengkap untuk file laporan (MemberReport.jrxml)
            String path = System.getProperty("user.dir") + File.separator + "report" + File.separator + "DropBoxReport.jrxml";
            
            // Mengompilasi file laporan menjadi objek JasperReport
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
                
             // Membuat objek parameter untuk laporan
            Map<String, Object> parameters = new HashMap<>();
            
            // Mengisi laporan menggunakan data dari koneksi database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySqlConnection.getInstance().getConnection());
            
            // Mencetak laporan ke printer
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException e) {
            // Menangani exception dengan mencetak stack trace
            e.printStackTrace();
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void previewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewButtonActionPerformed
       try {
            // Mendapatkan path direktori laporan
            String reportPath = System.getProperty("user.dir") + File.separator + "report";
            
            // Mendapatkan path lengkap untuk file laporan (MemberReport.jrxml)
            String path = System.getProperty("user.dir") + File.separator + "report" + File.separator + "DropBoxReport.jrxml";
            
            // Mengompilasi file laporan menjadi objek JasperReport
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
            
            // Membuat objek parameter untuk laporan
            Map<String, Object> parameters = new HashMap<>();
            
            // Mengisi laporan menggunakan data dari koneksi database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySqlConnection.getInstance().getConnection());
            
            // Menampilkan laporan dalam jendela pratinjau
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException e) {
            // Menangani exception dengan mencetak stack trace
            e.printStackTrace();
        }
    }//GEN-LAST:event_previewButtonActionPerformed

    private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
         try {
              // Mendapatkan path direktori laporan
            String reportPath = System.getProperty("user.dir") + File.separator + "report";
            
            // Mendapatkan path lengkap untuk file laporan (MemberReport.jrxml)
            String path = System.getProperty("user.dir") + File.separator + "report" + File.separator + "DropBoxReport.jrxml";
            
             // Mengompilasi file laporan menjadi objek JasperReport
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
                
            // Membuat objek parameter untuk laporan
            Map<String, Object> parameters = new HashMap<>();
            
             // Mengisi laporan menggunakan data dari koneksi database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySqlConnection.getInstance().getConnection());
            
            // Membuat direktori jika belum ada
            File outDir = new File(reportPath);
            outDir.mkdirs();
            // Mengekspor laporan ke file PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath + File.separator + "DropBoxReport.pdf");
            // Menampilkan pesan dialog bahwa proses ekspor selesai
            JOptionPane.showMessageDialog(this, "Export selesai");
            
        } catch (JRException e) {
            // Menangani exception dengan mencetak stack trace
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_ExportButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportButton;
    private javax.swing.JLabel approvalregistrasi;
    private javax.swing.JLabel datamaster;
    private javax.swing.JButton dropboxButton;
    private javax.swing.JButton hapusDropBox;
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
    private javax.swing.JButton previewButton;
    private javax.swing.JButton printButton;
    private javax.swing.JTable tableDropBox;
    private javax.swing.JButton tambahDropBoxButton;
    private javax.swing.JButton ubahDropBoxButton;
    // End of variables declaration//GEN-END:variables
}
