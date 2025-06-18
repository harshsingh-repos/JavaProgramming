package Arrays;

public class ArrayMethods {

    public int maxInArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public int minInArray(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
    }

    public int[] sortArray(int[] nums){
        int len = nums.length;
        for(int i =0 ; i < len ; i++){
            for(int j = 0 ; j<len-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    //WAM to search a value in array

    //WAM to copy values of one array to another
    //1. both arrays are of similar length
    //2. where arrays are not of similar length


}
