package javaapplication42.entities;

import org.netbeans.xml.schema.comun.Cliente;

/**
 * Customer objects class
 *
 * It's a wrapper class for lr.wsGestion.Cliente original class
 */
public class SiteAccount {
	private final Cliente account;

	public SiteAccount() {
		this(new Cliente());
	}

	SiteAccount(Cliente account) {
		this.account = account;
	}

	Cliente getOriginalAccount() {
		return account;
	}

	public void setId(String id) {
		account.setCodigo(id);
	}

	public void setPhone(String phoneNumber) {
		account.setTelefono(phoneNumber);
	}

	public void setEmail(String email) {
		account.setEmail(email);
	}

	public String getId() {
		return account.getCodigo();
	}

	public String getPhone() {
		return account.getTelefono();
	}

	public String getEmail() {
		return account.getEmail();
	}
}
