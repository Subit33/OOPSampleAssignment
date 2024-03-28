package org.example;

import java.util.Scanner;

public class Admin {
    public static void adminMenu(){
        System.out.println("====================");
        System.out.println("Welcome Admin!!!");
        System.out.println("1: Add Climate Details");
        System.out.println("2: View Climate Details");
        System.out.println("3: Delete Climate Details");
        System.out.println("4: Log Out");
        System.out.println("=====================");
        System.out.println("Enter a number 1/2/3/4");
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();
        sc.nextLine();
        if (selectedNumber == 1){
            addWeather();
        } else if (selectedNumber == 2) {
            viewWeather();
        } else if (selectedNumber == 3) {
            deleteWeather();
        } else if (selectedNumber == 4) {
            Main.login();
        } else {
            System.out.println("Invalid Number");
        }
    }

    public static void addWeather(){
        System.out.println("Add Weather");
        adminMenu();
    }

    public static void viewWeather(){
        System.out.println("View Weather");
        adminMenu();
    }
    public static void deleteWeather(){
        System.out.println("Delete Weather");
        adminMenu();
    }


}
