package il.co.zipy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

import il.co.zipy.entities.Item;
import il.co.zipy.entities.Order;
import il.co.zipy.entities.SiteAccount;
import il.co.zipy.entities.User;

public class Main {
	private static final String WEB_SERVICE_URL = "http://62.15.232.241:9090/WebConnector/GestionService";

	private static final boolean IS_PROXY_NEEDED = true;

	public static void main(String[] args) throws IOException {
		Order order = new Order();
		order.setAccount(new SiteAccount("952060270", "asalaso@inerttia.es"));
		order.setShippingUser(new User("Alberto Salas Ortega", "11223344", "Marie Curie,20",
				"29590", "Malaga", "Malaga", "ES"));
		order.setInvoiceUser(new User("Inerttia", "33445566", "Marie Curie,20",
				"29590", "Malaga", "Malaga", "ES"));
		order.setOrderDate("2018-05-17");
		order.setOrderNumber("P1234");
		order.setOrderComments("No comments");
		order.setOrderAmount(90);
		order.setPaymentInfo("");
		order.setShippingCosts(10);
		order.setShippingWeight(0);
		order.setDiscount(0);
		order.setCourierCode((short) 0);
		order.setPaymentMethod("R");

		order.addItem(new Item("0ML00001", 1, 5, 0, 0));

		System.out.println(order);

		sendRequest(createXmlStringRequestFromOrder("username", "password", order));
	}


