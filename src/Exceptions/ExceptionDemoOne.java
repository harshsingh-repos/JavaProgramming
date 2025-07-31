package Exceptions;

import java.util.Scanner;

public class ExceptionDemoOne {

    //Checked Exceptions(compile time)
    // Unchecked Exception (runtime)
    //Object -> Errors
                // Exceptions ->

    /*
    try{
        // try something out which might break the program
        //e.g check weather the file exists
        // if file exists then do something
        // other return an exception
    } catch(ExceptionName name){
        System.out.println("This file not found");
    }
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.println("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator/denominator;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Error: You can not divide by zero!");
        }

        System.out.println("Program still running after exception");
        scanner.close();
    }



}
