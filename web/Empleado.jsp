<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="d-flex">
        <div class="card col-sm-4">
            <div class="card-body">
                <form action="Controlador?menu=Empleado" method="POST">
                    <div class="form-group">
                      <label>Nombres</label>
                      <input type="text" value="${empleados.getNom()}" name="txtNombres" class="form-control">
                    </div>
                    <div class="form-group">
                      <label>Correo</label>
                      <input type="text" value="${empleados.getCorr()}" name="txtCorreo" class="form-control">
                    </div>
                    <div class="form-group">
                      <label>Edad</label>
                      <input type="text" value="${empleados.getEd()}" name="txtEdad" class="form-control">
                    </div>
                    <div class="form-group">
                      <label>Cargo</label>
                      <input type="text" value="${empleados.getCarg()}" name="txtCargo" class="form-control">
                    </div>
                    <div class="form-group">
                      <label>Direccion</label>
                      <input type="text" value="${empleados.getDir()}" name="txtDireccion" class="form-control">
                    </div>
                    <div class="form-group">
                      <label>Telefono</label>
                      <input type="text" value="${empleados.getTel()}" name="txtTelefono" class="form-control">
                    </div>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                </form>             
            </div>
        </div>          
        <div class="col-sm-8">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRES</th>
                        <th>CORREO</th>
                        <th>EDAD</th>
                        <th>CARGO</th>
                        <th>DIRECCION</th>
                        <th>TELEFONO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="em" items="${empleado}">
                    <tr>
                        <td>${em.getId()}</td>
                        <td>${em.getNom()}</td>
                        <td>${em.getCorr()}</td>
                        <td>${em.getEd()}</td>
                        <td>${em.getCarg()}</td>
                        <td>${em.getDir()}</td>
                        <td>${em.getTel()}</td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=Empleado&accion=Editar&id=${em.getId()}">Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=Empleado&accion=Delete&id=${em.getId()}">Delete</a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>   
        </div>
        </div>        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
