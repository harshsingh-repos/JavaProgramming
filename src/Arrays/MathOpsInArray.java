package Arrays;

public class MathOpsInArray {
    public static void main(String[] args) {
        int [] nums = {8,7,10,11,13};
        int sum =0;

        for(int num: nums){
            sum+= num;
        }

        double avg = (double) sum / nums.length;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);

    }
}
