package Collections;
/*
 //Collections - easier to store the information, manipulate , access
// Memory ( RAM/ Secondary Storage)

// -- List -- ordered collection (allows duplicate values) -- Array Lists (the files stored in RAM) ,
// //LinkedList ( Location of files in secondary storage )
// -- set -- unorder collection (no duplicates)
// -- Queue -- holds elements (First In First Out)
// Map -- Most important and used collection in Java till date (Key- Value Pair) unique keys
// arrays - fixed size but arraylist dynamic
*/


import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rohini");
        names.add("John");
        names.add("Smith");
        System.out.println("Names: " + names);

        names.remove("John"); //remove the element at index
        System.out.println("Names: " + names);
        names.add(1, "harsh"); // adds at an index
        System.out.println("Names: " + names);
        names.add(0, "singh");
        System.out.println("Names: " + names);
        System.out.println(names.size()); // returns size of the arrayList
        names.set(0,"harry"); // replace the element at index
        System.out.println("Using set : " + names);

        System.out.println("Check is Harsh is in the list: " + names.contains("harsh"));

        ArrayList<Integer> regNo = new ArrayList<>(); // we can not use primitive data types like int/char/double
        ArrayList<Double> score = new ArrayList<>(); // we can only use wrapper classes like Integer/Character/Double

    }

}
