
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidarMedico_QNAME = new QName("http://webservices/", "validarMedico");
    private final static QName _HistorialEntreFechasResponse_QNAME = new QName("http://webservices/", "historialEntreFechasResponse");
    private final static QName _HospitalActualizacionResponse_QNAME = new QName("http://webservices/", "hospital_actualizacionResponse");
    private final static QName _Actualizar_QNAME = new QName("http://webservices/", "actualizar");
    private final static QName _ConsultaPacienteResponse_QNAME = new QName("http://webservices/", "consultaPacienteResponse");
    private final static QName _ActualizarResponse_QNAME = new QName("http://webservices/", "actualizarResponse");
    private final static QName _ValidarMedicoResponse_QNAME = new QName("http://webservices/", "validarMedicoResponse");
    private final static QName _HospitalActualizacion_QNAME = new QName("http://webservices/", "hospital_actualizacion");
    private final static QName _HistorialEntreFechas_QNAME = new QName("http://webservices/", "historialEntreFechas");
    private final static QName _ConsultaPaciente_QNAME = new QName("http://webservices/", "consultaPaciente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPaciente }
     * 
     */
    public ConsultaPaciente createConsultaPaciente() {
        return new ConsultaPaciente();
    }

    /**
     * Create an instance of {@link HistorialEntreFechas }
     * 
     */
    public HistorialEntreFechas createHistorialEntreFechas() {
        return new HistorialEntreFechas();
    }

    /**
     * Create an instance of {@link HospitalActualizacion }
     * 
     */
    public HospitalActualizacion createHospitalActualizacion() {
        return new HospitalActualizacion();
    }

    /**
     * Create an instance of {@link ValidarMedicoResponse }
     * 
     */
    public ValidarMedicoResponse createValidarMedicoResponse() {
        return new ValidarMedicoResponse();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link ConsultaPacienteResponse }
     * 
     */
    public ConsultaPacienteResponse createConsultaPacienteResponse() {
        return new ConsultaPacienteResponse();
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ValidarMedico }
     * 
     */
    public ValidarMedico createValidarMedico() {
        return new ValidarMedico();
    }

    /**
     * Create an instance of {@link HospitalActualizacionResponse }
     * 
     */
    public HospitalActualizacionResponse createHospitalActualizacionResponse() {
        return new HospitalActualizacionResponse();
    }

    /**
     * Create an instance of {@link HistorialEntreFechasResponse }
     * 
     */
    public HistorialEntreFechasResponse createHistorialEntreFechasResponse() {
        return new HistorialEntreFechasResponse();
    }

    /**
     * Create an instance of {@link Actualizacion }
     * 
     */
    public Actualizacion createActualizacion() {
        return new Actualizacion();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link ActualizacionHospital }
     * 
     */
    public ActualizacionHospital createActualizacionHospital() {
        return new ActualizacionHospital();
    }

    /**
     * Create an instance of {@link HistorialClinico }
     * 
     */
    public HistorialClinico createHistorialClinico() {
        return new HistorialClinico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "validarMedico")
    public JAXBElement<ValidarMedico> createValidarMedico(ValidarMedico value) {
        return new JAXBElement<ValidarMedico>(_ValidarMedico_QNAME, ValidarMedico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialEntreFechasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "historialEntreFechasResponse")
    public JAXBElement<HistorialEntreFechasResponse> createHistorialEntreFechasResponse(HistorialEntreFechasResponse value) {
        return new JAXBElement<HistorialEntreFechasResponse>(_HistorialEntreFechasResponse_QNAME, HistorialEntreFechasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HospitalActualizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "hospital_actualizacionResponse")
    public JAXBElement<HospitalActualizacionResponse> createHospitalActualizacionResponse(HospitalActualizacionResponse value) {
        return new JAXBElement<HospitalActualizacionResponse>(_HospitalActualizacionResponse_QNAME, HospitalActualizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPacienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "consultaPacienteResponse")
    public JAXBElement<ConsultaPacienteResponse> createConsultaPacienteResponse(ConsultaPacienteResponse value) {
        return new JAXBElement<ConsultaPacienteResponse>(_ConsultaPacienteResponse_QNAME, ConsultaPacienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "actualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarMedicoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "validarMedicoResponse")
    public JAXBElement<ValidarMedicoResponse> createValidarMedicoResponse(ValidarMedicoResponse value) {
        return new JAXBElement<ValidarMedicoResponse>(_ValidarMedicoResponse_QNAME, ValidarMedicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HospitalActualizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "hospital_actualizacion")
    public JAXBElement<HospitalActualizacion> createHospitalActualizacion(HospitalActualizacion value) {
        return new JAXBElement<HospitalActualizacion>(_HospitalActualizacion_QNAME, HospitalActualizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialEntreFechas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "historialEntreFechas")
    public JAXBElement<HistorialEntreFechas> createHistorialEntreFechas(HistorialEntreFechas value) {
        return new JAXBElement<HistorialEntreFechas>(_HistorialEntreFechas_QNAME, HistorialEntreFechas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "consultaPaciente")
    public JAXBElement<ConsultaPaciente> createConsultaPaciente(ConsultaPaciente value) {
        return new JAXBElement<ConsultaPaciente>(_ConsultaPaciente_QNAME, ConsultaPaciente.class, null, value);
    }

}
