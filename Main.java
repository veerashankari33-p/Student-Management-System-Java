package src;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                   Student s1 = new Student(id, name, department);

students.add(s1);

System.out.println("\nStudent Added Successfully!");
                    break;

               case 2:

if(students.isEmpty()){

    System.out.println("No Student Found.");

}
else{

    System.out.println("\nStudent List");

    for(Student s : students){

        s.display();

        System.out.println("------------------");

    }

}

break;

case 3:

    System.out.print("Enter Student ID to Search: ");
    int searchId = sc.nextInt();

    boolean found = false;

    for (Student s : students) {

        if (s.id == searchId) {

            System.out.println("\nStudent Found");
            s.display();

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Student Not Found");
    }

    break;
    case 4:

    System.out.print("Enter Student ID to Update: ");
    int updateId = sc.nextInt();
    sc.nextLine();

    boolean updated = false;

    for (Student s : students) {

        if (s.id == updateId) {

            System.out.print("Enter New Name: ");
            s.name = sc.nextLine();

            System.out.print("Enter New Department: ");
            s.department = sc.nextLine();

            System.out.println("Student Updated Successfully!");

            updated = true;
            break;
        }
    }

    if (!updated) {
        System.out.println("Student Not Found");
    }

    break;

case 5:

    System.out.println("Thank You!");
    sc.close();
    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}