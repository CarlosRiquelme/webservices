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
        <title>Historial</title>
    </head>
    <body>
       
        
        
        <h1>Listado de Historial Clinico</h1>
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
                    <jsp:useBean id="listahistorial" scope="session" class="java.util.List<webservices.HistorialClinico>" />
                    <c:forEach var="historial" items="${listahistorial}">
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
