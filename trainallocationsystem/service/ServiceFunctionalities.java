package trainallocationsystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import trainallocationsystem.dto.CustomerProfile;
import trainallocationsystem.dto.TrainStatus;

public class ServiceFunctionalities {
	static Scanner sc = new Scanner(System.in);
	static List<CustomerProfile> customerList = new ArrayList<CustomerProfile>();
	static String name;
	static int age;
	static int id = 10;
	static int seatfilled1, seatfilled2, seatfilled3;
	static int t1bn = 1, t1sn = 1, t2bn = 1, t2sn = 1, t3bn = 1, t3sn = 1;
	static List<TrainStatus> trainStatus = new ArrayList<TrainStatus>();
	static int totalSeats = 6, remaining1, remaining2, remaining3;

	// Main Menu
	public void displayMenu() {
		System.out.println("\nEnter your choice:");
		System.out.println("1. Enter Profile");
		System.out.println("2. Enter Train Choice");
		System.out.println("3. Display Person Information");
		System.out.println("4. Display Complete Information");
		System.out.println("5. Display Train Status");
		System.out.println("6. Exit");
	}

	// profile Registration
	public void profile() {
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		String loginId = "profile" + id++;
		System.out.println("profile registerd successfully and userID: " + loginId);

		customerList.add(new CustomerProfile(name, age, loginId));
		// System.out.println(customerList);

	}

	// Train choice
	public void trainChoice() {
		System.out.println("Enter your login Id");
		String id = sc.next();
		CustomerProfile cr = null;

		for (CustomerProfile c : customerList) {
			if (c.getLoginId().equals(id))
				cr = c;
		}
		if (cr != null) {
			System.out.println("select your Train \n1.Train 1\n2.Train 2\n3.Tarin 3");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {

				cr.setTrainName("tarin 1");
				if (t1bn <= 3 && t1sn <= 2) {
					cr.setBogiNum(t1bn);
					cr.setSeatNum(t1sn);
					t1sn++;
					seatfilled1++;
					remaining1 = totalSeats - seatfilled1;
					trainStatus.add(new TrainStatus(cr.getTrainName(), remaining1, seatfilled1, cr.getBogiNum()));
					if (t1sn > 2) {
						t1bn++;
						t1sn = 1;
					}

				} else {
					System.out.println("train 1 is filled up");
				}
				break;
			}
			case 2: {

				cr.setTrainName("tarin 2");
				if (t2bn <= 3 && t2sn <= 2) {
					cr.setBogiNum(t2bn);
					cr.setSeatNum(t2sn);
					t2sn++;
					seatfilled2++;
					remaining2 = totalSeats - seatfilled2;
					trainStatus.add(new TrainStatus(cr.getTrainName(), remaining2, seatfilled2, cr.getBogiNum()));
					if (t2sn > 2) {
						t2bn++;
						t2sn = 1;
					}

				} else {
					System.out.println("train 2 is filled up");
				}
				break;

			}
			case 3: {

				cr.setTrainName("tarin 3");
				if (t3bn <= 3 && t3sn <= 2) {
					cr.setBogiNum(t3bn);
					cr.setSeatNum(t3sn);
					t3sn++;
					seatfilled3++;
					remaining3 = totalSeats - seatfilled3;
					trainStatus.add(new TrainStatus(cr.getTrainName(), remaining3, seatfilled3, cr.getBogiNum()));
					if (t3sn > 2) {
						t3bn++;
						t3sn = 1;
					}

				} else {
					System.out.println("train 3 is filled up");
				}
				break;
			}
			default: {
				System.out.println("choose correct tarin from above");
			}

			}

		} else {
			System.out.println("invalid Id or create new profile");
		}

	}

	// customer details
	public void customerDetails() {
		System.out.println("Enter LoginId");
		String id = sc.next();
		CustomerProfile cr = null;
		for (CustomerProfile cr1 : customerList) {
			if (cr1.getLoginId().equals(id))
				cr = cr1;

		}

		if (cr != null) {
			System.out.println(cr);
		} else {
			System.out.println("loginId: " + id + " not found\n enter correct loginID");
		}

	}

	// complete information
	public void totalProfiles() {
		for (CustomerProfile cr : customerList) {
			System.out.println("---------------------------------");
			System.out.println("name: " + cr.getName());
			System.out.println("age: " + cr.getAge());
			System.out.println("LoginId: " + cr.getLoginId());
			System.out.println("trainNum: " + cr.getTrainName());
			System.out.println("BoogieNum: " + cr.getBogiNum());
			System.out.println("SeatNum: " + cr.getSeatNum());
			System.out.println("---------------------------------");
		}
	}

	// Train Status
	public void trainStatus() {
	
		
			for (TrainStatus status : trainStatus) {
				System.out.println("---------------------------------");
				System.out.println("Train name: " + status.getTrainName());
				System.out.println("Total seats Remaining: " + status.getSeatRemaining());
				System.out.println("Total seats filled: " + status.getSeatAllocated());
				System.out.println("Train Boogies filled upto: " + status.getBogieNumber());
				System.out.println("---------------------------------");

			}
		

	}
}
