package com.ecom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customers")
public class Customer {
	
	@Id
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String flatNumber;
	private String customerBuilding;
	private String customerAddress;
	private String customerCity;
	private String customerState;
	private Integer postalCode;
	private String customerCountry;
	private Integer customerPhone;
	private String customerEmail;
	private String customerUserName;
	private String customerPassword;
	private String cardType;
	private Integer cardNumber;
	private Integer cardMonth;
	private Integer cardYear;
	private String shippingAddress;
	private String shippingCity;
	private String shippingState;
	private Integer shippingCode;
	private String shippingCountry;
	
	public Customer() {
		
	}

	public Customer(Integer customerId, String firstName, String lastName, String flatNumber, String customerBuilding,
			String customerAddress, String customerCity, String customerState, Integer postalCode,
			String customerCountry, Integer customerPhone, String customerEmail, String customerUserName,
			String customerPassword, String cardType, Integer cardNumber, Integer cardMonth, Integer cardYear,
			String shippingAddress, String shippingCity, String shippingState, Integer shippingCode,
			String shippingCountry) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.flatNumber = flatNumber;
		this.customerBuilding = customerBuilding;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.postalCode = postalCode;
		this.customerCountry = customerCountry;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardMonth = cardMonth;
		this.cardYear = cardYear;
		this.shippingAddress = shippingAddress;
		this.shippingCity = shippingCity;
		this.shippingState = shippingState;
		this.shippingCode = shippingCode;
		this.shippingCountry = shippingCountry;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getCustomerBuilding() {
		return customerBuilding;
	}

	public void setCustomerBuilding(String customerBuilding) {
		this.customerBuilding = customerBuilding;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public Integer getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(Integer customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getCardMonth() {
		return cardMonth;
	}

	public void setCardMonth(Integer cardMonth) {
		this.cardMonth = cardMonth;
	}

	public Integer getCardYear() {
		return cardYear;
	}

	public void setCardYear(Integer cardYear) {
		this.cardYear = cardYear;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public Integer getShippingCode() {
		return shippingCode;
	}

	public void setShippingCode(Integer shippingCode) {
		this.shippingCode = shippingCode;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", flatNumber=" + flatNumber + ", customerBuilding=" + customerBuilding + ", customerAddress="
				+ customerAddress + ", customerCity=" + customerCity + ", customerState=" + customerState
				+ ", postalCode=" + postalCode + ", customerCountry=" + customerCountry + ", customerPhone="
				+ customerPhone + ", customerEmail=" + customerEmail + ", customerUserName=" + customerUserName
				+ ", customerPassword=" + customerPassword + ", cardType=" + cardType + ", cardNumber=" + cardNumber
				+ ", cardMonth=" + cardMonth + ", cardYear=" + cardYear + ", shippingAddress=" + shippingAddress
				+ ", shippingCity=" + shippingCity + ", shippingState=" + shippingState + ", shippingCode="
				+ shippingCode + ", shippingCountry=" + shippingCountry + "]";
	}

		

}
