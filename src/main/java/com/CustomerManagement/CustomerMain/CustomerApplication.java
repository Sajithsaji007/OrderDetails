package com.CustomerManagement.CustomerMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.CustomerDetail.CustomerData;
import com.CustomerLayer.CustomerImplementation;
import com.CustomerLayer.NosuchExceptionFound;



public class CustomerApplication {
	public static void main(String[] args) {
		menuDriven();
	}
	public static void menuDriven() {
	
	Scanner in= new Scanner(System.in);
	List<CustomerData> customer=new ArrayList<>();
	customer.add(new CustomerData(101,"Akash",25,3446));
	customer.add(new CustomerData(102,"Satish",37,7242));
	customer.add(new CustomerData(103,"Belwin",22,1735));
	customer.add(new CustomerData(104,"Vishal",26,4267));
	customer.add(new CustomerData(105,"Denver",32,10379));
	customer.add(new CustomerData(106,"Henry",29,5437));
	customer.add(new CustomerData(107,"Xavier",24,11442));
	customer.add(new CustomerData(108,"Malvin",20,2456));
	customer.add(new CustomerData(109,"Zack",26,8784));
	customer.add(new CustomerData(110,"Jenifer",23,25089));
	
	CustomerImplementation a=new CustomerImplementation();
	
	
	String options="";
	do {
		System.out.println("1. Name in ascending order.");
		System.out.println("2. Update the purchase amount.");
		System.out.println("3. Exit the Application.");
		options=in.next();
		
		switch(options) {
		
		case "1":
			Comparator<CustomerData> comp=new CustomerImplement();
			Collections.sort(customer, comp);
			for(int i=0;i<customer.size();i++) {
			System.out.println(customer.get(i).getCustomerId()+" "+customer.get(i).getCustomerName()+" "+customer.get(i).getCustomerAge()+" "+customer.get(i).getCustomerPurchaseAmount());
			} break;
			
		case "2":
			System.out.println("Enter Id");
			int cus_id=in.nextInt();
			System.out.println("Enter the updated purchase amount");
			int cus_upAmount=in.nextInt();
			try {
				a.updateCustomerAge(cus_id, cus_upAmount,customer);
			} catch(NosuchExceptionFound cus) {
				System.out.println(cus.getMessage());
			}
			break;
			
		case "3":
			System.out.println("Thank You!");
			break;
		}
		System.out.println("If you want to continue press Y");
		options=in.next();
		
		}while(options.equalsIgnoreCase("y"));
	}
}
	

