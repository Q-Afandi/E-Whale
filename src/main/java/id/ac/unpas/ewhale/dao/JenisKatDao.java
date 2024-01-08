/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.dao;

/**
 *
 * @author ACER
 */

import id.ac.unpas.ewhale.jenis_kategori.JenisKat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.ewhale.db.MySqlConnection;

public class JenisKatDao {
    public int insert(JenisKat jeniskat) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk memasukkan data ke database
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into sampah(idSampah, jenisSampah, kategoriSampah ) values (?, ?, ?)");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, jeniskat.getidSampah()); // id
            statement.setString(2, jeniskat.getjenisSampah()); // jenis sampah
            statement.setString(3, jeniskat.getkategoriSampah()); // kategori sampah
            
            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dimasukkan ke database
            System.out.println("Insert data: " + jeniskat.getidSampah() + " " + jeniskat.getjenisSampah() + " "
                    + jeniskat.getkategoriSampah());
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk mengubah data di database
    public int update(JenisKat jeniskat ) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk mengubah data di database
            PreparedStatement statement = connection.prepareStatement(
                    "update sampah set jenisSampah = ?, kategoriSampah = ? where idSampah = ?");

            // Set nilai dari parameter yang ada di query
            
            statement.setString(1, jeniskat.getjenisSampah()); // jenis sampah
            statement.setString(2, jeniskat.getkategoriSampah()); // kategori sampah
            statement.setString(3, jeniskat.getidSampah()); // id

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang diubah di database
            System.out.println("Update data: " + jeniskat.getidSampah() + " " + jeniskat.getjenisSampah() + " "
                    + jeniskat.getkategoriSampah() + " " );

        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk menghapus data di database
    public int delete(JenisKat jeniskat) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk menghapus data di database
            PreparedStatement statement = connection.prepareStatement("delete from sampah where idSampah = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, jeniskat.getidSampah()); // id

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dihapus di database
            System.out.println("Delete data: " + jeniskat.getidSampah() + " " + jeniskat.getjenisSampah() + " "
                    + jeniskat.getkategoriSampah() + " " );
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk mendapatkan semua data dari database
    public List<JenisKat> findAll() {
        // Membuat list untuk menyimpan semua data
        List<JenisKat> list = new ArrayList<>();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Membuat statement untuk mengirim query ke database
                Statement statement = connection.createStatement();) {

            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from sampah")) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Membuat object sampah untuk menyimpan data
                    JenisKat jeniskat = new JenisKat();

                    // Set nilai dari object sampah
                    jeniskat.setidSampah(resultSet.getString("idSampah")); // id
                    jeniskat.setjenisSampah(resultSet.getString("jenisSampah")); // Jenis Sampah
                    jeniskat.setkategoriSampah(resultSet.getString("kategoriSampah")); // Kategori Sampah

                    // Menambahkan sampah ke list
                    list.add(jeniskat);
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
    public JenisKat select(String column, String value) {
        // Membuat object kurir untuk menyimpan data
        JenisKat jeniskat = new JenisKat();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();
            ) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from sampah where " + column+ " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object kurir
                    jeniskat.setidSampah(resultSet.getString("idSampah")); // id
                    jeniskat.setjenisSampah(resultSet.getString("jenisSampah")); // jenis sampah
                    jeniskat.setkategoriSampah(resultSet.getString("kategoriSampah")); // kategori sampah
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai sampah
        return jeniskat;
    }
}
