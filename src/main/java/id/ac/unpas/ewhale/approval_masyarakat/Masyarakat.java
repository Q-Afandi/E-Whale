/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.approval_masyarakat;

/**
 *
 * @author ACER
 */
public class Masyarakat {
    private String id; // Variable id untuk menyimpan nilai id
    private String nama; // Variable nama untuk menyimpan nilai nama
    private String noTelepon; // Variable noTelepon untuk menyimpan nilai noTelepon
    private String alamat; // Variable jenisKelamin untuk menyimpan nilai jenisKelamin
    
    // Set nilai dari id dengan parameter id
    public void setId(String id) {
        // Set this.id dengan parameter id
        this.id = id;
    }
    
    // Dapatkan nilai dari id
    public String getId() {
        // Kembalikan nilai dari this.id
        return this.id;
    } 
    
    // Set nilai dari nama dengan parameter nama
    public void setNama(String nama) {
        // Set this.nama dengan parameter nama
        this.nama = nama;
    }
    
    // Dapatkan nilai dari nama
    public String getNama() {
        // Kembalikan nilai dari this.nama
        return this.nama;
    } 
    
    // Set nilai dari noTelepon dengan parameter noTelepon
    public void setNoTelepon(String noTelepon) {
        // Set this.noTelepon dengan parameter noTelepon
        this.noTelepon = noTelepon;
    }
    
    // Dapatkan nilai dari noTelepon
    public String getNoTelepon() {
        // Kembalikan nilai dari this.noTelepon
        return this.noTelepon;
    }
        
    // Set nilai dari alamat dengan parameter alamat
    public void setAlamat(String alamat) {
        // Set this.alamat dengan parameter alamat
        this.alamat = alamat;
    }
    
    // Dapatkan nilai dari alamat
    public String getAlamat() {
        // Kembalikan nilai dari this.alamat
        return this.alamat;
    }
}
