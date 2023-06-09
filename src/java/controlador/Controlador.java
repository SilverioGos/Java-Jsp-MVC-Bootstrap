
package controlador;

import config.GenerarSerie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import modelo.User;
import modelo.UserDAO;
import modelo.Clientes;
import modelo.ClientesDAO;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Ventas;
import modelo.VentasDAO;

public class Controlador extends HttpServlet {
    
    Empleado em=new Empleado();
    EmpleadoDAO edao=new EmpleadoDAO();
    int ide;
    
    User us=new User();
    UserDAO usdao=new UserDAO();
    int idu;
    
    Clientes cli=new Clientes();
    ClientesDAO clidao=new ClientesDAO();
    int idc;
    
    Productos pro=new Productos();
    ProductosDAO prodao=new ProductosDAO();
    int idp;
    
    Ventas v=new Ventas();
    List<Ventas>lista=new ArrayList<>();
    int item;
    int cod;
    String descripcion;
    double precio;
    int cant;
    double subtotal;
    double totalPagar;
    
    String numeroserie;
    VentasDAO vdao=new VentasDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu=request.getParameter("menu"); 
        String accion=request.getParameter("accion");   
        if(menu.equals("Principal")){
            request.getRequestDispatcher("Principal.jsp").forward(request,response);
        }
        if(menu.equals("Empleado")){
            switch(accion){
                case "Listar":
                    List lista=edao.listar();
                    request.setAttribute("empleado", lista);
                    break;
                case "Agregar":
                    String nom=request.getParameter("txtNombres");
                    String cor=request.getParameter("txtCorreo");
                    String ed=request.getParameter("txtEdad");
                    String car=request.getParameter("txtCargo");
                    String dir=request.getParameter("txtDireccion");
                    String tel=request.getParameter("txtTelefono"); 
                    em.setNom(nom);
                    em.setCorr(cor);
                    em.setEd(ed);
                    em.setCarg(car);
                    em.setDir(dir);
                    em.setTel(tel);
                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide=Integer.parseInt(request.getParameter("id"));
                    Empleado e=edao.listarId(ide);
                    request.setAttribute("empleados", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nom1=request.getParameter("txtNombres");
                    String cor1=request.getParameter("txtCorreo");
                    String ed1=request.getParameter("txtEdad");
                    String car1=request.getParameter("txtCargo");
                    String dir1=request.getParameter("txtDireccion");
                    String tel1=request.getParameter("txtTelefono"); 
                    em.setNom(nom1);
                    em.setCorr(cor1);
                    em.setEd(ed1);
                    em.setCarg(car1);
                    em.setDir(dir1);
                    em.setTel(tel1);
                    em.setId(ide);
                    edao.actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide=Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Empleado.jsp").forward(request,response);           
        }
        
       
        if(menu.equals("Clientes")){
            switch(accion){
                case "Listar":
                    List lista=clidao.listar();
                    request.setAttribute("clientes", lista);
                    break;
                case "Agregar":
                    String nom=request.getParameter("txtNombres");
                    String ed=request.getParameter("txtEd");
                    String dir=request.getParameter("txtDir");
                    String tel=request.getParameter("txtTel");                 
                    cli.setNom(nom);
                    cli.setEd(ed);
                    cli.setDirec(dir);
                    cli.setTel(tel);
                    clidao.agregar(cli);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idc=Integer.parseInt(request.getParameter("id"));
                    Clientes c=clidao.listarId(idc);
                    request.setAttribute("cliente", c);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nom1=request.getParameter("txtNombres");
                    String ed1=request.getParameter("txtEd");
                    String dir1=request.getParameter("txtDir");
                    String tel1=request.getParameter("txtTel");
                    cli.setNom(nom1);
                    cli.setEd(ed1);
                    cli.setDirec(dir1);
                    cli.setTel(tel1);
                    cli.setId(idc);
                    clidao.actualizar(cli);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idc=Integer.parseInt(request.getParameter("id"));
                    clidao.delete(idc);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request,response);
        }
         
        if(menu.equals("Productos")){
            switch(accion){
                case "Listar":
                    List lista=prodao.listar();
                    request.setAttribute("productos", lista);
                    break;
                case "Agregar":
                    String des=request.getParameter("txtDes");
                    String pre=request.getParameter("txtPrec");
                    String sto=request.getParameter("txtStoc");                
                    pro.setDes(des);
                    pro.setPre(pre);
                    pro.setStoc(sto);
                    prodao.agregar(pro);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idp=Integer.parseInt(request.getParameter("id"));
                    Productos e=prodao.listarId(idp);
                    request.setAttribute("producto", e);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String des1=request.getParameter("txtDes");
                    String pre1=request.getParameter("txtPrec");
                    String sto1=request.getParameter("txtStoc"); 
                    pro.setDes(des1);
                    pro.setPre(pre1);
                    pro.setStoc(sto1);
                    pro.setId(idp);
                    prodao.actualizar(pro);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idp=Integer.parseInt(request.getParameter("id"));
                    prodao.delete(idp);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Productos.jsp").forward(request,response);
        }
        
        if(menu.equals("Ventas")){
            switch (accion){
                case "BuscarCLiente":
                    int idclie=Integer.parseInt(request.getParameter("Codigocliente"));
                    //cli=clidao.listarId(idclie)
                    request.setAttribute("cliente", cli);
                    break;
                case "BuscarProducto":
                    int id=Integer.parseInt(request.getParameter("Codigoproducto"));
                    pro=prodao.listarId(id);
                    request.setAttribute("cliente", cli);
                    request.setAttribute("producto", pro);
                    request.setAttribute("lista", lista);
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "Agregar": 
                    request.setAttribute("cliente", cli);
                    request.setAttribute("nserie", numeroserie);
                    totalPagar=0.0;
                    item=item+1;
                    cod=pro.getId();
                    descripcion=request.getParameter("nomproducto");
                    precio=Double.parseDouble(request.getParameter("precio"));
                    cant=Integer.parseInt(request.getParameter("cant"));
                    subtotal=precio*cant;
                    v=new Ventas();
                    v.setItem(item);
                    v.setIdproducto(cod);
                    v.setDescripcionP(descripcion);
                    v.setPrecio(precio);
                    v.setCantidad(cant);
                    v.setSubtotal(subtotal); 
                    lista.add(v);
                    for (int i=0; i<lista.size(); i++){
                        totalPagar=totalPagar + lista.get(i).getSubtotal();
                    }
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("lista", lista);
                    break;
                case "GenerarVenta":
                    v.setIdcliente(cli.getId());
                    v.setIdempleado(2);
                    v.setNumserie(numeroserie);
                    v.setFecha("2023-05-15");
                    v.setMonto(totalPagar);
                    v.setEstado("1");
                    vdao.guardarVenta(v);
                    
                    int idv=Integer.parseInt(vdao.IdVentas());
                    for(int i=0; i <lista.size(); i++){
                        v=new Ventas();
                        v.setId(idv);
                        v.setIdproducto(lista.get(i).getIdproducto());
                        v.setCantidad(lista.get(i).getCantidad());
                        v.setPrecio(lista.get(i).getPrecio());
                        vdao.guardarDetalleventas(v);
                    }                  
                    break;    
                default:
                    /* Codigo Critico */
                    v=new Ventas();
                    lista= new ArrayList<>();
                    item=0;
                    totalPagar=0.0;
                    
                    numeroserie= vdao.GenerarSerie();
                    if(numeroserie==null){
                        numeroserie="00000001";
                        request.setAttribute("nserie", numeroserie);
                    } else {
                        int incrementar=Integer.parseInt(numeroserie);
                        GenerarSerie gs= new GenerarSerie();
                        numeroserie=gs.NumeroSerie(incrementar);
                        request.setAttribute("nserie", numeroserie);
                    }        
                    request.getRequestDispatcher("Ventas.jsp").forward(request,response);
            }
            request.getRequestDispatcher("Ventas.jsp").forward(request,response);
        }
        
        if(menu.equals("Reportes")){
            request.getRequestDispatcher("Reportes.jsp").forward(request,response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
