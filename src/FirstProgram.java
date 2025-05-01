import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Add two Numbers");
        System.out.println("Enter two number");
        int numberOne, numberTwo;
        Scanner keyboard = new Scanner(System.in);  //Created an object of Scanner class using new keyword
        //NameofClass objName = new(keyword) NameofClass();
        // Scanner keyboardTwo =new Scanner(System.in);
        numberOne = keyboard.nextInt();
        numberTwo = keyboard.nextInt();
        System.out.println("The sum of two number is");
        System.out.println(numberOne + numberTwo);
    }
}