	/**
	 <?xml version="1.0" ?>
	 <S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
		 <S:Body>
			 <ns2:setPedidoWeb3 xmlns:ns2="http://ws/"
				 xmlns:ns3="http://xml.netbeans.org/schema/gestion"
				 xmlns:ns4="http://xml.netbeans.org/schema/comun">

				 <usuario>primorUsername</usuario>
				 <password>primorUsersPass</password>

				 <pedido>
					 <ns3:Numero>0</ns3:Numero>
					 <ns3:Fecha>2018-05-17</ns3:Fecha>
					 <ns3:SuPedido>P1234</ns3:SuPedido>

					 <ns3:Cliente>
						 <ns4:Codigo>codigo de cliente facilitado por primor</ns4:Codigo>
						 <ns4:Centro>codigo de centro de cliente facilitado por primor</ns4:Centro>
						 <ns4:Telefono>952060270</ns4:Telefono>
						 <ns4:Email>asalaso@inerttia.es</ns4:Email>
						 <ns4:RecargoEquivalencia>0</ns4:RecargoEquivalencia>
					 </ns3:Cliente>

					 <ns3:Observaciones>Observaciones sobre el pedido</ns3:Observaciones>

					 <ns3:DireccionEntrega
	                    Nombre="Alberto Salas Ortega"
	                    Domicilio="Marie Curie,20"
	                    Poblacion="Malaga"
	                    Provincia="Malaga"
	                    DNI="11223344"
	                    CodigoPostal="29590"
	                    Pais="ES">
	                 </ns3:DireccionEntrega>

					 <ns3:DireccionFacturacion
	                    Nombre="Inerttia"
	                    Domicilio="Marie Curie,20"
	                    Poblacion="Malaga"
	                    Provincia="Malaga"
	                    DNI="33445566"
	                    CodigoPostal="29590">
	                 </ns3:DireccionFacturacion>

					 <ns3:FormaPago>R</ns3:FormaPago>
					 <ns3:Bruto>0.0</ns3:Bruto>
					 <ns3:Descuento>0.0</ns3:Descuento>
					 <ns3:Importe>90.0</ns3:Importe>
					 <ns3:ReferenciaPago></ns3:ReferenciaPago>
					 <ns3:GastosEnvio>10.0</ns3:GastosEnvio>
					 <ns3:AgenciaTransporte>1</ns3:AgenciaTransporte>
					 <ns3:Retorno>0</ns3:Retorno>

					 <ns3:PedidoLinea>
						 <ns3:NumeroLinea>0</ns3:NumeroLinea>
						 <ns3:Articulo>
							 <ns4:Codigo>0ML00001</ns4:Codigo>
							 <ns4:UnidadesCodigoBarras>0</ns4:UnidadesCodigoBarras>
							 <ns4:UnidadesPrecio>0.0</ns4:UnidadesPrecio>
							 <ns4:Estado>0</ns4:Estado>
							 <ns4:StockMin>0.0</ns4:StockMin>
							 <ns4:StockMax>0.0</ns4:StockMax>
							 <ns4:ControlLote>0</ns4:ControlLote>
							 <ns4:ControlCaducidad>0</ns4:ControlCaducidad>
							 <ns4:TipoUnidad>0</ns4:TipoUnidad>
							 <ns4:Conversion1>0.0</ns4:Conversion1>
							 <ns4:Conversion2>0.0</ns4:Conversion2>
							 <ns4:IdIva>0</ns4:IdIva>
						 </ns3:Articulo>
						 <ns3:Unidad1>1.0</ns3:Unidad1>
						 <ns3:Unidad2>0.0</ns3:Unidad2>
						 <ns3:Unidad3>0.0</ns3:Unidad3>
						 <ns3:Pvp>5.0</ns3:Pvp>
						 <ns3:Descuento>0.0</ns3:Descuento>
						 <ns3:Importe>5.0</ns3:Importe>
					 </ns3:PedidoLinea>

					 <ns3:PedidoLinea>
						 <ns3:NumeroLinea>0</ns3:NumeroLinea>
						 <ns3:Articulo>
							 <ns4:Codigo>0ML00096</ns4:Codigo>
							 <ns4:UnidadesCodigoBarras>0</ns4:UnidadesCodigoBarras>
							 <ns4:UnidadesPrecio>0.0</ns4:UnidadesPrecio>
							 <ns4:Estado>0</ns4:Estado>
							 <ns4:StockMin>0.0</ns4:StockMin>
							 <ns4:StockMax>0.0</ns4:StockMax>
							 <ns4:ControlLote>0</ns4:ControlLote>
							 <ns4:ControlCaducidad>0</ns4:ControlCaducidad>
							 <ns4:TipoUnidad>0</ns4:TipoUnidad>
							 <ns4:Conversion1>0.0</ns4:Conversion1>
							 <ns4:Conversion2>0.0</ns4:Conversion2>
							 <ns4:IdIva>0</ns4:IdIva>
						 </ns3:Articulo>
						 <ns3:Unidad1>2.0</ns3:Unidad1>
						 <ns3:Unidad2>0.0</ns3:Unidad2>
						 <ns3:Unidad3>0.0</ns3:Unidad3>
						 <ns3:Pvp>5.0</ns3:Pvp>
						 <ns3:Descuento>0.0</ns3:Descuento>
						 <ns3:Importe>10.0</ns3:Importe>
					 </ns3:PedidoLinea>

					 <ns3:CentroRecogida></ns3:CentroRecogida>
					 <ns3:ParaRegalo>false</ns3:ParaRegalo>
					 <ns3:ParaRegaloMsg>Mensaje para mostrar en el regalo</ns3:ParaRegaloMsg>
				 </pedido>
			 </ns2:setPedidoWeb3>
		 </S:Body>
	 </S:Envelope>
	 */
	public static String createXmlStringRequestFromOrder(String username, String password, Order order) {
		StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" ?><S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><S:Body><ns2:setPedidoWeb3 xmlns:ns2=\"http://ws/\" xmlns:ns3=\"http://xml.netbeans.org/schema/gestion\" xmlns:ns4=\"http://xml.netbeans.org/schema/comun\">");
		appendXmlTagAndValue(sb, "<usuario>", username);
		appendXmlTagAndValue(sb, "<password>", password);

