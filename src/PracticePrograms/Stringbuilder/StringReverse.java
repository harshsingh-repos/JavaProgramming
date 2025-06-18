package PracticePrograms.Stringbuilder;

public class StringReverse {
    public static void main(String[] args) {
        String orignalStr = "Harshpreet Singh";

        StringBuilder sb = new StringBuilder(orignalStr);
        sb.reverse();

        System.out.println("Reversed String: " + sb.toString());
    }
}
