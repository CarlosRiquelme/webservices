/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Modelo.Historial_Clinico;
import Modelo.Hospital;
import Modelo.Medico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/**
 *
 * @author toshiba
 */
public class ConsultasDB {
    
    public static JSONArray ConsultaMaestro() throws SQLException
    {
        String servidor = "jdbc:postgresql://localhost/WSDistri";
        
        Connection miConexion = ConnectionDB.GetConnection(servidor);
                
        System.out.println("Mi conexion: "+miConexion);
        ArrayList<Hospital> lista = new ArrayList(); 
        JSONArray array=null;
        String formatoJSON=""; 
        if(miConexion != null){
            Statement s = miConexion.createStatement(); 
            ResultSet rs = s.executeQuery ("select * from hospital");
            boolean isRecord = false;
            
            
            while (rs.next()){       
                Hospital hospital=new Hospital();
                hospital.setId(rs.getInt("id"));
                hospital.setNombre(rs.getString("nombre"));
                lista.add(hospital);
                isRecord = true;
              
            }
          array = new JSONArray(lista);    
        }
        return array;
    }
    
    public  Medico verificarMedico(int id, String password, String hospital) throws SQLException
    {
        
        String servidor = "jdbc:postgresql://localhost/";
        
        if(hospital.equals("hospital1")){
            servidor = servidor+"Hospital1";
        }
        if(hospital.equals("hospital2")){
            servidor = servidor+"Hospital2";
        }
        if(hospital.equals("hospital3")){
            servidor = servidor+"Hospital3";
        }
        
        Medico medico=null;
        Connection miConexion = ConnectionDB.GetConnection(servidor);
                
        System.out.println("Mi conexion: "+miConexion);
         
        
        if(miConexion != null){
           
            Statement s = miConexion.createStatement(); 
            String consulta="select * from medico where id = "+Integer.toString(id)+" and password = '"+password+"'";
            
            ResultSet rs = s.executeQuery (consulta);
            
            while (rs.next()){       
               
                medico=new Medico();
                medico.setId(rs.getInt("id"));
                medico.setNombre(rs.getString("nombre"));
                medico.setPassword(rs.getString("password"));
                medico.setHospital(rs.getString("hospital"));
            }
        }
        return medico;
    }
    public List<Historial_Clinico> consultaHistorial(String id, Medico medico) throws SQLException{
        
        String servidor = "jdbc:postgresql://localhost/";
        String hospital=medico.getHospital();
        ArrayList<Historial_Clinico> lista = new ArrayList(); 
        if(hospital.equals("hospital1")){
            servidor = servidor+"Hospital1";
        }
        if(hospital.equals("hospital2")){
            servidor = servidor+"Hospital2";
        }
        if(hospital.equals("hospital3")){
            servidor = servidor+"Hospital3";
        }
        
        
        Connection miConexion = ConnectionDB.GetConnection(servidor);
                
        System.out.println("Mi conexion: "+miConexion);
         
        
        if(miConexion != null){
           
            Statement s = miConexion.createStatement(); 
            String consulta="select * from medico where id = "+id;
            
            ResultSet rs = s.executeQuery (consulta);
            
            while (rs.next()){       
               
                Historial_Clinico historial=new Historial_Clinico();
                historial.setId(rs.getInt("id"));
                historial.setPaciente_id(rs.getInt("paciente_id"));
                historial.setMedico_id(rs.getInt("medico_id"));
                historial.setHospital_id(rs.getInt("hospital_id"));
                historial.setEnfermedad(rs.getString("enfermedad"));
                historial.setDiagnostico(rs.getString("diagnostico"));
                historial.setSintomas(rs.getString("sintomas"));
                historial.setFecha(rs.getString("fecha"));
                lista.add(historial);
            }
        }
        return lista;
        
        
    }
    
    
    
}