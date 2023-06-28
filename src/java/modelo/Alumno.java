/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class Alumno {
   private static String url;
    
    
    public static String[] select(String url){
        Connection cn=Conexion.conexion();
        String num[]=new String[6];
        try{
            PreparedStatement pst=cn.prepareStatement(url);
            ResultSet rs=pst.executeQuery();
      
            while (rs.next()) {
            num[0]= rs.getString("id");
                num[1]=rs.getString("nombre");
                 num[2]=rs.getString("descripcion");
                  num[3]=rs.getString("stock");
                  num[4]=rs.getString("precio");
                  num[5]=rs.getString("codigo");
                  
            }
         
        }catch(Exception e){
            e.getMessage();
        }
        return num;
        
    }
    
    public static String[] alumn(){
        String numero[]=new String[5];
        numero[0]="juanito";
          numero[1]="juana la cubana";
            numero[2]="juanelo";
              numero[3]="juana";
                numero[4]="julina";
                  
        return numero;
    }
}
