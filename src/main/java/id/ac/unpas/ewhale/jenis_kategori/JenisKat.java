/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.jenis_kategori;

/**
 *
 * @author ACER
 */
public class JenisKat {
    private String idSampah; // Variable id untuk menyimpan nilai id
    private String jenisSampah; // Variable nama untuk menyimpan nilai nama
    private String kategoriSampah; // Variable noTelepon untuk menyimpan nilai noTelepon
    
    // Set nilai dari id dengan parameter id
    public void setidSampah(String id) {
        // Set this.id dengan parameter id
        this.idSampah = id;
    }
    
    // Dapatkan nilai dari id
    public String getidSampah() {
        // Kembalikan nilai dari this.id
        return this.idSampah;
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
}
