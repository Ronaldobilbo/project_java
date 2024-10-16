 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbodealer;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class koneksidatabase {
   public Connection con;
    public ResultSet rs;
    public Statement stat;
    public String sql="";  

public void koneksidatabase() {
     try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbutsdealer", "root", "");
    } catch (ClassNotFoundException | SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "KONEKSI GAGAL");
        JOptionPane.showMessageDialog(null, "Silahkan Coba Lagi");
    }   
    }
}
