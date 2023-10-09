package com.CustomerManagement.CustomerMain;

import java.util.Comparator;

import com.CustomerDetail.CustomerData;

public class CustomerImplement implements Comparator<CustomerData>{

	@Override
	public int compare(CustomerData o1, CustomerData o2) {
		// TODO Auto-generated method stub
		return o1.getCustomerName().compareToIgnoreCase(o2.getCustomerName());
	}

}
