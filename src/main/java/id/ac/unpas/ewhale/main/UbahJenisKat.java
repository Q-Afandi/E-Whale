/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.ewhale.main;

import id.ac.unpas.ewhale.jenis_kategori.JenisKat;
import id.ac.unpas.ewhale.jenis_kategori.JenisKatFrame;
import id.ac.unpas.ewhale.jenis_kategori.JenisKatModelTable;
import id.ac.unpas.ewhale.dao.JenisKatDao;
import java.util.List;

/**
 *
 * @author Afandi
 */
public class UbahJenisKat extends javax.swing.JFrame {

    /**
     * Creates new form UbahJenisKat
     */
    
    private JenisKatModelTable modelTable;
    private JenisKatDao jeniskatDao;
    private JenisKatFrame jeniskatFrame;
    private List<JenisKat> jeniskatList;
    private JenisKat jenisKat;
    
    public UbahJenisKat(JenisKat jenisKat) {
        initComponents();
        this.jenisKat = jenisKat;
        this.jenisTextField.setText(this.jenisKat.getjenisSampah());
        this.kategoriTextField.setText(this.jenisKat.getkategoriSampah());
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }

    public void updateData(JenisKat jenisKat) {
        this.jeniskatDao = new JenisKatDao();
        jeniskatFrame = new JenisKatFrame(jeniskatDao);
        this.jeniskatList = this.jeniskatDao.findAll();
        JenisKatModelTable jeniskatModelTable = new JenisKatModelTable(jeniskatList);
        jeniskatFrame.setModelTable(jeniskatModelTable);
        jenisTextField.setText("");
        kategoriTextField.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jenisTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kategoriTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submitJenisKatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ubah Data Jenis & Kategori Sampah");

        jenisTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Jenis");

        kategoriTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Kategori");

        submitJenisKatButton.setBackground(new java.awt.Color(0, 153, 0));
        submitJenisKatButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitJenisKatButton.setForeground(new java.awt.Color(0, 0, 0));
        submitJenisKatButton.setText("Submit");
        submitJenisKatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJenisKatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kategoriTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(jenisTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(submitJenisKatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategoriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addComponent(submitJenisKatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jenisTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jenisTextFieldActionPerformed

    private void kategoriTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kategoriTextFieldActionPerformed

    private void submitJenisKatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJenisKatButtonActionPerformed
        // TODO add your handling code here:
        this.jeniskatDao = new JenisKatDao();
        String jenisSampah = this.jenisTextField.getText();
        String kategoriSampah = this.kategoriTextField.getText();
 
        JenisKat jenisKat = new JenisKat();
        jenisKat.setidSampah(this.jenisKat.getidSampah());
        jenisKat.setjenisSampah(jenisSampah);
        jenisKat.setkategoriSampah(kategoriSampah);

        
        this.jeniskatDao.update(jenisKat);
        this.updateData(jenisKat);
    }//GEN-LAST:event_submitJenisKatButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jenisTextField;
    private javax.swing.JTextField kategoriTextField;
    private javax.swing.JButton submitJenisKatButton;
    // End of variables declaration//GEN-END:variables
}
