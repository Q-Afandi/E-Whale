/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.drop_box;

/**
 *
 * @author ACER
 */
public class DropBox {
    private String idDropBox; // Variable id untuk menyimpan nilai id
    private String jenisSampah; // Variable nama untuk menyimpan nilai nama
    private String kategoriSampah; // Variable noTelepon untuk menyimpan nilai noTelepon
    private String poinSampah;
    private String namaMasyarakat;
    private String alamatMasyarakat;
    
    public void setidDropBox(String id) {
        // Set this.id dengan parameter id
        this.idDropBox = id;
    }
    
    // Dapatkan nilai dari id
    public String getidDropBox() {
        // Kembalikan nilai dari this.id
        return this.idDropBox;
    } 
    
    // Set nilai dari nama dengan parameter nama
    public void setjenisSampah(String jenis) {
        // Set this.nama dengan parameter nama
        this.jenisSampah = jenis;
    }
    
    // Dapatkan nilai dari nama
    public String getjenisSampah() {
        // Kembalikan nilai dari this.nama
        return this.jenisSampah;
    } 
    
    // Set nilai dari noTelepon dengan parameter noTelepon
    public void setkategoriSampah(String kategori) {
        // Set this.noTelepon dengan parameter noTelepon
        this.kategoriSampah = kategori;
    }
    
    // Dapatkan nilai dari noTelepon
    public String getkategoriSampah() {
        // Kembalikan nilai dari this.noTelepon
        return this.kategoriSampah;
    }
    
    public void setpoinSampah(String poin) {
        this.poinSampah = poin;
    }
    
     public String getpoinSampah() {
        // Kembalikan nilai dari this.noTelepon
        return this.poinSampah;
    }
    
    public void setnamaMasyarakat(String nama) {
        this.namaMasyarakat = nama;
    }
    
    public String getnamaMasyarakat() {
        return this.namaMasyarakat;
    }
    public void setalamatMasyarakat(String alamat) {
        this.alamatMasyarakat = alamat;
    }
    
    public String getalamatMasyarakat() {
        return this.alamatMasyarakat;
    }

   
}

