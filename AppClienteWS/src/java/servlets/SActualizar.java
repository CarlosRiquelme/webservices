/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import webservices.Actualizacion;
import webservices.ActualizacionHospital;
import webservices.WsGestionUsuarios_Service;

/**
 *
 * @author toshiba
 */
@WebServlet(name = "SActualizar", urlPatterns = {"/SActualizar"})
public class SActualizar extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CentralHospital/WsGestionUsuarios.wsdl")
    private WsGestionUsuarios_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session=request.getSession();
        String hospital=(String) session.getAttribute("hospital");
        String timeout=(String)request.getParameter("txttiempo");
        List<Actualizacion> act=actualizar(timeout, hospital);
        ActualizacionHospital act2=hospitalActualizacion(hospital);
        session.setAttribute("listadoactualizacion", act);
        session.setAttribute("actualizacionHospital", act2);
        response.sendRedirect("listado_actualizacion.jsp");
 
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

    private java.util.List<webservices.Actualizacion> actualizar(java.lang.String timeout, java.lang.String hospital) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WsGestionUsuarios port = service.getWsGestionUsuariosPort();
        return port.actualizar(timeout, hospital);
    }

    private ActualizacionHospital hospitalActualizacion(java.lang.String hospital) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WsGestionUsuarios port = service.getWsGestionUsuariosPort();
        return port.hospitalActualizacion(hospital);
    }
    

}
