import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void adminPrompt() {
        System.out.println("=================================================================");
        System.out.println("Please select one of the following number to perform the task:");
        System.out.println("1: Add New Students");
        System.out.println("2: View Existing Students");
        System.out.println("3: Delete Exising Students");
        System.out.println("4: Logout");
        System.out.println("5: Exit");
        int selectedPrompt = 0;
        while (selectedPrompt != 1 && selectedPrompt != 2 && selectedPrompt != 3 && selectedPrompt != 4 && selectedPrompt != 5) {
            try {
                if (selectedPrompt != 1 && selectedPrompt != 2 && selectedPrompt != 3 && selectedPrompt != 4 && selectedPrompt != 5) {
                    System.out.print("Select a number (1/2/3/4/5): ");
                    selectedPrompt = scanner.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number!!");
                scanner.next();
            }
        }
        if (selectedPrompt == 1) addStudents();
        else if (selectedPrompt == 2) {
            if (!students.isEmpty()) printStudentDetails();
            else {
                System.out.println("No students added. Please add new students");
                addStudents();
            }
        } else if (selectedPrompt == 3) {
            deleteStudents();
        } else if (selectedPrompt == 4) {
            Main.userLogin();
        } else {
            System.out.println("Thank you for using the program!");
            System.exit(0);
        }
    }

    public static void addStudents() {
        System.out.println("Enter the number of students you want to add : ");
        int numberOfStudentsToAdd = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numberOfStudentsToAdd; i++) {
            System.out.println("Enter the Student ID of Student : " + i);
            int studentID = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the Name of Student : " + i);
            String fullName = scanner.nextLine();
            String gender = "";
            boolean isGenderSelected = false;
            while (!isGenderSelected) {
                System.out.println("Enter the Gender of Student : " + i);
                gender = scanner.next();
                if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("Others")) {
                    isGenderSelected = true;
                } else {
                    System.out.println("Please enter your gender: Male/Female/Others");
                }
            }
            students.add(new Student(fullName, studentID, gender));
        }
        adminPrompt();

    }

    private static void deleteStudents() {
        int studentIndex = 0;
        System.out.println("Students List");
        System.out.println("Index: Student Name");
        for (Student student : Admin.students) {
            if (student != null) {
                System.out.println(studentIndex++ + " " + student.getFullName());
            }
        }
        System.out.println("Please enter the index of to delete the student");
        int studentIndexToDelete = scanner.nextInt();
        System.out.println(students.get(studentIndexToDelete).getFullName() + " deleted successfully!!");
        students.remove(studentIndexToDelete);
        adminPrompt();
    }

    public static void printStudentDetails() {
        System.out.println("Students List");
        System.out.println("|      Name       | Student ID | Gender  |");
        for (Student student : Admin.students) {
            if (student != null) {
                System.out.printf("| %-15s | %10d | %-7s | \n", student.getFullName(), student.getStudentID(), student.getGender());
            }
        }
        adminPrompt();
    }

    public static ArrayList<Student> studentArrayList(){
        return students;
    }
}
