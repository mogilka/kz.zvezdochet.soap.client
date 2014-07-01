
package kz.zvezdochet.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.zvezdochet.soap.client package. 
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

    private final static QName _Configuration_QNAME = new QName("configuration", "configuration");
    private final static QName _Planet_QNAME = new QName("planet", "planet");
    private final static QName _House_QNAME = new QName("house", "house");
    private final static QName _Calculate_QNAME = new QName("http://server.soap.zvezdochet.kz/", "calculate");
    private final static QName _CalculateResponse_QNAME = new QName("http://server.soap.zvezdochet.kz/", "calculateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.zvezdochet.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calculate }
     * 
     */
    public Calculate createCalculate() {
        return new Calculate();
    }

    /**
     * Create an instance of {@link CalculateResponse }
     * 
     */
    public CalculateResponse createCalculateResponse() {
        return new CalculateResponse();
    }

    /**
     * Create an instance of {@link Planet }
     * 
     */
    public Planet createPlanet() {
        return new Planet();
    }

    /**
     * Create an instance of {@link House }
     * 
     */
    public House createHouse() {
        return new House();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "configuration", name = "configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Planet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "planet", name = "planet")
    public JAXBElement<Planet> createPlanet(Planet value) {
        return new JAXBElement<Planet>(_Planet_QNAME, Planet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link House }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "house", name = "house")
    public JAXBElement<House> createHouse(House value) {
        return new JAXBElement<House>(_House_QNAME, House.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.zvezdochet.kz/", name = "calculate")
    public JAXBElement<Calculate> createCalculate(Calculate value) {
        return new JAXBElement<Calculate>(_Calculate_QNAME, Calculate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.zvezdochet.kz/", name = "calculateResponse")
    public JAXBElement<CalculateResponse> createCalculateResponse(CalculateResponse value) {
        return new JAXBElement<CalculateResponse>(_CalculateResponse_QNAME, CalculateResponse.class, null, value);
    }

}
