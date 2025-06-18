package Arrays;

import java.util.Arrays;

public class FindInArray {
    public static void main(String[] args) {
        int [] nums = {8,7,10,11,13,5, 18, 12};

        ArrayMethods max = new ArrayMethods();
//        max.maxInArray(nums);

        System.out.println("Max is: " + max.maxInArray(nums));

        ArrayMethods min = new ArrayMethods();
        System.out.println("Min is: " + min.minInArray(nums));

        ArrayMethods sort = new ArrayMethods();
        int[] sorted = sort.sortArray(nums);
        System.out.println("Sorted Array is : " + Arrays.toString(sorted));

    }
}
