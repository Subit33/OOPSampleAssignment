import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userLogin();
    }

    public static void userLogin() {
        Scanner sc = new Scanner(System.in);
        String userName = "";
        String password = "";
        //Stored username and password is admin/password, user/password
        System.out.println("Please enter your username and password:");
        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.println("Enter your username : ");
            userName = sc.next();
            System.out.println("Enter your password :");
            password = sc.next();
            if (userName.equals("admin") && password.equals("password")) {
                System.out.println("================================");
                System.out.println("Logged in successfully!!");
                System.out.println("================================");
                System.out.println("Welcome " + userName);
                isLoggedIn = true;
                Admin.adminPrompt();
            } else if (userName.equals("user") && password.equals("password")) {
                System.out.println("================================");
                System.out.println("Logged in successfully!!");
                System.out.println("================================");
                System.out.println("Welcome " + userName);
                isLoggedIn = true;
                NormalUser.userPrompt();
            } else {
                System.out.println("Incorrect username/password. Please enter correct details!");
            }
        }
    }
}
