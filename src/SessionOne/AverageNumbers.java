package SessionOne;

import java.util.Scanner;

public class AverageNumbers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int n1, n2, n3;
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();

        double average;  //4.5
        average = (double) (n1 + n2 + n3) /3; //type cast
        System.out.println("The average of three numbers: " + average);



    }
}
