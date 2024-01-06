/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.dao;


import id.ac.unpas.ewhale.approval_kurir.Kurir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.ewhale.approval_masyarakat.Masyarakat;
import id.ac.unpas.ewhale.db.MySqlConnection;
/**
 *
 * @author acer
 */
public class KurirDao {
     public int insert(Kurir kurir) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk memasukkan data ke database
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into kurir(idKurir, namaKurir, noTeleponKurir, alamatKurir, noKK, noKTP) values (?, ?, ?, ?, ?, ?)");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, kurir.getIdKurir()); // id
            statement.setString(2, kurir.getNamaKurir()); // nama
            statement.setString(3, kurir.getNoTeleponKurir()); // no_telepon
            statement.setString(4, kurir.getAlamatKurir()); // alamat
            statement.setString(5, kurir.getNoKK()); // KK
            statement.setString(6, kurir.getNoKTP()); // KTP
            
            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dimasukkan ke database
            System.out.println("Insert data: " + kurir.getIdKurir() + " " + kurir.getNamaKurir() + " "
                    + kurir.getNoTeleponKurir() + " " + kurir.getAlamatKurir() + " " + kurir.getNoKK() + " " + kurir.getNoKTP());
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

//    // Fungsi untuk mengubah data di database
//    public int update(Kurir masyarakat) {
//        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
//        int result = -1;
//
//        // Try with resources untuk membuat koneksi ke database
//        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
//            // Membuat PreparedStatement untuk mengubah data di database
//            PreparedStatement statement = connection.prepareStatement(
//                    "update masyarakat set nama = ?, no_telepon = ?, alamat = ? where id = ?");
//
//            // Set nilai dari parameter yang ada di query
//            statement.setString(1, masyarakat.getNamaKurir()); // nama
//            statement.setString(2, masyarakat.getNoTeleponKurir()); // no_telepon
//            statement.setString(3, masyarakat.getAlamatKurir()); // alamat
//            statement.setString(4, masyarakat.getIdKurir()); // id
//
//            // Eksekusi query
//            result = statement.executeUpdate();
//
//            // Print data yang diubah di database
//            System.out.println("Update data: " + masyarakat.getIdKurir() + " " + masyarakat.getNamaKurir() + " "
//                    + masyarakat.getNoTeleponKurir() + " " + masyarakat.getAlamatKurir());
//
//        } catch (SQLException e) {
//            // Print error jika terjadi error
//            e.printStackTrace();
//        }
//
//        // Kembalikan nilai result
//        return result;
//    }

    // Fungsi untuk menghapus data di database
    public int delete(Kurir kurir) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk menghapus data di database
            PreparedStatement statement = connection.prepareStatement("delete from kurir where idKurir = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, kurir.getIdKurir()); // id

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dihapus di database
            System.out.println("Delete data: " + kurir.getIdKurir() + " " + kurir.getNamaKurir() + " "
                    + kurir.getNoTeleponKurir() + " " + kurir.getAlamatKurir() + " " + kurir.getNoKK() + " " + kurir.getNoKTP());
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk mendapatkan semua data dari database
    public List<Kurir> findAll() {
        // Membuat list untuk menyimpan semua data
        List<Kurir> list = new ArrayList<>();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Membuat statement untuk mengirim query ke database
                Statement statement = connection.createStatement();) {

            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from kurir")) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Membuat object kurir untuk menyimpan data
                    Kurir kurir = new Kurir();

                    // Set nilai dari object kurir
                    kurir.setIdKurir(resultSet.getString("idKurir")); // id
                    kurir.setNamaKurir(resultSet.getString("namaKurir")); // nama
                    kurir.setNoTeleponKurir(resultSet.getString("noTeleponKurir")); // no_telepon
                    kurir.setAlamatKurir(resultSet.getString("alamatKurir")); // alamat
                    kurir.setNoKK(resultSet.getString("noKK")); // alamat
                    kurir.setNoKTP(resultSet.getString("noKTP")); // alamat

                    // Menambahkan kurir ke list
                    list.add(kurir);
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai list
        return list;
    }

    // Fungsi untuk mendapatkan data dari database berdasarkan column dan value
    public Kurir select(String column, String value) {
        // Membuat object kurir untuk menyimpan data
        Kurir kurir = new Kurir();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();
            ) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from kurir where " + column+ " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object kurir
                    kurir.setIdKurir(resultSet.getString("idKurir")); // id
                    kurir.setNamaKurir(resultSet.getString("namaKurir")); // nama
                    kurir.setNoTeleponKurir(resultSet.getString("noTeleponKurir")); // no_telepon
                    kurir.setAlamatKurir(resultSet.getString("alamatKurir")); // alamat
                    kurir.setNoKK(resultSet.getString("noKK")); // alamat
                    kurir.setNoKTP(resultSet.getString("noKTP")); // alamat
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai kurir
        return kurir;
    }
    
}
