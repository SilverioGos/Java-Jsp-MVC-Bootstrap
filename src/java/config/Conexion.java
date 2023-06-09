/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;


public class Conexion {
    Connection con; 
    String base= "tec";
    String user= "root";
    String password= "";
    String url= "jdbc:mysql://localhost:33065/"+base;
    
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);        
        } catch (Exception e) {
            
        }
        return con;
    }    
        // Codigo para imprimir los datos de una tabla y verificar si esta conectada la base de datos    
    /*public static void main (String[] args){
        Conexxx cn= new Conexxx();
        Statement st;
        ResultSet rs;
        try{
            cn.getConexxx();
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from autor");
            while (rs.next()){
                System.out.println(rs.getString("cod_au")+" "+rs.getString("nom_au")+" "+rs.getString("ape_au"));
            }
            cn.con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Conexion fallida");
        }
    }*/
  
}
