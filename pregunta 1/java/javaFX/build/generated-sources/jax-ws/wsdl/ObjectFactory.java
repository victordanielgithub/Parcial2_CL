
package wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl package. 
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

    private final static QName _PostgreSQL_QNAME = new QName("http://swpersonacbd.umsa.com/", "PostgreSQL");
    private final static QName _ConexionPostgreSQL_QNAME = new QName("http://swpersonacbd.umsa.com/", "conexionPostgreSQL");
    private final static QName _HelloResponse_QNAME = new QName("http://swpersonacbd.umsa.com/", "helloResponse");
    private final static QName _PostgreSQLResponse_QNAME = new QName("http://swpersonacbd.umsa.com/", "PostgreSQLResponse");
    private final static QName _PersonaListResponse_QNAME = new QName("http://swpersonacbd.umsa.com/", "PersonaListResponse");
    private final static QName _ConexionPostgreSQLResponse_QNAME = new QName("http://swpersonacbd.umsa.com/", "conexionPostgreSQLResponse");
    private final static QName _PersonaList_QNAME = new QName("http://swpersonacbd.umsa.com/", "PersonaList");
    private final static QName _PostgreSQLOK_QNAME = new QName("http://swpersonacbd.umsa.com/", "PostgreSQLOK");
    private final static QName _Hello_QNAME = new QName("http://swpersonacbd.umsa.com/", "hello");
    private final static QName _PostgreSQLOKResponse_QNAME = new QName("http://swpersonacbd.umsa.com/", "PostgreSQLOKResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConexionPostgreSQLResponse }
     * 
     */
    public ConexionPostgreSQLResponse createConexionPostgreSQLResponse() {
        return new ConexionPostgreSQLResponse();
    }

    /**
     * Create an instance of {@link PersonaListResponse }
     * 
     */
    public PersonaListResponse createPersonaListResponse() {
        return new PersonaListResponse();
    }

    /**
     * Create an instance of {@link PostgreSQLResponse }
     * 
     */
    public PostgreSQLResponse createPostgreSQLResponse() {
        return new PostgreSQLResponse();
    }

    /**
     * Create an instance of {@link PostgreSQL }
     * 
     */
    public PostgreSQL createPostgreSQL() {
        return new PostgreSQL();
    }

    /**
     * Create an instance of {@link ConexionPostgreSQL }
     * 
     */
    public ConexionPostgreSQL createConexionPostgreSQL() {
        return new ConexionPostgreSQL();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link PostgreSQLOKResponse }
     * 
     */
    public PostgreSQLOKResponse createPostgreSQLOKResponse() {
        return new PostgreSQLOKResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link PostgreSQLOK }
     * 
     */
    public PostgreSQLOK createPostgreSQLOK() {
        return new PostgreSQLOK();
    }

    /**
     * Create an instance of {@link PersonaList }
     * 
     */
    public PersonaList createPersonaList() {
        return new PersonaList();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostgreSQL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "PostgreSQL")
    public JAXBElement<PostgreSQL> createPostgreSQL(PostgreSQL value) {
        return new JAXBElement<PostgreSQL>(_PostgreSQL_QNAME, PostgreSQL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConexionPostgreSQL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "conexionPostgreSQL")
    public JAXBElement<ConexionPostgreSQL> createConexionPostgreSQL(ConexionPostgreSQL value) {
        return new JAXBElement<ConexionPostgreSQL>(_ConexionPostgreSQL_QNAME, ConexionPostgreSQL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostgreSQLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "PostgreSQLResponse")
    public JAXBElement<PostgreSQLResponse> createPostgreSQLResponse(PostgreSQLResponse value) {
        return new JAXBElement<PostgreSQLResponse>(_PostgreSQLResponse_QNAME, PostgreSQLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "PersonaListResponse")
    public JAXBElement<PersonaListResponse> createPersonaListResponse(PersonaListResponse value) {
        return new JAXBElement<PersonaListResponse>(_PersonaListResponse_QNAME, PersonaListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConexionPostgreSQLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "conexionPostgreSQLResponse")
    public JAXBElement<ConexionPostgreSQLResponse> createConexionPostgreSQLResponse(ConexionPostgreSQLResponse value) {
        return new JAXBElement<ConexionPostgreSQLResponse>(_ConexionPostgreSQLResponse_QNAME, ConexionPostgreSQLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "PersonaList")
    public JAXBElement<PersonaList> createPersonaList(PersonaList value) {
        return new JAXBElement<PersonaList>(_PersonaList_QNAME, PersonaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostgreSQLOK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "PostgreSQLOK")
    public JAXBElement<PostgreSQLOK> createPostgreSQLOK(PostgreSQLOK value) {
        return new JAXBElement<PostgreSQLOK>(_PostgreSQLOK_QNAME, PostgreSQLOK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostgreSQLOKResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swpersonacbd.umsa.com/", name = "PostgreSQLOKResponse")
    public JAXBElement<PostgreSQLOKResponse> createPostgreSQLOKResponse(PostgreSQLOKResponse value) {
        return new JAXBElement<PostgreSQLOKResponse>(_PostgreSQLOKResponse_QNAME, PostgreSQLOKResponse.class, null, value);
    }

}
