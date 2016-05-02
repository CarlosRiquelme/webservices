/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automatizar;

import Connection.ActualizarService;
import Modelo.Actualizacion;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

//@autor Henry Joe Wong Urquiza

//La clase que tiene la tarea debe de implementar de la clase Job de Quartz
//ya que el programador de la tarea va a buscar una clase que implemente de ella
//y buscara el metodo execute para ejecutar la tarea
public class TareaInvocar implements Job {

  //Metodo que se ejecutara cada cierto tiempo que lo programemos despues
  public void execute(JobExecutionContext jec) throws JobExecutionException {
    //Aca pueden poner la tarea o el job que desean automatizar
    //Por ejemplo enviar correo, revisar ciertos datos, etc
      ActualizarService actualizar=new ActualizarService();
      String estado="exitoso";
      String hospital="hospital1";
      List<Actualizacion> actu=actualizar.GuardarActualizacion(estado,hospital );
      hospital="hospital2";
      actu=actualizar.GuardarActualizacion(estado,hospital );
      hospital="hospital3";
      actu=actualizar.GuardarActualizacion(estado,hospital );   
      SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
      System.out.println( "Tarea invocada a la hora: " + formato.format(new Date()));
  }
}
