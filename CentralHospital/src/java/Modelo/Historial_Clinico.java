/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author toshiba
 */
public class Historial_Clinico {
    
    
    private Integer id;
    private Integer paciente_id;
    private Integer medico_id;
    private String hospital;
    private String fecha;
    private String diagnostico;
    private String sintomas;
    private String enfermedad;
    private String enviado;

    public String getEnviado() {
        return enviado;
    }

    public void setEnviado(String enviado) {
        this.enviado = enviado;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Integer paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Integer getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(Integer medico_id) {
        this.medico_id = medico_id;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    
    
    
}
