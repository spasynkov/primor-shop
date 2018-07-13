package javaapplication42.entities;

import org.netbeans.xml.schema.comun.Persona;

/**
 * Person object's class
 *
 * It's a wrapper class for original lr.wsGestion.Persona class
 */
public class User {
	private final Persona user;

	public User() {
		this(new Persona());
	}

	User(Persona user) {
		this.user = user;
	}

	public void setName(String username) {
		user.setNombre(username);
	}

	public String getName() {
		return user.getNombre();
	}

	public void setIdentificationNumber(String identificationNumber) {
		user.setDNI(identificationNumber);
	}

	public String getIdentificationNumber() {
		return user.getDNI();
	}

	public void setAddress(String address) {
		user.setDomicilio(address);
	}

	public String getAddress() {
		return user.getDomicilio();
	}

	public void setZipCode(String zipCode) {
		user.setCodigoPostal(zipCode);
	}

	public String getZipCode() {
		return user.getCodigoPostal();
	}

	public void setCity(String city) {
		user.setPoblacion(city);
	}

	public String getCity() {
		return user.getPoblacion();
	}

	public void setRegion(String region) {
		user.setProvincia(region);
	}

	public String getRegion() {
		return user.getProvincia();
	}

	public void setCountryCode(String countryCode) {
		user.setPais(countryCode);
	}

	public String getCountryCode() {
		return user.getPais();
	}

	Persona getOriginalUser() {
		return user;
	}
}
