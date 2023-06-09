
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int p;
    
    public Productos buscar(int id){
        Productos pro=new Productos();
        String sql="Select * from producto where IdProducto="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                pro.setId(rs.getInt(1));              
                pro.setDes(rs.getString(2));
                pro.setPre(rs.getString(3));
                pro.setStoc(rs.getString(4));
            }    
        } catch(Exception e){          
        }
        return pro;
    }
    
    public List listar(){
        String sql="select * from producto";
        List<Productos>lista = new ArrayList<>();
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Productos pro=new Productos();
                pro.setId(rs.getInt(1));              
                pro.setDes(rs.getString(2));
                pro.setPre(rs.getString(3));
                pro.setStoc(rs.getString(4));       
                lista.add(pro);          
            }
        } catch (Exception e){    
        }
        return lista;        
    }
    public int agregar(Productos prod){
        String sql="insert into producto(Descripcion, Precio, Stock) values(?,?,?)";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, prod.getDes());
            ps.setString(2, prod.getPre());
            ps.setString(3, prod.getStoc());
            ps.executeUpdate();
        } catch (Exception e){     
        }
        return p;
    }
    
    public Productos listarId(int id){
        Productos pro=new Productos();
        String sql="select * from producto where IdProducto="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                pro.setId(rs.getInt(1));
                pro.setDes(rs.getString(2));
                pro.setPre(rs.getString(3));
                pro.setStoc(rs.getString(4));
            }
        } catch (Exception e){            
        }
        return pro;
    }
    
    public int actualizar(Productos produc){
        String sql="update producto set Descripcion=?, Precio=?, Stock=? where IdProducto=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, produc.getDes());
            ps.setString(2, produc.getPre());
            ps.setString(3, produc.getStoc());
            ps.setInt(4, produc.getId());
            ps.executeUpdate();
        } catch (Exception e){           
        }
        return p;
    }
    public void delete(int id){
        String sql="delete from producto where IdProducto="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){           
        }
    }
}
