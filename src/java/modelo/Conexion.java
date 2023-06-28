/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Conexion {
    private static Connection con;
   private   final static String url="jdbc:mysql://192.168.1.73:3306/ecatepec_fisica1";
        private final static String root="victoria";
        private final static String password="1234";
    public static Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection(url, root, password);
            System.out.println("mano larga");
        }catch(Exception e){
            e.getMessage();
        }
        
        return con;
    }
}
