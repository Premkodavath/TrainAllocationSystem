package trainallocationsystem;

import java.util.Scanner;
import java.util.ArrayList;

class TrainAllocationSystem1 
{
    static class Profile 
    {
        String name;
        int age;
        String loginId;
        Profile(String name, int age, String loginId) 
        {
            this.name = name;
            this.age = age;
            this.loginId = loginId;
        }
    }
    static ArrayList<Profile> profiles = new ArrayList<>();
    static String[] trains = {"Train 1", "Train 2", "Train 3"};
    static int[][] seats = new int[3][2]; // 3 boogies 2 seats 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("Enter your choice:");
            System.out.println("1. Enter Profile");
            System.out.println("2. Enter Train Choice");
            System.out.println("3. Display Person Information");
            System.out.println("4. Display Complete Information");
            System.out.println("5. Display Train Status");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    enterProfile();
                    break;
                case 2:
                    enterTrainChoice(sc);
                    break;
                case 3:
                    displayPersonInformation(sc);
                    break;
                case 4:
                    displayCompleteInformation();
                    break;
                case 5:
                    displayTrainStatus();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
    static void enterProfile() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        String loginId = "ID" + (profiles.size() + 1); 
        profiles.add(new Profile(name, age, loginId));
        System.out.println("Profile Registered Successfully. Your login ID is: " + loginId);
    }
    static void enterTrainChoice(Scanner sc) 
    {
        System.out.println("Enter your ID:");
        String id = sc.next();
        System.out.println("Available Trains:");
        for (int i = 0; i < trains.length; i++) 
        {
            System.out.println((i + 1) + ". " + trains[i]);
        }
        System.out.println("Select a train (1-3):");
        int trainChoice = sc.nextInt();
        int boogie = (trainChoice - 1) / 2;
        int seat = (trainChoice % 2 == 0) ? 1 : 0;
        seats[boogie][seat] = 1;
        System.out.println("Seat allocated successfully in " + trains[trainChoice - 1]);
    }
    static void displayPersonInformation(Scanner sc) 
    {
        System.out.println("Enter your login ID:");
        String id = sc.next();
        for (Profile profile : profiles) 
        {
            if (profile.loginId.equals(id)) 
            {
                System.out.println("Name: " + profile.name);
                System.out.println("Age: " + profile.age);
                return;
            }
        }
        System.out.println("Profile not found check your login ID.");
    }
    static void displayCompleteInformation() 
    {
        System.out.println("Complete Information:");
        for (Profile profile : profiles) 
        {
            System.out.println("Login ID: " + profile.loginId);
            System.out.println("Name: " + profile.name);
            System.out.println("Age: " + profile.age);
System.out.println();
        }
    }
    static void displayTrainStatus() 
    {
        System.out.println("Train Status:");
        for (int i = 0; i < trains.length; i++) 
        {
            System.out.println(trains[i] + ":");
            for (int j = 0; j < seats[i].length; j++) 
            {
                System.out.println("Boogie " + (i + 1) + ", Seat " + (j + 1) + ": " + (seats[i][j] == 1 ? "Occupied" : "Available"));
            }
        }
    }
}
