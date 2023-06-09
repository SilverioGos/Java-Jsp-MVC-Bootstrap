
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public User validar(String user, String pass){
        User us =new User();
        String sql="select * from user where nomUsuario=? and clave=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while(rs.next()){
                us.setId(rs.getInt("IdUsuario"));
                us.setUser(rs.getString("nomUsuario"));
                us.setPass(rs.getString("clave"));
                us.setNom(rs.getString("Nombres"));
            }
        } catch( Exception e){    
        }
        return us;
    }
    
}
