package com.customer;

public class CustomerDetails {
	public String customerName;
	public String customerAddress;
	public double customerMobileNumber;
	public Boolean isPropertyVerificationRequired;
	public String houseType;
	public Double price;
	public String customerEmailAddress;
	public String customerPassword;
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param customerName
	 * @param customerAddress
	 * @param customerMobileNumber
	 * @param isPropertyVerificationRequired
	 * @param houseType
	 * @param price
	 * @param customerEmailAddress
	 * @param customerPassword
	 */
	public CustomerDetails(String customerName, String customerAddress, double customerMobileNumber,
			Boolean isPropertyVerificationRequired, String houseType, Double price, String customerEmailAddress,
			String customerPassword) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNumber = customerMobileNumber;
		this.isPropertyVerificationRequired = isPropertyVerificationRequired;
		this.houseType = houseType;
		this.price = price;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPassword = customerPassword;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * @return the customerMobileNumber
	 */
	public double getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	/**
	 * @param customerMobileNumber the customerMobileNumber to set
	 */
	public void setCustomerMobileNumber(double customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	/**
	 * @return the isPropertyVerificationRequired
	 */
	public Boolean getIsPropertyVerificationRequired() {
		return isPropertyVerificationRequired;
	}
	/**
	 * @param isPropertyVerificationRequired the isPropertyVerificationRequired to set
	 */
	public void setIsPropertyVerificationRequired(Boolean isPropertyVerificationRequired) {
		this.isPropertyVerificationRequired = isPropertyVerificationRequired;
	}
	/**
	 * @return the houseType
	 */
	public String getHouseType() {
		return houseType;
	}
	/**
	 * @param houseType the houseType to set
	 */
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the customerEmailAddress
	 */
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	/**
	 * @param customerEmailAddress the customerEmailAddress to set
	 */
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	/**
	 * @return the customerPassword
	 */
	public String getCustomerPassword() {
		return customerPassword;
	}
	/**
	 * @param customerPassword the customerPassword to set
	 */
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
}
