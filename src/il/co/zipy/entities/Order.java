package il.co.zipy.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Order {
	private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

	private SiteAccount account;
	private User shippingUser;
	private User invoiceUser;
	private String orderDate;
	private String orderNumber;
	private String orderComments;
	private double orderAmount;
	private String paymentInfo;
	private double shippingCosts;
	private double shippingWeight;
	private double discount;
	private short courierCode;
	private String paymentMethod;
	private boolean isCashOnDelivery;
	private String collectionCenterCode;
	private boolean isGift;
	private String giftMessage;
	private List<Item> items;

	public Order() {
		this.orderDate = "";
		this.orderNumber = "";
		this.orderComments = "";
		this.paymentInfo = "";
		this.paymentMethod = "";
		this.collectionCenterCode = "";
		this.giftMessage = "";
		this.items = new LinkedList<>();
	}

	public SiteAccount getAccount() {
		return account;
	}

	public void setAccount(SiteAccount account) {
		this.account = account;
	}

	public User getShippingUser() {
		return shippingUser;
	}

	public void setShippingUser(User shippingUser) {
		this.shippingUser = shippingUser;
	}

	public User getInvoiceUser() {
		return invoiceUser;
	}

	public void setInvoiceUser(User invoiceUser) {
		this.invoiceUser = invoiceUser;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = dateFormatter.format(orderDate);
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderComments() {
		return orderComments;
	}

	public void setOrderComments(String orderComments) {
		this.orderComments = orderComments;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public double getShippingCosts() {
		return shippingCosts;
	}

	public void setShippingCosts(double shippingCosts) {
		this.shippingCosts = shippingCosts;
	}

	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public short getCourierCode() {
		return courierCode;
	}

	public void setCourierCode(short courierCode) {
		this.courierCode = courierCode;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public boolean isCashOnDelivery() {
		return isCashOnDelivery;
	}

	public void setCashOnDelivery(boolean cashOnDelivery) {
		isCashOnDelivery = cashOnDelivery;
	}

	public String getCollectionCenterCode() {
		return collectionCenterCode;
	}

	public void setCollectionCenterCode(String collectionCenterCode) {
		this.collectionCenterCode = collectionCenterCode;
	}

	public boolean isGift() {
		return isGift;
	}

	public void setGift(boolean gift) {
		isGift = gift;
	}

	public String getGiftMessage() {
		return giftMessage;
	}

	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public boolean addItem(Item item) {
		if (items == null) items = new LinkedList<>();

		return items.add(item);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Order)) return false;
		Order order = (Order) o;
		return Double.compare(order.orderAmount, orderAmount) == 0 &&
				Double.compare(order.shippingCosts, shippingCosts) == 0 &&
				Double.compare(order.shippingWeight, shippingWeight) == 0 &&
				Double.compare(order.discount, discount) == 0 &&
				courierCode == order.courierCode &&
				isCashOnDelivery == order.isCashOnDelivery &&
				isGift == order.isGift &&
				Objects.equals(account, order.account) &&
				Objects.equals(shippingUser, order.shippingUser) &&
				Objects.equals(invoiceUser, order.invoiceUser) &&
				Objects.equals(orderDate, order.orderDate) &&
				Objects.equals(orderNumber, order.orderNumber) &&
				Objects.equals(orderComments, order.orderComments) &&
				Objects.equals(paymentInfo, order.paymentInfo) &&
				Objects.equals(paymentMethod, order.paymentMethod) &&
				Objects.equals(collectionCenterCode, order.collectionCenterCode) &&
				Objects.equals(giftMessage, order.giftMessage) &&
				Objects.equals(items, order.items);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, shippingUser, invoiceUser, orderDate, orderNumber, orderComments, orderAmount, paymentInfo, shippingCosts, shippingWeight, discount, courierCode, paymentMethod, isCashOnDelivery, collectionCenterCode, isGift, giftMessage, items);
	}

	@Override
	public String toString() {
		return "Order{" +
				"account=" + account +
				", shippingUser=" + shippingUser +
				", invoiceUser=" + invoiceUser +
				", orderDate='" + orderDate + '\'' +
				", orderNumber='" + orderNumber + '\'' +
				", orderComments='" + orderComments + '\'' +
				", orderAmount=" + orderAmount +
				", paymentInfo='" + paymentInfo + '\'' +
				", shippingCosts=" + shippingCosts +
				", shippingWeight=" + shippingWeight +
				", discount=" + discount +
				", courierCode=" + courierCode +
				", paymentMethod='" + paymentMethod + '\'' +
				", isCashOnDelivery=" + isCashOnDelivery +
				", collectionCenterCode='" + collectionCenterCode + '\'' +
				", isGift=" + isGift +
				", giftMessage='" + giftMessage + '\'' +
				", items=" + items +
				'}';
	}
}
