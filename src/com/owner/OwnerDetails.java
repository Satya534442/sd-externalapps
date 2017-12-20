/**
 * 
 */
package com.owner;

/**
 * @author Satyavan_Dash
 */
public class OwnerDetails {

	/**
	 * 
	 */
	public String ownerName;
	public String ownerAddress;
	public double ownerPhoneNumber;
	public Boolean isHouseAvailableForRent;
	public Boolean isPoliceVerificationRequired;
	public String houseDescription;
	public String houseType;
	public OwnerDetails() {
		// TODO Auto-generated constructor stub
		
	}
	/**
	 * @param ownerName
	 * @param ownerAddress
	 * @param ownerPhoneNumber
	 * @param isHouseAvailableForRent
	 * @param houseDescription
	 * @param houseType
	 */
	public OwnerDetails(String ownerName, String ownerAddress, double ownerPhoneNumber, Boolean isHouseAvailableForRent,
			String houseDescription, String houseType) {
		super();
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.isHouseAvailableForRent = isHouseAvailableForRent;
		this.houseDescription = houseDescription;
		this.houseType = houseType;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the ownerAddress
	 */
	public String getOwnerAddress() {
		return ownerAddress;
	}
	/**
	 * @param ownerAddress the ownerAddress to set
	 */
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	/**
	 * @return the ownerPhoneNumber
	 */
	public double getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}
	/**
	 * @param ownerPhoneNumber the ownerPhoneNumber to set
	 */
	public void setOwnerPhoneNumber(double ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}
	/**
	 * @return the isHouseAvailableForRent
	 */
	public Boolean getIsHouseAvailableForRent() {
		return isHouseAvailableForRent;
	}
	/**
	 * @param isHouseAvailableForRent the isHouseAvailableForRent to set
	 */
	public void setIsHouseAvailableForRent(Boolean isHouseAvailableForRent) {
		this.isHouseAvailableForRent = isHouseAvailableForRent;
	}
	/**
	 * @return the houseDescription
	 */
	public String getHouseDescription() {
		return houseDescription;
	}
	/**
	 * @param houseDescription the houseDescription to set
	 */
	public void setHouseDescription(String houseDescription) {
		this.houseDescription = houseDescription;
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
}
