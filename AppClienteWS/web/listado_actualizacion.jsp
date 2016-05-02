<%-- 
    Document   : listado_historial
    Created on : 01/05/2016, 06:06:19 PM
    Author     : toshiba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizacion</title>
    </head>
    <body>
       
        
        
        <h2>Listado de Actualizaciones de la Base de Datos Maestra</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th>Hospital</th>
                        <th>Fecha</th>
                        <th>Estado</th>

                    </tr>
                </thead>
                <tbody>
                    <jsp:useBean id="listadoactualizacion" scope="session" class="java.util.List<webservices.Actualizacion>" />
                    <c:forEach var="act" items="${listadoactualizacion}">
                    <tr>
                        <td>${act.hospital}</td>
                        <td>${act.fecha}</td>
                        <td>${act.estado}</td>
                    </tr>
                    </c:forEach>
                    
                </tbody>
            </table>

        
        
    </body>
</html>
