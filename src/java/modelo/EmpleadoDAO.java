
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
        
    public List listar(){
        String sql="select * from empleado";
        List<Empleado>lista = new ArrayList<>();
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Empleado em=new Empleado();
                em.setId(rs.getInt(1));
                em.setNom(rs.getString(2));
                em.setCorr(rs.getString(3));
                em.setEd(rs.getString(4));
                em.setCarg(rs.getString(5));
                em.setDir(rs.getString(6));
                em.setTel(rs.getString(7));
                lista.add(em);          
            }
        } catch (Exception e){    
        }
        return lista;        
    }
    public int agregar(Empleado em){
        String sql="insert into empleado(Nombres, Correo, Edad, Cargo, Direccion, Telefono) values(?,?,?,?,?,?)";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);         
            ps.setString(1, em.getNom());
            ps.setString(2, em.getCorr());
            ps.setString(3, em.getEd());
            ps.setString(4, em.getCarg());
            ps.setString(5, em.getDir());
            ps.setString(6, em.getTel());
            ps.executeUpdate();
        } catch (Exception e){           
        }
        return r;
    }
    
    public Empleado listarId(int id){
        Empleado emp=new Empleado();
        String sql="select * from empleado where IdEmpleado="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                emp.setNom(rs.getString(2));
                emp.setCorr(rs.getString(3));
                emp.setEd(rs.getString(4));
                emp.setCarg(rs.getString(5));
                emp.setDir(rs.getString(6));
                emp.setTel(rs.getString(7));
            }
        } catch (Exception e){            
        }
        return emp;
    }
    
    public int actualizar(Empleado em){
        String sql="update empleado set Nombres=?, Correo=?, Edad=?, Cargo=?, Direccion=?, Telefono=? where IdEmpleado=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNom());
            ps.setString(2, em.getCorr());
            ps.setString(3, em.getEd());
            ps.setString(4, em.getCarg());
            ps.setString(5, em.getDir());
            ps.setString(6, em.getTel());
            ps.setInt(7, em.getId());
            ps.executeUpdate();
        } catch (Exception e){           
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from empleado where IdEmpleado="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){           
        }
    }
}
