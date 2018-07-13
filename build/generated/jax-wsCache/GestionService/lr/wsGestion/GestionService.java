
package lr.wsGestion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GestionService", targetNamespace = "http://ws/", wsdlLocation = "http://62.15.232.241:9090/WebConnector/GestionService?wsdl")
public class GestionService
    extends Service
{

    private final static URL GESTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException GESTIONSERVICE_EXCEPTION;
    private final static QName GESTIONSERVICE_QNAME = new QName("http://ws/", "GestionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://62.15.232.241:9090/WebConnector/GestionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTIONSERVICE_WSDL_LOCATION = url;
        GESTIONSERVICE_EXCEPTION = e;
    }

    public GestionService() {
        super(__getWsdlLocation(), GESTIONSERVICE_QNAME);
    }

    public GestionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTIONSERVICE_QNAME, features);
    }

    public GestionService(URL wsdlLocation) {
        super(wsdlLocation, GESTIONSERVICE_QNAME);
    }

    public GestionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GESTIONSERVICE_QNAME, features);
    }

    public GestionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Gestion
     */
    @WebEndpoint(name = "GestionPort")
    public Gestion getGestionPort() {
        return super.getPort(new QName("http://ws/", "GestionPort"), Gestion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Gestion
     */
    @WebEndpoint(name = "GestionPort")
    public Gestion getGestionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "GestionPort"), Gestion.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTIONSERVICE_EXCEPTION!= null) {
            throw GESTIONSERVICE_EXCEPTION;
        }
        return GESTIONSERVICE_WSDL_LOCATION;
    }

}
