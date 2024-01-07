/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.dao;

import id.ac.unpas.ewhale.db.MySqlConnection;
import id.ac.unpas.ewhale.jenis_kategori.JenisKat;
import id.ac.unpas.ewhale.drop_box.DropBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DropBoxDao {
    public int insert(DropBox dropbox) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk memasukkan data ke database
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into sampah(idSampah, jenisSampah, kategoriSampah, poinSampah, idMasyarakat ) values (?, ?, ?, ?, ?)");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, dropbox.getidSampah()); // id
            statement.setString(2, dropbox.getjenisSampah()); // jenis sampah
            statement.setString(3, dropbox.getkategoriSampah()); // kategori sampah
            statement.setString(4, dropbox.getpoinSampah());
            statement.setString(5, dropbox.getidMasyarakat());
            
            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dimasukkan ke database
            System.out.println("Insert data: " + dropbox.getidSampah() + " " + dropbox.getjenisSampah() + " "
                    + dropbox.getkategoriSampah() + " " + dropbox.getpoinSampah() + " " + dropbox.getidMasyarakat() + " ");
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk mengubah data di database
    public int update(DropBox dropbox ) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk mengubah data di database
            PreparedStatement statement = connection.prepareStatement(
                    "update sampah set jenisSampah = ?, kategoriSampah = ? where idSampah = ?, ");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, dropbox.getidSampah()); // id
            statement.setString(2, dropbox.getjenisSampah()); // jenis sampah
            statement.setString(3, dropbox.getkategoriSampah()); // kategori sampah
            statement.setString(4, dropbox.getpoinSampah());
            statement.setString(5, dropbox.getidMasyarakat());

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang diubah di database
            System.out.println("Update data: " + dropbox.getidSampah() + " " + dropbox.getjenisSampah() + " "
                    + dropbox.getkategoriSampah() + " " + dropbox.getpoinSampah() + " " + dropbox.getidMasyarakat() + " ");

        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk menghapus data di database
    public int delete(DropBox dropbox) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk menghapus data di database
            PreparedStatement statement = connection.prepareStatement("delete from sampah where idSampah = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, dropbox.getidSampah()); // id

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dihapus di database
            System.out.println("Delete data: " + dropbox.getidSampah() + " " + dropbox.getjenisSampah() + " "
                    + dropbox.getkategoriSampah() + " "  + dropbox.getpoinSampah() + " " + dropbox.getidMasyarakat() + " ");
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk mendapatkan semua data dari database
    public List<DropBox> findAll() {
        // Membuat list untuk menyimpan semua data
        List<DropBox> list = new ArrayList<>();

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
                    DropBox dropBox = new DropBox();

                    // Set nilai dari object sampah
                    dropBox.setnamaMasyarakat(resultSet.getString("namaMasyarakat")); // id
                    dropBox.setjenisSampah(resultSet.getString("jenisSampah")); // Jenis Sampah
                    dropBox.setkategoriSampah(resultSet.getString("kategoriSampah"));
                    dropBox.setpoinSampah(resultSet.getString("poinSampah"));
                    dropBox.setidMasyarakat(resultSet.getString("idMasyarakat"));// Kategori Sampah

                    // Menambahkan sampah ke list
                    list.add(dropBox);
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
    public DropBox select(String column, String value) {
        // Membuat object kurir untuk menyimpan data
        DropBox dropbox = new DropBox();

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
                    dropbox.setidSampah(resultSet.getString("idSampah")); // id
                    dropbox.setjenisSampah(resultSet.getString("jenisSampah")); // jenis sampah
                    dropbox.setkategoriSampah(resultSet.getString("kategoriSampah")); // kategori sampah
                    dropbox.setpoinSampah(resultSet.getString("poinSampah"));
                    dropbox.setidMasyarakat(resultSet.getString("idMasyarakat"));
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
        return dropbox;
    }
}
