package stationerystore;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con;
    Statement stm;

    public koneksi() {
        config();
    }
    
    public static void main(String[] args) {
        new koneksi();
    }
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/kasir","root","");
            stm =  (Statement) con.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal"+e.getMessage());
        }
    }
            
}
