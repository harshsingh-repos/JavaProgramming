package PracticePrograms.HashMapPrograms;

import java.util.*;

public class MergeGroupArrays {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David"};
        char[] grades = {'A', 'B', 'A', 'B'};

        Map<Character, List<String>> groupArray = new HashMap<>();

        for (int i=0; i< students.length;i++){
            char grade = grades[i];
            String student = students[i];

            if(groupArray.containsKey(grade)){
                groupArray.get(grade).add(student);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(student);
                groupArray.put(grade, newList);
            }
        }
        System.out.println("Grouped Students by Grade:");
        System.out.println(groupArray);
    }
}
