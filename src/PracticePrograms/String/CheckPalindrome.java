package PracticePrograms.String;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "saas"; //try with madam , saas

        StringReverse reverseObj = new StringReverse();
        String reverse = reverseObj.reverse(input);

        if(reverse.equals(input)){
            System.out.println("Strings are palindrome");
        }else{
            System.out.println("Strings are not palindrome");
        }
    }
}
