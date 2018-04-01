/**
 * 
 */
package com.customer;

/**
 * @author JAI MATA DI
 *
 */
public class CustomerServiceImp implements CustomerService {

	/**
	 * 
	 */
	public CustomerServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void newCustomer(String name, String address, double mobileNumber, Boolean verificationRequired,
			String houseType, Double price, String emailId, String password) {
		// TODO Auto-generated method stub
		CustomerDetails customer = new CustomerDetails();
		customer.setCustomerAddress(address);
		customer.setCustomerEmailAddress(emailId);
		customer.setCustomerMobileNumber(mobileNumber);
		customer.setCustomerName(name);
		customer.setHouseType(houseType);
		customer.setIsPropertyVerificationRequired(verificationRequired);
		customer.setPrice(price);
		
	}

	@Override
	public void showCustomerDetails() {
		// TODO Auto-generated method stub
		
	}
}