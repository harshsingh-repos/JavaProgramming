package FlowControl;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;


public class DateCheck {
    String input = "Hello";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in the format mm/dd/yyyy");
        String inputDate = scanner.nextLine();

        if(inputDate.length() == 10 && inputDate.charAt(2) == '/' && inputDate.charAt(5) == '/') {
            String mm = inputDate.substring(0, 2); // String method substring
            String dd = inputDate.substring(3, 5);
            String yyyy = inputDate.substring(6);

            int month = Integer.parseInt(mm); // converted the String to Integer using the Integer Wrapper class
            int day = Integer.parseInt(dd);
            int year = Integer.parseInt(yyyy);

            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("Invalid Date");
            }
            if (month == 2) {
                if (isLeapYear(year)) {
                    if (day > 29) {
                        System.out.println("Invalid Date for February");
                    } else {
                        if (day > 28) {
                            System.out.println("Invalid Date as February has 28 days");
                        }
                    }
                }
            }
            // logic to check for days in months .... to be added
            System.out.println("Valid Date");
        }else{
            System.out.println("Invalid Date");
        }
    }
    public static boolean isLeapYear(int year){
        return (year % 4 ==0 && year %100 !=0) || (year%400 == 0);
    }
}