		sb.append("<pedido>");
		appendXmlTagAndValue(sb, "<ns3:Numero>", 0);
		appendXmlTagAndValue(sb, "<ns3:Fecha>", order.getOrderDate());
		appendXmlTagAndValue(sb, "<ns3:SuPedido>", order.getOrderNumber());

		SiteAccount account = order.getAccount();
		sb.append("<ns3:Cliente>");
		appendXmlTagAndValue(sb, "<ns4:Codigo>", account.getId());
		appendXmlTagAndValue(sb, "<ns4:Centro>", account.getClientCode());
		appendXmlTagAndValue(sb, "<ns4:Telefono>", account.getPhone());
		appendXmlTagAndValue(sb, "<ns4:Email>", account.getEmail());
		appendXmlTagAndValue(sb, "<ns4:RecargoEquivalencia>", account.getSurchargeEquivalence());
		sb.append("</ns3:Cliente>");

		appendXmlTagAndValue(sb, "<ns3:Observaciones>", order.getOrderComments());

		User shippingUser = order.getShippingUser();
		sb.append("<ns3:DireccionEntrega ");
		sb.append("Nombre=\"").append(shippingUser.getName()).append("\" ");
		sb.append("Domicilio=\"").append(shippingUser.getAddress()).append("\" ");
		sb.append("Poblacion=\"").append(shippingUser.getCity()).append("\" ");
		sb.append("Provincia=\"").append(shippingUser.getRegion()).append("\" ");
		sb.append("DNI=\"").append(shippingUser.getIdentificationNumber()).append("\" ");
		sb.append("CodigoPostal=\"").append(shippingUser.getZipCode()).append("\" ");
		sb.append("Pais=\"").append(shippingUser.getCountryCode()).append("\" ");
		sb.append("></ns3:DireccionEntrega>");

		User invoiceUser = order.getInvoiceUser();
		sb.append("<ns3:DireccionFacturacion ");
		sb.append("Nombre=\"").append(invoiceUser.getName()).append("\" ");
		sb.append("Domicilio=\"").append(invoiceUser.getAddress()).append("\" ");
		sb.append("Poblacion=\"").append(invoiceUser.getCity()).append("\" ");
		sb.append("Provincia=\"").append(invoiceUser.getRegion()).append("\" ");
		sb.append("DNI=\"").append(invoiceUser.getIdentificationNumber()).append("\" ");
		sb.append("CodigoPostal=\"").append(invoiceUser.getZipCode()).append("\" ");
		sb.append("Pais=\"").append(invoiceUser.getCountryCode()).append("\" ");
		sb.append("></ns3:DireccionFacturacion>");

		appendXmlTagAndValue(sb, "<ns3:FormaPago>", order.getPaymentMethod());
		appendXmlTagAndValue(sb, "<ns3:Bruto>", order.getShippingWeight());
		appendXmlTagAndValue(sb, "<ns3:Descuento>", order.getDiscount());
		appendXmlTagAndValue(sb, "<ns3:Importe>", order.getOrderAmount());
		appendXmlTagAndValue(sb, "<ns3:ReferenciaPago>", order.getPaymentInfo());
		appendXmlTagAndValue(sb, "<ns3:GastosEnvio>", order.getShippingCosts());
		appendXmlTagAndValue(sb, "<ns3:AgenciaTransporte>", order.getCourierCode());
		appendXmlTagAndValue(sb, "<ns3:Retorno>", order.isCashOnDelivery() ? 1 : 0);

