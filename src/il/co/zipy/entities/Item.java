package il.co.zipy.entities;

import java.util.Objects;

public class Item {
	private String id;
	private double quantity;
	private double price;
	private double discount;
	private double amount;

	public Item() {
		this("", 0 ,0, 0, 0);
	}

	public Item(String id, double quantity, double price, double discount, double amount) {
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Item)) return false;
		Item item = (Item) o;
		return Double.compare(item.quantity, quantity) == 0 &&
				Double.compare(item.price, price) == 0 &&
				Double.compare(item.discount, discount) == 0 &&
				Double.compare(item.amount, amount) == 0 &&
				Objects.equals(id, item.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, quantity, price, discount, amount);
	}

	@Override
	public String toString() {
		return "Item{" +
				"id='" + id + '\'' +
				", quantity=" + quantity +
				", price=" + price +
				", discount=" + discount +
				", amount=" + amount +
				'}';
	}
}
