/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author achyar
 */
public class koneksi {
    private static Connection con;
    public koneksi(){
    
    }
    public static Connection getConnection(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/fastfood","root","root");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Koneksi");
        }
        return con;
    } 
    
}
