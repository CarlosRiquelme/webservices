/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Modelo.Actualizacion;
import Modelo.Actualizacion_Hospital;
import Modelo.Historial_Clinico;
import Modelo.Hospital;
import Modelo.Medico;
import Modelo.Paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;

/**
 *
 * @author toshiba
 */
public class ActualizarService {
    
    
    public String  ConsultaMaestro(String timeout, String hospital) throws SQLException 
    {
        long time_start, time_end;
        int otro;
        long tiempo = 0;
        time_start = System.currentTimeMillis();
        String servidor = "jdbc:postgresql://localhost/";
        String respuesta="fallido";
        if(hospital.equals("hospital1")){
            servidor = servidor+"Hospital1";
        }
        if(hospital.equals("hospital2")){
            servidor = servidor+"Hospital2";
        }
        if(hospital.equals("hospital3")){
            servidor = servidor+"Hospital3";
        }
        String maestro="jdbc:postgresql://localhost/HospitalMaestro";
        Connection miConexionMaestro=ConnectionDB.GetConnection(maestro);
        Connection miConexion = ConnectionDB.GetConnection(servidor);
                
        System.out.println("Mi conexion: "+miConexion);
        ArrayList<Paciente> paciente_lista = new ArrayList(); 
        ArrayList<Medico> medico_lista = new ArrayList(); 
        ArrayList<Historial_Clinico> historial_lista =new  ArrayList();
        String consulta="";
        
        if(miConexion != null && miConexionMaestro !=null){
            try {
                Statement s = miConexion.createStatement();
                Statement s2=miConexionMaestro.createStatement();
                miConexion.setAutoCommit(false);
                miConexionMaestro.setAutoCommit(false);
                ResultSet rs = s.executeQuery ("select * from historial_clinico where enviado = 'false'");
                while (rs.next()){
                    Historial_Clinico historial=new Historial_Clinico();
                    historial.setDiagnostico(rs.getString("diagnostico"));
                    historial.setEnfermedad(rs.getString("enfermedad"));
                    historial.setFecha(rs.getString("fecha"));
                    historial.setHospital(rs.getString("hospital"));
                    historial.setMedico_id(rs.getInt("medico_id"));
                    historial.setSintomas(rs.getString("sintomas"));
                    historial.setPaciente_id(rs.getInt("paciente_id"));
                    historial.setEnviado(rs.getString("enviado"));
                    historial.setId(rs.getInt("id"));
                    historial_lista.add(historial);
                }
                
                rs = s.executeQuery ("select * from paciente where enviado = 'false'");
                while (rs.next()){
                    Paciente paciente=new Paciente();
                    paciente.setNombre(rs.getString("nombre"));
                    paciente.setEnviado(rs.getString("enviado"));
                    paciente.setId(rs.getInt("id"));
                    paciente_lista.add(paciente);
                }
                
                rs = s.executeQuery ("select * from medico where enviado = 'false'");
                while (rs.next()){
                    Medico medico=new Medico();
                    medico.setNombre(rs.getString("nombre"));
                    medico.setEnviado(rs.getString("enviado"));
                    medico.setId(rs.getInt("id"));
                    medico_lista.add(medico);
                }
                if(historial_lista != null){
                for (Historial_Clinico h:historial_lista){
                    s2.executeUpdate("INSERT INTO historial_clinico ( diagnostico, sintomas, enfermedad,fecha,hospital,paciente_id, medico_id) VALUES ('" + h.getDiagnostico() + "','" + h.getSintomas() + "','"+ h.getEnfermedad() + "','"+h.getFecha().trim()+"','"+h.getHospital().trim()+"',"+ Integer.toString(h.getPaciente_id())+ ","+ Integer.toString(h.getMedico_id()) +");");
                    System.out.println("hola1 -->"+s);
                    s.executeUpdate("update historial_clinico set enviado= 'true' where id = "+h.getId());
                    System.out.println("hola3");
                }}
                for(Paciente p:paciente_lista){
                    
                    consulta="INSERT INTO paciente (nombre, codigo_paciente,hospital) VALUES ('"+p.getNombre()+ "',"+ Integer.toString(p.getId()) +",'"+hospital+"');";
                    s2.executeUpdate(consulta);
                    consulta="update paciente set enviado= 'true' where id = "+Integer.toString(p.getId());
                    s.executeUpdate(consulta);
                }
                for(Medico m:medico_lista){
                    
                    consulta="INSERT INTO medico (nombre, codigo_medico,hospital) VALUES ('"+m.getNombre()+ "',"+ Integer.toString(m.getId()) +",'"+hospital+"');";
                    s2.executeUpdate(consulta);
                    consulta="update medico set enviado= 'true' where id = "+Integer.toString(m.getId());
                    s.executeUpdate(consulta);
                }
                Date myDate = new Date();
                String fecha =myDate.toString();
                consulta="INSERT INTO actualizacion (fecha) VALUES ('"+fecha+ "');";
                s.executeUpdate(consulta);
                time_end = System.currentTimeMillis();
                tiempo = time_end - time_start;
                otro = Integer.valueOf(String.valueOf(tiempo));
                long timeout2=Long.parseLong(timeout);
                int otro2=Integer.valueOf(String.valueOf(timeout2));
                System.out.println("tiempo total -->"+tiempo);
                System.out.println("tiempo estimado -->"+timeout);
                rango(otro,otro2);
                miConexion.commit();
                miConexionMaestro.commit();
                respuesta="exitoso";

            } catch (SQLException ex) {
                miConexion.rollback();
                miConexionMaestro.rollback();
                String mensaje=ex.getMessage();
            }
        }
        return respuesta;
    }
    static void rango (int num,int timeout) throws SQLException {
        if(num > timeout){
            throw new SQLException();
        }
    }
    
