/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import webservices.ActualizacionHospital;
import webservices.Medico;
import webservices.WsGestionUsuarios_Service;

/**
 *
 * @author toshiba
 */
@WebServlet(name = "SAutentificacion", urlPatterns = {"/SAutentificacion"})
public class SAutentificacion extends HttpServlet {
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
        String id2=request.getParameter("txtcodigo");
        String pass=request.getParameter("txtPass");
        String hospital=request.getParameter("cboHospital");
        int id=Integer.parseInt(id2);
        Medico medico= validarMedico(id, pass, hospital);
        ActualizacionHospital act=hospitalActualizacion(hospital);
        
        if (medico !=null){
            HttpSession session=request.getSession();
            session.setAttribute("validMedico", medico);
            session.setAttribute("hospital", hospital);
            session.setAttribute("actualizacionHospital", act);
            response.sendRedirect("ventanaMedico.jsp");
        }else{
            response.sendRedirect("index.jsp");
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

    private Medico validarMedico(int id, java.lang.String password, java.lang.String hospital) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WsGestionUsuarios port = service.getWsGestionUsuariosPort();
        return port.validarMedico(id, password, hospital);
    }

    private ActualizacionHospital hospitalActualizacion(java.lang.String hospital) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WsGestionUsuarios port = service.getWsGestionUsuariosPort();
        return port.hospitalActualizacion(hospital);
    }
    
    
    
    

}
