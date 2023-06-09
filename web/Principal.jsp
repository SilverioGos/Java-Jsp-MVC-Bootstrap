
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="style1.css">
</head>
<body>  
    <div id="sidemenu" class="menu-expanded">
        <div id="header">
            <div id="title"><span>DATA - TEC</span></div>
            <div id="menu-btn">
                <div class="btn-hamburger"></div>
                <div class="btn-hamburger"></div>
                <div class="btn-hamburger"></div>
            </div>
        </div>
        <div id="profile">
            <div id="photo"><img src="img/usemin.png" alt=""></div> 
            <div id="name"><span><a>${usuario.getNom()}</a></span></div>
        </div>
        <br>
        <div id="menu-items">
            <div class="item">
                <a href="Controlador?menu=Clientes&accion=Listar" target="myFrame">
                    <div class="icon"><img src="img/vist.png" alt=""></div>
                    <div class="title"><span>CLIENTES</span></div>
                </a>
            </div>
            
            <div class="item">
                <a href="Controlador?menu=Productos&accion=Listar" target="myFrame">
                    <div class="icon"><img src="img/prod.png" alt=""></div>
                    <div class="title"><span>PRODUCTOS</span></div>
                </a>
            </div>
            
            <div class="item">
                <a href="Controlador?menu=Empleado&accion=Listar" target="myFrame">
                    <div class="icon"><img src="img/trab.png" alt=""></div>
                    <div class="title"><span>EMPLEADOS</span></div>
                </a>
            </div>
            
            <div class="item">
                <a href="Controlador?menu=Ventas&accion=default" target="myFrame">
                    <div class="icon"><img src="img/vit.png" alt=""></div>
                    <div class="title"><span>VENTAS</span></div>
                </a>
            </div>
            
            <div class="item">
                <a href="Controlador?menu=Reportes" target="myFrame">
                    <div class="icon"><img src="img/report.png" alt=""></div>
                    <div class="title"><span>REPORTES</span></div>
                </a>
            </div>
            <br>
            <div id="profile">               
            </div>          
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            
            
            <div class="item">
                <a href="#">
                    <form action="Validar" method="POST">
                        <button name="accion" value="Salir" class="dropdown-item" href="#">
                            <div class="icon"><img src="img/sali.png" alt=""></div>
                            <div class="title"><span>Cerrar Sesion</span></div>
                        </button>
                    </form>
                </a>
            </div>
        </div>
    </div>    
    <div class="m-5" style="height:750px; ">
        <iframe name="myFrame" style="height:100%; width:100%; border: none"></iframe>
    </div>
    <script>
        const btn = document.querySelector('#menu-btn');
        const menu = document.querySelector('#sidemenu');
        btn.addEventListener('click', e =>{
            menu.classList.toggle("menu-expanded");
            menu.classList.toggle("menu-collapsed");
            document.querySelector('body').classList.toggle('body-expanded');
        });
    </script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>