		List<Item> items = order.getItems();
		Item item;
		for (int i = 0, itemsSize = items.size(); i < itemsSize; i++) {
			item = items.get(i);
			sb.append("<ns3:PedidoLinea>");
			appendXmlTagAndValue(sb, "<ns3:NumeroLinea>", i);
			sb.append("<ns3:Articulo>");
			appendXmlTagAndValue(sb, "<ns4:Codigo>", item.getId());
			appendXmlTagAndValue(sb, "<ns4:UnidadesCodigoBarras>", 0);
			appendXmlTagAndValue(sb, "<ns4:UnidadesPrecio>", 0.0);
			appendXmlTagAndValue(sb, "<ns4:Estado>", 0);
			appendXmlTagAndValue(sb, "<ns4:StockMin>", 0.0);
			appendXmlTagAndValue(sb, "<ns4:StockMax>", 0.0);
			appendXmlTagAndValue(sb, "<ns4:ControlLote>", 0);
			appendXmlTagAndValue(sb, "<ns4:ControlCaducidad>", 0);
			appendXmlTagAndValue(sb, "<ns4:TipoUnidad>", 0);
			appendXmlTagAndValue(sb, "<ns4:Conversion1>", 0.0);
			appendXmlTagAndValue(sb, "<ns4:Conversion2>", 0.0);
			appendXmlTagAndValue(sb, "<ns4:IdIva>", 0);
			sb.append("</ns3:Articulo>");

			appendXmlTagAndValue(sb, "<ns3:Unidad1>", item.getQuantity());
			appendXmlTagAndValue(sb, "<ns3:Unidad2>", 0);
			appendXmlTagAndValue(sb, "<ns3:Unidad3>", 0);
			appendXmlTagAndValue(sb, "<ns3:Pvp>", item.getPrice());
			appendXmlTagAndValue(sb, "<ns3:Descuento>", item.getDiscount());
			appendXmlTagAndValue(sb, "<ns3:Importe>", item.getAmount());
			sb.append("</ns3:PedidoLinea>");
		}

		appendXmlTagAndValue(sb, "<ns3:CentroRecogida>", order.getCollectionCenterCode());
		appendXmlTagAndValue(sb, "<ns3:ParaRegalo>", String.valueOf(order.isGift()));
		appendXmlTagAndValue(sb, "<ns3:ParaRegaloMsg>", order.getGiftMessage());
		sb.append("</pedido>");

		sb.append("</ns2:setPedidoWeb3>").append("</S:Body>").append("</S:Envelope>");

		return sb.toString();
	}

	private static void appendXmlTagAndValue(StringBuilder sb, String tag, String value) {
		sb.append(tag).append(value).append("</").append(tag.substring(1));
	}

	private static void appendXmlTagAndValue(StringBuilder sb, String tag, double value) {
		sb.append(tag).append(value).append("</").append(tag.substring(1));
	}

	private static String sendRequest(String xml) throws IOException {
		HttpURLConnection con = getConnection();

		// specify that we will send output and accept input
		con.setDoInput(true);
		con.setDoOutput(true);

		//con.setConnectTimeout( 20000 );  // long timeout, but not infinite
		//con.setReadTimeout( 20000 );
		//con.setUseCaches (false);
		//con.setDefaultUseCaches (false);

		//adding request header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", "JAX-WS RI 2.2.9-b130926.1035 svn-revision#5f6196f2b90e9460065a4c2f4e30e065b245e51e");
		con.setRequestProperty("Accept", "text/xml, multipart/related");
		con.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
		con.setRequestProperty("SOAPAction", "\"http://ws/Gestion/setPedidoWeb3Request\"");

		// sending post request
		OutputStreamWriter os = new OutputStreamWriter(con.getOutputStream()); //get output Stream from con
		os.write(xml);
		os.flush();
		os.close();

		// reading the response
		String result = readResponse(con.getInputStream());
		System.err.println("\nResponse from server after POST:\n" + result);
		return result;
	}

	private static HttpURLConnection getConnection() throws IOException {
		URL url = new URL(WEB_SERVICE_URL);

		if (IS_PROXY_NEEDED) {
			System.setProperty("java.net.useSystemProxies", "true");
			return (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8888)));
		} else {
			return (HttpURLConnection) url.openConnection();
		}
	}

	private static String readResponse(InputStream inputStream) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder buf = new StringBuilder();

		while (reader.ready()) {
			buf.append(reader.readLine()).append(System.lineSeparator());
		}
		return buf.toString();
	}
}
