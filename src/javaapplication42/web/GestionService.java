package javaapplication42.web;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
		name = "GestionService",
		targetNamespace = "http://ws/",
		wsdlLocation = "http://62.15.232.241:9090/WebConnector/GestionService?wsdl"
)
public class GestionService extends Service {
	private static final URL GESTIONSERVICE_WSDL_LOCATION;
	private static final WebServiceException GESTIONSERVICE_EXCEPTION;
	private static final QName GESTIONSERVICE_QNAME = new QName("http://ws/", "GestionService");

	static {
		URL url = null;
		WebServiceException e = null;

		try {
			url = new URL("http://62.15.232.241:9090/WebConnector/GestionService?wsdl");
		} catch (MalformedURLException var3) {
			e = new WebServiceException(var3);
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

	@WebEndpoint(
			name = "GestionPort"
	)
	public Gestion getGestionPort() {
		return (Gestion)super.getPort(new QName("http://ws/", "GestionPort"), Gestion.class);
	}

	@WebEndpoint(
			name = "GestionPort"
	)
	public Gestion getGestionPort(WebServiceFeature... features) {
		return (Gestion)super.getPort(new QName("http://ws/", "GestionPort"), Gestion.class, features);
	}

	private static URL __getWsdlLocation() {
		if (GESTIONSERVICE_EXCEPTION != null) {
			throw GESTIONSERVICE_EXCEPTION;
		} else {
			return GESTIONSERVICE_WSDL_LOCATION;
		}
	}
}