     public  List<Actualizacion> GuardarActualizacion( String estado, String hospital) 
    {
        
        String servidor="jdbc:postgresql://localhost/HospitalMaestro";
        Date myDate = new Date();
        String fecha =myDate.toString();
        System.out.println("fecha "+fecha);
        Actualizacion act=null;
        Connection miConexion = ConnectionDB.GetConnection(servidor);
        ArrayList<Actualizacion> lista =new  ArrayList();
        System.out.println("Mi conexion: "+miConexion);
         
        
        if(miConexion != null){
           
            try {
                Statement s = miConexion.createStatement();
                String consulta="INSERT INTO actualizacion (fecha,hospital,estado) VALUES ('"+fecha.trim()+ "','"+hospital.trim()+"','"+estado.trim()+"');";
                s.executeUpdate(consulta);
                consulta="SELECT * FROM actualizacion ";
                ResultSet rs = s.executeQuery (consulta);
                
                while (rs.next()){
                    
                    act=new Actualizacion();
                    act.setId(rs.getInt("id"));
                    act.setFecha(rs.getString("fecha"));
                    act.setEstado(rs.getString("estado"));
                    act.setHospital(rs.getString("hospital"));
                    lista.add(act);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ActualizarService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
     
     public Actualizacion_Hospital ultimaActualizacion(String hospital){
        
        String servidor=""; 
        if(hospital.equals("hospital1")){
            servidor = "jdbc:postgresql://localhost/Hospital1";
            System.out.println("soy servido 1");
        }
        if(hospital.equals("hospital2")){
            servidor = "jdbc:postgresql://localhost/Hospital2";
        }
        if(hospital.equals("hospital3")){
            servidor = "jdbc:postgresql://localhost/Hospital3";
        }
        ArrayList<Historial_Clinico> lista = new ArrayList(); 
        
        Connection miConexion = ConnectionDB.GetConnection(servidor);
                
        System.out.println("Mi conexion: "+miConexion);
        Actualizacion_Hospital act=null; 
        if(miConexion != null){
           
            try {
                
                Statement s = miConexion.createStatement();
                String consulta="SELECT *  FROM  actualizacion where fecha = ( SELECT MAX(fecha) FROM actualizacion);";
                ResultSet rs = s.executeQuery (consulta);
                
                while (rs.next()){
                    
                    act=new Actualizacion_Hospital();
                    act.setId(rs.getInt("id"));
                    act.setFecha(rs.getString("fecha"));
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return act;
     }
}

