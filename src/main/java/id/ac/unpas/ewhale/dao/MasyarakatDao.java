package id.ac.unpas.ewhale.dao;

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

// Class MasyarakatDao untuk mengatur CRUD dari masyarakat
public class MasyarakatDao {
    // Fungsi untuk menambahkan data ke database
    public int insert(Masyarakat masyarakat) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk memasukkan data ke database
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into masyarakat(id, nama, no_telepon, jenis_kelamin, alamat) values (?, ?, ?, ?, ?)");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, masyarakat.getIdMasyarakat()); // id
            statement.setString(2, masyarakat.getNamaMasyarakat()); // nama
            statement.setString(3, masyarakat.getNoTeleponMasyarakat()); // no_telepon
            statement.setString(5, masyarakat.getAlamatMasyarakat()); // alamat
            
            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dimasukkan ke database
            System.out.println("Insert data: " + masyarakat.getIdMasyarakat() + " " + masyarakat.getNamaMasyarakat() + " "
                    + masyarakat.getNoTeleponMasyarakat() + " " + masyarakat.getAlamatMasyarakat());
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk mengubah data di database
    public int update(Masyarakat masyarakat) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk mengubah data di database
            PreparedStatement statement = connection.prepareStatement(
                    "update masyarakat set nama = ?, no_telepon = ?, jenis_kelamin = ?, alamat = ? where id = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, masyarakat.getNamaMasyarakat()); // nama
            statement.setString(2, masyarakat.getNoTeleponMasyarakat()); // no_telepon
            statement.setString(4, masyarakat.getAlamatMasyarakat()); // alamat
            statement.setString(5, masyarakat.getIdMasyarakat()); // id

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang diubah di database
            System.out.println("Update data: " + masyarakat.getIdMasyarakat() + " " + masyarakat.getNamaMasyarakat() + " "
                    + masyarakat.getNoTeleponMasyarakat() + " " + masyarakat.getAlamatMasyarakat());

        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk menghapus data di database
    public int delete(Masyarakat masyarakat) {
        // Variable result untuk menyimpan nilai dari eksekusi query apakah berhasil atau tidak
        int result = -1;

        // Try with resources untuk membuat koneksi ke database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // Membuat PreparedStatement untuk menghapus data di database
            PreparedStatement statement = connection.prepareStatement("delete from masyarakat where id = ?");

            // Set nilai dari parameter yang ada di query
            statement.setString(1, masyarakat.getIdMasyarakat()); // id

            // Eksekusi query
            result = statement.executeUpdate();

            // Print data yang dihapus di database
            System.out.println("Delete data: " + masyarakat.getIdMasyarakat() + " " + masyarakat.getNamaMasyarakat() + " "
                    + masyarakat.getNoTeleponMasyarakat() + " " + masyarakat.getAlamatMasyarakat());
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai result
        return result;
    }

    // Fungsi untuk mendapatkan semua data dari database
    public List<Masyarakat> findAll() {
        // Membuat list untuk menyimpan semua data
        List<Masyarakat> list = new ArrayList<>();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Membuat statement untuk mengirim query ke database
                Statement statement = connection.createStatement();) {

            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from masyarakat")) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Membuat object masyarakat untuk menyimpan data
                    Masyarakat masyarakat = new Masyarakat();

                    // Set nilai dari object masyarakat
                    masyarakat.setIdMasyarakat(resultSet.getString("id")); // id
                    masyarakat.setNamaMasyarakat(resultSet.getString("nama")); // nama
                    masyarakat.setNoTeleponMasyarakat(resultSet.getString("no_telepon")); // no_telepon
                    masyarakat.setAlamatMasyarakat(resultSet.getString("alamat")); // alamat

                    // Menambahkan masyarakat ke list
                    list.add(masyarakat);
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
    public Masyarakat select(String column, String value) {
        // Membuat object masyarakat untuk menyimpan data
        Masyarakat masyarakat = new Masyarakat();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();
            ) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from masyarakat where " + column+ " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object masyarakat
                    masyarakat.setIdMasyarakat(resultSet.getString("id")); // id
                    masyarakat.setNamaMasyarakat(resultSet.getString("nama")); // nama
                    masyarakat.setNoTeleponMasyarakat(resultSet.getString("no_telepon")); // no_telepon
                    masyarakat.setAlamatMasyarakat(resultSet.getString("alamat")); // alamat
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai masyarakat
        return masyarakat;
    }
}