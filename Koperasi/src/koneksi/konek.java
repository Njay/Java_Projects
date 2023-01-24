package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class konek {
    
    private static Connection Koneksi;
    
    public static Connection GetConnection() throws SQLException{
        
        String db = "jdbc:mysql://localhost/user_db";
        String user = "root";
        String pass ="";
        if (Koneksi==null){
        Koneksi = DriverManager.getConnection(db, user, pass);
        }return Koneksi;
    }
}
