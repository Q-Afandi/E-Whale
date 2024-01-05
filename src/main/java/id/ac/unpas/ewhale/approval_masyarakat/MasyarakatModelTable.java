/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.approval_masyarakat;

import java.util.List;
import javax.swing.table.*;
/**
 *
 * @author ACER
 */
public class MasyarakatModelTable extends AbstractTableModel {
        // Array columnNames untuk menyimpan nama-nama kolom
    private String[] columnNames = {"Nama", "No Telepon", "Alamat", "Action" };
    // Membuat List dengan nama data yang berisi Biodata untuk menyimpan data dari input
    private List<Masyarakat> data;

    // Constructor ModelTable dengan parameter List<Biodata> data
    public MasyarakatModelTable(List<Masyarakat> data) {
        // Set this.data dengan parameter data
        this.data = data;
    }

    // Fungsi untuk menambah jumlah kolom
    public int getColumnCount() {
        // Kembalikan panjang/ukuran dari array columnNames
        return columnNames.length;
    }

    // Fungsi untuk menambah jumlah baris
    public int getRowCount() {
        // Kembalikan jumlah data yang diterima/panjang dari ArrayList data
        return data.size();
    }

    // Fungsi untuk mendapatkan nama dari kolom yang dipilih dari parameter
    public String getColumnName(int col) {
        // Kembalikan elemen columnNames dengan index col
        return columnNames[col];
    }

    // Fungsi untuk mendapatkan nilai dari baris dan kolom tertentu
    public Object getValueAt(int row, int col) {
        // Menyimpan elemen dari List data dari baris yang dipilih ke Biodata rowItem
        Masyarakat rowItem = data.get(row);
        // Membuat variable value untuk menyimpan nilai dari kolom yang dipilih
        String value = "";

        // Switch case untuk menentukan nilai dari variable value
        switch (col) {
 
            // Jika col bernilai 0
            case 0:
                // Set value dengan nama dari rowItem
                value = rowItem.getNamaMasyarakat();
                break;
            // Jika col bernilai 1
            case 1:
                // Set value dengan noTelepon dari rowItem
                value = rowItem.getNoTeleponMasyarakat();
                break;
            // Jika col bernilai 2
            case 2:
                // Set value dengan alamat dari rowItem
                value = rowItem.getAlamatMasyarakat();
                break;
        }

        // Kembalikan nilai dari variable value
        return value;
    }

    // Fungsi untuk mengatur apakah cell bisa diedit atau tidak
    public boolean isCellEditable(int row, int col) {
        // Kembalikan nilai false
        return false;
    }

    // Method untuk menambah nilai ke table
    public void add(Masyarakat value) {
        // Menambahkan input user ke List data
        data.add(value);
        // Menambahkan elemen-elemen List data ke table
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    // Method untuk mengubah nilai di table
    public void update(Masyarakat value) {
        // Membuat variable i untuk menyimpan index dari data
        int i = 0;

        // Looping untuk mencari index dari data yang ingin diubah
        for (Masyarakat b : data) {
            // Jika id dari data sama dengan id dari value
            if (b.getIdMasyarakat().equals(value.getIdMasyarakat())) {
                // Biodata tersebut menjadi value
                b = value;
                // Set List data ke-i dengan value
                data.set(i, value);
                // Mengubah nilai di table
                fireTableCellUpdated(data.size() - 1,
                        data.size() - 1);
            }
            // Increment i
            i++;
        }
    }

    // Method untuk menghapus nilai di table
    public void delete(Masyarakat value) {
        // Membuat variable i untuk menyimpan index dari data
        int i = 0;

        // Looping untuk mencari index dari data yang ingin dihapus
        for (Masyarakat b : data) {
            // Jika id dari data sama dengan id dari value
            if (b.getIdMasyarakat().equals(value.getIdMasyarakat())) {
                // Hapus data dari List data
                data.remove(i);
                // Hentikan looping
                break;
            }
            // Increment i
            i++;
        }
        
        // Menghapus nilai di table
        fireTableRowsDeleted(data.size() - 1,
                data.size() - 1);
    }
}