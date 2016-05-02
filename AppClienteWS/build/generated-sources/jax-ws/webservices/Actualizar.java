
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "actualizar", propOrder = {
    "timeout",
    "hospital"
})
public class Actualizar {

    protected String timeout;
    protected String hospital;

    /**
     * Obtiene el valor de la propiedad timeout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * Define el valor de la propiedad timeout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeout(String value) {
        this.timeout = value;
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

}
