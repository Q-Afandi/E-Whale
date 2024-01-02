/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.ewhale.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author acer
 */

// Class MySqlConnection untuk menghubungkan aplikasi dengan database
public class MySqlConnection {
    // Variable DB_URL untuk menyimpan nilai url database
    private final static String DB_URL = "jdbc:mysql://localhost:3306/ewhale";
    // Variable DB_USER untuk menyimpan nilai username database
    private final static String DB_USER = "root";
    // Variable DB_PASS untuk menyimpan nilai password database
    private final static String DB_PASS = "";
    
    // Variable instance untuk menyimpan nilai instance dari MySqlConnection
    private static MySqlConnection instance;
    
    // Method getInstance untuk mengembalikan nilai instance dari MySqlConnection
    public static MySqlConnection getInstance() {
        // Jika instance bernilai null
        if (instance == null) {
            // Set instance dengan MySqlConnection
            instance = new MySqlConnection();
        }
        // Kembalikan nilai instance
        return instance;
    }
    
    // Method getConnection untuk mengembalikan nilai connection dari MySqlConnection
    public Connection getConnection() {
        // Variable connection untuk menyimpan nilai connection
        Connection connection = null;

        // Try catch untuk menghubungkan aplikasi dengan database
        try {
            // Load driver database
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Set connection dengan DriverManager.getConnection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e) {
            // Jika terjadi error, tampilkan error
            e.printStackTrace();
        }
        // Kembalikan nilai connection
        return connection;
    }
}