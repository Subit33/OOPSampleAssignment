package org.example;

import java.util.Scanner;

public class NormalUser {
    static Scanner scanner = new Scanner(System.in);
    public static void userMenu(){
        System.out.println("=================");
        System.out.println("1: View Weather");
        System.out.println("2: Logout");
        System.out.println("3: Exit");
        System.out.println("=================");
        System.out.println("Enter a number between 1/3");
        int selectedNumber = scanner.nextInt();
        scanner.nextLine();

        if (selectedNumber == 1){
            viewLocation();
        } else if (selectedNumber == 2 ) {
            Main.login();
        }
        else {
            System.out.println("Thanks for using the program!!");
            System.exit(0);
        }
    }

    public static void viewLocation() {
        Admin.viewLocation();
    }
}
