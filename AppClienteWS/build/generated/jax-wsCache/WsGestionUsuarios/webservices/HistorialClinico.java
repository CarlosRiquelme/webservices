
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para historialClinico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="historialClinico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnostico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enfermedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enviado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="medico_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paciente_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sintomas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historialClinico", propOrder = {
    "diagnostico",
    "enfermedad",
    "enviado",
    "fecha",
    "hospital",
    "id",
    "medicoId",
    "pacienteId",
    "sintomas"
})
public class HistorialClinico {

    protected String diagnostico;
    protected String enfermedad;
    protected String enviado;
    protected String fecha;
    protected String hospital;
    protected Integer id;
    @XmlElement(name = "medico_id")
    protected Integer medicoId;
    @XmlElement(name = "paciente_id")
    protected Integer pacienteId;
    protected String sintomas;

    /**
     * Obtiene el valor de la propiedad diagnostico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Define el valor de la propiedad diagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnostico(String value) {
        this.diagnostico = value;
    }

    /**
     * Obtiene el valor de la propiedad enfermedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     * Define el valor de la propiedad enfermedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnfermedad(String value) {
        this.enfermedad = value;
    }

    /**
     * Obtiene el valor de la propiedad enviado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviado() {
        return enviado;
    }

    /**
     * Define el valor de la propiedad enviado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviado(String value) {
        this.enviado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad hospital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * Define el valor de la propiedad hospital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospital(String value) {
        this.hospital = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad medicoId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedicoId() {
        return medicoId;
    }

    /**
     * Define el valor de la propiedad medicoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedicoId(Integer value) {
        this.medicoId = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPacienteId() {
        return pacienteId;
    }

    /**
     * Define el valor de la propiedad pacienteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPacienteId(Integer value) {
        this.pacienteId = value;
    }

    /**
     * Obtiene el valor de la propiedad sintomas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSintomas() {
        return sintomas;
    }

    /**
     * Define el valor de la propiedad sintomas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSintomas(String value) {
        this.sintomas = value;
    }

}
