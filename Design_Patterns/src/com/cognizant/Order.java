package com.cognizant;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to our site!! would you like to order or repair??");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String processOption = sc.nextLine().toUpperCase();

		switch (processOption) {
		case "ORDER":
			ProcessOrderImpl p1 = new ProcessOrderImpl();
			p1.processOrder("Order");
			break;
		case "REPAIR":
			System.out.println("Is it phone or accessory that you want to repair???");
			String repairOption = sc.nextLine();

			if (repairOption.equalsIgnoreCase("phone")) {
				ProcessPhoneRepairImpl p3 = new ProcessPhoneRepairImpl();
				p3.processPhoneRepair("Nokia");
				break;
			}
			else
			{
				ProcessAcessRepairImpl p2 = new ProcessAcessRepairImpl();
				p2.accessRepair("Battery");
				break;
				
			}
			

		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
