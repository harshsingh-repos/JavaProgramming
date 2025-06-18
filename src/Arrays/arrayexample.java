package Arrays;

public class arrayexample {
    public static void main(String[] args) {
        //An array is a collection of elements of same data type.
        // All the elemnts are stored in a contiguous memory location.
        // we can store multiple values under one variable name. -> indexing

        // element1 -> element2 -> element3 // element 1, 2 and 3 are of same data type.

        // declaring and array
        int[] number; // numbers is just a reference in the memory

        int scores[]; // memory is not allocated while declaration.

        //creating and initializing the array numbers (length = 5)
        number = new int[5]; // Allocate 5 spaces in memory, where the index starts from 0 (0-4)

        //combine the declaration and initialization of the array (length = 3)
        int[] score = new int[3]; //score has 3 spaces in memory starting at index 0.

        // Initializing the arrays is with values.

        int[] marks = {90, 95, 89}; // marks has 3 spaces in memory starting at index 0, value 90 at [0] index

        //Accessing the array elements
        System.out.println("Value of marks at 0 index : " + marks[0]);
        System.out.println("Value of marks at 1 index : " + marks[1]);
        System.out.println("Value of marks at 2 index : " + marks[2]);
//        System.out.println("Value of marks at 3 index : " + marks[3]); // ArrayIndexOutOfBoundsException

        //update the array elements
        marks[1] = 93;
        System.out.println("After updating the value of marks at index 1 or value 2");
        System.out.println("Value of marks at 1 index : " + marks[1]);

        // array length is a property and not a method like in strings.
        System.out.println("Array Length: " + marks.length); //length return the size of the array

            //traversing an array
        for(int i =0 ; i<marks.length ; i++){
//            System.out.println("Marks " + (i+1) + ": " + marks[i]);
            System.out.println("Index: " + i + " has Mark value: " + (i+1) + ": " + marks[i]);
        }

        // for each
        for(int mark: marks){ // the variable to traverse should be of same data type that of the array
            System.out.println("Marks: " + mark);
        }


    }
}
