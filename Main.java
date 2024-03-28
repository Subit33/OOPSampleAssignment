package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        login();
    }

    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = sc.next();
        if (email.equals("admin@gmail.com")){
            Admin.adminMenu();
        }
        else if (email.equals("user@gmail.com")){
            NormalUser.userMenu();
        }
        else {
            System.out.println("No user found!!");
        }
    }

}