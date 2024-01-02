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
    private String idMasyarakat; // Variable id untuk menyimpan nilai id
    private String namaMasyarakat; // Variable nama untuk menyimpan nilai nama
    private String noTeleponMasyarakat; // Variable noTelepon untuk menyimpan nilai noTelepon
    private String alamatMasyarakat; // Variable jenisKelamin untuk menyimpan nilai jenisKelamin
    
    // Set nilai dari id dengan parameter id
    public void setIdMasyarakat(String id) {
        // Set this.id dengan parameter id
        this.idMasyarakat = id;
    }
    
    // Dapatkan nilai dari id
    public String getIdMasyarakat() {
        // Kembalikan nilai dari this.id
        return this.idMasyarakat;
    } 
    
    // Set nilai dari nama dengan parameter nama
    public void setNamaMasyarakat(String nama) {
        // Set this.nama dengan parameter nama
        this.namaMasyarakat = nama;
    }
    
    // Dapatkan nilai dari nama
    public String getNamaMasyarakat() {
        // Kembalikan nilai dari this.nama
        return this.namaMasyarakat;
    } 
    
    // Set nilai dari noTelepon dengan parameter noTelepon
    public void setNoTeleponMasyarakat(String noTelepon) {
        // Set this.noTelepon dengan parameter noTelepon
        this.noTeleponMasyarakat = noTelepon;
    }
    
    // Dapatkan nilai dari noTelepon
    public String getNoTeleponMasyarakat() {
        // Kembalikan nilai dari this.noTelepon
        return this.noTeleponMasyarakat;
    }
        
    // Set nilai dari alamat dengan parameter alamat
    public void setAlamatMasyarakat(String alamat) {
        // Set this.alamat dengan parameter alamat
        this.alamatMasyarakat = alamat;
    }
    
    // Dapatkan nilai dari alamat
    public String getAlamatMasyarakat() {
        // Kembalikan nilai dari this.alamat
        return this.alamatMasyarakat;
    }
}
