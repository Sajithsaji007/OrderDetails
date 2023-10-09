package com.CustomerDetail;

public class CustomerData {
	private int customerId;
	private String customerName;
	private int customerAge;
	private int customerPurchaseAmount;
	
	public CustomerData(int customerId, String customerName, int customerAge, int customerPurchaseAmount) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAge=customerAge;
		this.customerPurchaseAmount=customerPurchaseAmount;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public int getCustomerPurchaseAmount() {
		return customerPurchaseAmount;
	}
	public void setCustomerPurchaseAmount(int customerPurchaseAmount) {
		this.customerPurchaseAmount = customerPurchaseAmount;
	}

}
