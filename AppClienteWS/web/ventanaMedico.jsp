<%-- 
    Document   : ventanaMedico
    Created on : 30/04/2016, 08:41:10 PM
    Author     : toshiba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medico</title>
    </head>
    <body>
        <h1>Bienvenido
            <jsp:useBean id="validMedico" scope="session" class="webservices.Medico" />
            <jsp:getProperty name="validMedico" property="nombre" />
        </h1>
        
        
        
    </body>
</html>
