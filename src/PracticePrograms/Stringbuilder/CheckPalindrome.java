package PracticePrograms.Stringbuilder;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        StringBuilder sb = new StringBuilder(input);

        String reversed = sb.reverse().toString();

        if(input.equals(reversed)){
            System.out.println("Strings are palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
}
