<%-- 
    Document   : index
    Created on : 30/04/2016, 08:10:47 PM
    Author     : toshiba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1 style="text-align: center;">Ingresar</h1>
        <form action="SAutentificacion" method="POST">
            <table border="0" style="margin-left: 38%;">
                <tbody>
                    <tr>
                        <td>Codigo:</td>
                        <td><input type="text" name="txtcodigo" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="txtPass" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nombre del Hospital:</td>
                        <td><select name="cboHospital">
                                <option value="hospital1">Hospital1</option>
                                <option value="hospital2">Hospital2</option>
                                <option value="hospital3">Hospital3</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Ingresar" name="btnIngresar" /></td>

                    </tr>
                </tbody>
            </table>

            
        </form>
    </body>
</html>
