package org.example;

import java.util.Scanner;

public class NormalUser {
    public static void userMenu(){
        System.out.println("====================");
        System.out.println("Welcome User!!!");
        System.out.println("1: View Climate Details");
        System.out.println("2: Log Out");
        System.out.println("=====================");
        System.out.println("Enter a number 1/2");
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();
        sc.nextLine();
        if (selectedNumber == 1){
            viewWeather();
        }
    }

    public static void viewWeather(){
        System.out.println("View Weather");
    }
}
