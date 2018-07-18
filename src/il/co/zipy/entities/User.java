package il.co.zipy.entities;

import java.util.Objects;

public class User {
	private String name;
	private String identificationNumber;
	private String address;
	private String zipCode;
	private String city;
	private String region;
	private String countryCode;

	public User() {
		this("", "", "", "", "", "", "");
	}

	public User(String name, String identificationNumber, String address, String zipCode, String city, String region, String countryCode) {
		this.name = name;
		this.identificationNumber = identificationNumber;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.region = region;
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		User user = (User) o;
		return Objects.equals(name, user.name) &&
				Objects.equals(identificationNumber, user.identificationNumber) &&
				Objects.equals(address, user.address) &&
				Objects.equals(zipCode, user.zipCode) &&
				Objects.equals(city, user.city) &&
				Objects.equals(region, user.region) &&
				Objects.equals(countryCode, user.countryCode);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name, identificationNumber, address, zipCode, city, region, countryCode);
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", identificationNumber='" + identificationNumber + '\'' +
				", address='" + address + '\'' +
				", zipCode='" + zipCode + '\'' +
				", city='" + city + '\'' +
				", region='" + region + '\'' +
				", countryCode='" + countryCode + '\'' +
				'}';
	}
}
