package ie.atu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first student:");
        System.out.print("Enter student name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email1 = scanner.nextLine();
        System.out.print("Enter course name: ");
        String course1 = scanner.nextLine();

        Student student1 = new Student(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        System.out.println("\nEnter details for the second student:");
        System.out.print("Enter student name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email2 = scanner.nextLine();
        System.out.print("Enter course name: ");
        String course2 = scanner.nextLine();

        Student student2 = new Student(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);

        System.out.println("\nEnter details for the third student:");
        System.out.print("Enter student name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email3 = scanner.nextLine();
        System.out.print("Enter course name: ");
        String course3 = scanner.nextLine();

        Student student3 = new Student(name3, email3, course3);

        System.out.println("\nDetails of all three students:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}