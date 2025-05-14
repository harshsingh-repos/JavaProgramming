package PracticePrograms.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class MergeArrays {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David"};
        char[] grades = {'A', 'B', 'A', 'B'};

        Map<String, Character> groupArray = new HashMap<>();

        for(int i=0; i< students.length;i++){
                groupArray.put(students[i], grades[i]);
            }

        System.out.println("Grouped Array");
        System.out.println(groupArray);
    }
}
