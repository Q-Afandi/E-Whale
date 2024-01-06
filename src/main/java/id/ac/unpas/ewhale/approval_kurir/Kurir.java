/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.approval_kurir;

/**
 *
 * @author ACER
 */
public class Kurir {
    private String idKurir; 
    private String namaKurir; 
    private String noTeleponKurir;
    private String alamatKurir; 
    private String noKK; 
    private String noKTP; 
    
    // Set nilai dari id dengan parameter id
    public void setIdKurir(String id) {
        // Set this.id dengan parameter id
        this.idKurir = id;
    }
    
    // Dapatkan nilai dari id
    public String getIdKurir() {
        // Kembalikan nilai dari this.id
        return this.idKurir;
    } 
    
      public void setNamaKurir(String nama) {
        // Set this.id dengan parameter id
        this.namaKurir = nama;
    }
    
    // Dapatkan nilai dari id
    public String getNamaKurir() {
        // Kembalikan nilai dari this.id
        return this.namaKurir;
    } 
    
     // Set nilai dari noTelepon dengan parameter noTelepon
    public void setNoTeleponKurir(String noTelepon) {
        // Set this.noTelepon dengan parameter noTelepon
        this.noTeleponKurir = noTelepon;
    }
    
    // Dapatkan nilai dari noTelepon
    public String getNoTeleponKurir() {
        // Kembalikan nilai dari this.noTelepon
        return this.noTeleponKurir;
    }
        
    // Set nilai dari alamat dengan parameter alamat
    public void setAlamatKurir(String alamat) {
        // Set this.alamat dengan parameter alamat
        this.alamatKurir = alamat;
    }
    
    // Dapatkan nilai dari alamat
    public String getAlamatKurir() {
        // Kembalikan nilai dari this.alamat
        return this.alamatKurir;
    }
    
      // Set nilai dari alamat dengan parameter alamat
    public void setNoKK(String noKK) {
        // Set this.alamat dengan parameter alamat
        this.noKK = noKK;
    }
    
    // Dapatkan nilai dari alamat
    public String getNoKK() {
        // Kembalikan nilai dari this.alamat
        return this.noKK;
    }
    
        // Set nilai dari alamat dengan parameter alamat
    public void setNoKTP(String noKTP) {
        // Set this.alamat dengan parameter alamat
        this.noKTP = noKTP;
    }
    
    // Dapatkan nilai dari alamat
    public String getNoKTP() {
        // Kembalikan nilai dari this.alamat
        return this.noKTP;
    }
}
