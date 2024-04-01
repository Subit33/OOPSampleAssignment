package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        login();
    }

    public static void login(){
        System.out.println("Enter your username:");
        String username = scanner.next();
        if (username.equals("admin")){
            System.out.println("Welcome Admin!!");
            Admin.adminMenu();
        } else if (username.equals("user")) {
            System.out.println("Welcome User");
            NormalUser.userMenu();
        }
        else {
            System.out.println("Invalid username");
            login();
        }
    }
}
