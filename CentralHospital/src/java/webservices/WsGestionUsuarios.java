/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import Connection.ActualizarService;
import Connection.ConsultasDB;
import Modelo.Actualizacion;
import Modelo.Actualizacion_Hospital;
import Modelo.Historial_Clinico;
import Modelo.Medico;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author toshiba
 */
@WebService(serviceName = "WsGestionUsuarios")
public class WsGestionUsuarios {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validarMedico")
    public Medico validarMedico(@WebParam(name = "id") int id, @WebParam(name = "password") String password, @WebParam(name = "hospital") String hospital) {
        
        Medico medico=null;
        try {
            ConsultasDB med=new ConsultasDB();
            medico=med.verificarMedico(id, password, hospital);
            if(medico != null){
                System.out.println("Ingreso el medico: "+medico.getNombre());
                System.out.println("Hospital:  "+hospital);
            }

        } catch (SQLException ex) {
            Logger.getLogger(WsGestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return medico;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultaPaciente")
    public List<Historial_Clinico> consultaPaciente(@WebParam(name = "id") String id, @WebParam(name = "medico") Medico medico) {
         List<Historial_Clinico> historial;
         ConsultasDB consulta =new ConsultasDB();
         String hospital=(String)medico.getHospital();
         historial=consulta.consultaHistorial(id, medico,hospital);
              
         return historial;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "historialEntreFechas")
    public List<Historial_Clinico> historialEntreFechas(@WebParam(name = "fechaInicio") String fechaInicio, @WebParam(name = "fechaFin") String fechaFin, @WebParam(name = "hospital") String hospital) {
         List<Historial_Clinico> historial;
         ConsultasDB consulta =new ConsultasDB();
         historial=consulta.consultaHistorialFechas(fechaInicio, fechaFin,hospital);
         return historial;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizar")
    public List<Actualizacion> actualizar(@WebParam(name = "timeout") String timeout, @WebParam(name = "hospital") String hospital) {
        ArrayList<Actualizacion> lista =null;
        try {
            ActualizarService act= new ActualizarService();
            String estado=act.ConsultaMaestro(timeout, hospital);
            lista =   (ArrayList<Actualizacion>) act.GuardarActualizacion(estado, hospital);
            
        } catch (SQLException ex) {
            Logger.getLogger(WsGestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "hospital_actualizacion")
    public Actualizacion_Hospital hospital_actualizacion(@WebParam(name = "hospital") String hospital) {
        ActualizarService act=new ActualizarService();
        Actualizacion_Hospital act_hospital=act.ultimaActualizacion(hospital);
        return act_hospital;
    }
    
    
    
    
    

  
}
