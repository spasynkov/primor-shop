package javaapplication42;

import javaapplication42.entities.*;

public class Main {
	public static void main(String[] args) {
		Order order = new Order();

		SiteAccount account = new SiteAccount();
		account.setId("0");
		account.setPhone("952060270");
		account.setEmail("asalaso@inerttia.es");
		order.setSiteAccount(account);

		User shippingUser = new User();
		shippingUser.setName("Alberto Salas Ortega");
		shippingUser.setIdentificationNumber("11223344");
		shippingUser.setAddress("Marie Curie,20");
		shippingUser.setZipCode("29590");
		shippingUser.setCity("Malaga");
		shippingUser.setRegion("Malaga");
		shippingUser.setCountryCode("ES");
		order.setShippingUser(shippingUser);

		User invoiceUser = new User();
		invoiceUser.setName("Inerttia");
		invoiceUser.setIdentificationNumber("33445566");
		invoiceUser.setAddress("Marie Curie,20");
		invoiceUser.setZipCode("29590");
		invoiceUser.setCity("Malaga");
		invoiceUser.setRegion("Malaga");
		invoiceUser.setCountryCode("ES");
		order.setInvoiceUser(invoiceUser);

		order.setOrderDate("2018-05-17");
		order.setOrderNumber("P1234");
		order.setOrderComments("Observaciones sobre el pedido");
		order.setOrderAmount(90);
		order.setPaymentInfo("");
		order.setShippingCosts(10);
		order.setShippingWeight(0);
		order.setDiscount(0);
		order.setCourierCode((short) 1);

		order.setPaymentMethod("R");

		Item item1 = new Item();
		item1.setItemId("0ML00001");
		item1.setQuantity(1);
		item1.setPrice(5);
		item1.setDiscount(0);
		item1.setAmount(5);
		order.addItem(item1);

		Item item2 = new Item();
		item2.setItemId("0ML00096");
		item2.setQuantity(2);
		item2.setPrice(5);
		item2.setDiscount(0);
		item2.setAmount(10);
		order.addItem(item2);

		OrderResponse resp = Utils.sendRequest("primorUsername", "primorUsersPass", order);
		System.out.println(resp);
	}
}
