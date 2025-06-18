package Arrays;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
//        Student[] students = new Student[3]; //Creates 3 reference , not creating objects
//        students[0] = new Student("Harsh", 123); //each index needs to be initialized
//        students[1] = new Student("John", 234);
//        students[2] = new Student("Sean", 124);
//
//        System.out.println("Name of first student: " + students[0].name);
//        System.out.println("Id of first student: " + students[0].id);

//        for( Student s :students){
//            s.displayInformation();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        Student[] stu = new Student[size];

        for(int i = 0; i < size ; i++){
            System.out.println("Enter Student details " + (i+1) + ": ");
            System.out.println("Enter Name: ");
            String name = scanner.nextLine();

            System.out.println("Enter Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            stu[i] = new Student(name, id);
        }

        System.out.println("Student Information");
        for( Student s :stu){
            s.displayInformation();
            }

    }
}
