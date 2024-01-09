/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.dao;

import id.ac.unpas.ewhale.db.MySqlConnection;
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
                    "Insert into dropbox(idDropbox, namaMasyarakat, alamatMasyarakat, jenisSampah, kategoriSampah, poinSampah) values (?, ?, ?, ?, ?, ?)");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, dropbox.getidDropBox());
            statement.setString(2, dropbox.getnamaMasyarakat()); // id
            statement.setString(3, dropbox.getalamatMasyarakat()); // jenis sampah
            statement.setString(4, dropbox.getjenisSampah()); // kategori sampah
            statement.setString(5, dropbox.getkategoriSampah());
            statement.setString(6, dropbox.getpoinSampah());
            
            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dimasukkan ke database
            System.out.println("Insert data: " + dropbox.getidDropBox() + " " + dropbox.getnamaMasyarakat() + " " + dropbox.getalamatMasyarakat() + " "
                    + dropbox.getjenisSampah() + " " + dropbox.getkategoriSampah() + " " + dropbox.getpoinSampah() + " ");
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
                    "update dropbox set namaMasyarakat = ?, alamatMasyarakat = ?, jenisSampah = ?, kategoriSampah = ?, poinSampah = ? where idDropBox = ?");

            // Set nilai dari parameter yang ada di query
            
            statement.setString(1, dropbox.getnamaMasyarakat()); // id
            statement.setString(2, dropbox.getalamatMasyarakat()); // jenis sampah
            statement.setString(3, dropbox.getjenisSampah()); // kategori sampah
            statement.setString(4, dropbox.getkategoriSampah());
            statement.setString(5, dropbox.getpoinSampah());
            statement.setString(6, dropbox.getidDropBox());

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang diubah di database
            System.out.println("Update data: " + dropbox.getidDropBox() + " " + dropbox.getnamaMasyarakat() + " " + dropbox.getalamatMasyarakat() + " "
                    + dropbox.getjenisSampah() + " " + dropbox.getkategoriSampah() + " " + dropbox.getpoinSampah() + " ");

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
            PreparedStatement statement = connection.prepareStatement("delete from dropbox where idDropBox = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, this.select("namaMasyarakat", dropbox.getnamaMasyarakat()).getidDropBox()); 
           
            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dihapus di database
            System.out.println("Delete data: " + dropbox.getidDropBox() + " " + dropbox.getnamaMasyarakat() + " " + dropbox.getalamatMasyarakat() + " "
                    + dropbox.getjenisSampah() + " "  + dropbox.getkategoriSampah() + " " + dropbox.getpoinSampah() + " ");
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
            try (ResultSet resultSet = statement.executeQuery("select * from dropbox")) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Membuat object sampah untuk menyimpan data
                    DropBox dropBox = new DropBox();

                    // Set nilai dari object sampah
                    dropBox.setidDropBox(resultSet.getString("idDropBox")); 
                    dropBox.setnamaMasyarakat(resultSet.getString("namaMasyarakat")); // id
                    dropBox.setalamatMasyarakat(resultSet.getString("alamatMasyarakat")); // Jenis Sampah
                    dropBox.setjenisSampah(resultSet.getString("jenisSampah"));
                    dropBox.setkategoriSampah(resultSet.getString("kategoriSampah"));
                    dropBox.setpoinSampah(resultSet.getString("poinSampah"));// Kategori Sampah

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
        DropBox dropBox = new DropBox();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();
            ) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from dropbox where " + column+ " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object kurir
                    dropBox.setidDropBox(resultSet.getString("idDropBox"));
                    dropBox.setnamaMasyarakat(resultSet.getString("namaMasyarakat")); // id
                    dropBox.setalamatMasyarakat(resultSet.getString("alamatMasyarakat")); // Jenis Sampah
                    dropBox.setjenisSampah(resultSet.getString("jenisSampah"));
                    dropBox.setkategoriSampah(resultSet.getString("kategoriSampah"));
                    dropBox.setpoinSampah(resultSet.getString("poinSampah"));
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
        return dropBox;
    }
}
