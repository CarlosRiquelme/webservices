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
        <h2>Consulta de Historia Clinica del Paciente</h2>
        <form action="SConsultaPaciente">
           <table border="0">
                <tr>
                    <td>Codigo Paciente</td>
                    <td><input type="text" name="txtConsulta" value="" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Consultar" name="btnConsultar" /></td>

                </tr>
            </table>

        </form>
        <h2>Listado de Historial Clinico</h2>
        <form action="SConsultaHistorial">
            <table border="0">
                <tr>
                    <td>Fecha Inicio:</td>
                    <td><input type="text" name="txtfecha_inicio" value="" /></td>
                </tr>
                <tr>
                    <td>Fecha Fin:</td>
                    <td><input type="text" name="txtfecha_fin" value="" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Consultar" name="btnConsultar" /></td>

                </tr>
            </table>

        </form>
         <h3>Actualizar</h3>
        <form action="SActualizar">
           <table border="0">
                <tr>
                    <td>Tiempo ml: </td>
                    <td><input type="text" name="txttiempo" value="" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Actualizar" name="btnActualizar" /></td>

                </tr>
            </table>

        </form>
        
        
    </body>
</html>
