package Collections;

import Arrays.Student;

import java.util.ArrayList;

public class StudentArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Students> student = new ArrayList<>();
        student.add(new Students("Smith", 25));
        student.add(new Students("Harry", 27));
        student.add(new Students("Stella", 29));

        // print
        for (Students s : student){
            System.out.println(s);
        }

        Students firstStudent = student.get(0);
        System.out.println("First Student Info: " + firstStudent.name + " " + firstStudent.age);
        firstStudent.age = 23;

        System.out.println("First Student Info: " + firstStudent.name + " " + firstStudent.age);

        Students misclStudentInfo = new Students("Harsh", 29);

        student.set(1, misclStudentInfo);

        for (Students s : student){
            System.out.println(s);
        }






    }
}
