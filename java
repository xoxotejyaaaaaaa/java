import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Add students
        students.add(new Student("John Doe", 20, "A"));
        students.add(new Student("Jane Smith", 22, "B"));

        // Display all students
        System.out.println("All Students:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }

        // Update student information
        System.out.println("Enter student name to update:");
        String nameToUpdate = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equals(nameToUpdate)) {
                System.out.println("Enter new age:");
                int newAge = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                student.setAge(newAge);
                System.out.println("Enter new grade:");
                String newGrade = scanner.nextLine();
                student.setGrade(newGrade);
                break; // Exit loop once student is found and updated
            }
        }

        // Display updated information
        System.out.println("Updated Student Information:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}
