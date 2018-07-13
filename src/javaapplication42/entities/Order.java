package javaapplication42.entities;

import java.util.List;

import org.netbeans.xml.schema.gestion.PedidoExt;

import javaapplication42.Utils;

public class Order {

	private final PedidoExt order;

	public Order() {
		this(new PedidoExt());
	}

	Order(PedidoExt order) {
		this.order = order;
	}

	public void setSiteAccount(SiteAccount account) {
		order.setCliente(account.getOriginalAccount());
	}

	public SiteAccount getSiteAccount() {
		return new SiteAccount(order.getCliente());
	}

	public void setShippingUser(User shippingUser) {
		order.setDireccionEntrega(shippingUser.getOriginalUser());
	}

	public User getShippingUser() {
		return new User(order.getDireccionEntrega());
	}

	public void setInvoiceUser(User invoiceUser) {
		order.setDireccionFacturacion(invoiceUser.getOriginalUser());
	}

	public User getInvoiceUser() {
		return new User(order.getDireccionFacturacion());
	}

	public void setOrderDate(String orderDate) {
		order.setFecha(orderDate);
	}

	public String getOrderDate() {
		return order.getFecha();
	}

	public void setOrderNumber(String orderNumber) {
		order.setSuPedido(orderNumber);
	}

	public String getOrderNumber() {
		return order.getSuPedido();
	}

	public void setOrderComments(String orderComments) {
		order.setObservaciones(orderComments);
	}

	public String getOrderComments() {
		return order.getObservaciones();
	}

	/**
	 * Order amount
	 * It says: Define el valor de la propiedad importe.
	 * Defines the value of the import property.
	 *
	 * @param orderAmount idk what is that, but it should be a double value
	 */
	public void setOrderAmount(double orderAmount) {
		order.setImporte(orderAmount);
	}

	public double getOrderAmount() {
		return order.getImporte();
	}

	/**
	 * Payment information (Visa, paypal, etc) authorziation number
	 *
	 * @param paymentInfo
	 */
	public void setPaymentInfo(String paymentInfo) {
		order.setReferenciaPago(paymentInfo);
	}

	public String getPaymentInfo() {
		return order.getReferenciaPago();
	}

	public void setShippingCosts(double shippingCosts) {
		order.setGastosEnvio(shippingCosts);
	}

	public double getShippingCosts() {
		return order.getGastosEnvio();
	}

	public void setShippingWeight(double shippingWeight) {
		order.setBruto(shippingWeight);
	}

	public double getShippingWeight() {
		return order.getBruto();
	}

	public void setDiscount(double discount) {
		order.setDescuento(discount);
	}

	public double getDiscount() {
		return order.getDescuento();
	}

	public void setCourierCode(short courierCode) {
		order.setAgenciaTransporte(courierCode);
	}

	public short getCourierCode() {
		return order.getAgenciaTransporte();
	}

	public void setPaymentMethod(String paymentMethod) {
		order.setFormaPago(paymentMethod);
	}

	public String getPaymentMethod() {
		return order.getFormaPago();
	}

	public void setCashOnDelivery(boolean cashOnDelivery) {
		order.setRetorno((short) (cashOnDelivery ? 1 : 0));
	}

	public boolean isCashOnDelivery() {
		return order.getRetorno() == 1;
	}

	public void addItem(Item item) {
		order.getPedidoLinea().add(item.getOriginalItem());
	}

	public List<Item> getItems() {
		return order.getPedidoLinea().stream()
				.map(Item::new)
				.collect(Utils.toImmutableList());
	}

	public PedidoExt getOriginalOrder() {
		return order;
	}
}
