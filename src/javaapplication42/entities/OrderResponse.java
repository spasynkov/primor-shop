package javaapplication42.entities;

import org.netbeans.xml.schema.comun.Respuesta;
import org.netbeans.xml.schema.gestion.PedidoResponse;

public class OrderResponse {
	private final PedidoResponse resp;

	public OrderResponse(PedidoResponse resp) {
		this.resp = resp;
	}

	public void setOrder(Order order) {
		resp.setPedido(order.getOriginalOrder());
	}

	public Order getOrder() {
		return new Order(resp.getPedido());
	}

	public void setResp(Respuesta resp) {
		this.resp.setRespuesta(resp);
	}

	public Respuesta getResp() {
		return resp.getRespuesta();
	}
}
