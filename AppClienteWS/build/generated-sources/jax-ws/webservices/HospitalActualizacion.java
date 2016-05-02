
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hospital_actualizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hospital_actualizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hospital_actualizacion", propOrder = {
    "hospital"
})
public class HospitalActualizacion {

    protected String hospital;

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

}
