<%-- 
    Document   : listado_entreFechas
    Created on : 01/05/2016, 08:55:01 PM
    Author     : toshiba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
    </head>
    <body>
        <h1>Listado entre  Fechas</h1>
        <table border="1">
                <thead>
                    <tr>
                        <th>Paciente</th>
                        <th>Fecha</th>
                        <th>Diagnostico</th>
                        <th>Sintomas</th>
                        <th>Enfermedad</th>
                    </tr>
                </thead>
                <tbody>
                    <jsp:useBean id="listaEntreFecha" scope="session" class="java.util.List<webservices.HistorialClinico>" />
                    <c:forEach var="historial" items="${listaEntreFecha}">
                    <tr>
                        <td>${historial.pacienteId}</td>
                        <td>${historial.fecha}</td>
                        <td>${historial.diagnostico}</td>
                        <td>${historial.sintomas}</td>
                        <td>${historial.enfermedad}</td>
                    </tr>
                    </c:forEach>
                    
                </tbody>
            </table>


        
    </body>
</html>
