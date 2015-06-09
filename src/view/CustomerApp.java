package view;

import Model.Customer;
import controller.CustomerIO;
import Exception.NoSuchCustomerException;

import java.util.Scanner;
public class CustomerApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Customer Application.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a customer number: ");
		int custNo = sc.nextInt();
		
		try
		{
			Customer cust = CustomerIO.getCustomer(custNo);
			String message = cust.printNameAndAddress();
			System.out.println(message);
		}
		catch(NoSuchCustomerException nce)
		{
			System.out.println(nce);
		}
		
		
		

	}

}
