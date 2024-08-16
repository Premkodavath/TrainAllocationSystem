package trainallocationsystem.controller;


import java.util.Scanner;

import trainallocationsystem.service.ServiceFunctionalities;

public class TrainAllocationSystemMain {
	static Scanner sc = new Scanner(System.in);
	static ServiceFunctionalities service = new ServiceFunctionalities();
	

	public static void main(String[] args) {
		
		int choice;
		do {
			service.displayMenu();
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				service.profile();
					break;
			}
			case 2: {
				   
				service.trainChoice();
				break;
			}
			case 3: {
				
				service.customerDetails();
				break;
			}
			case 4: {
				
				service.totalProfiles();
				break;
			}
			case 5: {
				service.trainStatus();
				break;
			}
			case 6: {
				System.out.println("Thank you for Using Train Allocation System Application (--)");
				
				break;
			}
			default: {
				System.out.println("enter your correct choice");
				break;
			}

			}
		} while (choice!=6);


	}

}
