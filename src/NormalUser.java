import java.util.Scanner;

public class NormalUser {
    public static void userPrompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================================================");
        System.out.println("Please select one of the following number to perform the task:");
        System.out.println("1: View Existing Students");
        System.out.println("2: Logout");
        System.out.println("3: Exit");
        int selectedPrompt = 0;
        while (selectedPrompt != 1 && selectedPrompt != 2 && selectedPrompt != 3) {
            try {
                if (selectedPrompt != 1 && selectedPrompt != 2 && selectedPrompt != 3) {
                    System.out.print("Select a number (1/2/3/4/5): ");
                    selectedPrompt = scanner.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number!!");
                scanner.next();
            }
        }
        if (selectedPrompt == 1){
            Admin.studentArrayList();
            userPrompt();
        }
        else if (selectedPrompt == 3) {
            Main.userLogin();
        }
        else {
            System.out.println("Thank you for using the program!");
            System.exit(0);
        }
    }
}
