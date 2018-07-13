package javaapplication42.entities;

import org.netbeans.xml.schema.comun.Articulo;
import org.netbeans.xml.schema.gestion.PedidoLinea;

public class Item {
	private final PedidoLinea item;

	public Item() {
		this(new PedidoLinea());
	}

	Item(PedidoLinea item) {
		this.item = item;

		// preparing itemId
		Articulo itemIdObject = new Articulo();
		item.setArticulo(itemIdObject);

		// always 0
		this.item.setUnidad2(0);
		this.item.setUnidad3(0);
	}

	PedidoLinea getOriginalItem() {
		return item;
	}

	public void setItemId(String itemId) {
		item.getArticulo().setCodigo(itemId);
	}

	public String getItemId() {
		return item.getArticulo().getCodigo();
	}

	public void setQuantity(double quantity) {
		item.setUnidad1(quantity);
	}

	public void setPrice(double price) {
		item.setPvp(price);
	}

	public double getPrice() {
		return item.getPvp();
	}

	public void setDiscount(double discount) {
		item.setDescuento(discount);
	}

	public double getDiscount() {
		return item.getDescuento();
	}

	public void setAmount(double amount) {
		item.setImporte(amount);
	}

	public double getAmount() {
		return item.getImporte();
	}
}
