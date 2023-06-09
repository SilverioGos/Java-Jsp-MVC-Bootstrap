
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int c;
    
    public Clientes buscar(int id){
        Clientes cli=new Clientes();
        String sql="Select * from cliente where IdCliente="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                cli.setId(rs.getInt(1));              
                cli.setNom(rs.getString(2));
                cli.setEd(rs.getString(3));
                cli.setDirec(rs.getString(4));
                cli.setTel(rs.getString(5));
            }    
        } catch(Exception e){          
        }
        return cli;
    }
    
    public List listar(){
        String sql="select * from cliente";
        List<Clientes>lista = new ArrayList<>();
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Clientes cli=new Clientes();
                cli.setId(rs.getInt(1));              
                cli.setNom(rs.getString(2));
                cli.setEd(rs.getString(3));
                cli.setDirec(rs.getString(4));
                cli.setTel(rs.getString(5));
                
                
                lista.add(cli);          
            }
        } catch (Exception e){    
        }
        return lista;        
    }
    public int agregar(Clientes cli){
        String sql="insert into cliente(Nombres, Edad, Direccion, Telefono) values(?,?,?,?)";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cli.getNom());
            ps.setString(2, cli.getEd());
            ps.setString(3, cli.getDirec());
            ps.setString(4, cli.getTel());
            ps.executeUpdate();
        } catch (Exception e){
            
        }
        return c;
    }
    
    public Clientes listarId(int id){
        Clientes clien=new Clientes();
        String sql="select * from cliente where IdCliente="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                clien.setNom(rs.getString(2));
                clien.setEd(rs.getString(3));
                clien.setDirec(rs.getString(4));
                clien.setTel(rs.getString(5));
            }
        } catch (Exception e){            
        }
        return clien;
    }
    
    public int actualizar(Clientes clim){
        String sql="update cliente set Nombres=?, Edad=?, Direccion=?, Telefono=? where IdCliente=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, clim.getNom());
            ps.setString(2, clim.getEd());
            ps.setString(3, clim.getDirec());
            ps.setString(4, clim.getTel());
            ps.setInt(5, clim.getId());
            ps.executeUpdate();
        } catch (Exception e){           
        }
        return c;
    }
    public void delete(int id){
        String sql="delete from cliente where IdCliente="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){           
        }
    }
}
