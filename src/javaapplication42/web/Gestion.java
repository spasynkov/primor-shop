package javaapplication42.web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.netbeans.xml.schema.gestion.Documento;
import org.netbeans.xml.schema.gestion.DocumentoPdfResponse;
import org.netbeans.xml.schema.gestion.DocumentoResponse;
import org.netbeans.xml.schema.gestion.Pedido2Response;
import org.netbeans.xml.schema.gestion.PedidoExt;
import org.netbeans.xml.schema.gestion.PedidoResponse;
import org.netbeans.xml.schema.gestion.PedidosResponse;
import org.netbeans.xml.schema.gestion.PrecioArticuloResponse;

@WebService(
		name = "Gestion",
		targetNamespace = "http://ws/"
)
public interface Gestion {
	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "setPedido",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedido"
	)
	@ResponseWrapper(
			localName = "setPedidoResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedidoResponse"
	)
	@Action(
			input = "http://ws/Gestion/setPedidoRequest",
			output = "http://ws/Gestion/setPedidoResponse"
	)
	PedidoResponse setPedido(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "pedido",targetNamespace = "") PedidoExt var3);


	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "getDocumento",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetDocumento"
	)
	@ResponseWrapper(
			localName = "getDocumentoResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetDocumentoResponse"
	)
	@Action(
			input = "http://ws/Gestion/getDocumentoRequest",
			output = "http://ws/Gestion/getDocumentoResponse"
	)
	DocumentoResponse getDocumento(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "tipoDocumento",targetNamespace = "") String var3, @WebParam(name = "serie",targetNamespace = "") String var4, @WebParam(name = "numero",targetNamespace = "") Long var5);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "getPedidosAgenteFecha",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPedidosAgenteFecha"
	)
	@ResponseWrapper(
			localName = "getPedidosAgenteFechaResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPedidosAgenteFechaResponse"
	)
	@Action(
			input = "http://ws/Gestion/getPedidosAgenteFechaRequest",
			output = "http://ws/Gestion/getPedidosAgenteFechaResponse"
	)
	PedidosResponse getPedidosAgenteFecha(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "agente",targetNamespace = "") String var3, @WebParam(name = "fechaInicio",targetNamespace = "") String var4, @WebParam(name = "fechaFin",targetNamespace = "") String var5);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "getPedido",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPedido"
	)
	@ResponseWrapper(
			localName = "getPedidoResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPedidoResponse"
	)
	@Action(
			input = "http://ws/Gestion/getPedidoRequest",
			output = "http://ws/Gestion/getPedidoResponse"
	)
	Pedido2Response getPedido(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "serie",targetNamespace = "") String var3, @WebParam(name = "numero",targetNamespace = "") String var4);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "setDocumento",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetDocumento"
	)
	@ResponseWrapper(
			localName = "setDocumentoResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetDocumentoResponse"
	)
	@Action(
			input = "http://ws/Gestion/setDocumentoRequest",
			output = "http://ws/Gestion/setDocumentoResponse"
	)
	DocumentoResponse setDocumento(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "documento",targetNamespace = "") Documento var3);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "getPedidosPendienteCliente",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPedidosPendienteCliente"
	)
	@ResponseWrapper(
			localName = "getPedidosPendienteClienteResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPedidosPendienteClienteResponse"
	)
	@Action(
			input = "http://ws/Gestion/getPedidosPendienteClienteRequest",
			output = "http://ws/Gestion/getPedidosPendienteClienteResponse"
	)
	PedidosResponse getPedidosPendienteCliente(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "grupo",targetNamespace = "") String var3, @WebParam(name = "clienteCodigo",targetNamespace = "") String var4, @WebParam(name = "clienteCentro",targetNamespace = "") String var5);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "setPedidoWeb",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedidoWeb"
	)
	@ResponseWrapper(
			localName = "setPedidoWebResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedidoWebResponse"
	)
	@Action(
			input = "http://ws/Gestion/setPedidoWebRequest",
			output = "http://ws/Gestion/setPedidoWebResponse"
	)
	PedidoResponse setPedidoWeb(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "pedido",targetNamespace = "") PedidoExt var3);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "getDocumentoPdf",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetDocumentoPdf"
	)
	@ResponseWrapper(
			localName = "getDocumentoPdfResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetDocumentoPdfResponse"
	)
	@Action(
			input = "http://ws/Gestion/getDocumentoPdfRequest",
			output = "http://ws/Gestion/getDocumentoPdfResponse"
	)
	DocumentoPdfResponse getDocumentoPdf(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "tipoDocumento",targetNamespace = "") String var3, @WebParam(name = "serie",targetNamespace = "") String var4, @WebParam(name = "numero",targetNamespace = "") Long var5);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "getPrecioArticulo",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPrecioArticulo"
	)
	@ResponseWrapper(
			localName = "getPrecioArticuloResponse",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.GetPrecioArticuloResponse"
	)
	@Action(
			input = "http://ws/Gestion/getPrecioArticuloRequest",
			output = "http://ws/Gestion/getPrecioArticuloResponse"
	)
	PrecioArticuloResponse getPrecioArticulo(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "idArticulo",targetNamespace = "") String var3);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "setPedidoWeb2",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedidoWeb2"
	)
	@ResponseWrapper(
			localName = "setPedidoWeb2Response",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedidoWeb2Response"
	)
	@Action(
			input = "http://ws/Gestion/setPedidoWeb2Request",
			output = "http://ws/Gestion/setPedidoWeb2Response"
	)
	PedidoResponse setPedidoWeb2(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "pedido",targetNamespace = "") PedidoExt var3);

	@WebMethod
	@WebResult(
			targetNamespace = ""
	)
	@RequestWrapper(
			localName = "setPedidoWeb3",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedidoWeb3"
	)
	@ResponseWrapper(
			localName = "setPedidoWeb3Response",
			targetNamespace = "http://ws/",
			className = "lr.wsGestion.SetPedidoWeb3Response"
	)
	@Action(
			input = "http://ws/Gestion/setPedidoWeb3Request",
			output = "http://ws/Gestion/setPedidoWeb3Response"
	)
	PedidoResponse setPedidoWeb3(@WebParam(name = "usuario",targetNamespace = "") String var1, @WebParam(name = "password",targetNamespace = "") String var2, @WebParam(name = "pedido",targetNamespace = "") PedidoExt var3);
}
