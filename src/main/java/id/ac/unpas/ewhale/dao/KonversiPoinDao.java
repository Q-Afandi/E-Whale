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
import id.ac.unpas.ewhale.konversi_poin.KonversiPoin;

public class KonversiPoinDao {
     public int insert(KonversiPoin konversipoin) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk memasukkan data ke database
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into sampah(idSampah, jenisSampah, kategoriSampah, poinSampah ) values (?, ?, ?, ?)");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, konversipoin.getidSampah()); // id
            statement.setString(2, konversipoin.getjenisSampah()); // jenis sampah
            statement.setString(3, konversipoin.getkategoriSampah()); // kategori sampah
            statement.setString(4, konversipoin.getpoinSampah()); // kategori sampah

            
            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dimasukkan ke database
            System.out.println("Insert data: " + konversipoin.getidSampah() + " " + konversipoin.getjenisSampah() + " "
                    + konversipoin.getkategoriSampah() + "" + konversipoin.getpoinSampah());
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

      public int update(KonversiPoin konversipoin ) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk mengubah data di database
            PreparedStatement statement = connection.prepareStatement(
                    "update sampah set jenisSampah = ?, kategoriSampah = ? , poinSampah = ? ,where idSampah = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, konversipoin.getidSampah()); // id
            statement.setString(2, konversipoin.getjenisSampah()); // jenis sampah
            statement.setString(3, konversipoin.getkategoriSampah()); // kategori sampah
            statement.setString(4, konversipoin.getpoinSampah()); // kategori sampah

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang diubah di database
            System.out.println("Update data: " + konversipoin.getidSampah() + " " + konversipoin.getjenisSampah() + " "
                    + konversipoin.getkategoriSampah() + " " + konversipoin.getpoinSampah());

        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }
      public int delete(KonversiPoin konversiPoin) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk menghapus data di database
            PreparedStatement statement = connection.prepareStatement("delete from sampah where idSampah = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, konversiPoin.getidSampah()); // id

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dihapus di database
            System.out.println("Delete data: " + konversiPoin.getidSampah() + " " + konversiPoin.getjenisSampah() + " "
                    + konversiPoin.getkategoriSampah() + " " + konversiPoin.getpoinSampah() );
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }
      public List<KonversiPoin> findAll() {
        // Membuat list untuk menyimpan semua data
        List<KonversiPoin> list = new ArrayList<>();

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
                    KonversiPoin konversiPoin = new KonversiPoin();

                    // Set nilai dari object sampah
                    konversiPoin.setidSampah(resultSet.getString("idSampah")); // id
                    konversiPoin.setjenisSampah(resultSet.getString("jenisSampah")); // Jenis Sampah
                    konversiPoin.setkategoriSampah(resultSet.getString("kategoriSampah")); // Kategori Sampah
                    konversiPoin.setpoinSampah(resultSet.getString("poinSampah")); // Poin sampah

                    // Menambahkan sampah ke list
                    list.add(konversiPoin);
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
       public KonversiPoin select(String column, String value) {
        // Membuat object kurir untuk menyimpan data
        KonversiPoin konversiPoin = new KonversiPoin();

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
                    konversiPoin.setidSampah(resultSet.getString("idSampah")); // id
                    konversiPoin.setjenisSampah(resultSet.getString("jenisSampah")); // jenis sampah
                    konversiPoin.setkategoriSampah(resultSet.getString("kategoriSampah")); // kategori sampah
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
        return konversiPoin;
    }
}
