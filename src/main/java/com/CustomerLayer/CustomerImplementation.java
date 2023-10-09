package com.CustomerLayer;

import java.util.List;

import com.CustomerDetail.CustomerData;

public class CustomerImplementation {
	
	public void updateCustomerAge(int cus_id, int cus_upAmount,List<CustomerData> j) throws NosuchExceptionFound {
		boolean flag=false;
		for(int i=0;i<j.size();i++) {
			if(j.get(i).getCustomerId()==cus_id) {
				System.out.println("Updated purchase amount from "+j.get(i).getCustomerPurchaseAmount()+" to "+cus_upAmount);
				System.out.println(j.get(i).getCustomerId()+" "+j.get(i).getCustomerName()+" "+j.get(i).getCustomerAge()+" "+cus_upAmount);
				j.get(i).setCustomerPurchaseAmount(cus_upAmount);
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Updated purchase amount "+cus_upAmount);
		} else {
				throw new NosuchExceptionFound("Invalid Input Id");
		}
	}

}
