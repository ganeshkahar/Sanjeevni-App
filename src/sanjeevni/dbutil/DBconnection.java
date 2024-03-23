/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DBconnection {
    private static Connection conn;
    static {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("driver loaded successfully");
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Promble in DB "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
       
        }
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","sanjeevani","sanjeevani");
       System.out.println("DB connected successfully");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Promble in DB "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection(){
        if(conn!=null){
            try{
                conn.close();
                System.out.println("conn close successfully");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }



}
