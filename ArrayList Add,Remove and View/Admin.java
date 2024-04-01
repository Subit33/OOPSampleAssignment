package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> locations = new ArrayList<>();

    public static void adminMenu(){
        System.out.println("=================");
        System.out.println("1: Add Location");
        System.out.println("2: View Weather");
        System.out.println("3: Delete Weather");
        System.out.println("4: Logout");
        System.out.println("5: Exit");
        System.out.println("=================");
        System.out.println("Enter a number between 1/4");
        int selectedNumber = scanner.nextInt();
        scanner.nextLine();

        if (selectedNumber == 1){
            addLocation();
        } else if (selectedNumber ==2 ) {
            viewLocation();
        }
        else if (selectedNumber == 3){
            deleteLocation();
        } else if (selectedNumber == 4) {
            Main.login();
        }
        else {
            System.out.println("Thanks for using the program!!");
            System.exit(0);
        }
    }

    public static void addLocation(){
        System.out.println("Enter the number of locations to add:");
        int totalLocations = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= totalLocations; i++){
            System.out.println("Enter location : " + i);
            String selectedLocation = scanner.nextLine();
            locations.add(selectedLocation);
        }
        adminMenu();

    }
    public static void viewLocation(){
        System.out.println("========");
        System.out.println("Location");
        System.out.println("========");
        for (String location : locations){
            System.out.println(location);
        }adminMenu();
    }

    public static void deleteLocation(){
        System.out.println("========");
        System.out.println("Location");
        System.out.println("========");
        for (String location : locations){
            System.out.println(location);
        }
        System.out.println("Enter the location to delete:");
        String selectedLocation = scanner.nextLine();
        locations.remove(selectedLocation);
        adminMenu();
    }


}
