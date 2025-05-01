import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string");
        int x = keyboard.nextInt();
        String s = keyboard.next();
        System.out.println("x is : " + x);
        System.out.println("s is: " + s);

        keyboard.useDelimiter("y");

        System.out.println("Enter a string");
        String a = keyboard.next(); // input only word delimiter by default is space
        String b = keyboard.nextLine(); // assign the whole sentence to the variable
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
    }
}
