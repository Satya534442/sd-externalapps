/**
 * 
 */
package com.customer;

/**
 * @author JAI MATA DI
 *
 */
public interface CustomerService {
	
	public void newCustomer(String name, String address, double mobileNumber, Boolean verificationRequired,
			String houseType, Double price, String emailId, String password);
	public void showCustomerDetails();

}
