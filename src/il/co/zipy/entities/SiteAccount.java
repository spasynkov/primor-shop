package il.co.zipy.entities;

import java.util.Objects;

public class SiteAccount {
	private String id;
	private String clientCode;
	private String phone;
	private String email;
	private String surchargeEquivalence;

	public SiteAccount() {
		this("", "", "", "", "");
	}

	public SiteAccount(String phone, String email) {
		this("", "", phone, email, "");
	}

	public SiteAccount(String id, String phone, String email) {
		this(id, "", phone, email, "");
	}

	public SiteAccount(String id, String clientCode, String phone, String email, String surchargeEquivalence) {
		this.id = id;
		this.clientCode = clientCode;
		this.phone = phone;
		this.email = email;
		this.surchargeEquivalence = surchargeEquivalence;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSurchargeEquivalence() {
		return surchargeEquivalence;
	}

	public void setSurchargeEquivalence(String surchargeEquivalence) {
		this.surchargeEquivalence = surchargeEquivalence;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof SiteAccount)) return false;
		SiteAccount that = (SiteAccount) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(clientCode, that.clientCode) &&
				Objects.equals(phone, that.phone) &&
				Objects.equals(email, that.email) &&
				Objects.equals(surchargeEquivalence, that.surchargeEquivalence);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, clientCode, phone, email, surchargeEquivalence);
	}

	@Override
	public String toString() {
		return "SiteAccount{" +
				"id='" + id + '\'' +
				", clientCode='" + clientCode + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", surchargeEquivalence='" + surchargeEquivalence + '\'' +
				'}';
	}
}
