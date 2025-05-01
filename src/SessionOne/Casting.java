package SessionOne;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter a floating point value");
        double fv = keyboard.nextDouble();

        int x = (int)fv;
        System.out.println("The int value of " + fv + " is" + x);
        byte b = (byte)fv;
        System.out.println("The byte value of " + fv + " is " + b);
    }
}
