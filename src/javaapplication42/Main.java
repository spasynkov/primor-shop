package javaapplication42;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javaapplication42.entities.*;

public class Main {
	private static String login;
	private static String pass;

	static {
		System.setProperty("java.net.useSystemProxies", "true");

		Properties props = new Properties();
		try {
			props.load(new FileReader("app.properties"));
			login = props.getProperty("login");
			pass = props.getProperty("password");
		} catch (IOException e) {
			login = "";
			pass = "";
		}
	}

	public static void main(String[] args) {
		Order order = new Order();

		SiteAccount account = new SiteAccount();
		account.setId("0");
		account.setPhone("952060270");
		account.setEmail(login);
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
		item1.setItemId("35315");
		item1.setQuantity(1);
		item1.setPrice(0);
		item1.setDiscount(0);
		item1.setAmount(0);
		order.addItem(item1);

		OrderResponse resp = Utils.sendRequest(login, pass, order);
		System.out.println(resp);
	}
}
