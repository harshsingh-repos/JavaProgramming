package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNameManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println(" \n 1. Add 2. Display 3.Search 4. Remove 5. Exit");
            int choice = input.nextInt();
            input.nextLine();
            if(choice == 1){
                System.out.println("Enter Student name:");
                String name = input.nextLine();
                students.add(name);
            }else if (choice == 2){
                System.out.println("Student List: " + students);
            }else if(choice == 3){
                System.out.println("Enter name to search: ");
                String search = input.nextLine();
                if(students.contains(search)){
                    System.out.println(search + " is in the list");
                } else {
                    System.out.println("Student " + search + " is not in the list");
                }
            }else if(choice == 4){
                System.out.println("Enter name to remove");
                String remove = input.nextLine();
                students.remove(remove);
            }
            else{
                break;
            }
        }
        input.close();
    }
}
