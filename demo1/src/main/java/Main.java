import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. View Students");
            System.out.println("2. Add Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    database.readStudents();
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    database.createStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId;
                    try {
                        updateId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input for student ID. Please enter a number.");
                        continue;
                    }
                    System.out.print("Enter the new name: ");
                    String updatedName = scanner.nextLine();
                    database.updateStudent(updateId, updatedName);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId;
                    try {
                        deleteId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input for student ID. Please enter a number.");
                        continue;
                    }
                    database.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Thank you and goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
